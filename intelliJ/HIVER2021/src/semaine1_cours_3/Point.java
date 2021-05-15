package semaine1_cours_3;

public class Point {
    public double x;
    public double y;

   /* Point() {
        this(0, 0);
    }*/

    public Point(double x0, double y0) {
        this.x = x;
        this.y = y;
    }

    void deplacer(double a, double b) {
        this.x = a;
        this.y = b;
       // System.out.println(a + " " + b);
    }

    /*double calculeDistance(Point p) {
        return Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
    }*/

    public double distance(Point p) {
        return Math.sqrt(Math.pow((this.x - p.x ), 2) + Math.pow((this.y - p.y), 2));
    }

    public String toString() {
        return "Position du point :  {" +
                "x = " + this.x +
                ", y = " + this.y +
                '}';
    }

    public Point copie() {
        Point p = new Point(x, y);
        return p;
    }
}
