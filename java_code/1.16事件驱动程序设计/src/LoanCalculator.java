import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;
public class LoanCalculator extends JFrame{
	private JTextField jtfAnnualInterestRate=new JTextField();
	private JTextField jtfNumberOfYears=new JTextField();
	private JTextField jtfLoanAmount=new JTextField();
	private JTextField jtfMouthlyPayment=new JTextField();
	private JTextField jtfTotalPayment=new JTextField();
	
	private JButton jbtComputeLoan=new JButton("Compute Payment");
	
	public LoanCalculator(){
		JPanel p1=new JPanel(new GridLayout(5,2));
		p1.add(new JLabel("Annual Interest Rate:"));
		p1.add(jtfAnnualInterestRate);
		p1.add(new JLabel("Number of years:"));
		p1.add(jtfNumberOfYears);
		p1.add(new JLabel("Loan Amount:"));
		p1.add(jtfLoanAmount);
		p1.add(new JLabel("Mouthly Payment:"));
		p1.add(jtfMouthlyPayment);
		p1.add(new JLabel("Total Payment:"));
		p1.add(jtfTotalPayment);
		
		p1.setBorder(new TitledBorder("Enter loan mount,interest rate,and year:"));
	    
		
		JPanel p2=new JPanel(new FlowLayout(FlowLayout.RIGHT));
		p2.add(jbtComputeLoan);
		
		add(p1,BorderLayout.CENTER);
		add(p2,BorderLayout.SOUTH);
		
		jbtComputeLoan.addActionListener(new ButtonListener());
	}
	
	
	private class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			double interest=Double.parseDouble(jtfAnnualInterestRate.getText());
			int year=Integer.parseInt(jtfNumberOfYears.getText());
			double loanAmount=Double.parseDouble(jtfLoanAmount.getText());
			
			Loan loan=new Loan(interest,year,loanAmount);
			
			jtfMouthlyPayment.setText(String.format("%.2f", loan.getMouthlyPayment()));
			jtfTotalPayment.setText(String.format("%.2f", loan.getTotalPayment()));
			
		}
	}
	
	
	public static void main(String[] args){
		LoanCalculator frame=new LoanCalculator();
		frame.pack();
		frame.setTitle("LoanCalculator");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	
}































