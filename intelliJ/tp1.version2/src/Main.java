/**
 * Programme permettant la gestion des comptes bancaires.
 * @author Yahaya Moukaila
 * @date 20 février 2021
 */

public class Main {
    public static void main(String[] args) {

        /** 1 - Création de 3 clients */
        
        Client cli1 = new Client("M.","dupont","alain",1988,"567, Rue Java","Montreal, QC, K1M, 2H2","514-600-7890");
        Client cli2 = new Client("Mme","DUBOIS","Maryse",1986,"2809, Rue JavaScript","Toronto, ON, K1M, 2H2","514-567-11234");
        Client cli3 = new Client("M","DUCHAMP","Marcel",1999,"5124, Rue Angular10","Laval, QC, K1M, 2H2","514-678-0987");
        
        /** 2 - Affichage de chaque client */

        System.out.println("Affichage de chaque client");
        System.out.println("--------------------------");
        System.out.println(cli1);
        System.out.println("----");
        System.out.println();
        System.out.println(cli2);
        System.out.println("----");
        System.out.println();
        System.out.println(cli3);
        System.out.println("----");
        System.out.println();
        
        /** 3 - Création de 3 comptes pour les clients créés */

        Compte c1 = new Compte(cli1, 1600);
        Compte c2 = new Compte(cli2, 600);
        Compte c3 = new Compte(cli3, 42);

        
        /** 4 - Affichage des informations de chaque compte */

        System.out.println("Affichage de chaque compte");
        System.out.println("--------------------------");
        System.out.println(c1);
        System.out.println("----");
        System.out.println();
        System.out.println(c2);
        System.out.println("----");
        System.out.println();
        System.out.println(c3);
        System.out.println("----");
        
        /** 5a - Création dune banque */

       Banque b = new Banque();

       /** 5b - Ajout des 3 comptes crées */

       b.ajouterCompte(c1);
       b.ajouterCompte(c2);
       b.ajouterCompte(c3);
      
       /** 6 - Affichage de liste des comptes */

        b.listeCompte();
       
       /** 7 - Sauvegarde de la banque */

        Banque backup = b.copie();

        /** 8 - Affichage de la liste des comptes dans la sauvegarde */

        backup.listeCompteBackup();

       /** 9 - Recherche et affichage du compte correspondant au nom « dubois » et prénom « maryse » */

        System.out.println("Compte de \"Maryse Dubois\"");
        System.out.print("-------------------------");
        b.afficherUnCompte(b.rechercherUnCompte("dubois","Maryse"));


       /** 10 - Débitez le compte de Alain DUPONT de 120,50 $. */

       b.debiterUnCompte(b.rechercherUnCompte("dupont","alain"), 120.5);

        /** 11 - Effectuez un virement de 210 $ du compte de "Maryse DUBOIS" vers celui de "Alain DUPONT" */

        b.virerement(b.rechercherUnCompte("dupont","alain"), b.rechercherUnCompte("dubois","Maryse"), 210);
       
       /** 12 - Affichez la liste de tous les comptes contenus dans la banque */

        b.listeCompte();
       
       /** 13 - Effectuez un virement de 90 $ du compte de " Maryse DUBOIS " vers celui de " Marcel DUCHAMP " */

        b.virerement(b.rechercherUnCompte("DUCHAMP","Marcel"), b.rechercherUnCompte("dubois","Maryse"), 90);
       
       /** 14 - Effectuez un virement de 500 $ du compte de Marcel DUCHAMP vers celui de Alain DUPONT */

        b.virerement(b.rechercherUnCompte("dupont","alain"), b.rechercherUnCompte("DUCHAMP","Marcel"), 500);
       
       /** 15 - Affichez la liste de tous les comptes contenus dans la banque */

        b.listeCompte();
       
       /** 16 - Supprimez le compte de Maryse DUBOIS de la banque */

        b.supprimerUnCompte(b.rechercherUnCompte("dubois","Maryse"));
       
       /** 17 - Affichez la liste de tous les comptes contenus dans la banque */

       b.listeCompte();

       /** 18 - Affichage de la sauvegarde */

        backup.listeCompteBackup();
    }
}
