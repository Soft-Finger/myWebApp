import java.io.IOException;

/**
 * @author Yahaya
 */
public class Sauvegarde {
    public static void main ( String[] args ) throws IOException {

        //match entre t1 et t2
        League l = new League();

        Team t1 = new Team ( 100, "Carolina Hurricane", "Montreal" );
        Team t2 = new Team ( 109, "Columbus Blue Jackets", "Quebec" );
        l.addTeam ( t1 );
        l.addTeam ( t2 );
        Joueur auteurBut = new Joueur ( 2345, "Mike", "Wise", t1.getID () );
        Joueur assistant1 = new FieldPlayer ( 4555, "Bastic", "Killer", t1.getID () );
        Joueur assistant2 = new FieldPlayer ( 4578, "Yahaya", "Moukaila", t1.getID () );
        Goalie gardienEncaisseurBut = new Goalie ( 9890, "Soft-Finger", "Goodman", t2.getID () );

        t1.addJoueur ( auteurBut );
        t1.addJoueur ( assistant1 );
        t1.addJoueur ( assistant2 );
        t2.addJoueur ( gardienEncaisseurBut );

        Game g = new Game ( 123, t1.getID (), t2.getID () );

        Goal but1 = new Goal ( auteurBut.getIDJoueur (), assistant1.getIDJoueur (), assistant2.getIDJoueur (), t1.getID (), t2.getID (), g.getIDGame (), gardienEncaisseurBut.getIDJoueur () );
        Goal but2 = new Goal ( auteurBut.getIDJoueur (), assistant1.getIDJoueur (), assistant2.getIDJoueur (), t1.getID (), t2.getID (), g.getIDGame (), gardienEncaisseurBut.getIDJoueur () );

        g.addGoal ( but1 );
        g.addGoal ( but2 );

        Joueur auteurButT2 = new Joueur ( 709, "Great", "Saf", t2.getID () );
        Joueur assistant1T2 = new FieldPlayer ( 1012, "KIM", "Kil", t2.getID () );
        Joueur assistant2T2 = new Joueur ( 333, "Mad", "Poof", t2.getID () );
        Joueur gardienEncaisseurButT1 = new Goalie ( 1980, "NAS", "mou", t1.getID () );
        t2.addJoueur ( auteurButT2 );
        t2.addJoueur ( assistant1T2 );
        t2.addJoueur ( assistant2T2 );
        t1.addJoueur ( gardienEncaisseurButT1 );

        Goal but3 = new Goal ( auteurButT2.getIDJoueur (), assistant1T2.getIDJoueur (), assistant2T2.getIDJoueur (), t2.getID (), t1.getID (), g.getIDGame (), gardienEncaisseurButT1.getIDJoueur () );

        g.addGoal ( but3 );

        //MATCH entre t1 et t3

        Team t3 = new Team ( 1243, "Bruins de Boston", "Boston" );
        League.addTeam ( t3 );

        Joueur gardienEncaisseurButT3 = new Goalie ( 4567, "MARDEZ", "mou", t3.getID () );

        t3.addJoueur ( gardienEncaisseurButT3 );

        Game g1 = new Game ( 1265, t1.getID (), t3.getID () );

        Goal butT3 = new Goal ( auteurBut.getIDJoueur (), t1.getID (), t3.getID (), g1.getIDGame (), gardienEncaisseurButT3.getIDJoueur () );

        g1.addGoal ( butT3 );

        // Ajout des games

        League.addGame ( g );
        League.addGame ( g1 );
        League.save ();
    }

}
