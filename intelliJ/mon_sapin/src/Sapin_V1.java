public class Sapin_V1 {
    public static void main (String[] args) {
        // Déclaration des constantes

        final char ESPACE = ' ';
        final char SYMBOLE = '+';
        final int HAUTEUR_MIN = 2;
        final int HAUTEUR_MAX = 20;

        // Déclaration des variables
        int hauteur;
        int nbPlusADessiner = 1;
        int nbEspaceADessiner;

        /* Ajoutez les instructions de traitement ci-dessous */
        do {
            System.out.print("Entrez la hauteur du sapin (2 a 20) : ");
            hauteur = Keyboard.readInt();
        }
        while (hauteur < HAUTEUR_MIN || hauteur > HAUTEUR_MAX);

        nbEspaceADessiner = hauteur - 1;
        for (int noEtage = 1; noEtage <= hauteur; noEtage = noEtage + 1) {
            // Boucle pour dessiner les espaces sur la ligne
            for (int noEspace = 1; noEspace <= nbEspaceADessiner; noEspace = noEspace + 1) {
                System.out.print(ESPACE);
            }

            // Boucle pour dessiner les + sur la ligne
            for (int noPlus = 1; noPlus <= nbPlusADessiner; noPlus = noPlus + 1) {
                System.out.print(SYMBOLE);
            }
            System.out.println();
            nbPlusADessiner = nbPlusADessiner + 2;
            nbEspaceADessiner = nbEspaceADessiner - 1;
        }
    }
}
