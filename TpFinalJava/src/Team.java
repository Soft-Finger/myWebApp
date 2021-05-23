import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Team {
    private int ID;
    private String teamName;
    private String teamCity;

    ArrayList < Joueur > players;

    public Team ( int ID , String teamName , String teamCity ) {
        if ( teamName == null || teamCity == null ) {
            throw new IllegalArgumentException ( " impossible de creer" );
        } else {
            this.ID = ID;
            this.teamName = teamName;
            this.teamCity = teamCity;
            players = new ArrayList <> ();
        }
    }

    public int getID () {
        return ID;
    }

    public String getTeamName () {
        return teamName;
    }

    public String getTeamCity () {
        return teamCity;
    }


    public void addJoueur ( Joueur j ) {
        players.add ( j );

    }

    public void removeJouer ( String nomJoueur , String prenomJoueur ) {
        int indice = - 1;
        if ( nomJoueur == null || prenomJoueur == null ) {
            throw new IllegalArgumentException ( " impossible d'ajouter null" );
        } else {
            for ( int i = 0; i < players.size (); i++ ) {
                if ( players.get ( i ).getNomJoueur ().equals ( nomJoueur ) && players.get ( i ).getPreNomJoueur ().equals ( prenomJoueur ) ) {
                    indice = i;
                    break;
                }
            }
            if ( indice != - 1 ) {
                players.remove ( indice );
            }
        }
    }

    public void removeAllJoueur () {
        players.clear ();

    }

    public int getNbJoueur () {
        return players.size ();
    }

    public ArrayList < Joueur > getPlayers () {
        return players;
    }

    static void serialize ( ArrayList < Team > equipe ) throws IOException {
        FileWriter fi = new FileWriter ( "team.csv" , true );

        PrintWriter sortie = new PrintWriter ( fi );
        if ( equipe.isEmpty () ) {
        } else {
            for ( int i = 0; i < equipe.size (); i++ ) {
                sortie.print ( equipe.get ( i ).toString () );
                sortie.println ();
            }
            sortie.close ();
        }
    }

    public static void unserialize () {
        try {
            Scanner scan = new Scanner ( new File ( "team.csv" ) );
            while (scan.hasNext ()) {
                String g = scan.nextLine ();
                StringTokenizer token = new StringTokenizer ( g , ";" );
                int id = Integer.parseInt ( token.nextToken () );
                String name = token.nextToken ();
                String city = token.nextToken ();

                Team n = new Team ( id , name , city );
                League.addTeam ( n );
            }
            scan.close ();
        } catch ( IOException e ) {
            System.out.println ( "Impossible d'ouvrir le fichier" );
        }
    }

    @Override
    public String toString () {
        return ID + ";" + teamName + ";" + teamCity;
    }
}
