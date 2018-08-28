import java.util.*;
public class RecursivePalindromeUsingSubstringf {
	
	public static boolean isPalindrome(String s){
		return isPalindrome(s,0,s.length()-1);
	}
	
	
	public static boolean isPalindrome(String s,int low,int high){
		if(high<=low)
			return true;
		else if(s.charAt(low)!=s.charAt(high))
			return false;
		else
			return isPalindrome(s,low+1,high-1);
	}
	
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		String s=input.nextLine();
		while(s!=" "){
			System.out.println(s+" is a palindrome? "+isPalindrome(s));
			s=input.nextLine();
		}
	}
	
	
}
