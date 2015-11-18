// Rational Class
public class Rational {
    // Instance Variables
    private int numer;
    private int denom;

    // Constructors
    public Rational() {
	numer = 0;
	denom = 1;
    }
    public Rational(int n, int d) {
	this();
	if (d == 0) {
	    System.out.println("Please enter a valid denominator!");
	    numer = 0;
	    denom = 1;
	}
	else {
	    numer = n;
	    denom = d;
	}
    }

    // Mutators and Accessors
    public int getNumer() {
	return numer;
    }
    public int getDenom() {
	return denom;
    }
    public void setNumer(int i) {
	numer = i;
    }
    public void setDenom(int i) {
	denom = i;
    }

    // Methods
    public String toString() {
	return (numer + "/" + denom);
    }
    public double floatValue() {
	return (double)numer / denom;
    }
    public void multiply(Rational r) {
	if (r.denom == 0) {
	    System.out.println("ERROR: Denominator value of 0");
	}
	else {
	    numer *= r.getNumer();
	    denom *= r.getDenom();
	}
    }
    public void divide(Rational r) {
	if (r.denom == 0 || r.numer == 0) {
	    System.out.println("ERROR: Division by 0");
	}
	else {
	    numer *= r.getDenom();
	    denom *= r.getNumer();
	}
    }
    
    // Testing
    public static void main(String[] args) {
	Rational oof = new Rational();
	System.out.println(oof);
	System.out.println(oof.floatValue());
	oof.setNumer(15); oof.setDenom(10);
	System.out.println(oof.floatValue());
	Rational bar = new Rational(1,3);
        oof.multiply(bar);
	System.out.println(oof);
	oof.divide(bar);
	System.out.println(oof);
	oof.divide(bar);
	System.out.println(oof);
	Rational baz = new Rational(7,0);
	System.out.println(baz);
    }
}
