package 线性表_栈_队列_和优先队列;
/**
*
*author:liuxv
*student_number:15130120185
*email:liuxver444@gmail.com
*email1:1369058574@qq.com
*/
import java.lang.Comparable;
import sort.Heap;
public class MyPoriorityQueue <E extends Comparable>{
    private Heap<E> heap=new Heap<E>();
    
    public void enqueue(E newObject){
    	heap.add(newObject);
    }
    
    public E dequeue(){
    	return heap.remove();
    }
    
    public int getSize(){
    	return heap.getSize();
    }
    
}
