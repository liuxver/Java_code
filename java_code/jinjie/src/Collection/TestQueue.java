package Collection;

public class TestQueue {
	public static void main(String[] args){
		java.util.Queue<String> queue=new java.util.LinkedList<String>();
		queue.offer("Love");
		queue.offer("xiaomengmeng~");
		queue.offer("yueyue");
		
		while(queue.size()>0)
			System.out.print(queue.remove()+" ");
	}
}
