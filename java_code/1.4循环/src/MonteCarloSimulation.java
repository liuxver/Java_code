
public class MonteCarloSimulation {
	public static void main(String[] args){
		final int NUMBER=1000000;
		int numberOfHits=0;
		
		for(int i=0;i<NUMBER;i++){
			double x=Math.random()*2.0-1;
			double y=Math.random()*2.0-1;
			if(x*x+y*y<=1){
				numberOfHits++;
			}
		}
		
		double pi=4.0*numberOfHits/NUMBER;
		System.out.println("pi is "+pi);
	}
}
