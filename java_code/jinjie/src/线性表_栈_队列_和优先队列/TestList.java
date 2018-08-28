package 线性表_栈_队列_和优先队列;

public class TestList {
	public static void main(String[] args){
		MyList<String> list=new MyLinkedList<String>();
		list.add("a");
		
		System.out.println("(1)"+list);
		
		
		list.add(0, "b");
		System.out.println("(2)"+list);

		list.add("c");
		System.out.println("(3)"+list);

		list.add(2, "d");
		System.out.println("(4)"+list);

		list.add("f");
		System.out.println("(5)"+list);

		list.remove(2);
		System.out.println("(6)"+list);

		list.remove("g");
		System.out.println("(7)"+list);

		
	}
}
