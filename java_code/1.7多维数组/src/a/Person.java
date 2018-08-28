package a;

public class Person {
	String name;
	Address add=null;
	
	Person(String name,Address a){
		System.out.println(a.a);
		this.name=name;
		this.add=a;
		System.out.println(this.add);
	}
	void show(){
		System.out.println(name);
		if(add!=null){
			System.out.println(add.toString());
		}
		
	}
	public static void main(String[] args){
		Address add=new Address("xian");
		Person p=new Person("liuxv",add);
		p.show();
		
	}
}
