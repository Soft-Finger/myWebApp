import java.util.ArrayList;

public class Game {
    private int IDGame;
    private int IDEquipeLocal;
    private int IDEquipeVisiteur;
    private ArrayList< Goal > listeButs;

    public Game ( int IDGame, int IDEquipeLocal, int IDEquipeVisiteur ) {
        this.IDGame = IDGame;
        this.IDEquipeLocal = IDEquipeLocal;
        this.IDEquipeVisiteur = IDEquipeVisiteur;
        listeButs = new ArrayList<>();
    }

    public void addGoal ( Goal g ) {
        listeButs.add( g );
    }

    public int getIDGame () {
        return IDGame;
    }

    public int getIDEquipeLocal () {
        return IDEquipeLocal;
    }

    public int getIDEquipeVisiteur () {
        return IDEquipeVisiteur;
    }

    public ArrayList< Goal > getListeButs () {
        return listeButs;
    }

    public Team getTheWinner () {
        if ( nbButsMarquesEquipe( League.getTeam( IDEquipeLocal ) ) > nbButsMarquesEquipe( League.getTeam( IDEquipeVisiteur ) ) ) {
            return League.getTeam( IDEquipeLocal );
        } else {
            return League.getTeam( IDEquipeVisiteur );
        }
    }

    public Team getThelooser () {
        if ( nbButsMarquesEquipe( League.getTeam( IDEquipeLocal ) ) > nbButsMarquesEquipe( League.getTeam( IDEquipeVisiteur ) ) ) {
            return League.getTeam( IDEquipeVisiteur );
        } else {
            return League.getTeam( IDEquipeLocal );
        }
    }

    public int nbButEncaissesTeam ( Team team ) {

        int nombreButEncaisser = 0;
        for ( int i = 0; i < this.listeButs.size(); i++ ) {
            if ( this.listeButs.get( i ).getIDTeamEcaisseur() == team.getID() ) {
                nombreButEncaisser = nombreButEncaisser + 1;
            }
        }
        return nombreButEncaisser;
    }

    public int nbButDePasse ( Joueur joueur ) {
        int nombreButPasse = 0;
        for ( int i = 0; i < listeButs.size(); i++ ) {
            if ( listeButs.get( i ).getIDJoueurAssistant1() == joueur.getIDJoueur() || listeButs.get( i ).getIDJoueurAssistant2() == joueur.getIDJoueur() ) {
                nombreButPasse = nombreButPasse + 1;
            }
        }
        return nombreButPasse;
    }

    public int nbButsMarquesJoueur ( Joueur joueur ) {
        int nombreButMarquer = 0;
        for ( int i = 0; i < listeButs.size(); i++ ) {
            if ( listeButs.get( i ).getIDJoueurAuteur() == joueur.getIDJoueur() ) {
                nombreButMarquer = nombreButMarquer + 1;
            }
        }
        return nombreButMarquer;
    }

    public int nbButsEncaissesJoueur ( Joueur joueur ) {
        int nombreButEncaisser = 0;
        for ( int i = 0; i < listeButs.size(); i++ ) {
            if ( listeButs.get( i ).getIDJoueurEncaisseur() == joueur.getIDJoueur() ) {
                nombreButEncaisser = nombreButEncaisser + 1;
            }
        }
        return nombreButEncaisser;
    }

    public int nbButsMarquesEquipe ( Team team ) {
        int nombreButMarquer = 0;
        for ( int i = 0; i < listeButs.size(); i++ ) {
            if ( listeButs.get( i ).getIDTeamMarqueur() == team.getID() ) {
                nombreButMarquer = nombreButMarquer + 1;
            }
        }
        return nombreButMarquer;
    }
}
