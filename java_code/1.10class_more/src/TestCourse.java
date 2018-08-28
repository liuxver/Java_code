import java.util.*;
public class TestCourse {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		Course c=new Course("shuxue");
		System.out.println("enter a name:");
		String s=input.nextLine();
		c.addStudent(s);
		String s1=input.nextLine();
		c.addStudent(s1);
		s=input.nextLine();
		c.addStudent(s);
		String[] students=c.getStudent();
		for(int i=0;i<students.length;i++){
			System.out.println(students[i]);
		}
		System.out.println(c.getNumberOfStudent());
		c.dropStudent(s1);
		System.out.println("\n");
		String[] students1=c.getStudent();
		for(int i=0;i<students1.length;i++){
			System.out.println(students1[i]);
		}
		System.out.println(c.getNumberOfStudent());
	}
}
