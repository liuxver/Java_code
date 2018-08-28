package 网络_发送和接受对象;

public class StudentAddress implements java.io.Serializable {
	private String name;
	private String city;
	private String phone;
	
	public StudentAddress(String name,String city,String phone){
		this.name=name;
		this.city=city;
		this.phone=phone;
	}
	
	public String getName(){
		return name;
	}
	
	public String getCity(){
		return city;
	}
	
	public String getPhone(){
		return phone;
	}
	
	
	
	
}
