package GenericMatrix;
public class Rational extends Number implements Comparable{
	private long numberator=0;
	private long denominator=1;
	
	public Rational(){
		this(0,1);
	}
	
	public Rational(long numberator,long denominator){
		long gcd=gcd(numberator,denominator);
		this.numberator=((denominator>0)?1:-1)*numberator/gcd;
		this.denominator=Math.abs(denominator)/gcd;
	}
	
	private static long gcd(long n,long d){
		long n1=Math.abs(n);
		long n2=Math.abs(d);
		
		int gcd=1;
		
		for(int k=1;k<=n1&&k<=n2;k++){
			if(n1%k==0&&n2%k==0){
				gcd=k;
			}
		}
		return gcd;
	}
	
	
	public long getNumberator(){
		return numberator;
	}
	
	public long getDenominator(){
		return denominator;
	}
	
	
	
	public Rational add(Rational secondRational){
	//	System.out.println("11111111111111111111111");
	//	System.out.println(numberator+" "+secondRational.getDenominator()+" "+denominator+" "+secondRational.getNumberator());
		
		long n=numberator*secondRational.getDenominator()+denominator*secondRational.getNumberator();
	//	System.out.println(n);
		long d=denominator*secondRational.getDenominator();
		//System.out.println(n+" "+d);
		return new Rational(n,d);
	}
	
	public Rational subtract(Rational secondRational){
		long n=numberator*secondRational.getDenominator()-denominator*secondRational.getNumberator();
		long d=denominator*secondRational.getDenominator();
		
		return new Rational(n,d);
	}
	
	public Rational mutiply(Rational secondRational){
		long n=numberator*secondRational.getNumberator();
		long d=denominator*secondRational.getDenominator();
		return new Rational(n,d);
	}
	
	public Rational divide(Rational secondRational){
		long n=numberator*secondRational.getDenominator();
		long d=denominator*secondRational.getNumberator();
		return new Rational(n,d);
	}
	
	public String toString(){
		if(denominator==1)
			return numberator+"";
		else
			return numberator+"/"+denominator;
	}
	
	public boolean equals(Object parml){
		if((this.subtract((Rational)(parml))).getNumberator()==0)
			return true;
		else
			return false;
	}
	
	public int intValue(){
		return (int)doubleValue();
	}
	
	public double doubleValue(){
		return numberator*1.0/denominator;
	}
	
	public float floatValue(){
		return (float)doubleValue();
	}
	
	public long longValue(){
		return (long)doubleValue();
	}
	
	public int Comparable(Object o){
		if((this.subtract((Rational)o)).getNumberator()>0)
			return 1;
		else if((this.subtract((Rational)o)).getNumberator()<0)
			return -1;
		else
			return 0;
	}

	
	
	
}




















