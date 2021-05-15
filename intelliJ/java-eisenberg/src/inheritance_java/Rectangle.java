package inheritance_java;

public class Rectangle extends GeometricObject {
    private double width;
    private double height;

    public  Rectangle() {
        setColor("white");
        setFilled(false);
        width = 1.0;
        height = 1.0;
    }

    public Rectangle(double width, double height, String color, boolean filled) {
        setColor(color);
        setFilled(filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public  double getArea() {
        return width * height;
    }

    public  double getPerimeter() {
        return 2.0 * (width + height);
    }

    public String toString() {
        return ("Rectangle with dimensions: " +
                width + " x " + height + ", " +
                "Color: " + getColor() + ", Filled: " + isFilled());
    }
}
