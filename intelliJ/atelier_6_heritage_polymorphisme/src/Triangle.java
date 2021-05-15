public class Triangle extends Forme {
    protected int mHauteur;

    public Triangle( char pCouleur, int pHauteur ) {
        super(pCouleur);
        this.mHauteur = pHauteur;
    }

    public  void dessine() {
        for( int i = 0; i < this.mHauteur; i++ ) {
            int nbEspaceADessiner = this.mHauteur - 1;
            for (int noEtage = 1; noEtage <= this.mHauteur; noEtage = noEtage + 1) {
                // Boucle pour dessiner les espaces sur la ligne
                for( int noEspace = 1; noEspace <= nbEspaceADessiner; noEspace = noEspace + 1 ) {
                    System.out.print(" ");
                }

                // Boucle pour dessiner les + sur la ligne
                int nbCharADessiner = 1;
                for( int caractere = 1; caractere <= nbCharADessiner; caractere = caractere + 1 ) {
                    System.out.print(getMcouleur());
                }
                System.out.println();
                nbCharADessiner = nbCharADessiner + 2;
                nbEspaceADessiner = nbEspaceADessiner - 1;
            }
        }
    }

    @Override
    public String toString() {
        return
                "mHauteur=" + mHauteur;
    }
}
