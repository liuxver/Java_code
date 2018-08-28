package sort;

public class BubbleSort {
	public static void bubbleSort(int[] list){
		boolean needNextPass=true;
		
		for(int i=1;i<list.length&&needNextPass;i++){
			needNextPass=false;
			for(int j=0;j<list.length-i;j++){
				if(list[j]>list[j+1]){
					int temp=list[j];
					list[j]=list[j+1];
					list[j+1]=temp;
					needNextPass=true;
				}
				
			}
		}
	}
	
	public static void main(String[] args){
		int[] list={2,3,2,5,6,-5,7,24,12,5};
		bubbleSort(list);
		for(int i=0;i<list.length;i++){
			System.out.print(list[i]+" ");
		}
	}
	
}
