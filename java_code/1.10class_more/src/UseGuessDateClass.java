import javax.swing.*;
public class UseGuessDateClass {
	public static void main(String[] args){
		int date=0;
	//	int answer;
		//Scanner input=new Scanner(System.in);
		//String s = null;
		for(int i=0;i<5;i++){
			String s = "";
			//System.out.println("Is your birthday in Set "+(i+1)+" ?");
			for(int j=0;j<4;j++){
				for(int k=0;k<4;k++){
					s+=GuessDate.getValue(i, j, k);
					s+=" ";
				}
				s+=" \n";
			}
			int answerTemp=JOptionPane.showConfirmDialog(null, "Is your birthday in this Set ?\n"
					+ s);
			if(answerTemp==JOptionPane.YES_OPTION){
				date+=GuessDate.getValue(i, 0, 0);
			}
			
		}
		
		System.out.println("your birthday is "+date);
		JOptionPane.showMessageDialog(null, "your birthday is "+date);
	}
}
