

public class Main {
    public static void main(String[] args) {

        // Création de 3 clients
        Client cli1 = new Client("M","dupont","alain",1988,"32 rue De Marseille","514-223-0908");
        Client cli2 = new Client("Mme","DUBOIS","Marlyse",1986,"3443 Rue Gauchetiere","514-465-5555");
        Client cli3 = new Client("M","DUCHAMP","Marcel",1999,"23e, 60 avenue des Technos","514-145-0998");
        
        // Affichage de chaque client
        System.out.println("Affichage de chaque client");
        System.out.print("**************************");
        System.out.println();
        System.out.println(cli1);
        System.out.println("---");
        System.out.println(cli2);
        System.out.println("---");
        System.out.println(cli3);
        System.out.println("====================");
        System.out.println();

        
         // Création de 3 comptes pour les clients créés
        Compte c1 = new Compte(cli1, 1600);
        Compte c2 = new Compte(cli2, 600);
        Compte c3 = new Compte(cli3, 42);

        /* Affichage des informations de chaque
         *compte et son propriétaire
         */
        System.out.println("Informations compte et propriétaire");
        System.out.println("************************************");
        System.out.println(c1);
        System.out.println("---");
        System.out.println();
        System.out.println(c2);
        System.out.println("---");
        System.out.println();
        System.out.println(c3);
        System.out.println("====================");

        
        // Création dune banque
        Banque b = new Banque();

       // Ajout des 3 comptes crées à la banque
        b.ajouterCompte(c1);
        b.ajouterCompte(c2);
        b.ajouterCompte(c3);

       //Affichage de liste des comptes
        b.listeCompte();
        //System.out.println("COPIE");
        //Banque test = b.backupBanque();
        //test.listeCompte();
       //Recherche et affichage du compte correspondant au nom « dubois » et prénom « maryse » 
       b.afficherUnCompte(b.rechercherUnCompte("dubois","Marlyse"));
       
       // Débiter le compte de Alain DUPONT de 120,50 $.
       b.debiterUnCompte(b.rechercherUnCompte("dupont","alain"), 120.5);
       
       // Virement de 210 $ du compte de Maryse DUBOIS vers celui de Alain DUPONT
       b.virement(b.rechercherUnCompte("dupont","alain"), b.rechercherUnCompte("dubois","Marlyse"), 210);
       
       //Affichage de la liste de tous les comptes contenus dans la banque
       b.listeCompte();
       
       //Virement de 90 $ du compte de Maryse DUBOIS vers celui de Marcel DUCHAMP
       b.virement(b.rechercherUnCompte("DUCHAMP","Marcel"), b.rechercherUnCompte("dubois","Marlyse"), 90);
       
       //Virement de 500 $ du compte de Marcel DUCHAMP vers celui de Alain DUPONT
       b.virement(b.rechercherUnCompte("dupont","alain"), b.rechercherUnCompte("DUCHAMP","Marcel"), 500);
       
       // Affichage la liste de tous les comptes contenus dans la banque
       b.listeCompte();
       
       //Supression du compte de Maryse DUBOIS de la banque
       b.supprimerUnCompte(b.rechercherUnCompte("dubois","Marlyse"));
       
       //Affichage la liste de tous les comptes contenus dans la banque
       b.listeCompte();
    }
   
    
}
