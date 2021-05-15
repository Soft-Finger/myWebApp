package semaine2_cours_4;

import semaine1_cours_3.Point;

public class TestPoint3D {
    public static void main(String[] args) {
        /*Point3D p1 = new Point3D(1, 2, 3);
        Point3D p2 = new Point3D(1, 2, 3);
        Point3D origine = new Point3D(0, 0, 0);

        boolean isEquals1= p1 == p2;
        boolean isEquals2 = p1 == origine;

        System.out.println(isEquals1);
        System.out.println(isEquals2);*/
        Point a = new Point(2.3, 4.2);
        Point b = new Point(0.4, 0.4);
        Point c = new Point(1.3, 2.3);
        Point d = new Point(3.7, 3.7);
        Rectangle4Points r = new Rectangle4Points(a, b, c, d);
        RectangleArray reca = new RectangleArray();
        Point[] pp = new Point[4];
        pp[0] = a;
        pp[1] = b;
        pp[2] = c;
        pp[3] = d;
        RectangleArray v = new RectangleArray(pp);
        v.getPoints(pp);

        System.out.println(v);


    }
}
