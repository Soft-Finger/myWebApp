
public class Banque{
     private Compte[] compteEnBanque;
     private static int compteurCompte = 0;
   
    public Banque() {
        this.compteEnBanque = new Compte[100];
    }

    /*public Banque(Compte[] compteEnBanqueCopie) {
        this.compteEnBanque = new Compte[100];
    }*/


    /**Méthode qui affiche la liste des comptes dans la banque
     * return elle ne retourne rien
     */


    public void listeCompte() {
       System.out.println();
        System.out.println("Liste des comptes");
        System.out.println("================");
        for( Compte compte : this.compteEnBanque ) {
            if (compte != null) {
                System.out.println(compte);
            }
        }
        System.out.println("====================");
    }

    /**Méthode qui permet d'obtenir l'index d'un compte dans la banque
     * a partir d'un npmbre qu'elle reçoit en paramettre
     * @param numeroCompte le numero du compte à trouver passé en paramettre
     * @return  elle retourne la position du compte dans la banque
     */

    public int obtenirIndexCompte(int numeroCompte) {
        int positionCompte = -1;
        for( int i = 0; i < this.compteEnBanque.length; i = i + 1) {
            if(this.compteEnBanque[i] != null) {
                if(this.compteEnBanque[i].getCompteId() == numeroCompte) {
                    positionCompte = i;
                }
            }
        }
        return positionCompte;
    }
        /**Méthode qui affiche un compte en banque en fonction de son numéro
         * cette méthode utilise méthode obtenirIndexCompte() pour trouver
         * l'index du compte, ce qui nous permettra d'afficher sa position
         * @param numeroCompte le numéro du compte à afficher
         * return elle les retourne les informations du compte à la position de l'index
         */


    public void afficherUnCompte(int numeroCompte){
      int position = obtenirIndexCompte(numeroCompte);
        if (position != -1){
            System.out.println();
             System.out.println("Informations du compte No #" + numeroCompte);
            System.out.println(this.compteEnBanque[position]);
        } else {
            System.out.println();
            System.out.println("Numero de compte introuvable");
        }
   }
    
 public void crediterUnCompte(int numeroCompte, double montant) {
    int position = obtenirIndexCompte(numeroCompte);
    if (position != -1) {
            this.compteEnBanque[position].crediter(montant);
        } else {
        System.out.println();
        System.out.println("Numero de compte introuvable");
    }
 }
     
  public void debiterUnCompte(int numeroCompte, double montant) {
      int position = obtenirIndexCompte(numeroCompte);
      if (position != -1) {
          this.compteEnBanque[position].debiter(montant);
      }else {
          System.out.println();
          System.out.println("Aucun compte n'a ce numéro");
      }
  }

   public void supprimerUnCompte(int numeroCompte) {
        int position = obtenirIndexCompte(numeroCompte);
        if (position != -1){
            this.compteEnBanque = miseAJourDesTableaux(position, this.compteEnBanque);
            compteurCompte = compteurCompte - 1;
        } else{
            System.out.println();
            System.out.println("Aucun compte n'a ce numéro");
        }
   }

    /** Méthode qui consiste à effectuer un virement d'un compte à un autre
     * avec les identifiants des comptes. elle va utiliser la méthode obtenirIndexCompte()
     * des deux deux comptes.
     * @param numeroCompteACrediter le numero du compte sur lequel on envoie l'argent
     * @param numeroCompteADebiter le numero du compte sur lequel on prélève l'argent
     * elle ne retourne rien.
     */

   public void virement(int numeroCompteACrediter, int numeroCompteADebiter, double montantVirement) {
        int position1 = obtenirIndexCompte(numeroCompteACrediter);
        int position2 = obtenirIndexCompte(numeroCompteADebiter);

         if (position1 != -1 && position2 != -1 ){
            this.compteEnBanque[position2].debiter(montantVirement);
            if((this.compteEnBanque[position2].getSolde() - montantVirement < -100)){
                System.out.println();
                System.out.println("Virement impossible, montant insuffisant");
            }else{
                this.compteEnBanque[position1].crediter(montantVirement);
            }
         }else{
            System.out.println();
            System.out.println("Numéro de compte inexistent !");
         }
   }

    /** Vérification si le tableau des comptes est plein */

    public void ajouterCompte(Compte compte) {
         if(compteurCompte == this.compteEnBanque.length){
            System.out.println("banque plein ajout impossible");
         }else{
             this.compteEnBanque[compteurCompte] = compte;
             compteurCompte = compteurCompte + 1;
        }
    }
    
    public Compte [] miseAJourDesTableaux(int position, Compte[] c){
        Compte[] temp = new Compte[c.length];
        int positionTemp = 0;
        c[position] = null;
        for( Compte compte : c ) {
            if (compte != null) {
                temp[positionTemp] = compte;
                positionTemp = positionTemp + 1;
            }
        }
        return temp;
  }

    /**
     * */

      public int rechercherUnCompte(String nom, String prenom) {
        int numeroCompte = -1;
          for( Compte compte : this.compteEnBanque ) {
              if (compte != null) {
                  if (compte.getTitulaire().getNom().equalsIgnoreCase(nom) &&
                          compte.getTitulaire().getPrenom().equalsIgnoreCase(prenom)) {
                      numeroCompte = compte.getCompteId();
                  }
              }
          }
        return numeroCompte;
      }

     /* public Banque backupBanque() {
          Banque c = new Banque(100);
          for( int i = 0; i < this.CompteEnBanque.length; i++ ) {
              for( int j = 0; j < compteEnBanqueCopie.length; j++ ) {
                  if (this.CompteEnBanque[i] != null) {
                      compteEnBanqueCopie[j] = this.CompteEnBanque[i];
                  }
              }
             c = new Banque(compteEnBanqueCopie);
          }
          return c;
      }*/
/*
    public  void backupBanque() {
       backupCompte  = new  Compte[compteEnBanque.length];
    }*/

  }
