import javax.swing.*;
public class SentinelValueUsingConfirmationDialog {
	public static void main(String[] args){
		int sum=0;
		int option=JOptionPane.YES_OPTION;
		while(option==JOptionPane.YES_NO_OPTION){
			String dataString=JOptionPane.showInputDialog("enter an int value:");
			int data=Integer.parseInt(dataString);
			sum+=data;
			option=JOptionPane.showConfirmDialog(null, "continue?");
			
		}
		JOptionPane.showMessageDialog(null, "the sum is "+sum);
	}
}
