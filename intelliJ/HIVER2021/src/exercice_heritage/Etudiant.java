package exercice_heritage;

public class Etudiant extends  Personne{

    private int moyenne;
    private String programme;

    public Etudiant(String mCodePermanent, String mNom, int moyenne, String programme) {
        super(mCodePermanent, mNom);
        this.moyenne = moyenne;
        this.programme = programme;
    }


    public int getMoyenne() {
        return moyenne;
    }

    public void setMoyenne(int moyenne) {
        this.moyenne = moyenne;
    }

    public String getProgramme() {
        return programme;
    }

    public void setProgramme(String programme) {
        this.programme = programme;
    }

    public String toString() {
        String affichage = super.toString();
        affichage +="\n" + "Moyenne: " + this.moyenne + "\n" + "Programme: " + this.programme;
        return affichage;
    }
}
