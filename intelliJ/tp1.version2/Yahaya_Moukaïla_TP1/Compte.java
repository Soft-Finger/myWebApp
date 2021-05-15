/**
 * Programme permettant la gestion des comptes bancaires.
 * @author Yahaya Moukaila
 * date 20 février 2021
 */

public class Compte {

    private int compteId;
    private Client titulaire;
    private double solde;
    private static int dernierIdCompte = 99999;

    public Compte(Client titulaire, double solde) {

        this.compteId=dernierIdCompte;
         dernierIdCompte=dernierIdCompte - 1;

        this.titulaire = titulaire;
        this.solde = solde;
    }

    public int getCompteId() {
        return compteId;
    }

    public Client getTitulaire() {
        return titulaire;
    }

    public double getSolde() {
        return solde;
    }

    public void debiter(double montant) {
        if((this.solde - montant) < -100) {
            System.out.println("Impossible d'effectuer cette transaction veuillez alimenter le compte");
        } else {
            this.solde = this.solde - montant;
        }
    }

    public void crediter(double montant) {
        this.solde = this.solde + montant;
    }

    /**
     * Méthode qui copie le compte dans un nouveau compte qui
     * dispose des memes parametres
     * @return la copie du compte
     */

    public Compte copieCompte() {
        Compte compteCopie = new Compte(this.titulaire, this.solde);
        compteCopie.compteId = this.compteId;

        return compteCopie;
    }

    public String toString(){
        return this.titulaire.toString() + "\n"
            + "------" + "\n"
            + "Compte" + " #" + this.compteId + "\n"
            + "Solde: " + this.solde + " $";
    }
}
