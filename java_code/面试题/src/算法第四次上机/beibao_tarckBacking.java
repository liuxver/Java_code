//package �㷨���Ĵ��ϻ�;
/**
*
*author:liuxv
*student_number:15130120185
*email:liuxver444@gmail.com
*email1:1369058574@qq.com
*/
public class beibao_tarckBacking {
	
	static int [] value=new int[]{20,30,65,40,60};
	static int [] weight=new int[]{10,20,30,40,50};
	static int capicty=100;
	static int result=0;
	static int currentValue=0;
	static int currentWeight=0;
	//static int m=0;
	
	static void backtrack(int n){
		//i++;
		if(n>=5){
			if(result<currentValue){
				result=currentValue;
				for(int i=0;i<n-1;i++){
					System.out.print("\t");
				}
				System.out.print(currentValue+"true\n");
				return;
			}
			for(int i=0;i<n-1;i++){
				System.out.print("\t");
			}
			System.out.print(n-1+"�ڵ���false\n");			
			return;
		}
		if(currentWeight+weight[n]<=capicty){
			//++;
			currentWeight+=weight[n];
			currentValue+=value[n];
			for(int i=0;i<n;i++){
				System.out.print("\t");
			}
			System.out.print(n+"�ڵ���뵽�����\n");
			//System.out.print(n+":");
			backtrack(n+1);//�ݹ���⣬������ɹ�����ôȥ����ǰ�ڵ����
			currentWeight-=weight[n];
			currentValue-=value[n];
			//m--;
			for(int i=0;i<n;i++){
				System.out.print("\t");
			}
			//m-=n;
			System.out.println(n+"�ڵ�ӽ������ȥ��\n");
			//i--;
		}
		//i++;
		backtrack(n+1);
		
		
		
	}
	
	
	
	
	
	
	public static void main(String[] args){
		backtrack(0);
		System.out.println(result);
	}
}
