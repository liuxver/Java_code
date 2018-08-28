package a;

public class b {
    public static void main(String[] args){
    	T t=new T();
    	System.out.println(t.i);
    	t.m();
    	t.n();
    	
    	TT tt=new TT();
    	System.out.println(tt.i);
    	tt.m();
    	tt.n();
    	
    	xx(t);
    	xx(tt);
    	
    }
    public static void xx(T objectT){
    	System.out.println(objectT.i);
    	objectT.m();
    }
}
