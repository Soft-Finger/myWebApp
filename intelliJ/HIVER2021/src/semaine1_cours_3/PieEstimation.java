package semaine1_cours_3;

public class PieEstimation {
    Cercle cible;
    int nPoints = 0;
    int nPointsDansCercle = 0;

    public PieEstimation() { this.cible = new Cercle(0, 0, 0.5);
    }

    /*public PieEstimation() {
        this(new Cercle(new Point(0,0),0.5, 0.5), 0, 0, 0.0);
    }*/


    //public Cercle getC() { return c; }

    //public int getnPoints() { return nPoints; }

    //public int getnPointsDansCercle() {return nPointsDansCercle;}

    //public double getEstimationPie() {return estimationPie;}

    /*void pigerPoint(Point p) {
        //double randomP = (MIN)((Math.random() * (MAX-MIN) + MIN));
        p.x = ((Math.random() * (0.5 - (-0.5)) + 1) + 0.5 );
        p.y = (((Math.random() * (0.5 - (-0.5))) + 1) + 0.5);
        this.nPoints++;
        if(c.estDansCercle(p)) {
            nPointsDansCercle++;
        }
    }*/

    /*public void pigerPoint() {
        Point p = new Point();
        p.x = Math.random() - 0.5;
        p.y = Math.random() - 0.5;
        this.nPoints++;
        if(cible.estDansCercle(p)) {
            this.nPointsDansCercle++;
        }
    }*/

    private  double getSurfaceEstimation() {return (double) this.nPointsDansCercle / this.nPoints;}
    public  double getPieEstimation() {return getSurfaceEstimation() / (cible.rayon * cible.rayon);}

}
