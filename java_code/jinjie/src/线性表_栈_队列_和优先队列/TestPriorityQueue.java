package 线性表_栈_队列_和优先队列;
/**
*
*author:liuxv
*student_number:15130120185
*email:liuxver444@gmail.com
*email1:1369058574@qq.com
*/
public class TestPriorityQueue {
    public static void main(String[] args){
    	Patient p1=new Patient("liuxv",5);
    	Patient p2=new Patient("liuyi",2);
    	Patient p3=new Patient("liu2",1);
    	Patient p4=new Patient("liu3",6);
    	
    	MyPoriorityQueue priorityQueue=new MyPoriorityQueue();
    	priorityQueue.enqueue(p1);
    	priorityQueue.enqueue(p2);
    	priorityQueue.enqueue(p3);
    	priorityQueue.enqueue(p4);
    	
    	while(priorityQueue.getSize()>0){
    		System.out.print(priorityQueue.dequeue()+" ");
    	}
    	
    }
    
    static class Patient implements Comparable{
    	private String name;
    	private int priority;
    	
    	public Patient(String name,int priority){
    		this.name=name;
    		this.priority=priority;
    	}
    	
    	public String toString(){
    		return name+"(priority: "+priority+" )";
    	}
    	
    	public int compareTo(Object o){
    		return this.priority-((Patient)o).priority;
    	}
    	
    	
    }
}
