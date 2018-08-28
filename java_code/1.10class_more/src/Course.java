
public class Course {
	final int NUM=1;
	private String courseName;
	private String[] students;
	private int numberOfStudents;
	
	public Course(String courseName){
		this.courseName=courseName;
	}
	
	public void addStudent(String student){
		String[] students1=new String[numberOfStudents+1];
		for(int i=0;i<numberOfStudents;i++){
			students1[i]=students[i];
		}
		students1[numberOfStudents]=student;
	//	System.out.println(students1[0]);
		numberOfStudents++;
		//System.out.println(numberOfStudents);
	/*	for(int i=0;i<numberOfStudents;i++){
			System.out.println(students[0]+" "+students1[0]);
			students[i]=students1[i];
		}*/
		//String[] students = new //String[students1.length + 1];
		//System.arraycopy(students1, 0, students, 0,1);
		students=students1;
		
		//students[students1.length] = student;
		
	}
	
	public String[] getStudent(){
		return students;
	}
	
	public int getNumberOfStudent(){
		return numberOfStudents;
	}
	
	public String getCourseName(){
		return courseName;
	}
	
	public void dropStudent(String student){
		int i;
		for(i=0;i<numberOfStudents;i++){
			if(students[i]==student){
				break;
			}
		}
		if(i==numberOfStudents){
			System.out.println("There is no student name "+student);
			return;
		}
	/*	for(int j=i;j<=numberOfStudents-1;j++){
			students[j]=students[j+1];
		}*/
		//System.out.println(i);
		String[] students1=new String[numberOfStudents-1];
		System.arraycopy(students, 0, students1, 0, i);
		/*for(int j=0;j<students.length;j++){
			System.out.println(students[j]+"11111111111111111111111111111");
		}
		for(int j=0;j<students1.length;j++){
			System.out.println(students1[j]+"222222222222222222222222");
		}*/
		System.arraycopy(students, i+1, students1, i, numberOfStudents-i-1);
	//	System.out.println("5555555555555555555555555");
		students=students1;
		numberOfStudents--;
	}
	
	public void clear(){
		String[] s1=new String[0];
		students=s1;
	}
	
	
}
