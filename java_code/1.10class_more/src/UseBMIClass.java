
public class UseBMIClass {
	public static void main(String[] args){
		BMI bmi1=new BMI("liuxv",20,80,1.7);
		System.out.println("The BMI for "+bmi1.getName()+" is "+bmi1.getBMI()+" "+bmi1.getStatus());
		
		BMI bmi2=new BMI("wuyue",20,55,1.7);
		System.out.println("The BMI for "+bmi2.getName()+" is "+bmi2.getBMI()+" "+bmi2.getStatus());
		
		
	}
}
