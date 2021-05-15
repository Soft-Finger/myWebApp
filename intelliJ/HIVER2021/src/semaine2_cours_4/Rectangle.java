package semaine2_cours_4;

public class Rectangle {
    private double a;
    private double b;
    private double c;
    private double d;

    public Rectangle(double a, double b, double c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public void reset() {

    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a = " + a +
                ", b = " + b +
                ", c = " + c +
                ", d = " + d +
                '}';
    }
}
