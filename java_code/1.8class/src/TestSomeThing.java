/**
*
*author:liuxv
*student_number:15130120185
*email:liuxver444@gmail.com
*email1:1369058574@qq.com
*/
public class TestSomeThing {
	public static void main(String[] args){
		String s=new String("abc");
		String s1=new String("abc");
		int a=5;
		int b=5;
		Integer n=new Integer(1);
		Integer n1=new Integer(1);
		Circle1 c=new Circle1();
		Circle1 c1=new Circle1();
		System.out.println(s.equals(s1));
		System.out.println(s==s1);
		
		System.out.println(c.equals(c1));
		System.out.println(c==c1);
		
		System.out.println(n.equals(n1));
		System.out.println(n==n1);
		
		System.out.println(a==b);
	}
}
