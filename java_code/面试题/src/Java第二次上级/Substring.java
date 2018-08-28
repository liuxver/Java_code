//package Java第二次上级;
/**
*
*author:liuxv
*student_number:15130120185
*email:liuxver444@gmail.com
*email1:1369058574@qq.com
*/
public class Substring {
	public static void main(String[] args){
		String s=args[0];
		int m=s.length();
		int a=Integer.parseInt(args[1]);
		int b=Integer.parseInt(args[2]);
		if(a>m){
			return;
		}
		int end=a+b>m?m:a+b;
		String result=s.substring(a, end);
		System.out.println(result);
		/*for(int i=1;i<a+b-1&&i<=m;i++){
			result=result+s.
		}
		*/
	}
}
