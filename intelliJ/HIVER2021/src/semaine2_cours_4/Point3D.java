package semaine2_cours_4;

public class Point3D {
    double x;
    double y;
    double z;

    public Point3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public boolean compare(Point3D p) {
        return (
                (p.x == this.x) && (p.y == this.y) && (p.z == this.z)
        );
    }
}
