import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Utilisateur
 */
public class JoueurTest {

    public JoueurTest() {
    }

    League l;

    @Before
    public void setUp() {
        l = new League ();
    }

    /**
     * Test of getIDJoueur method, of class Joueur.
     */
    @Test
    public void testGetIDJoueur() {
        Team t = new Team ( 689 , "ASP" , "Porto" );
        FieldPlayer j = new FieldPlayer ( 3456 , "YAYA" , "mou" , t.getID () );
        t.addJoueur ( j );
        assertEquals ( 3456 , j.getIDJoueur () );
    }

    /**
     * Test of getPreNomJoueur method, of class Joueur.
     */
    @Test
    public void testGetPreNomJoueur() {

        Team t = new Team ( 689 , "ASP" , "Porto" );
        FieldPlayer j = new FieldPlayer ( 3456 , "YAYA" , "mou" , t.getID () );
        t.addJoueur ( j );
        assertEquals ( "mou" , j.getPreNomJoueur () );
    }

    /**
     * Test of getIDEquipeJoueur method, of class Joueur.
     */
    @Test
    public void testGetIDEquipeJoueur() {

        Team t = new Team ( 689 , "ASP" , "Porto" );
        FieldPlayer j = new FieldPlayer ( 3456 , "YAYA" , "mou" , t.getID () );
        t.addJoueur ( j );
        assertEquals ( 689 , j.getIDEquipeJoueur () );
    }

    /**
     * Test of getNomJoueur method, of class Joueur.
     */
    @Test
    public void testGetNomJoueur() {
        Team t = new Team ( 689 , "ASP" , "Porto" );
        FieldPlayer j = new FieldPlayer ( 1234 , "YAYA" , "mou" , t.getID () );
        t.addJoueur ( j );
        assertEquals ( "YAYA" , j.getNomJoueur () );
    }

    /**
     * Test of setPreNomJoueur method, of class Joueur.
     */
    @Test
    public void testSetPreNomJoueur() {

        Team t = new Team ( 689 , "ASP" , "Porto" );
        FieldPlayer j = new FieldPlayer ( 2345 , "YAYA" , "mou" , t.getID () );
        t.addJoueur ( j );
        assertEquals ( "mou" , j.getPreNomJoueur () );
        j.setPreNomJoueur ( "Moukaila" );
        assertEquals ( "Moukaila" , j.getPreNomJoueur () );
    }

    @Test
    public void testSetPreNomJoueurAtNull() {

        Team t = new Team ( 689 , "ASP" , "Porto" );
        FieldPlayer j = new FieldPlayer ( 2345 , "YAYA" , "mou" , t.getID () );
        t.addJoueur ( j );
        try {
            j.setPreNomJoueur ( null );
        } catch ( IllegalArgumentException e ) {
            assertEquals ( "mou" , j.getPreNomJoueur () );

            return;
        }
        fail ();
    }

    /**
     * Test of nbButMarques method, of class Joueur.
     */
    @Test
    public void testNbButMarques() {

        Team t1 = new Team ( 100 , "ASP" , "Porto" );
        Team t2 = new Team ( 109 , "FC DIJON" , "FR" );
        Joueur auteurBut = new Joueur ( 2345 , "ola" , "mou" , t1.getID () );
        Joueur assistant1 = new FieldPlayer ( 4555 , "KOLA" , "Kil" , t1.getID () );
        Joueur assistant2 = new FieldPlayer ( 4578 , "YAYA" , "mou" , t1.getID () );
        Joueur gardienEncaisseurBut = new Goalie ( 9890 , "MARDEZ" , "mou" , t2.getID () );


        Game g = new Game ( 123 , t1.getID () , t2.getID () );

        Goal but1 = new Goal ( auteurBut.getIDJoueur () , assistant1.getIDJoueur () , assistant2.getIDJoueur () , t1.getID () , t2.getID () , g.getIDGame () , gardienEncaisseurBut.getIDJoueur () );

        Goal but2 = new Goal ( auteurBut.getIDJoueur () , assistant1.getIDJoueur () , assistant2.getIDJoueur () , t1.getID () , t2.getID () , g.getIDGame () , gardienEncaisseurBut.getIDJoueur () );
        g.addGoal ( but1 );
        g.addGoal ( but2 );

        Joueur auteurButT2 = new Joueur ( 709 , "KOLA" , "Saf" , t2.getID () );
        Joueur assistant1T2 = new FieldPlayer ( 1012 , "KIM" , "Kil" , t2.getID () );
        Joueur assistant2T2 = new Joueur ( 333 , "MARDEZ" , "Poof" , t2.getID () );
        Joueur gardienEncaisseurButT1 = new Goalie ( 1980 , "NAS" , "mou" , t1.getID () );
        Goal but = new Goal ( auteurButT2.getIDJoueur () , assistant1T2.getIDJoueur () , assistant2T2.getIDJoueur () , t2.getID () , t1.getID () , g.getIDGame () , gardienEncaisseurButT1.getIDJoueur () );

        g.addGoal ( but );
        League.addGame ( g );

        //MATCH entre t1 et t3


        Team t3 = new Team ( 1243 , "POUR" , "FR" );


        Joueur gardienEncaisseurButT3 = new Goalie ( 4567 , "MARDEZ" , "mou" , t3.getID () );


        Game g1 = new Game ( 1265 , t1.getID () , t3.getID () );

        Goal butT3 = new Goal ( auteurBut.getIDJoueur () , t1.getID () , t3.getID () , g1.getIDGame () , gardienEncaisseurButT3.getIDJoueur () );


        g1.addGoal ( butT3 );
        // Ajout des games

        League.addGame ( g1 );
        assertEquals ( 3 , auteurBut.nbButMarques () );
        assertEquals ( 1 , auteurButT2.nbButMarques () );
    }

    /**
     * Test of nbButDePasse method, of class Joueur.
     */
    @Test
    public void testNbButDePasse() {

        Team t1 = new Team ( 100 , "ASP" , "Porto" );
        Team t2 = new Team ( 109 , "FC DIJON" , "FR" );
        Joueur auteurBut = new Joueur ( 2345 , "ola" , "mou" , t1.getID () );
        Joueur assistant1 = new FieldPlayer ( 4555 , "KOLA" , "Kil" , t1.getID () );
        Joueur assistant2 = new FieldPlayer ( 4578 , "YAYA" , "mou" , t1.getID () );
        Joueur gardienEncaisseurBut = new Goalie ( 9890 , "MARDEZ" , "mou" , t2.getID () );


        Game g = new Game ( 123 , t1.getID () , t2.getID () );

        Goal but1 = new Goal ( auteurBut.getIDJoueur () , assistant1.getIDJoueur () , assistant2.getIDJoueur () , t1.getID () , t2.getID () , g.getIDGame () , gardienEncaisseurBut.getIDJoueur () );

        Goal but2 = new Goal ( auteurBut.getIDJoueur () , assistant1.getIDJoueur () , assistant2.getIDJoueur () , t1.getID () , t2.getID () , g.getIDGame () , gardienEncaisseurBut.getIDJoueur () );
        g.addGoal ( but1 );
        g.addGoal ( but2 );

        Joueur auteurButT2 = new Joueur ( 709 , "KOLA" , "Saf" , t2.getID () );
        Joueur assistant1T2 = new FieldPlayer ( 1012 , "KIM" , "Kil" , t2.getID () );
        Joueur assistant2T2 = new Joueur ( 333 , "MARDEZ" , "Poof" , t2.getID () );
        Joueur gardienEncaisseurButT1 = new Goalie ( 1980 , "NAS" , "mou" , t1.getID () );
        Goal but = new Goal ( auteurButT2.getIDJoueur () , assistant1T2.getIDJoueur () , assistant2T2.getIDJoueur () , t2.getID () , t1.getID () , g.getIDGame () , gardienEncaisseurButT1.getIDJoueur () );

        g.addGoal ( but );

        //MATCH entre t1 et t3


        Team t3 = new Team ( 1243 , "POUR" , "FR" );


        Joueur gardienEncaisseurButT3 = new Goalie ( 4567 , "MARDEZ" , "mou" , t3.getID () );


        Game g1 = new Game ( 1265 , t1.getID () , t3.getID () );

        Goal butT3 = new Goal ( auteurBut.getIDJoueur () , t1.getID () , t3.getID () , g1.getIDGame () , gardienEncaisseurButT3.getIDJoueur () );


        g1.addGoal ( butT3 );
        // Ajout des games
        League.addGame ( g );
        League.addGame ( g1 );
        assertEquals ( 0 , auteurBut.nbButDePasse () );
        assertEquals ( 2 , assistant1.nbButDePasse () );
        assertEquals ( 2 , assistant2.nbButDePasse () );

        assertEquals ( 1 , assistant1T2.nbButDePasse () );
        assertEquals ( 1 , assistant2T2.nbButDePasse () );
        assertEquals ( 0 , gardienEncaisseurButT3.nbButDePasse () );


    }

    /**
     * Test of nbButDePasse method, of class Joueur.
     */
    @Test
    public void testNbButEnCaisse() {

        Team t1 = new Team ( 100 , "ASP" , "Porto" );
        Team t2 = new Team ( 109 , "FC DIJON" , "FR" );
        Joueur auteurBut = new Joueur ( 2345 , "ola" , "mou" , t1.getID () );
        Joueur assistant1 = new FieldPlayer ( 4555 , "KOLA" , "Kil" , t1.getID () );
        Joueur assistant2 = new FieldPlayer ( 4578 , "YAYA" , "mou" , t1.getID () );
        Goalie gardienEncaisseurBut = new Goalie ( 9890 , "MARDEZ" , "mou" , t2.getID () );


        Game g = new Game ( 123 , t1.getID () , t2.getID () );

        Goal but1 = new Goal ( auteurBut.getIDJoueur () , assistant1.getIDJoueur () , assistant2.getIDJoueur () , t1.getID () , t2.getID () , g.getIDGame () , gardienEncaisseurBut.getIDJoueur () );

        Goal but2 = new Goal ( auteurBut.getIDJoueur () , assistant1.getIDJoueur () , assistant2.getIDJoueur () , t1.getID () , t2.getID () , g.getIDGame () , gardienEncaisseurBut.getIDJoueur () );
        g.addGoal ( but1 );
        g.addGoal ( but2 );

        Joueur auteurButT2 = new Joueur ( 709 , "KOLA" , "Saf" , t2.getID () );
        Joueur assistant1T2 = new FieldPlayer ( 1012 , "KIM" , "Kil" , t2.getID () );
        Joueur assistant2T2 = new Joueur ( 333 , "MARDEZ" , "Poof" , t2.getID () );
        Goalie gardienEncaisseurButT1 = new Goalie ( 1980 , "NAS" , "mou" , t1.getID () );
        Goal but = new Goal ( auteurButT2.getIDJoueur () , assistant1T2.getIDJoueur () , assistant2T2.getIDJoueur () , t2.getID () , t1.getID () , g.getIDGame () , gardienEncaisseurButT1.getIDJoueur () );

        g.addGoal ( but );

        //MATCH entre t1 et t3


        Team t3 = new Team ( 1243 , "POUR" , "FR" );


        Goalie gardienEncaisseurButT3 = new Goalie ( 4567 , "MARDEZ" , "mou" , t3.getID () );


        Game g1 = new Game ( 1265 , t1.getID () , t3.getID () );

        Goal butT3 = new Goal ( auteurBut.getIDJoueur () , t1.getID () , t3.getID () , g1.getIDGame () , gardienEncaisseurButT3.getIDJoueur () );


        g1.addGoal ( butT3 );
        // Ajout des games
        League.addGame ( g );
        League.addGame ( g1 );

        assertEquals ( 1 , gardienEncaisseurButT1.nbButEncaisse () );

        assertEquals ( 2 , gardienEncaisseurBut.nbButEncaisse () );
        assertEquals ( 1 , gardienEncaisseurButT3.nbButEncaisse () );


    }

}
