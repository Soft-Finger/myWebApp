import java.util.ArrayList;

public class Team {
    private int ID;
    private String teamName;
    private String teamCity;

    ArrayList < Joueur > players;

    public Team ( int ID, String teamName, String teamCity ) {
        if ( teamName == null || teamCity == null ) {
            throw new IllegalArgumentException( " impossible de créer" );
        } else {
            this.ID = ID;
            this.teamName = teamName;
            this.teamCity = teamCity;
            players = new ArrayList <>();
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
        players.add( j );

    }

    public void removeJoueur ( String nomJoueur, String prenomJoueur ) {
        int indice = - 1;
        if ( nomJoueur == null || prenomJoueur == null ) {
            throw new IllegalArgumentException( " impossible d'ajouter null" );
        } else {
            for ( int i = 0; i < players.size(); i++ ) {
                if ( players.get( i ).getNomJoueur().equals( nomJoueur ) && players.get( i ).getPreNomJoueur().equals( prenomJoueur ) ) {
                    indice = i;
                    break;
                }
            }

            if ( indice != - 1 ) {
                players.remove( indice );
            }
        }
    }

    public void removeAllJoueur () {
        players.clear();
    }

    public int getNbJoueur () {
        return players.size();
    }

}
