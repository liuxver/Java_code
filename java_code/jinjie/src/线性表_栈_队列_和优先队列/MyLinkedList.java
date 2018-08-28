package 线性表_栈_队列_和优先队列;

public class MyLinkedList<E> extends MyAbstractList<E> {
	private Node<E> head,tail;
	
	public MyLinkedList(){
		
	}
	
	public MyLinkedList(E[] objects){
		super(objects);
	}
	
	public E getFirst(){
		if(size==0){
			return null;
		}
		else{
			return head.element;
		}
	}
	
	public E getLast(){
		if(size==0){
			return null;
		}
		else{
			return tail.element;
		}
	}
	
	public void addFirst(E e){
		Node<E> node=new Node<E>(e);
		size++;
		if(size==0){
			head=node;
			tail=head;
		}
		else{
			node.next=head;
			head=node;
		}
	}
	
	public void addLast(E e){
		Node<E> node=new Node<E>(e);
		
		if(tail==null){
			head=tail=node;
		}
		else{
			tail.next=node;
			tail=tail.next;
		}
		size++;
	}
	
	public void add(int index,E e){
		if(index==0)
			addFirst(e);
		else if(index>=size)
			addLast(e);
		else{
			Node<E> current=head;
			
			//Node<E> node=new Node<E>(e);
			for(int i=0;i<index-1;i++){
				current=current.next;
			}
			
			Node<E> temp=current.next;
			current.next=new Node<E>(e);
			(current.next).next=temp;
			size++;
		}
	}
	
	
	public E removeFirst(){
		if(size==0)
			return null;
		else if(size==1){
			Node<E> temp=head;
			head=tail=null;
			size=0;
			return temp.element;
		}
		else{
			Node<E> temp=head;
			head=head.next;
			size--;
			return temp.element;
		}
	}
	
	
	
	
	public E removeLast(){
		if(size==0)
			return null;
		else if(size==1){
			Node<E> temp=head;
			head=tail=null;
			size=0;
			return temp.element;
		}
		else{
			Node<E> current=head;
			for(int i=0;i<size-2;i++){
				current=current.next;
			}
			Node<E> temp=tail;
			tail=current;
			tail.next=null;
			size--;
			return temp.element;
		}
	}
	
	
	
	
	
	
	public E remove(int index){
		if(index<0||index>=size)
			return null;
		else if(index==0)
			return removeFirst();
		else if(index==size-1)
			return removeLast();
		else{
			Node<E> previous=head;
			for(int i=0;i<index-1;i++){
				previous=previous.next;
			}
			
			Node<E> current=previous.next;
			previous.next=current.next;
			size--;
			return current.element;
		}
	}
	
	public String toString(){
		StringBuilder result1=new StringBuilder("[");
		
		Node<E> current=head;
		for(int i=0;i<size-1;i++){
			result1.append(current.element);
			current=current.next;
			
			if(current!=null){
				result1.append(", ");
			}
			
		}
		
		return result1.toString()+"]";
		
	}
	
	
	
	
	public void clear(){
		head=tail=null;
	}
	
	public boolean contains(E e){
		
		if(size==0)
			return false;
		else{
			Node<E> current=head;
			for(int i=0;i<size-1;i++){
				if(current.element==e){
					return true;
				}
			}
		}
		return false;
	}
	
	public E get(int index){
		
		if(index<0||index>size)
			return null;
		else if(index==0)
			return getFirst();
		else if(index==size-1)
			return getLast();
		else{
			Node<E> current=head;
			for(int i=0;i<index;i++){
				current=current.next;
			}
			return current.element;
		}
	}
	
	public int indexOf(E e){
		
		if(size==0)
			return -1;
		else{
			Node<E> current=head;
			for(int i=0;i<size-1;i++){
				if(current.element==e)
					return i;
			}
		}
		
		return -1;
	}
	
	public int lastIndexOf(E e){
		if(size==0)
			return -1;
		else{
			Node<E> current=head;
			int result=-1;
			for(int i=0;i<size-1;i++){
				if(current.element==e)
					result=i;
			}
			return result;
		}
	}
	
	public E set(int index,E e){
		if(index<0||index>size-1)
			return null;
		else{
			Node<E> current=head;
			for(int i=0;i<index;i++){
				current=current.next;
			}
			current.element=e;
			return e;
		}
	}
	
	private static class Node<E> {
	    E element;
	    Node<E> next;
	    
	    public Node(E e){
	    	element=e;
	    }
	}

	
	
}
