import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Game {
    private final int IDGame;
    private final int IDEquipeLocal;
    private final int IDEquipeVisiteur;
    private ArrayList < Goal > listeButs;

    public Game ( int IDGame, int IDEquipeLocal, int IDEquipeVisiteur ) {
        this.IDGame = IDGame;
        this.IDEquipeLocal = IDEquipeLocal;
        this.IDEquipeVisiteur = IDEquipeVisiteur;
        listeButs = new ArrayList <> ();
    }

    public void addGoal ( Goal goal ) {
        listeButs.add ( goal );
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

    public ArrayList < Goal > getListeButs () {
        return listeButs;
    }

    public Team getTheWinner () {
        if ( nbButsMarquesEquipe ( League.getTeam ( IDEquipeLocal ) ) > nbButsMarquesEquipe ( League.getTeam ( IDEquipeVisiteur ) ) ) {
            return League.getTeam ( IDEquipeLocal );
        } else {
            return League.getTeam ( IDEquipeVisiteur );
        }
    }

    public Team getThelooser () {
        if ( nbButsMarquesEquipe ( League.getTeam ( IDEquipeLocal ) ) > nbButsMarquesEquipe ( League.getTeam ( IDEquipeVisiteur ) ) ) {
            return League.getTeam ( IDEquipeVisiteur );
        } else {
            return League.getTeam ( IDEquipeLocal );
        }
    }

    public int nbButEncaissesTeam ( Team team ) {
        int nombreButEncaisser = 0;
        for ( Goal listeBut : this.listeButs ) {
            if ( listeBut.getIDTeamEcaisseur () == team.getID () ) {
                nombreButEncaisser = nombreButEncaisser + 1;
            }
        }
        return nombreButEncaisser;
    }

    public int nbButDePasse ( Joueur joueur ) {
        int nombreButPasse = 0;
        for ( Goal listeBut : listeButs ) {
            if ( listeBut.getIDJoueurAssistant1 () == joueur.getIDJoueur () || listeBut.getIDJoueurAssistant2 () == joueur.getIDJoueur () ) {
                nombreButPasse = nombreButPasse + 1;
            }
        }
        return nombreButPasse;
    }

    public int nAssistJoueur(Joueur joueur) {
        int nAssistJoueur = 0;
        for(Goal but: listeButs) {
            if ( but.getIDJoueurAssistant1() == joueur.getIDJoueur() || but.getIDJoueurAssistant2() == joueur.getIDJoueur()) {
                nAssistJoueur = nAssistJoueur + 1;
            }
        }
        return nAssistJoueur;
    }

    public int nbButsMarquesJoueur ( Joueur joueur ) {
        int nombreButMarquer = 0;
        for ( Goal listeBut : listeButs ) {
            if ( listeBut.getIDJoueurAuteur () == joueur.getIDJoueur () ) {
                nombreButMarquer = nombreButMarquer + 1;
            }
        }
        return nombreButMarquer;
    }

    public int nbButsEncaissesJoueur ( Joueur joueur ) {
        int nombreButEncaisser = 0;
        try {
            nombreButEncaisser = 0;
            for ( Goal listeBut : listeButs ) {
                if ( listeBut.getIDGoalierEncaisseur() == joueur.getIDJoueur () ) {
                    nombreButEncaisser = nombreButEncaisser + 1;
                }
            }
        } catch ( Exception e ) {
            System.out.println("Liste vide");
        }
        return nombreButEncaisser;
    }

    public int nbButsMarquesEquipe ( Team team ) {
        int nombreButMarquer = 0;
        for ( Goal listeBut : listeButs ) {
            if ( listeBut.getIDTeamMarqueur () == team.getID () ) {
                nombreButMarquer = nombreButMarquer + 1;
            }
        }
        return nombreButMarquer;
    }

    static void serialize ( ArrayList < Game > games ) throws IOException {
        try {
            FileWriter fi = new FileWriter ( "game.csv", true );

            PrintWriter sortie = new PrintWriter ( fi );
            if ( games.isEmpty () ) {
                System.out.println ("Liste vide");
            } else {
                for ( Game game : games ) {
                    sortie.print ( game.toString () );
                    sortie.println ();
                }
                sortie.close ();
            }
        } catch ( IOException e ) {
            System.out.println("Fichier introuvable");
        }
    }

    public static void unserialize () {
        try {
            Scanner scan = new Scanner ( new File ( "game.csv" ) );
            while ( scan.hasNext () ) {
                String g = scan.nextLine ();
                StringTokenizer token = new StringTokenizer ( g, ";" );
                int idGame = Integer.parseInt ( token.nextToken () );
                int idEquipeLocal = Integer.parseInt ( token.nextToken () );
                int idEquipeVisiteur = Integer.parseInt ( token.nextToken () );

                Game gam = new Game ( idGame, idEquipeLocal, idEquipeVisiteur );
                League.addGame ( gam );
            }
            scan.close ();
        } catch ( IOException e ) {
            System.out.println ( "Impossible d'ouvrir le fichier" );
        } catch ( NumberFormatException nfe) {
            System.out.println ("mauvais formatage");
        }
    }

    @Override
    public String toString () {
        return  IDGame + ";" + IDEquipeLocal + ";" + IDEquipeVisiteur;
    }

}
