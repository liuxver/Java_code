
public class CountLettersInArray {
	public static void main(String[] args){
		char[] chars=creatArray();
		System.out.println("the letters are:");
		displayArray(chars);
		
		int[] counts=countLetters(chars);
		System.out.println();
		System.out.println("the counts of letters are:");
		displayCounts(counts);
		
	}
	
	public static char[] creatArray(){
		char[] chars=new char[100];
		for(int i=0;i<chars.length;i++){
			chars[i]=RandomCharacter.getRandomLowerCaseLetter();
		}
		return chars;
	}
	
	public static void displayArray(char[] chars){
		for(int i=0;i<chars.length;i++){
			if((i+1)%20==0)
				System.out.println(chars[i]);
			else
				System.out.print(chars[i]+"");
		}
	}
	
	public static int[] countLetters(char[] chars){
		int[] counts=new int[26];
		for(int i=0;i<chars.length;i++){
			counts[chars[i]-'a']++;
		}
		return counts;
	}
	
	public static  void displayCounts(int [] count){
		for(int i=0;i<count.length;i++){
			if((i+1)%10==0)
				System.out.println(count[i]+" "+(char)(i+'a'));
			else
				System.out.print(count[i]+" "+(char)(i+'a')+" ");
		}
	}
}
