/**
 * Programme permettant la gestion des comptes bancaires.
 * @author Yahaya Moukaila
 * date 20 février 2021
 */

public class Banque {

     private Compte[] CompteEnBanque;
     private Compte[] CompteEnBanqueBackUp;
     static int compteurCompte = 0;
   
    public Banque() {
        this.CompteEnBanque = new Compte[100];
    }

    /**
     * Le constructeur qui instancie la sauvegarde avec la meme taille
     * et l'initialise avec la copie des comptes en banque
     * @param c un tableau de compte
     * ne retourne rien.
     */

     public Banque(Compte[] c) {
     	CompteEnBanqueBackUp = new Compte[100];
     	for(int i = 0; i < c.length; i++) {
            if(c[i] != null) {
                CompteEnBanqueBackUp[i] = c[i].copieCompte();
            }
        }
     }

    /**
     * LA Méthode qui copie la banque
     * @return une nouvelle instance de la banque copiée
     */

    public Banque copie() {
     Banque   b = new Banque(CompteEnBanque);
     return b;
    }

    /**
     * Méthode qui affiche la liste des comptes dans la banque
     * elle ne retourne rien
     */

    public void listeCompte() {
       System.out.println();
       System.out.println("-- Liste des comptes --");
        System.out.println("-------------------");

        for(int i = 0; i < this.CompteEnBanque.length; i++) {
            if(this.CompteEnBanque[i] != null) {
             System.out.println(this.CompteEnBanque[i]);
                System.out.println();
            }
        }
    }

    /**
     * Méthode qui affiche la liste des comptes dans la sauvegarde de la banque
     * elle ne retourne rien
     */

     public void listeCompteBackup() {
       System.out.println();
       System.out.println("Liste des comptes sauvegardés");
         System.out.println("---------------------------");

        for(int i = 0; i < CompteEnBanqueBackUp.length; i++){
            if(CompteEnBanqueBackUp[i] != null){
                System.out.println(CompteEnBanqueBackUp[i]);
                System.out.println();
            }
        }
    }

    /**
     * Méthode qui permet d'obtenir l'index d'un compte dans la banque
     * a partir d'un nombre qu'elle reçoit en paramettre
     * @param numeroCompte le numero du compte à trouver passé en paramettre
     * @return  elle retourne la position du compte dans la banque
     */
    
    public int obtenirIndexCompte(int numeroCompte) {
        int positionCompte = - 1;
        for(int i = 0; i < this.CompteEnBanque.length; i = i + 1) {
            if(this.CompteEnBanque[i] != null) {
                if(this.CompteEnBanque[i].getCompteId() == numeroCompte) {
                    positionCompte = i;
                }
            }
        }
        return positionCompte;
    }

    /**
     * Méthode qui affiche un compte en banque en fonction de son numéro
     * cette méthode utilise la méthode obtenirIndexCompte() pour trouver
     * l'index du compte, ce qui nous permettra d'afficher sa position
     * @param numeroCompte le numéro du compte à afficher
     * elle ne retourne rien
     */

    public void afficherUnCompte(int numeroCompte) {
      int position = obtenirIndexCompte(numeroCompte);
        if (position != -1) {
            System.out.println();
             System.out.println("Informations du compte No #" + numeroCompte);
            System.out.println(this.CompteEnBanque[position]);
        } else {
            System.out.println();
            System.out.println("Numero de compte introuvable");
        }
   }

    /**
     * Méthode qui permet de créditer un compte en fonction de son  numéro.
     * Cette méthode utilise la méthode obtenirIndexCompte() et la méthode
     * créditer de la class Compte.
     * @param numeroCompte numéro du compte à créditer
     * @param montant montant à créditer
     */
    
   public void crediterUnCompte(int numeroCompte, double montant) {
        int position = obtenirIndexCompte(numeroCompte);
        if (position != -1) {
            this.CompteEnBanque[position].crediter(montant);
        } else {
            System.out.println();
            System.out.println("Numero de compte introuvable");
        }
    }

    /**
     * Méthode qui permet de débiter un compte en fonction de son  numéro.
     * Cette méthode utilise la méthode obtenirIndexCompte() et la fonction
     * débiter de la class Compte.
     * @param numeroCompte numéro du compte à débiter
     * @param montant montant à débiter
     */

    public void debiterUnCompte(int numeroCompte, double montant) {
        int position = obtenirIndexCompte(numeroCompte);
        if (position != -1) {
            this.CompteEnBanque[position].debiter(montant);
        } else {
            System.out.println();
            System.out.println("Numero de compte introuvable");
        }
    }

    /**
     * Méthode qui permet de supprimer un compte en fonction de son  numéro.
     * Cette méthode utilise la méthode obtenirIndexCompte() pour la position
     * du compte et la méthode miseAJourDesTableau() (ligne 200) pour ranger les comptes
     * après suppression d'un compte de la class Compte.
     * @param numeroCompte numéro du compte à supprimer.
     */
      
    public void supprimerUnCompte(int numeroCompte) {
        int position = obtenirIndexCompte(numeroCompte);
        if (position != -1) {
            this.CompteEnBanque = miseAJourDesTableau(position, this.CompteEnBanque);
            compteurCompte = compteurCompte - 1;
        } else {
            System.out.println();
            System.out.println("Numero de compte introuvable");
        }
    }

    /**
     * Méthode qui permet de faire un virement d'un compte à un autre à partir de leur numéro respectif
     * cette méthode utilise les méthodes obtenirIndexCompte() pour identifier le numero des comptes
     * et les méthodes débiter et créditer pour effectuer la transaction du virement.
     * @param numeroCompteACrediter compte à créditer
     * @param numeroCompteADebiter compte à débiter
     * @param montantVirement montant de la transaction
     */

    public void virerement (int numeroCompteACrediter, int numeroCompteADebiter, double montantVirement) {
         int position1 = obtenirIndexCompte(numeroCompteACrediter);
         int position2 = obtenirIndexCompte(numeroCompteADebiter);

        if (position1 != -1 && position2 != -1 ) {
            this.CompteEnBanque[position2].debiter(montantVirement);
            if((this.CompteEnBanque[position2].getSolde() - montantVirement <- 100)) {
                System.out.println();
                System.out.println("Virement impossible solde insuffisant !!!");
            }else {
                this.CompteEnBanque[position1].crediter(montantVirement);
            }
        } else {
            System.out.println();
            System.out.println("Numero de compte introuvable");
        }
    }

    /**
     * Méthode qui permet d'ajouter un compte à la banque si la banque n'est pas au
     * maximum de sa capacité
     * @param compte le compte à ajouter
     */

    public void ajouterCompte(Compte compte) {
        //Vérification si le tableau des comptes est plein
        if(compteurCompte == this.CompteEnBanque.length) {
            System.out.println("Banque: Max capacité, ajout impossible, réésayer ultérieurement. merci !!!");
        } else {
             this.CompteEnBanque[compteurCompte] = compte;
             compteurCompte = compteurCompte + 1;
        }
    }

    /**
     * Méthode qui met le tableau des comptes en ordre après la supression
     * d'un compte elle est utilisée par la méthode supprimerUnCompte() (ligne 138)
     * @param position position du compte supprimé
     * @param c tableau de comptes
     * @return le tableau de comptes temporaire
     */

    public Compte[] miseAJourDesTableau(int position, Compte[] c) {
       Compte[] temp = new Compte[c.length];
       int positionTemp = 0;
       c[position] = null;

       for(int i = 0; i < c.length; i++) {
           if(c[i] != null){
               temp[positionTemp] = c[i];
               positionTemp = positionTemp + 1;
           }
       }
        return temp;
    }

    /**
     * Méthode qui permet de rechercher un compte à partir d'un nom et prénom
     * cette recherche est insensible à la casse donc utilise la méthode
     * equalsIgnoreCase() sur le nom et le prénom
     * @param nom du titulaire du compte
     * @param prenom du titulaire du compte
     * @return retourne le numéro du compte
     */
     
  public int rechercherUnCompte(String nom, String prenom) {
      int numeroCompte = -1;
      for( int i = 0; i < this.CompteEnBanque.length; i = i + 1 ) {
          if (this.CompteEnBanque[i] != null) {
              if (this.CompteEnBanque[i].getTitulaire().getNom().equalsIgnoreCase(nom) &&
                      this.CompteEnBanque[i].getTitulaire().getPrenom().equalsIgnoreCase(prenom)) {
                  numeroCompte = this.CompteEnBanque[i].getCompteId();
              }
          }
      }
      return numeroCompte;
  }
}
