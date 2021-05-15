package semaine1_cours_3;

public class Cercle {
    public Point centre;
    double rayon;

    /*public Cercle(Point centre, double rayon, double diametre) {
        this.centre = new Point();
        this.rayon = rayon;
    }*/

    public Cercle(double x, double y, double r) {
        this.centre = new Point(x, y);
        this.rayon = r;
    }

    double getArea() {
        return  Math.PI * rayon * rayon;
    }

    double getPerimetre() {
        return  2 * Math.PI * rayon;
    }

    void moveTo(double a, double b) {
        centre.deplacer(a, b);
    }

    void resize(double r) {
        this.rayon = r;
    }

    /*boolean estDansCercle(Point p) {
        return (p.distance((p.x, p.y < rayon) ? true : false );
    }*/

    public String toString() {
        return "Cercle{" +
                "centre = " + centre +
                ", rayon = " + rayon +
                '}';
    }
}
