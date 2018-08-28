package Collection;
import java.util.*;

public class TestTreeSetWithComparator {
	public static void main(String[] args) throws InvalidRadiusException{
		//new TreeSet<GeometricObject>(new GeometricObjectComparator()) 中间的 new GeometricObjectComparator() 
		//是对排序算法进行重写  使用指定的排序算法 进行排序 
		Set<GeometricObject> set=new TreeSet<GeometricObject>(new GeometricObjectComparator());
		set.add(new Rectangle(4,5));
		set.add(new Circle(40));
		set.add(new Circle(40));
		set.add(new Rectangle(4,1));
		
		System.out.println("A sorted set of geometric objects ");
		for(GeometricObject e:set){
			System.out.println("area="+e.getArea());
		}
	}
}
