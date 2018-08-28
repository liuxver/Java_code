import java.util.*;
public class ComputeAndInterpretBMI {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("enter weight in pounds: ");
		double weight=input.nextDouble();
		
		System.out.print("enter heigt in inches: ");
		double height=input.nextDouble();
		
		final double KILOGRAMS_PER_POUND=0.45359237;
		final double METER_PER_INCH=0.0254;
		
		double weightInKilograms=weight*KILOGRAMS_PER_POUND;
		double heightInMeters=height*METER_PER_INCH;
		double bmi=weightInKilograms/(heightInMeters*heightInMeters);
		
		System.out.println("your BMI is "+bmi);
		if(bmi<16){
			System.out.println("you are seriously underweight.");
		}else if(bmi<18){
			System.out.println("you are under weight.");
		}else if(bmi<24){
			System.out.println("you are normal weight.");
		}else if(bmi<29){
			System.out.println("you are over height.");
		}else if(bmi<35){
			System.out.println("you are seriously overweight.");
		}else{
			System.out.println("you are gravely overheight.");
		}
	}
}
