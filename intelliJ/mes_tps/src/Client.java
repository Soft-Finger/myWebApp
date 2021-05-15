


import java.text.DecimalFormat;

public class Client {
    
    private  int clientId;
    private  String titre;
    private  String nom;
    private String prenom;
    private  int anneeNaissance;
    private String adresse;
    private  String telephone;
    private static int dernierIdClient = 0;

    /**
     * */

    DecimalFormat formater = new DecimalFormat("00000");

    public Client(int clientId, String titre, String nom, String prenom, int anneeNaissance, String adresse, String telephone) {
        this.clientId = clientId;
        this.titre = titre;
        this.nom = nom;
        this.prenom = prenom;
        this.anneeNaissance = anneeNaissance;
        this.adresse = adresse;
        this.telephone = telephone;
    }

    public Client(String titre, String nom, String prenom, int anneeNaissance, String adresse, String telephone) {

        /** Pour permettre la génération atomatique
         *  de l'identifiant du client
         *  Permet d'incrémenter le dernier
         *  inditfiant à chaque fois qu'on appelle le constructeur
        */

        dernierIdClient = dernierIdClient + 1;
        this.clientId = dernierIdClient;

        this.titre = titre;
        this.nom = nom;
        this.prenom = prenom;
        this.anneeNaissance = anneeNaissance;
        this.adresse = adresse;
        this.telephone = telephone;
    }

    /**Les accesseurs Getters */

    public int getClientId() {
        return clientId;
    }

    public String getTitre() {
        return titre;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getAnneeNaissance() {
        return anneeNaissance;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getTelephone() {
        return telephone;
    }

    /**
     * Méthode native qui permet d'afficher un object
     */

    public String toString(){
     prenom = prenom.toLowerCase();
     prenom = prenom.toUpperCase().charAt(0) + prenom.substring(1);
    return "No." + formater.format(clientId) + "\n" +
            titre + ". " + prenom + " " + nom.toUpperCase() + "\n" +
            (2021-anneeNaissance) + " ans" + "\n" + adresse + "\n" +
            telephone;
    }
}