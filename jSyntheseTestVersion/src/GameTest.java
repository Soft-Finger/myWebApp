
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Utilisateur
 */
public class GameTest {
    
    public GameTest() {
    }
    
    League l;
    
    @Before
    public void setUp() {
        l=new League();
    }

    /**
     * Test of addGoal method, of class Game.
     */
    @Test
    public void testAddGoal() {
        Team t1 = new Team(100,"ASP","Porto");
         Team t2 = new Team(109,"FC DIJON","FR");
         Joueur auteurBut=new Joueur(123,"ola","mou",t1.getID());
        Joueur assistant1=new FieldPlayer(124,"KOLA","Kil",t1.getID());
        Joueur assistant2=new Joueur(125,"YAYA","mou",t1.getID());
         Goalie gardienEncaisseurBut=new Goalie(126,"MARDEZ","mou",t2.getID());
         
        Game g=new Game(123,t1.getID(),t2.getID());
        Goal but=new Goal(auteurBut.getIDJoueur(),assistant1.getIDJoueur(),assistant2.getIDJoueur(),t1.getID(),t2.getID(),g.getIDGame(),gardienEncaisseurBut.getIDJoueur());
        g.addGoal(but);
        
         assertEquals(1,g.getListeButs().size());
    }

    /**
     * Test of getIDGame method, of class Game.
     */
    @Test
    public void testGetIDGame() {
        Team t1 = new Team(100,"ASP","Porto");
         Team t2 = new Team(109,"FC DIJON","FR");
         
         
        Game g=new Game(123,t1.getID(),t2.getID());
        
         assertEquals(123,g.getIDGame());
        
    }

    /**
     * Test of getIDEquipeLocal method, of class Game.
     */
    @Test
    public void testGetIDEquipeLocal() {
        
         Team t1 = new Team(100,"ASP","Porto");
         Team t2 = new Team(109,"FC DIJON","FR");
         
         
        Game g=new Game(123,t1.getID(),t2.getID());
        
         assertEquals(100,g.getIDEquipeLocal());
    }

    /**
     * Test of getIDEquipeVisiteur method, of class Game.
     */
    @Test
    public void testGetIDEquipeVisiteur() {
        
        Team t1 = new Team(100,"ASP","Porto");
         Team t2 = new Team(109,"FC DIJON","FR");
         
         
        Game g=new Game(123,t1.getID(),t2.getID());
        
         assertEquals(109,g.getIDEquipeVisiteur());
    }

    /**
     * Test of getListeButs method, of class Game.
     */
    @Test
    public void testGetListeButs() {
        
         Team t1 = new Team(100,"ASP","Porto");
         Team t2 = new Team(109,"FC DIJON","FR");
         League.addTeam(t1);
         League.addTeam(t2);
         Joueur auteurBut=new Joueur(122,"ola","mou",t1.getID());
        Joueur assistant1=new FieldPlayer(123,"KOLA","Kil",t1.getID());
        Joueur assistant2=new Joueur(124,"YAYA","mou",t1.getID());
         Goalie gardienEncaisseurBut=new Goalie(126,"MARDEZ","mou",t2.getID());
              
                  
        Game g=new Game(123,t1.getID(),t2.getID());
        
         Goal but1=new Goal(auteurBut.getIDJoueur(),assistant1.getIDJoueur(),assistant2.getIDJoueur(),t1.getID(),t2.getID(),g.getIDGame(),gardienEncaisseurBut.getIDJoueur());
        
         Goal but2=new Goal(auteurBut.getIDJoueur(),assistant1.getIDJoueur(),assistant2.getIDJoueur(),t1.getID(),t2.getID(),g.getIDGame(),gardienEncaisseurBut.getIDJoueur());
        g.addGoal(but1);
        g.addGoal(but2);
        
        Joueur auteurButT2=new Joueur(127,"KOLA","Saf",t2.getID());
        Joueur assistant1T2=new FieldPlayer(128,"KIM","Kil",t2.getID());
        Joueur assistant2T2=new Joueur(129,"MARDEZ","Poof",t2.getID());
         Goalie gardienEncaisseurButT1=new Goalie(130,"NAS","mou",t1.getID());
         
         Goal but=new Goal(auteurButT2.getIDJoueur(),assistant1T2.getIDJoueur(),assistant2T2.getIDJoueur(),t2.getID(),t1.getID(),g.getIDGame(),gardienEncaisseurButT1.getIDJoueur());
          g.addGoal(but);
          
         assertEquals(3,g.getListeButs().size());
    }

    /**
     * Test of getTheWinner method, of class Game.
     */
    @Test
    public void testGetTheWinner() {
         Team t1 = new Team(100,"ASP","Porto");
         Team t2 = new Team(109,"FC DIJON","FR");
         League.addTeam(t1);
         League.addTeam(t2);
         Joueur auteurBut=new Joueur(122,"ola","mou",t1.getID());
        Joueur assistant1=new FieldPlayer(123,"KOLA","Kil",t1.getID());
        Joueur assistant2=new Joueur(124,"YAYA","mou",t1.getID());
         Goalie gardienEncaisseurBut=new Goalie(126,"MARDEZ","mou",t2.getID());
              
                  
        Game g=new Game(123,t1.getID(),t2.getID());
        
         Goal but1=new Goal(auteurBut.getIDJoueur(),assistant1.getIDJoueur(),assistant2.getIDJoueur(),t1.getID(),t2.getID(),g.getIDGame(),gardienEncaisseurBut.getIDJoueur());
        
         Goal but2=new Goal(auteurBut.getIDJoueur(),assistant1.getIDJoueur(),assistant2.getIDJoueur(),t1.getID(),t2.getID(),g.getIDGame(),gardienEncaisseurBut.getIDJoueur());
        g.addGoal(but1);
        g.addGoal(but2);
        
        Joueur auteurButT2=new Joueur(127,"KOLA","Saf",t2.getID());
        Joueur assistant1T2=new FieldPlayer(128,"KIM","Kil",t2.getID());
        Joueur assistant2T2=new Joueur(129,"MARDEZ","Poof",t2.getID());
         Goalie gardienEncaisseurButT1=new Goalie(130,"NAS","mou",t1.getID());
         
         Goal but=new Goal(auteurButT2.getIDJoueur(),assistant1T2.getIDJoueur(),assistant2T2.getIDJoueur(),t2.getID(),t1.getID(),g.getIDGame(),gardienEncaisseurButT1.getIDJoueur());
          g.addGoal(but);
          
          League.addGame(g);
          
          assertEquals("ASP",g.getTheWinner().getTeamName());
    }

    /**
     * Test of getThelooser method, of class Game.
     */
    @Test
    public void testGetThelooser() {
        
           Team t1 = new Team(100,"ASP","Porto");
         Team t2 = new Team(109,"FC DIJON","FR");
         League.addTeam(t1);
         League.addTeam(t2);
         Joueur auteurBut=new Joueur(122,"ola","mou",t1.getID());
        Joueur assistant1=new FieldPlayer(123,"KOLA","Kil",t1.getID());
        Joueur assistant2=new Joueur(124,"YAYA","mou",t1.getID());
         Goalie gardienEncaisseurBut=new Goalie(126,"MARDEZ","mou",t2.getID());
              
                  
        Game g=new Game(123,t1.getID(),t2.getID());
        
         Goal but1=new Goal(auteurBut.getIDJoueur(),assistant1.getIDJoueur(),assistant2.getIDJoueur(),t1.getID(),t2.getID(),g.getIDGame(),gardienEncaisseurBut.getIDJoueur());
        
         Goal but2=new Goal(auteurBut.getIDJoueur(),assistant1.getIDJoueur(),assistant2.getIDJoueur(),t1.getID(),t2.getID(),g.getIDGame(),gardienEncaisseurBut.getIDJoueur());
        g.addGoal(but1);
        g.addGoal(but2);
        
        Joueur auteurButT2=new Joueur(127,"KOLA","Saf",t2.getID());
        Joueur assistant1T2=new FieldPlayer(128,"KIM","Kil",t2.getID());
        Joueur assistant2T2=new Joueur(129,"MARDEZ","Poof",t2.getID());
         Goalie gardienEncaisseurButT1=new Goalie(130,"NAS","mou",t1.getID());
         
         Goal but=new Goal(auteurButT2.getIDJoueur(),assistant1T2.getIDJoueur(),assistant2T2.getIDJoueur(),t2.getID(),t1.getID(),g.getIDGame(),gardienEncaisseurButT1.getIDJoueur());
          g.addGoal(but);
          
          League.addGame(g);
          
          assertEquals("FC DIJON",g.getThelooser().getTeamName());
    }

    /**
     * Test of nbButEncaissesTeam method, of class Game.
     */
    @Test
    public void testNbButEncaissesTeam() {
        
        Team t1 = new Team(100,"ASP","Porto");
         Team t2 = new Team(109,"FC DIJON","FR");
         League.addTeam(t1);
         League.addTeam(t2);
         Joueur auteurBut=new Joueur(122,"ola","mou",t1.getID());
        Joueur assistant1=new FieldPlayer(123,"KOLA","Kil",t1.getID());
        Joueur assistant2=new Joueur(124,"YAYA","mou",t1.getID());
         Goalie gardienEncaisseurBut=new Goalie(126,"MARDEZ","mou",t2.getID());
              
                  
        Game g=new Game(123,t1.getID(),t2.getID());
        
         Goal but1=new Goal(auteurBut.getIDJoueur(),assistant1.getIDJoueur(),assistant2.getIDJoueur(),t1.getID(),t2.getID(),g.getIDGame(),gardienEncaisseurBut.getIDJoueur());
        
         Goal but2=new Goal(auteurBut.getIDJoueur(),assistant1.getIDJoueur(),assistant2.getIDJoueur(),t1.getID(),t2.getID(),g.getIDGame(),gardienEncaisseurBut.getIDJoueur());
        g.addGoal(but1);
        g.addGoal(but2);
        
        Joueur auteurButT2=new Joueur(127,"KOLA","Saf",t2.getID());
        Joueur assistant1T2=new FieldPlayer(128,"KIM","Kil",t2.getID());
        Joueur assistant2T2=new Joueur(129,"MARDEZ","Poof",t2.getID());
         Goalie gardienEncaisseurButT1=new Goalie(130,"NAS","mou",t1.getID());
         
         Goal but=new Goal(auteurButT2.getIDJoueur(),assistant1T2.getIDJoueur(),assistant2T2.getIDJoueur(),t2.getID(),t1.getID(),g.getIDGame(),gardienEncaisseurButT1.getIDJoueur());
          g.addGoal(but);
          
          League.addGame(g);
          
         assertEquals(2,g.nbButEncaissesTeam(t2));
         assertEquals(1,g.nbButEncaissesTeam(t1));
        
    }

    /**
     * Test of nbButDePasse method, of class Game.
     */
    @Test
    public void testNbButDePasse() {
        
         Team t1 = new Team(100,"ASP","Porto");
         Team t2 = new Team(109,"FC DIJON","FR");
         League.addTeam(t1);
         League.addTeam(t2);
         Joueur auteurBut=new Joueur(122,"ola","mou",t1.getID());
        Joueur assistant1=new FieldPlayer(123,"KOLA","Kil",t1.getID());
        Joueur assistant2=new Joueur(124,"YAYA","mou",t1.getID());
         Goalie gardienEncaisseurBut=new Goalie(126,"MARDEZ","mou",t2.getID());
              
                  
        Game g=new Game(123,t1.getID(),t2.getID());
        
         Goal but1=new Goal(auteurBut.getIDJoueur(),assistant1.getIDJoueur(),assistant2.getIDJoueur(),t1.getID(),t2.getID(),g.getIDGame(),gardienEncaisseurBut.getIDJoueur());
        
         Goal but2=new Goal(auteurBut.getIDJoueur(),assistant1.getIDJoueur(),assistant2.getIDJoueur(),t1.getID(),t2.getID(),g.getIDGame(),gardienEncaisseurBut.getIDJoueur());
        g.addGoal(but1);
        g.addGoal(but2);
        
        Joueur auteurButT2=new Joueur(127,"KOLA","Saf",t2.getID());
        Joueur assistant1T2=new FieldPlayer(128,"KIM","Kil",t2.getID());
        Joueur assistant2T2=new Joueur(129,"MARDEZ","Poof",t2.getID());
         Goalie gardienEncaisseurButT1=new Goalie(130,"NAS","mou",t1.getID());
         
         Goal but=new Goal(auteurButT2.getIDJoueur(),assistant1T2.getIDJoueur(),assistant2T2.getIDJoueur(),t2.getID(),t1.getID(),g.getIDGame(),gardienEncaisseurButT1.getIDJoueur());
          g.addGoal(but);
          
          League.addGame(g);
            assertEquals(0,g.nbButDePasse(auteurBut));
            assertEquals(0,g.nbButDePasse(auteurButT2));
            
            assertEquals(1,g.nbButDePasse(assistant1T2));
            assertEquals(2,g.nbButDePasse(assistant1));
            assertEquals(2,g.nbButDePasse(assistant2));
            
            assertEquals(0,g.nbButDePasse(gardienEncaisseurButT1));
            assertEquals(0,g.nbButDePasse(gardienEncaisseurBut));
            
           
    }

    /**
     * Test of nbButsMarquesJoueur method, of class Game.
     */
    @Test
    public void testNbButsMarquesJoueur() {
        
        Team t1 = new Team(100,"ASP","Porto");
         Team t2 = new Team(109,"FC DIJON","FR");
         League.addTeam(t1);
         League.addTeam(t2);
         Joueur auteurBut=new Joueur(122,"ola","mou",t1.getID());
        Joueur assistant1=new FieldPlayer(123,"KOLA","Kil",t1.getID());
        Joueur assistant2=new Joueur(124,"YAYA","mou",t1.getID());
         Goalie gardienEncaisseurBut=new Goalie(126,"MARDEZ","mou",t2.getID());
              
                  
        Game g=new Game(123,t1.getID(),t2.getID());
        
         Goal but1=new Goal(auteurBut.getIDJoueur(),assistant1.getIDJoueur(),assistant2.getIDJoueur(),t1.getID(),t2.getID(),g.getIDGame(),gardienEncaisseurBut.getIDJoueur());
        
         Goal but2=new Goal(auteurBut.getIDJoueur(),assistant1.getIDJoueur(),assistant2.getIDJoueur(),t1.getID(),t2.getID(),g.getIDGame(),gardienEncaisseurBut.getIDJoueur());
        g.addGoal(but1);
        g.addGoal(but2);
        
        Joueur auteurButT2=new Joueur(127,"KOLA","Saf",t2.getID());
        Joueur assistant1T2=new FieldPlayer(128,"KIM","Kil",t2.getID());
        Joueur assistant2T2=new Joueur(129,"MARDEZ","Poof",t2.getID());
         Goalie gardienEncaisseurButT1=new Goalie(130,"NAS","mou",t1.getID());
         
         Goal but=new Goal(auteurButT2.getIDJoueur(),assistant1T2.getIDJoueur(),assistant2T2.getIDJoueur(),t2.getID(),t1.getID(),g.getIDGame(),gardienEncaisseurButT1.getIDJoueur());
          g.addGoal(but);
          
          League.addGame(g);
          
            assertEquals(2,g.nbButsMarquesJoueur(auteurBut));
            assertEquals(0,g.nbButsMarquesJoueur(assistant1T2));
            assertEquals(1,g.nbButsMarquesJoueur(auteurButT2));
        
        
    }

    /**
     * Test of nbButsEncaissesJoueur method, of class Game.
     */
    @Test
    public void testNbButsEncaissesJoueur() {
        
          Team t1 = new Team(100,"ASP","Porto");
         Team t2 = new Team(109,"FC DIJON","FR");
         League.addTeam(t1);
         League.addTeam(t2);
         Joueur auteurBut=new Joueur(122,"ola","mou",t1.getID());
        Joueur assistant1=new FieldPlayer(123,"KOLA","Kil",t1.getID());
        Joueur assistant2=new Joueur(124,"YAYA","mou",t1.getID());
         Goalie gardienEncaisseurBut=new Goalie(126,"MARDEZ","mou",t2.getID());
              
                  
        Game g=new Game(123,t1.getID(),t2.getID());
        
         Goal but1=new Goal(auteurBut.getIDJoueur(),assistant1.getIDJoueur(),assistant2.getIDJoueur(),t1.getID(),t2.getID(),g.getIDGame(),gardienEncaisseurBut.getIDJoueur());
        
         Goal but2=new Goal(auteurBut.getIDJoueur(),assistant1.getIDJoueur(),assistant2.getIDJoueur(),t1.getID(),t2.getID(),g.getIDGame(),gardienEncaisseurBut.getIDJoueur());
        g.addGoal(but1);
        g.addGoal(but2);
        
        Joueur auteurButT2=new Joueur(127,"KOLA","Saf",t2.getID());
        Joueur assistant1T2=new FieldPlayer(128,"KIM","Kil",t2.getID());
        Joueur assistant2T2=new Joueur(129,"MARDEZ","Poof",t2.getID());
         Goalie gardienEncaisseurButT1=new Goalie(130,"NAS","mou",t1.getID());
         
         Goal but=new Goal(auteurButT2.getIDJoueur(),assistant1T2.getIDJoueur(),assistant2T2.getIDJoueur(),t2.getID(),t1.getID(),g.getIDGame(),gardienEncaisseurButT1.getIDJoueur());
          g.addGoal(but);
          
          League.addGame(g);
          
            assertEquals(2,g.nbButsEncaissesJoueur(gardienEncaisseurBut));
            assertEquals(1,g.nbButsEncaissesJoueur(gardienEncaisseurButT1));
    }

    /**
     * Test of nbButsMarquesEquipe method, of class Game.
     */
    @Test
    public void testNbButsMarquesEquipe() {
        
        Team t1 = new Team(100,"ASP","Porto");
         Team t2 = new Team(109,"FC DIJON","FR");
         League.addTeam(t1);
         League.addTeam(t2);
         Joueur auteurBut=new Joueur(122,"ola","mou",t1.getID());
        Joueur assistant1=new FieldPlayer(123,"KOLA","Kil",t1.getID());
        Joueur assistant2=new Joueur(124,"YAYA","mou",t1.getID());
         Goalie gardienEncaisseurBut=new Goalie(126,"MARDEZ","mou",t2.getID());
              
                  
        Game g=new Game(123,t1.getID(),t2.getID());
        
         Goal but1=new Goal(auteurBut.getIDJoueur(),assistant1.getIDJoueur(),assistant2.getIDJoueur(),t1.getID(),t2.getID(),g.getIDGame(),gardienEncaisseurBut.getIDJoueur());
        
         Goal but2=new Goal(auteurBut.getIDJoueur(),assistant1.getIDJoueur(),assistant2.getIDJoueur(),t1.getID(),t2.getID(),g.getIDGame(),gardienEncaisseurBut.getIDJoueur());
        g.addGoal(but1);
        g.addGoal(but2);
        
        Joueur auteurButT2=new Joueur(127,"KOLA","Saf",t2.getID());
        Joueur assistant1T2=new FieldPlayer(128,"KIM","Kil",t2.getID());
        Joueur assistant2T2=new Joueur(129,"MARDEZ","Poof",t2.getID());
         Goalie gardienEncaisseurButT1=new Goalie(130,"NAS","mou",t1.getID());
         
         Goal but=new Goal(auteurButT2.getIDJoueur(),assistant1T2.getIDJoueur(),assistant2T2.getIDJoueur(),t2.getID(),t1.getID(),g.getIDGame(),gardienEncaisseurButT1.getIDJoueur());
          g.addGoal(but);
          
          League.addGame(g);
          
             assertEquals(2,g.nbButsMarquesEquipe(t1));
             assertEquals(1,g.nbButsMarquesEquipe(t2));
        
    }
    
}
