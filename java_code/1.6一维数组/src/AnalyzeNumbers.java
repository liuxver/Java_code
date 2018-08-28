public class AnalyzeNumbers {
	public static void main(String[] args){
		final int NUMBER_OF_ELEMENTS=100;
		int[] numbers=new int[NUMBER_OF_ELEMENTS];
		double sum=0;
		
		java.util.Scanner input=new java.util.Scanner(System.in);
		for(int i=0;i<NUMBER_OF_ELEMENTS;i++){
			int number=(int)(Math.random()*100);
			System.out.printf("%4d",number);
			if((i+1)%10==0){
				System.out.println();
			}
			sum+=number;
			numbers[i]=number;
		}
		double average=sum/NUMBER_OF_ELEMENTS;
		int count=0;
		for(int i=0;i<NUMBER_OF_ELEMENTS;i++){
			if(numbers[i]>average)
				count++;
		}
		System.out.println("average is "+average);
		System.out.println("number of elements above the average:"+count);
		
		System.out.println("the begin number:");
		int[] numbers1=new int[NUMBER_OF_ELEMENTS];
		for(int i=0;i<NUMBER_OF_ELEMENTS;i++){
			numbers1[i]=i+1;
			System.out.print(numbers1[i]+" ");
			if((i+1)%10==0){
				System.out.println();
			}
				//System.out.println();
		}
		System.out.println("the shuffing number:");
		for(int i=0;i<numbers1.length;i++){
			int index=(int)(Math.random()*numbers1.length);
			int temp=numbers1[i];
			numbers1[i]=numbers1[index];
			numbers1[index]=temp;
		}
		for(int i=0;i<numbers1.length;i++){
			int temp=numbers1[i];
			System.out.print(temp+" ");
			if((i+1)%10==0){
				System.out.println();
			}
		}
		
		System.out.println("the for each:");
		for(int x:numbers1){
			System.out.println(x+" ");
		}
	}
}
