
public class TestRandomCharacter {
	public static void main(String[] args){
		final int NUMBER=175;
		final int CHAR_PER_LINE=25;
		
		for(int i=0;i<NUMBER;i++){
			char ch=RandomCharacter.getRandomLowerCaseLetter();
			if((i+1)%CHAR_PER_LINE==0)
				System.out.println(ch);
			else
				System.out.print(ch);
		}
	}
}
