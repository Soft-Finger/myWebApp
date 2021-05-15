public class Forme {
    private static int dernierId = -1;
    protected int mId;
    protected char mCouleur;
   // private static int nbFormes = 0;

    public Forme(char pCouleur) {
        dernierId++;
        this.mId = dernierId;
        this.mCouleur = pCouleur;
    }

    public Forme() {

    }

    public char getMcouleur() {
        return mCouleur;
    }

    public void setPcouleur(char pCouleur) {
        this.mCouleur = pCouleur;
    }

    public void dessine() {
        System.out.println(this.mCouleur);
    }

    public int getId() {
        return mId;
    }

    @Override
    public String toString() {
        return "Forme " +
                " mId = " + mId ;
    }
}
