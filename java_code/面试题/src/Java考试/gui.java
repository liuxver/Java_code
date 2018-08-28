package Javaøº ‘;
/**
*
*author:liuxv
*student_number:15130120185
*email:liuxver444@gmail.com
*email1:1369058574@qq.com
*/

import javax.swing.*;
public class gui {
	public static void main(String[] args){
		String num=JOptionPane.showInputDialog("Enter a number :");
		double n=Double.parseDouble(num);
		double result=5*(n-32)/9;
		JOptionPane.showMessageDialog(null, "The result is "+result);
		
		
		
	}
}
