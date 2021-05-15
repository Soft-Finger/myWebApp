
public class Compte {
    private  int compteId;
    private  Client titulaire;
    private double solde;
    private static int dernierIdCompte = 99999;

    public Compte(Client titulaire, double solde) {
        this.compteId = dernierIdCompte;
         dernierIdCompte = dernierIdCompte - 1;

        this.titulaire = titulaire;
        this.solde = solde;

    }

    /**Les accesseurs Getters */

    public int getCompteId() {
        return compteId;
    }

    public Client getTitulaire() {
        return titulaire;
    }

    public double getSolde() {
        return solde;
    }

    /** Méthode pour débiter un compte avec un découvert de -$100 sur le compte à débiter
    * l'opération ne peut pas être inferieur à -$100
     * @param montant le montant à débiter
     * @return la méthode ne retourne rien.
    */

    public void debiter(double montant){
        if((this.solde - montant) < -100){
            System.out.println("Impossible de retier d'argent veuiilez alimenter le compte");
        }else {
             this.solde = this.solde - montant;
        }
    }

    /** Méthode pour créditer un compte
     * @param: montant le montant à ajouter sur le compte
     * @return: La méthode ne retourne rien
    */

    public void crediter(double montant){
        this.solde = this.solde + montant;
    }

    public  Compte backupCompte() {
        Compte compteBackup = new Compte(this.titulaire, this.getSolde());
        compteBackup.compteId = this.compteId;
        return compteBackup;
    }


    /**
     * Méthode native qui permet d'afficher un object
     */

    public String toString(){
        return this.titulaire.toString() + "\n"
                + "------\n"
                + "Compte" + " #" + this.compteId + "\n"
                + "Solde: " + this.solde + " $";
    }
}
