package 线性表_栈_队列_和优先队列;

public class GenericStack<E> {
	private java.util.ArrayList<E> list=new java.util.ArrayList<E>();
	
	public int getSize(){
		return list.size();
	}
	
	public E peek(){
		return list.get(getSize()-1);
	}
	
	public void push(E o){
		list.add(o);
	}
	
	public E pop(){
		E o=list.get(getSize()-1);
		list.remove(getSize()-1);
		return o;
	}
	
	public boolean isEmpty(){
		return list.isEmpty();
	}
	
	public String toString(){
		String s="";
		for(int i=0;i<list.size();i++){
			s=s+list.get(i);
		}
		return s;
	}
	
}
