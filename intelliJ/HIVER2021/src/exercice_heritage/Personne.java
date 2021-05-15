package exercice_heritage;

public class Personne {
    protected String mCodePermanent;
    protected String mNom;

    public Personne(String mCodePermanent, String mNom) {
        this.mCodePermanent = mCodePermanent;
        this.mNom = mNom;
    }

    public Personne() {
    }

    public String getmCodePermanent() {
        return mCodePermanent;
    }

    public void setmCodePermanent(String mCodePermanent) {
        this.mCodePermanent = mCodePermanent;
    }

    public String getmNom() {
        return mNom;
    }

    public void setmNom(String mNom) {
        this.mNom = mNom;
    }

    @Override
    public String toString() {
        return
                "code Permanent = '" + mCodePermanent + '\'' + "\n" +
                "nom = '" + mNom + '\'';
    }
}
