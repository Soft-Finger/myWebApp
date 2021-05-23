import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Utilisateur
 */
public class TeamTest {

    public TeamTest () {
    }

    @Test
    public void constructorGeneral () {
        Team t = new Team ( 156, "ASP", "Porto" );
        assertEquals ( "ASP", t.getTeamName () );
        assertEquals ( "Porto", t.getTeamCity () );
        assertEquals ( 156, t.getID () );
    }


    /**
     * Test of getID method, of class Team.
     */
    @Test
    public void testGetID () {
        Team t = new Team ( 156, "ASP", "Porto" );

        assertEquals ( 156, t.getID () );
    }

    /**
     * Test of getTeamName method, of class Team.
     */
    @Test
    public void testGetTeamName () {
        Team t = new Team ( 156, "ASP", "Porto" );
        assertEquals ( "ASP", t.getTeamName () );

    }

    /**
     * Test of getTeamCity method, of class Team.
     */
    @Test
    public void testGetTeamCity () {

        Team t = new Team ( 156, "ASP", "Porto" );

        assertEquals ( "Porto", t.getTeamCity () );

    }

    /**
     * Test of addJoueur method, of class Team.
     */
    @Test
    public void testAddJouer () {

        Team t = new Team ( 100, "ASP", "Porto" );
        Joueur j = new Joueur ( 123, "ola", "mou", t.getID () );
        Joueur field = new FieldPlayer ( 124, "ola", "mou", t.getID () );
        Joueur g = new Goalie ( 125, "ola", "mou", t.getID () );
        Joueur u = new Joueur ( 126, "ola", "mou", t.getID () );
        t.addJoueur ( j );
        t.addJoueur ( field );
        t.addJoueur ( g );
        t.addJoueur ( u );
        assertEquals ( 4, t.getNbJoueur () );
    }

    /**
     * Test of removeJouer method, of class Team.
     */
    @Test
    public void testRemoveJouer () {
        Team t = new Team ( 100, "ASP", "Porto" );
        Joueur j = new Joueur ( 123, "ola", "mou", t.getID () );
        Joueur field = new FieldPlayer ( 124, "ola", "mou", t.getID () );
        Joueur g = new Goalie ( 125, "ola", "mou", t.getID () );
        Joueur u = new Joueur ( 126, "ola", "mou", t.getID () );

        t.addJoueur ( j );
        t.addJoueur ( field );
        t.addJoueur ( g );
        t.addJoueur ( u );
        assertEquals ( 4, t.getNbJoueur () );

        t.removeJouer ( "ola", "mou" );
        t.removeJouer ( "ola", "mou" );
        assertEquals ( 2, t.getNbJoueur () );
    }

    /**
     * Test of removeAllJoueur method, of class Team.
     */
    @Test
    public void testRemoveAllJoueur () {
        Team t = new Team ( 100, "ASP", "Porto" );
        Joueur j = new Joueur ( 123, "ola", "mou", t.getID () );
        Joueur field = new FieldPlayer ( 124, "ola", "mou", t.getID () );
        Joueur g = new Goalie ( 125, "ola", "mou", t.getID () );
        Joueur u = new Joueur ( 126, "ola", "mou", t.getID () );

        t.addJoueur ( j );
        t.addJoueur ( field );
        t.addJoueur ( g );
        t.addJoueur ( u );

        t.removeAllJoueur ();
        assertEquals ( 0, t.getNbJoueur () );
    }

    /**
     * Test of getNbJoueur method, of class Team.
     */
    @Test
    public void testGetNbJoueur () {
        Team t = new Team ( 100, "ASP", "Porto" );
        Joueur j = new Joueur ( 123, "ola", "mou", t.getID () );
        Joueur field = new FieldPlayer ( 124, "ola", "mou", t.getID () );
        Joueur g = new Goalie ( 125, "ola", "mou", t.getID () );
        Joueur u = new Joueur ( 126, "ola", "mou", t.getID () );

        t.addJoueur ( j );
        t.addJoueur ( field );
        t.addJoueur ( g );
        t.addJoueur ( u );
        assertEquals ( 4, t.getNbJoueur () );
    }


}
