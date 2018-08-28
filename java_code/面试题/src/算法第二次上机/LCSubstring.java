package 算法第二次上机;
/**
*
*author:liuxv
*student_number:15130120185
*email:liuxver444@gmail.com
*email1:1369058574@qq.com
*/
public class LCSubstring {
	static void LongestCommonSubstring(String s1,String s2){
		int m=s1.length();
		int n=s2.length();
		String minString=m>n?s2:s1;
		String maxString=m>n?s1:s2;
		for(int i=0;i<minString.length();i++){
			for(int j=minString.length()-1;j>=i;j--){
				String temp=minString.substring(i, j);
				if(maxString.contains(temp)){
					System.out.println("the result: "+temp);
					return;
				}
			}
		}
	}
	
	public static void main(String[] args){
		String s="xzyzzyx";
		String s1="zxyyzxz";
		//String s="ABCBDAB";
		//String s1="BDCABA";
		String s2="MAEEEVAKLEKHLMLLRQEYVKLQKKLAETEKRCALLAAQANKESSSESFISRLLAIVAD";
		String s3="MAEEEVAKLEKHLMLLRQEYVKLQKKLAETEKRCTLLAAQANKENSNESFISRLLAIVAG";
		//char [] x=s.toCharArray();
		//char [] y=s1.toCharArray();
		//System.out.println(x.length);
		//System.out.println(y.length);
		//char [] z=s2.toCharArray();
		//char [] w=s3.toCharArray();
		//LCS_length(x,y);
		//LCS_length(z,w);
		LongestCommonSubstring(s,s1);
		LongestCommonSubstring(s2,s3);
		
	}
	
	
	
	
}
