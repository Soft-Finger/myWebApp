public class Joueur {
    protected int IDJoueur;
    protected String nomJoueur;
    protected String preNomJoueur;
    protected int IDEquipeJoueur;

    public Joueur (int IDJoueur, String nomJoueur, String preNomJoueur, int IDEquipeJoueur) {
        this.IDJoueur = IDJoueur;
        this.nomJoueur = nomJoueur;
        this.preNomJoueur = preNomJoueur;
        this.IDEquipeJoueur = IDEquipeJoueur;
    }

    public int getIDJoueur () {
        return IDJoueur;
    }

    public String getPreNomJoueur () {
        return preNomJoueur;
    }

    public int getIDEquipeJoueur () {
        return IDEquipeJoueur;
    }

    public String getNomJoueur () {
        return nomJoueur;
    }

    public void setPreNomJoueur (String preNomJoueur) throws IllegalArgumentException {
        if ( preNomJoueur == null ) {
            throw new IllegalArgumentException ( "prenom ne peut être null" );
        } else {
            this.preNomJoueur = preNomJoueur;
        }
    }

    public int nbButMarques () {
        int nombreDeBut = 0;
        for ( int i = 0; i < League.matchesCompletes.size ( ); i++ ) {
            if ( League.matchesCompletes.get ( i ).getIDEquipeLocal ( ) == getIDEquipeJoueur ( ) || League.matchesCompletes.get ( i ).getIDEquipeVisiteur ( ) == getIDEquipeJoueur ( ) ) {
                nombreDeBut = nombreDeBut + League.matchesCompletes.get ( i ).nbButsMarquesJoueur ( this );
            }
        }
        return nombreDeBut;
    }

    public int nbButDePasse () {
        int nombreDeBut = 0;
        for ( int i = 0; i < League.matchesCompletes.size ( ); i++ ) {
            if ( League.matchesCompletes.get ( i ).getIDEquipeLocal ( ) == getIDEquipeJoueur ( ) || League.matchesCompletes.get ( i ).getIDEquipeVisiteur ( ) == getIDEquipeJoueur ( ) ) {
                nombreDeBut = nombreDeBut + League.matchesCompletes.get ( i ).nbButDePasse ( this );
            }
        }
        return nombreDeBut;
    }

    @Override
    public String toString () {
        return IDJoueur + ";" + nomJoueur + ";" + preNomJoueur + ";" + IDEquipeJoueur;
    }
}