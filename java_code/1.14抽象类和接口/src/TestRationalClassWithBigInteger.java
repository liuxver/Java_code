
public class TestRationalClassWithBigInteger {
    public static void main(String[] args){
    	Rational r1=new Rational(1,123456789);
    	Rational r2=new Rational(1,123456789);
    	Rational r3=new Rational(1,123456789);
    	
    	System.out.println("r1*r2*r3 is "+r1.mutiply(r2.mutiply(r3)));
    }
}
