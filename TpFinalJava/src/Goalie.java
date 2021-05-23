public class Goalie extends Joueur {

    public Goalie( int IDJoueur , String nomJoueur , String preNomJoueur , int IDEquipeJoueur ) {
        super ( IDJoueur , nomJoueur , preNomJoueur , IDEquipeJoueur );
    }

    public int nbButEncaisse() {
        int nombreDeBut = 0;
        for ( int i = 0 ; i < League.matchesCompletes.size () ; i++ ) {
            if ( League.matchesCompletes.get ( i ).getIDEquipeLocal () == getIDEquipeJoueur () || League.matchesCompletes.get ( i ).getIDEquipeVisiteur () == getIDEquipeJoueur () ) {
                nombreDeBut = nombreDeBut + League.matchesCompletes.get ( i ).nbButsEncaissesJoueur ( this );
            }
        }
        return nombreDeBut;
    }
}


    

   

