public class House_Cloneable_Comparable implements Cloneable,Comparable {
	private int id;
	private double area;
	private java.util.Date whenBuilt;
	
	
	public House_Cloneable_Comparable(int id,double area){
		this.id=id;
		this.area=area;
		whenBuilt=new java.util.Date();
	}
	
	public int getId(){
		return id;
	}
	
	public double getArea(){
		return area;
	}
	
	public java.util.Date getWhenBuilt(){
		return whenBuilt;
	}
	
	public void setWhenBuilt(java.util.Date whenBuilt){
		this.whenBuilt=whenBuilt;
	}
	
	public Object clone() throws CloneNotSupportedException{
		Object c=super.clone();
		return c;
	}
	
	public int compereTo(Object o){
		if(area>((House_Cloneable_Comparable)o).area)
			return 1;
		else if(area<((House_Cloneable_Comparable)o).area)
				return -1;
		else
			return 0;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
}
