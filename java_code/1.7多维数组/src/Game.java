import java.util.*;
public class Game {
	public static void main(String[] args){
		
		int[][] data=new int[6][7];
		//System.out.println(data[1][1]);
		show(data);
		//@SuppressWarnings("unused")
		
		boolean over=false;
		while(!over){
			insertRed(data);
			int over1=over(data);
			show(data);
			insertYellow(data);
			show(data);
			int over2=over(data);
			//System.out.println(over1+"  "+over2+"@@@@@@@@@@@@@@@@@@@@@@@@@22");
			if(over1==1&&over2==0){
				System.out.println("red player won");
				break;
			}
			else if(over1==0&&over2==2){
				System.out.println("yellow player won");
				break;
			}
			else if(over1==1&&over2==2){
				System.out.println("they all won!");
				break;
			}
			else{
				continue;
			}
		}
		
		
		
	}
	public static void show(int[][] data){
		for(int i=0;i<data.length;i++){
			for(int j=0;j<data[i].length;j++){
				System.out.print("|");
				switch(data[i][j]){
				case 0:{
					System.out.print(" ");
					break;
				}
				case 1:{
					System.out.print("R");
					break;
				}
				case 2:{
					System.out.print("Y");
					break;
				}
				default:break;
				}
			}
			System.out.println("|");
		}
		
		System.out.println("----------------------------------------");
		
	}
	public static int over(int[][] data){
		int over1=0;
		for(int i=0;i<data.length-3;i++){
			for(int j=0;j<data[i].length-3;j++){
				
				
				if(data[i][j]==data[i][j+1]&&data[i][j+1]==data[i][j+2]&&data[i][j+2]==data[i][j+3]&&data[i][j]==1){
					over1=1;
				}
				if(data[i][j]==data[i][j+1]&&data[i][j+1]==data[i][j+2]&&data[i][j+2]==data[i][j+3]&&data[i][j]==2){
					over1=2;
				}
				
				if(data[i][j]==data[i+1][j]&&data[i+1][j]==data[i+2][j]&&data[i+2][j]==data[i+3][j]&&data[i][j]==1){
					over1=1;
				}
				if(data[i][j]==data[i+1][j]&&data[i+1][j]==data[i+2][j]&&data[i+2][j]==data[i+3][j]&&data[i][j]==2){
					over1=2;
				}
				
				if(data[i][j]==data[i+1][j+1]&&data[i+1][j+1]==data[i+2][j+2]&&data[i+2][j+2]==data[i+3][j+3]&&data[i][j]==1){
					over1=1;
				}
				if(data[i][j]==data[i+1][j+1]&&data[i+1][j+1]==data[i+2][j+2]&&data[i+2][j+2]==data[i+3][j+3]&&data[i][j]==2){
					over1=2;
				}
			}
		}
		
		for(int i=0;i<data.length-3;i++){
			for(int j=data[i].length-1;j>2;j--){
				
				if(data[i][j]==data[i+1][j-1]&&data[i+1][j-1]==data[i+2][j-2]&&data[i+2][j-2]==data[i+3][j-3]&&data[i][j]==1){
					over1=1;
				}
				if(data[i][j]==data[i+1][j-1]&&data[i+1][j-1]==data[i+2][j-2]&&data[i+2][j-2]==data[i+3][j-3]&&data[i][j]==2){
					over1=2;
				}
			}
		}
		return over1;
		
	}
	public static void insertRed(int[][] data){
		Scanner input=new Scanner(System.in);
		//int insertRedOver=0;
		while(true){
			System.out.print("drop a red disk at column (0-6):");
			int y=input.nextInt();
			int x=location(data,y);
			if(x!=-1){
				data[x][y]=1;
				break;
			}else{
				System.out.println("data error!");
				continue;
			}
		}
		
		
	}
	public static void insertYellow(int[][] data){
		Scanner input=new Scanner(System.in);
		//int insertRedOver=0;
		while(true){
			System.out.print("drop a Yellow disk at column (0-6):");
			int y=input.nextInt();
			int x=location(data,y);
			if(x!=-1){
				data[x][y]=2;
				break;
			}else{
				System.out.println("data error!");
				continue;
			}
		}
		
		
	}
	public static int location(int[][] data,int y){
		for(int i=data.length-1;i>0;i--){
			if(data[i][y]==0){
				return i;//  java可以返回局部变量的引用？？？？？？？
			}
		}
		return -1;
	}
	
}
