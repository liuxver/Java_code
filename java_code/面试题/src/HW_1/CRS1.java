package HW_1;
/*package Java上机第一次;

import java.util.*;

public class CRS1 {
	
	
	public static void main(String[] args){
		
		
        int n=args.length;
		
		Course [] courses=new Course[n-1];
		//String[] courseList1=new String[]{"Java","WebEngineering","system"};
		List<Course> courseList=new ArrayList<Course>();
		courseList.add(Java);
		courseList.add(system);
		courseList.add(WebEngineering);
		
		
		for(int i=1;i<args.length;i++){
			for(int j=0;j<courseList.size();j++){
				if(courseList.get(j).showName().equals(args[i])){
					//System.out.println(args[i]);
					//System.out.println(courseList.get(i).showName());
					courses[i-1]=courseList.get(j);
					break;
				}
			}
		}
		//System.out.println(courses[0].showName());
		//System.out.println(courses.length);
		Student s=new Student(args[0],courses);
		s.show();
	}
	static Book think_in_java=new Book("Think in Java");
	static Book java_8=new Book("Java 8");

	static Book web_engineering=new Book("Web Engineering");

	static Book linux=new Book("Linux");
	static Book operating_system=new Book("operating_system");

	static Book [] java_book=new Book[]{think_in_java,java_8};
	static Book [] web_book=new Book[]{web_engineering};
	static Book [] system_book=new Book[]{linux,operating_system};

	
	static Course Java=new Course("Java",java_book);
	static Course WebEngineering=new Course("WebEngineering",web_book);
	static Course system=new Course("system",system_book);
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
	/*
	public Course(Collection<? extends Book> books){
		bookList.addAll(books);
	}
	
	public Course(String name,Book[] books){
		courseName=name;
		for(int i=0;i<books.length;i++){
			bookList.add(books[i]);
		}
	}
	public String show(){
		String s=""+courseName+" with books ";
		//List<String> list=new ArrayList<String>();
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
		//System.out.println(courseName);
		return courseName;
	}
}


class Student{
	String name;
	//List<Course> courseList=new ArrayList<Course>();
	Course[] courseList1;
	public Student(String name){
		this.name=name;
		//courseList.add(system);
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
	*/















