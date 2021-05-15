public class Dessine {
    public static void main(String[] args) {

    Forme f = new Forme('*');
    Triangle t = new Triangle('*', 5);
    Rectangle r = new Rectangle('*', 5, 10);



       Forme[] formes = {
               new Rectangle('*', 4, 7),
               new Triangle('*', 7)
       };

       for( int i = 1; i < formes.length; i++ ) {
           System.out.println(formes[i].toString());
           System.out.printf("Rectangle: %.2f, Triangle: %.2f", formes[i].dessine(), formes[i].dessine());
           if (formes[i] instanceof Rectangle) {
               System.out.printf("Largeur: %d", ((Rectangle) formes[i]).getmLongueur());
           } else  {
               ((Triangle) formes[i]).getmHauteur();
           }

       }

       Forme g = new Rectangle('*', 5, 5);
       int lo = ((Rectangle)g).getmLongueur();

    }
}






   /* public static void menu() {
        System.out.println("1. Ajouter un triangle");
        System.out.println("2. Ajouter un rectangle");
        System.out.println("3. Dessiner une forme");
        System.out.println("4. Dessiner toutes les formes");
        System.out.println("q pour quitter le programme ");
    }

    public static void createForme(Forme maForme){
        char c;

        System.out.println("Entrez la couleur de votre dessin");
        c = Keyboard.readChar();

            System.out.println("Etat réalisation du dessin: succès !!!");
            System.out.println("*************************");
            System.out.println("Liste des formes");
            System.out.println(maForme);
            System.out.println("*************************\n\n\n");

    }

    public static void main(String[] args) {
        //creation d'une nouvelle forme
        Forme form = new Forme('*');


        int choix = 0;
        char c;
        int largeur;
        int longueur;
        int hauteur;
        int id;

        //on demande d'ajouter de nouvelles formes, jusqu'a ce que l'usager tape: "fin"
        while(choix != 0){
            menu();
            choix = Keyboard.readInt();
            switch(choix){
                case 1://Ajouter un triangle
                    createForme(form);
                    System.out.println("Entrez la couleur du triangle");
                    c = Keyboard.readChar();
                    System.out.println("Entrez la hauteur du triangle");
                    hauteur = Keyboard.readInt();
                    Triangle tria = new Triangle(c, hauteur);
                    break;
                case 2://Ajouter un rectangle
                    System.out.println("Entrez la couleur du rectagle");
                    c = Keyboard.readChar();
                    System.out.println("Entrez la largeur du triangle");
                    largeur = Keyboard.readInt();
                    System.out.println("Entrez la longueur du triangle");
                    longueur = Keyboard.readInt();
                    Rectangle rec = new Rectangle(c, largeur, longueur);
                    break;
                case 3: //Dessiner une forme
                    System.out.println("Entrez le numero d'identification de la forme");
                    id = Keyboard.readInt();
                    //Forme uneForme = new Forme()
                    break;
                case 0://le programme se terminera
                    break;
                default:
                    System.out.println("Option invalide");
            }
        }
    }

}
*/