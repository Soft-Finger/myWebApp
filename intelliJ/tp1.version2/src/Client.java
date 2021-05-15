
/**
 * Programme permettant la gestion des comptes bancaires.
 * @author Yahaya Moukaila
 * @date 20 février 2021
 */

import java.text.DecimalFormat;

public class Client {
    private int clientId;
    private String titre;
    private String nom;
    private String prenom;
    private int anneeNaissance;
    private String adresse1;
    private String adresse2;
    private String telephone;
    private static int dernierIdClient = 0;

    DecimalFormat formater = new DecimalFormat("00000");

    public Client(String titre, String nom, String prenom, int anneeNaissance, String adresse1, String adresse2, String telephone) {

        dernierIdClient = dernierIdClient + 1;
        this.clientId = dernierIdClient;
        this.titre = titre;
        this.nom = nom;
        this.prenom = prenom;
        this.anneeNaissance = anneeNaissance;
        this.adresse1 = adresse1;
        this.adresse2 = adresse2;
        this.telephone = telephone;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    /**
     * Méthode qui copie le client, elle n'a été utilisé car la copie du client
     * dans la banque copie automatiquement le client, elle utilise les memes
     * proprétés que la class client
     * @return retourne une copie du client
     */

    public Client copieClient(){
        Client clientCopie = new Client (this.titre, this.nom, this.prenom,
                this.anneeNaissance, this.adresse1, this.adresse2, this.telephone);
        clientCopie.clientId = this.clientId;
        return clientCopie;
    }

    public String toString() {
     prenom = prenom.toLowerCase();
     prenom = prenom.toUpperCase().charAt(0) + prenom.substring(1);

    return "No." + formater.format(clientId) + "\n"
            + titre + ". " + prenom + " " + nom.toUpperCase() + "\n"
            + (2021 - anneeNaissance) + " ans" + "\n" + adresse1 + "\n" + adresse2  + " \n"
            + telephone;
    }
}
