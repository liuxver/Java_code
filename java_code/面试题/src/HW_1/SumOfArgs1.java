package HW_1;

public class SumOfArgs1 {
	public static void main(String[] args){
		int n=args.length;
		int num=0;
		for(int i=0;i<n;i++){
			int m;
			try{
				m=Integer.parseInt(args[i]);
			}
			catch(Exception e){
				continue;
			}
			num+=m;
			
		}
		
		System.out.println(num);
		//System.out.println(5);
		//System.out.println(Integer.parseInt("aa"));
	}
}
