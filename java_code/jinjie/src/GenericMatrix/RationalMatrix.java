package GenericMatrix;

public class RationalMatrix extends GenericMatrix<Rational>{
	protected Rational add(Rational r1,Rational r2){
		return r1.add(r2);
	}
	
	protected Rational mutiply(Rational r1,Rational r2){
		return r1.mutiply(r2);
	}
	
	protected Rational zero(){
		return new Rational(0,1);
	}
}
