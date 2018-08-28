package HW_1;
/**
*author:baiyuze
*student_number:15130120184
*email:179134005@qq.com
*/
import java.util.ArrayList;
import java.util.List;

public class CRS {
	static Book thinkinjava=new Book("Think in Java");
	static Book java8=new Book("Java 8");
	static Book webengineering=new Book("Web Engineering");
	static Book linux=new Book("Linux");
	static Book operatingsystem=new Book("operatingsystem");
	static Book [] javabook=new Book[]{thinkinjava,java8};
	static Book [] webbook=new Book[]{webengineering};
	static Book [] systembook=new Book[]{linux,operatingsystem};
	static Course Java=new Course("Java",javabook);
	static Course WebEngineering=new Course("WebEngineering",webbook);
	static Course system=new Course("system",systembook);
	
	public static void main(String[] args){
        int n=args.length;
		Course [] courses=new Course[n-1];
		List<Course> courseList=new ArrayList<Course>();
		courseList.add(Java);
		courseList.add(system);
		courseList.add(WebEngineering);
		for(int i=1;i<args.length;i++){
			for(int j=0;j<courseList.size();j++){
				if(courseList.get(j).showName().equals(args[i])){
					courses[i-1]=courseList.get(j);
					break;
				}
			}
		}
		Student s=new Student(args[0],courses);
		s.show();
	}
	
}
class Book{
	String bookName;
	
	public Book(String s){
		bookName=s;
	}
	
	public String show(){
		return bookName;
	}
	
}
class Course{
	String courseName;
	List<Book> bookList=new ArrayList<Book>();
	public Course(String name,Book[] books){
		courseName=name;
		for(int i=0;i<books.length;i++){
			bookList.add(books[i]);
		}
	}
	public String show(){
		String s=""+courseName+" with books ";
		for(int i=0;i<bookList.size();i++){
			if(i==bookList.size()-1){
				s=s+bookList.get(i).show()+" ";
				break;
			}
			s=s+bookList.get(i).show()+" , ";
		}
		return s;
	}
	public String showName(){
		return courseName;
	}
}
class Student{
	String name;
	Course[] courseList1;
	public Student(String name){
		this.name=name;
	}
		
	
	public Student(String name,Course[] courseArray){
		this.name=name;
		courseList1=courseArray;
	}
		
	
	public Student(String name,List<Course> list){
		this.name=name;
		for(int i=0;i<list.size();i++){
			courseList1[i]=list.get(i);
		}
	}
	
	public void show(){
		String s;
		s=""+this.name+" select ";
		
		for(int i=0;i<courseList1.length;i++){
			if(i>0){
				s=s+" and ";
			}
			if(i==courseList1.length-1){
				s=s+courseList1[i].show()+" .";
				break;
			}
			s=s+courseList1[i].show()+" ; ";	
		}
		System.out.println(s);		
	}
}
	

