import java.util.*;
public class HexToDecimalConversion {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("enter a number:");
		String hex=input.nextLine();
		System.out.println("The decimal value for hex number "+hex+" is "+hexToDecimal(hex.toUpperCase()));
		
	}
	
	public static int hexToDecimal(String hex){
		int decimalValue=0;
		for(int i=0;i<hex.length();i++){
			char hexChar=hex.charAt(i);
			decimalValue=decimalValue*16+hexChatToDecimal(hexChar);
		}
		return decimalValue;
	}
	public static int hexCharToDecimal(char ch){
		if(ch>='A'&&ch<='F'){
			return 10+ch-'A';
		}
		else{
			return ch-'0';
		}
	}
	
}
