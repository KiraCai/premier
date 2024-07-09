package src.main.java.Core.OOP_et_packages.task219;

public class ComplexNumber {
    private double re;
    private double im;

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public boolean equals(Object o) {
        if (getClass() != o.getClass()) return false;
        ComplexNumber other = (ComplexNumber) o;
        return Double.compare(this.re, other.getRe()) == 0 && Double.compare(this.im, other.getIm()) == 0;
    }

    public int hashCode() {
        Double result = 31 * this.re + this.im;
        return result.intValue();
    }

    public double getRe() {return re;}

    public double getIm() {return im;}
}
