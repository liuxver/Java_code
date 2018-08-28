package HW_1;
/**
*author:baiyuze
*student_number:15130120184
*email:179134005@qq.com
*/
public class SumOfArgs {
	public static void main(String[] args){
		int m=args.length;
		int sum=0;
		for(int i=0;i<m;i++){
			int n;
			try{
				n=Integer.parseInt(args[i]);
			}
			catch(Exception e){
				continue;
			}
			sum+=n;
			
		}
		
		System.out.println(sum);
	}
}
