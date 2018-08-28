
public class BMI {
	private String name;
	private int age;
	private double weight;
	private double height;
	public static final double KILOGRAMS_PER_POUND=0.45359237;
	//public static final double METERS_PER_INCH=0.0254;
	private static int number=0;
	
	public BMI(String name,int age,double weight,double height){
		this.name=name;
		this.age=age;
		this.weight=weight;
		this.height=height;
		number++;
	}
	
	public BMI(String name,double weight,double height){
		this(name,20,weight,height);
	}
	
	public double getBMI(){
		double bmi=weight/((height)*(height));
		return Math.round(bmi*100)/100.0;
	}
	
	public String getStatus(){
		double bmi=getBMI();
		if(bmi<16){
			return "seriously underweight.";
		}
		else if(bmi<18){
			return "underweight.";
		}
		else if(bmi<24){
			return "nomal weight.";
		}
		else if(bmi<29){
			return "overweight.";
		}
		else if(bmi<35){
			return "seriously overweight.";
		}
		else{
			return "gravely overweight.";
		}
	}
	
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}
	
	public double getWeight(){
		return weight;
	}
	
	public double getHeight(){
		return height;
	}
	
	public int getNumber(){
		return number;
	}
}
