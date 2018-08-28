import javax.swing.JOptionPane;

public class GuessBirthdayUsingConfirmationDialog1 {
	public static void main(String[] args){
		String s1=
				" 1    3    5   7\n"+" 9	11	13	15\n"+" 17	19	21	23\n"+" 25	27	29	31";
		String s2=
				" 2    3    6   7\n"+" 10	11	14	15\n"+" 18  19  22  23\n"+" 28  29  30  31";
		String s3=
				" 4    5    6   7\n"+" 12   13  14  15\n"+" 20  21  22  23\n"+" 28  29  30  31";
		String s4=
				" 8    9    10  11\n"+" 12   13  14  15\n"+" 24  25   26  27\n"+" 28  29  30  31";
		String s5=
				" 16   17   18  19\n"+" 20   21  22  23\n"+" 24  25   26  27\n"+" 28  29  30  31";
		
		int day=0;
		//Scanner input=new Scanner(System.in);
		
		int answer=JOptionPane.showConfirmDialog(null, "Is your birthday in those numbers?\n"+s1);
		if(answer==JOptionPane.YES_OPTION){
			day+=1;
		}
		
		answer=JOptionPane.showConfirmDialog(null, "Is your birthday in those numbers?\n"+s2);
		if(answer==JOptionPane.YES_OPTION){
			day+=2;
		}
		
		answer=JOptionPane.showConfirmDialog(null, "Is your birthday in those numbers?\n"+s3);
		if(answer==JOptionPane.YES_OPTION){
			day+=4;
		}
		
		answer=JOptionPane.showConfirmDialog(null, "Is your birthday in those numbers?\n"+s4);
		if(answer==JOptionPane.YES_OPTION){
			day+=8;
		}
		
		answer=JOptionPane.showConfirmDialog(null, "Is your birthday in those numbers?\n"+s5);
		if(answer==JOptionPane.YES_OPTION){
			day+=16;
		}
		
		JOptionPane.showMessageDialog(null, "your birthday is "+day+" ! ");
	}
}
