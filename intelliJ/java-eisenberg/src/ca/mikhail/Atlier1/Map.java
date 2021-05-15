package ca.mikhail.Atlier1;

public class Map {
    static final double MIN = 0.0;
    static final double MAX = 20.0;

    public static void main(String[] args) {

        //double x = 0.0;
        //double y = 0.0;
        double point = moveTo(3, 8);
        double[] d = {1.1, 2.3, 4.5, 4.6};
        double[] r = {2.1, 4.3, 0.5, 5.6};
        double[] test = fusion(d, r);

        for (int i = 0; i < test.length; i++) {
            System.out.println(test[i]);
        }

        System.out.printf("x: %.1f\n", point);
    }
    /*static double[] moveTo(double[] p){
         p = new double[2];
         double i = 0.0;
         double[] points = new double[2];
         double random = ((Math.random() * (MAX - MIN) + 1) + MIN);
           for (i = 0; i <= p.length; i++) {
               if (p[i] >= MIN && p[i] <= MAX) {
                   points = p[i] = random;
               }else {
                   System.out.println("");
               }
           }
        return  points;
    }*/

    static double moveTo(double x, double y) {
        double random = ((Math.random() * (MAX - MIN) + 1) + MIN);
        if (x > MIN && y < MAX) {
            x = random;
            y = random;
        }else {
            System.out.println("erreur");
        }
        return x;
    }

    static double[] fusion(double[]tab1, double[] tab2) {
        double[] resultat = new double[tab1.length + tab2.length];
        int position = 0;
        for(int i = 0; i < tab1.length; i++) {
            resultat[position] = tab1[i];
            position++;
        }
        for (int i = 0; i < tab2.length; i++) {
            resultat[position] = tab2[i];
            position++;
        }
        return resultat;
    }

}
