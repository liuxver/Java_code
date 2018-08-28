
import java.util.Scanner;

import javax.swing.JOptionPane;
public class DecimalToHexConversion1 {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		
		/*System.out.print("enter a decimal number:");
		int decimal=input.nextInt();*/
		
		String dataString=JOptionPane.showInputDialog("enter a number :");
		//String dataStrinh=JOptionPane.showInputDialog("enter a number :");
		int decimal=Integer.parseInt(dataString);
		JOptionPane.showMessageDialog(null, "the result is "+decimalToHex(decimal));
	}
	
	public static String decimalToHex(int decimal){
		String hex="";
		
		while(decimal!=0){
			int hexValue=decimal%16;
			hex=toHexChar(hexValue)+hex;
			decimal=decimal/16;
		}
		return hex;
	}
	
	public static char toHexChar(int hexValue){
		if(hexValue<=9&&hexValue>=0)
			return (char)(hexValue+'0');
		else
			return (char)(hexValue-10+'A');
	}
	
}
