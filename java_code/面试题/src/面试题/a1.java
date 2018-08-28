package 面试题;

public class a1 {
	public static void main(String[] args){
		int a;
		a=aplusb(-23333,-233);
		System.out.println(a);
	}
	//@SuppressWarnings("null")
	public static int aplusb(int a, int b) {
        // write your code here
		String s;
		int [] a1=new int[32];
		int [] b1=new int[32];
		int [] c=new int[32];
		for(int i=31;i>=0;i--){
			//System.out.print(a>>>i&1);
			a1[31-i]=(a>>>i&1);
			b1[31-i]=(b>>>i&1);
			
		}
		//System.out.println(Integer.toBinaryString(-256));
		//求补码
		/*for(int i=0;i<32;i++){
			System.out.print(a1[i]);
		}
		System.out.println();
		
		System.out.println(Integer.toBinaryString(b));
		
		for(int i=0;i<32;i++){
			System.out.print(b1[i]);
		}
		System.out.println();
		if(a1[0]==1){
			for(int i=31;i>0;i--){
				if(a1[i]==0){
					a1[i]=1;
					break;
				}
				else{
					a1[i]=0;
				}
			}
		}
		if(b1[0]==1){
			for(int i=31;i>0;i--){
				if(b1[i]==0){
					b1[i]=1;
					break;
				}
				else{
					b1[i]=0;
				}
			}
		}
		
		for(int i=0;i<32;i++){
			System.out.print(a1[i]);
		}
		System.out.println();
		for(int i=0;i<32;i++){
			System.out.print(b1[i]);
		}
		System.out.println();
		*/
		
		//相加
		int flag=0;
		for(int i=31;i>=0;i--){
			if(a1[i]==0&&b1[i]==0){
				c[i]=0+flag;
				flag=0;
			}
			else if(a1[i]==1&&b1[i]==1){
				c[i]=0+flag;
				flag=1;
			}
			else{
				if(flag==1){
					c[i]=0;
					flag=1;
				}
				else{
					flag=0;
					c[i]=1;
				}
			}
		}
		StringBuffer sb=new StringBuffer();
		
		//这里是因为  Integet.ParseInt() 只有 第一个是 '-' 才能计算
		if(c[0]==1){
			sb.append("-");
			int i;
			for(i=1;i<32;i++){
				if(c[i]==1){
					c[i]=0;
				}else{
					break;
				}
			}
			c[i-1]=1;
		}
		else{
			sb.append("0");
		}
		for(int i=1;i<32;i++){
			
			//System.out.print(c[i]);
			sb.append(c[i]);
			//s.join(c[i], i);
			
		}
		
		s=sb.toString();
		//System.out.println(s);
		//System.out.println(s);
		//System.out.println(Integer.parseInt(s,2));
		return Integer.parseInt(s,2);
		//System.out.println();
		
		//System.out.println(s);
	//	return 1;
	//	System.out.println(a1[0]);
		//System.out.println(b1[0]);
		
      //  return 1;
    }
}
