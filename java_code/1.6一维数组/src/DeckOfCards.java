
public class DeckOfCards {
	public static void main(String[] args){
		int[] deck=new int[52];
		String[] suits={"Spades","Hearts","Diamonds","Clubs"};
		String[] ranks={"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
		for(int i=0;i<deck.length;i++){
			deck[i]=i;
		}
		
		for(int i=0;i<deck.length;i++){
			int index=(int)(Math.random()*deck.length);
			int temp=deck[i];
			deck[i]=deck[index];
			deck[index]=temp;
		}
		
		for(int i=0;i<4;i++){
			String suit=suits[deck[i]/13];
			String rank=ranks[deck[i]%13];
			System.out.println("card number "+deck[i]+": "+rank+" of "+suit);
		}
		
		for(int i=0;i<deck.length;i++){
			String suit=suits[deck[i]/13];
			String rank=ranks[deck[i]%13];
			switch(suit){
			case "Spades":
				System.out.println("the first number:");
				break;
			case "Hearts":
				System.out.println("the second number:");
				break;
			case "Fiamonds":
				System.out.println("the third number: ");
				break;
			case "Clubs":
				System.out.println("the fourth number: ");
				break;
			default:
				break;
			}
			System.out.println(rank+" of "+suit);
			
		}
		
		int[] m=new int[52];
		System.arraycopy(deck, 0, m, 0, 52);
		for(int i=0;i<m.length;i++){
			System.out.print(m[i]+" ");
		}
		System.out.println();
		for(int i=0;i<deck.length;i++){
			System.out.print(deck[i]+" ");
		}
		
	}
}
