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
	if (denom == 0) {
	    System.out.println("Please enter a valid denominator!");
	}
	numer = n;
	denom = d;
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
}
