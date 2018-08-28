
public class TestArrayList {
	public static void main(String[] args){
		java.util.ArrayList cityList=new java.util.ArrayList();
		cityList.add("London");
		cityList.add("Denver");
		cityList.add("xian");
		cityList.add("ankang");
		
		System.out.println("ListSize? "+cityList.size());
		System.out.println("Is xian in the list ? "+cityList.contains("xian"));
		System.out.println("Is the list empty? "+cityList.isEmpty());
		
		cityList.add("beijing");
		cityList.remove("ankang");
		cityList.add(0, "nanchang");
		System.out.println(cityList.toString());
		
		for(int i=cityList.size()-1;i>=0;i--){
			System.out.println(cityList.get(i)+" ");
		}
		System.out.println();
		
		
		java.util.ArrayList list=new java.util.ArrayList();
		
		list.add(new Circle4(2));
		list.add(new Circle4(3));
		
		System.out.println("The area of the circle ? "+((Circle4)list.get(0)).getArea());
		
	}
}
