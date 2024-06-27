package src.main.java.Core.OOP_et_packages.task219;

public class ComplexNumber {
    private double re;

    private double im;

    public ComplexNumber() {

    }

    public ComplexNumber(double re, double im) {

        this.re = re;

        this.im = im;

    }

    public boolean equals(Object o) {

        if (getClass() != o.getClass()) return false;
        ComplexNumber other = (ComplexNumber) o;

        if (java.lang.Double.compare(this.re, other.getRe()) == 0) {
            return true;
        }
        return false;
    }
    public int hashCode() {
        Double doubleRe = new Double(this.re);
        int intRe = doubleRe.intValue();
        System.out.println(intRe);
        return intRe;
    }
    public double getRe() {

        return re;

    }

    public double getIm() {

        return im;

    }
}
