package exercice_heritage;

public class Enseigant extends Personne {
    private float salaire;
    private String departement;

    public Enseigant(String mCodePermanent, String mNom, float salaire, String departement) {
        super(mCodePermanent, mNom);
        this.salaire = salaire;
        this.departement = departement;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(float salaire) {
        this.salaire = salaire;
    }

    public String getDepartement() {
        return this.departement;
    }

    public void setDepartement(String departement) {
        departement = departement;
    }

    public String toString() {
        String affichage = super.toString();
        affichage +="\n" + "Salaire: " + this.salaire + "\n" + "Departement: " + this.departement;
        return affichage;
    }


}
