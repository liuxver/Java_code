import java.util.*;
public class GradeExam {
	public static void main(String[] args){
		char[][] answer=new char[5][10];
		Scanner input=new Scanner(System.in);
		for(int i=0;i<answer.length;i++){
			for(int j=0;j<answer[i].length;j++){
				answer[i][j]=RandomCharacter.getRandomUpperCaseLetter();
			}
		}
		char[] key={'A','B','C','D','A','B','C','D','A','B'};
		for(int i=0;i<answer.length;i++){
			int correntCount=0;
			for(int j=0;j<answer[i].length;j++){
				if(answer[i][j]==key[i])
					correntCount++;
			}
			System.out.println("student "+i+"'s corrent count is "+correntCount);
		}
		
	}
}
