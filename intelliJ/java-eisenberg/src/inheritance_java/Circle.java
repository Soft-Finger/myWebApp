package inheritance_java;

public class Circle extends GeometricObject {
    private double radius;

    public  Circle() {
        setColor("white");
        setFilled(false);
        radius = 1.0;
    }

    public  Circle(double radius, String color, boolean filled) {
        setColor(color);
        setFilled(filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return  Math.PI * radius * radius;
    }

    public  double getCircumference() {
        return 2.0 * Math.PI * radius;
    }

    public  String toString() {
        return ("Circle with raduis: " + radius + ", " +
                "Color: " + getColor() + ", Filled: " + isFilled());
    }
}
