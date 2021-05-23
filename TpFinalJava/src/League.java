import java.io.IOException;
import java.util.ArrayList;

public class League {
    public static ArrayList < Team > listeEquipe;
    public static ArrayList < Game > matchesCompletes;

    public League() {
        listeEquipe = new ArrayList <>();
        matchesCompletes = new ArrayList <>();
    }

    public static void addTeam( Team team ) {
        for ( int i = 0; i < listeEquipe.size(); i++ ) {
            if ( listeEquipe.get( i ).getTeamName() == team.getTeamName() ) {
                System.out.println("Ce nom d'équipe existe déjà, ajout impossible");
            }
        }
        listeEquipe.add( team );
    }

    public void removeTeam( Team team ) {
        removeTeam( team.getID() );
    }

    public void removeTeam( int id ) {
        int indice = - 1;
        if ( id < 0 ) {
            throw new IllegalArgumentException( " impossible d'ajouter null" );
        } else {
            for ( int i = 0 ; i < listeEquipe.size() ; i++ ) {
                if ( listeEquipe.get( i ).getID() == id ) {
                    indice = i;
                    break;
                }
            }
            if ( indice != - 1 ) {
                listeEquipe.remove( indice );
            }
        }
    }

    public static Team getTeam( int id ) {
        int indice = - 1;
        if ( id < 0 ) {
            throw new IllegalArgumentException( " impossible d'ajouter null" );
        } else {
            for ( int i = 0 ; i < listeEquipe.size() ; i++ ) {
                if ( listeEquipe.get( i ).getID() == id ) {
                    indice = i;
                    break;
                }
            }
        }

        if ( indice != - 1 ) {
            return listeEquipe.get( indice );
        } else {
            return null;
        }
    }

    public static void addGame( Game game ) {
        matchesCompletes.add( game );
    }

    public static ArrayList < Game > getGames() {
        return matchesCompletes;
    }

    // a revoir
    public static ArrayList < Game > getGames( Team team ) {
        ArrayList < Game > match = new ArrayList <>();
        for ( Game matchesComplete : matchesCompletes ) {
            if ( matchesComplete.getIDEquipeLocal() == team.getID() || matchesComplete.getIDEquipeVisiteur() == team.getID() ) {
                match.add( matchesComplete );
            }
        }
        return match;
    }

    public Game getGame( int id ) {
        int indice = - 1;
        if ( id < 0 ) {
            throw new IllegalArgumentException( " impossible d'ajouter null" );
        } else {
            for ( int i = 0 ; i < matchesCompletes.size() ; i++ ) {
                if ( matchesCompletes.get( i ).getIDGame() == id ) {
                    indice = i;
                    break;
                }
            }
        }

        if ( indice != - 1 ) {
            return matchesCompletes.get( indice );
        } else {
            return null;
        }
    }

    public int getNumberOfWins( Team team ) {
        int nbWin = 0;
        for ( Game matchesComplete : matchesCompletes ) {
            if ( matchesComplete.getTheWinner().getID() == team.getID() ) {
                nbWin = nbWin + 1;
            }
        }
        return nbWin;
    }

    public int getNumberOfLoss( Team team ) {
        int nbLoss = 0;
        for ( Game matchesComplete : matchesCompletes ) {
            if ( (matchesComplete.getThelooser().getID() == team.getID()) ) {
                nbLoss = nbLoss + 1;
            }
        }
        return nbLoss;
    }


    public static int getTotalGoalFor( Team team ) {
        int totalGoalFor = 0;
        ArrayList < Game > match = getGames( team );

        for ( Game game : match ) {
            totalGoalFor = totalGoalFor + game.nbButsMarquesEquipe( team );
        }
        return totalGoalFor;
    }

    public static int getTotalGoalAgainst( Team team ) {
        int totalGoalAgainst = 0;
        ArrayList < Game > match = getGames( team );

        for ( Game game : match ) {
            totalGoalAgainst = totalGoalAgainst + game.nbButEncaissesTeam( team );
        }
        return totalGoalAgainst;
    }

    public ArrayList < Team > getListeEquipe() {
        return listeEquipe;
    }

    // sauvegarde
    public static void save() throws IOException {
        try {
            for ( Team team : listeEquipe ) {
                Joueur.serialize( team.players );
            }
        } catch ( IOException e ) {
            System.out.println( "Fichier introuvable" );
        }

        try {
            Team.serialize( listeEquipe );
            for ( Game matchesComplete : matchesCompletes ) {
                Goal.serialize( matchesComplete.getListeButs() );
            }
        } catch ( IOException e ) {
            System.out.println( "Fichier introuvable" );
        }
        try {
            Game.serialize( matchesCompletes );
        } catch ( IOException e ) {
            System.out.println( "Fichier introuvable" );
        }
    }

    public static void load() {
        Team.unserialize();
        Joueur.unserialize();
        Game.unserialize();
        Goal.unserialize();
    }
}

