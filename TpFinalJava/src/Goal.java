import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Goal {
    private final int IDJoueurAuteur;
    private int IDJoueurAssistant1;
    private int IDJoueurAssistant2;
    private int IDTeamMarqueur;
    private int IDTeamEcaisseur;
    private int IDGame;
    private int IDGoalierEncaisseur;

    public Goal ( int IDJoueurAuteur , int IDJoueurAssistant1, int IDJoueurAssistant2 , int IDTeamMarqueur, int IDTeamEcaisseur , int IDGame , int IDGoalierEncaisseur ) {
        this.IDJoueurAuteur = IDJoueurAuteur;
        this.IDJoueurAssistant1 = IDJoueurAssistant1;
        this.IDJoueurAssistant2 = IDJoueurAssistant2;
        this.IDTeamMarqueur = IDTeamMarqueur;
        this.IDTeamEcaisseur = IDTeamEcaisseur;
        this.IDGame = IDGame;
        this.IDGoalierEncaisseur = IDGoalierEncaisseur;
    }

    public Goal ( int IDJoueurAuteur , int IDJoueurAssistant1, int IDJoueurAssistant2 , int IDTeamMarqueur, int IDTeamEcaisseur , int IDGame ) {
        this.IDJoueurAuteur = IDJoueurAuteur;
        this.IDJoueurAssistant1 = IDJoueurAssistant1;
        this.IDJoueurAssistant2 = IDJoueurAssistant2;
        this.IDTeamMarqueur = IDTeamMarqueur;
        this.IDTeamEcaisseur = IDTeamEcaisseur;
        this.IDGame = IDGame;
    }

    public Goal ( int IDJoueurAuteur , int IDTeamMarqueur, int IDTeamEcaisseur , int IDGame , int IDGoalierEncaisseur ) {
        this.IDJoueurAuteur = IDJoueurAuteur;
        this.IDTeamMarqueur = IDTeamMarqueur;
        this.IDTeamEcaisseur = IDTeamEcaisseur;
        this.IDGame = IDGame;
        this.IDGoalierEncaisseur = IDGoalierEncaisseur;
    }

    public Goal ( int IDJoueurAuteur , int IDTeamMarqueur, int IDTeamEcaisseur , int IDGame ) {
        this.IDJoueurAuteur = IDJoueurAuteur;
        this.IDTeamMarqueur = IDTeamMarqueur;
        this.IDTeamEcaisseur = IDTeamEcaisseur;
        this.IDGame = IDGame;
    }

    public int getIDJoueurAuteur () {
        return IDJoueurAuteur;
    }

    public int getIDJoueurAssistant1 () {
        return IDJoueurAssistant1;
    }

    public int getIDJoueurAssistant2 () {
        return IDJoueurAssistant2;
    }

    public int getIDTeamMarqueur () {
        return IDTeamMarqueur;
    }

    public int getIDTeamEcaisseur () {
        return IDTeamEcaisseur;
    }

    public int getIDGame () {
        return IDGame;
    }

    public int getIDGoalierEncaisseur () {
        return IDGoalierEncaisseur;
    }

    static void serialize ( ArrayList < Goal > goals ) throws IOException {
        FileWriter fi = new FileWriter ( "goal.csv" , true );
        PrintWriter sorti = new PrintWriter ( fi );

        if ( goals.isEmpty () ) {
            System.out.println("La liste des buts est vide");
            } else {
                for ( int i = 0 ; i < goals.size () ; i++ ) {
                    sorti.print ( goals.get ( i ).toString () );
                    sorti.println ();
                }
                sorti.close();
            }
    }

    public static void unserialize () {
        try {
            Scanner scan = new Scanner ( new File ( "goal.csv" ) );
            while ( scan.hasNext () ) {
                String g = scan.nextLine ();
                StringTokenizer token = new StringTokenizer ( g , ";" );

                int idJoueurAuteur = Integer.parseInt ( token.nextToken () );
                int idJoueurAssistan1 = Integer.parseInt ( token.nextToken () );
                int idJoueurAssistant2 = Integer.parseInt ( token.nextToken () );
                int idTeamMarquer = Integer.parseInt ( token.nextToken () );
                int idTeamEcaisseur = Integer.parseInt ( token.nextToken () );
                int idGame = Integer.parseInt ( token.nextToken () );
                int idJoueurEncaisseur = Integer.parseInt ( token.nextToken () );

                for ( int i = 0 ; i < League.matchesCompletes.size () ; i++ ) {
                    if ( League.matchesCompletes.get ( i ).getIDGame () == idGame ) {
                        Goal gao = new Goal ( idJoueurAuteur , idJoueurAssistan1 , idJoueurAssistant2 , idTeamMarquer , idTeamEcaisseur , idGame , idJoueurEncaisseur );
                        League.matchesCompletes.get ( i ).addGoal ( gao );
                    }
                }
            }
            scan.close ();
        } catch ( IOException e ) {
            System.out.println ( "Impossible d'ouvrir le fichier" );
        }
    }

    @Override
    public String toString () {
        return IDJoueurAuteur + ";" + IDJoueurAssistant1 + ";" + IDJoueurAssistant2 + ";" + IDTeamMarqueur + ";" + IDTeamEcaisseur + ";" + IDGame + ";" + IDGoalierEncaisseur;
    }

}