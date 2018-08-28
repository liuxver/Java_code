
public class TestStudent {
	public static void main(String[] args){
		Student student=new Student(1513,"liuxv");
		java.util.Date dateCreated=student.getDateCreated();
		System.out.println(dateCreated);
		dateCreated.setTime(200000000);
		java.util.Date dateCreated1=student.getDateCreated();
		System.out.println(dateCreated1);
		
	}
}
