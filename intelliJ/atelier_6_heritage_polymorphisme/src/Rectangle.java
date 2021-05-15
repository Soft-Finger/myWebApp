public class Rectangle extends  Forme{
    private int mLargeur;
    private int mLongueur;

    public Rectangle(char pCouleur, int pLargeur, int pLongueur) {
        super(pCouleur);
        this.mLargeur = pLargeur;
        this.mLongueur = pLongueur;
    }

    public int getmLargeur() {
        return mLargeur;
    }

    public int getmLongueur() {
        return mLongueur;
    }

    public  void dessine() {
        for( int i = 0; i < this.mLongueur; i++ ) {
            for( int j = 0; j < this.mLargeur; j++ ) {
                System.out.println(getMcouleur());
            }
        }
    }

}
