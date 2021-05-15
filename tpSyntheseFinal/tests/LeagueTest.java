

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Utilisateur
 */
public class LeagueTest {
    
    public LeagueTest() {
    }
    League l;
    
    @Before
    public void setUp() {
        l=new League();
    }

    /**
     * Test of addTeam method, of class League.
     */
    @Test
    public void testAddTeam() {
        Team t1 = new Team(100,"ASP","MCGALL");
        Team t2= new Team(101,"FC DIJON","PN");
        Team t3 = new Team(102,"LEVANTE","PS");
        
        League.addTeam(t1);
        League.addTeam(t2);
        League.addTeam(t3);
        assertEquals(3,l.getListeEquipe().size());
    }

    /**
     * Test of removeTeam method, of class League.
     */
    @Test
    public void testRemoveTeam_Team() {
        
         Team t1 = new Team(100,"ASP","MCGALL");
        Team t2= new Team(101,"FC DIJON","PN");
        Team t3 = new Team(102,"LEVANTE","PS");
        
        League.addTeam(t1);
        League.addTeam(t2);
        League.addTeam(t3);
        
        l.removeTeam(t1);
        
        assertEquals(2,l.getListeEquipe().size());
        
    }

    /**
     * Test of removeTeam method, of class League.
     */
    @Test
    public void testRemoveTeam_int() {
         Team t1 = new Team(100,"ASP","MCGALL");
        Team t2= new Team(101,"FC DIJON","PN");
        Team t3 = new Team(102,"LEVANTE","PS");
        
        League.addTeam(t1);
        League.addTeam(t2);
        League.addTeam(t3);
        
        l.removeTeam(101);
        
        assertEquals(2,l.getListeEquipe().size());
    }

    /**
     * Test of getTeam method, of class League.
     */
    @Test
    public void testGetTeam() {
        Team t1 = new Team(100,"ASP","MCGALL");
        Team t2= new Team(101,"FC DIJON","PN");
        Team t3 = new Team(102,"LEVANTE","PS");
        
        League.addTeam(t1);
        League.addTeam(t2);
        League.addTeam(t3);
        String res=League.getTeam(102).getTeamName();
             
        assertEquals("LEVANTE",res);
    }

    /**
     * Test of addGame method, of class League.
     */
    @Test
    public void testAddGame() {
        
          Team t1 = new Team(100,"ASP","Porto");
        Team t2 = new Team(109,"FC DIJON","FR");
        Team t3= new Team(101,"FC DIJON","PN");
        Team t4 = new Team(102,"LEVANTE","PS");
        
         
         
        Game g1=new Game(123,t1.getID(),t2.getID());
        Game g2=new Game(124,t2.getID(),t3.getID());
        Game g3=new Game(124,t1.getID(),t3.getID());
        
        League.addGame(g1);
         League.addGame(g2);
         League.addGame(g3);
        
        assertEquals(3, League.getGames().size());
    }

   

    /**
     * Test of getGames method, of class League.
     */
    @Test
    public void testGetGames_Team() {
        
         //match entre t1 et t2
        
         Team t1 = new Team(100,"ASP","Porto");
         Team t2 = new Team(109,"FC DIJON","FR");
         League.addTeam(t1);
         League.addTeam(t2);
         Joueur auteurBut=new Joueur(2345,"ola","mou",t1.getID());
         Joueur assistant1=new FieldPlayer(4555,"KOLA","Kil",t1.getID());
         Joueur assistant2=new FieldPlayer(4578,"YAYA","mou",t1.getID());
         Goalie gardienEncaisseurBut=new Goalie(9890,"MARDEZ","mou",t2.getID());
         
         t1.addJoueur (auteurBut);
         t1.addJoueur (assistant1);
         t1.addJoueur (assistant2);
         t2.addJoueur (gardienEncaisseurBut);
                  
        Game g=new Game(123,t1.getID(),t2.getID());
        
         Goal but1=new Goal(auteurBut.getIDJoueur(),assistant1.getIDJoueur(),assistant2.getIDJoueur(),t1.getID(),t2.getID(),g.getIDGame(),gardienEncaisseurBut.getIDJoueur());
        
         Goal but2=new Goal(auteurBut.getIDJoueur(),assistant1.getIDJoueur(),assistant2.getIDJoueur(),t1.getID(),t2.getID(),g.getIDGame(),gardienEncaisseurBut.getIDJoueur());
        g.addGoal(but1);
        g.addGoal(but2);
        
        Joueur auteurButT2=new Joueur(709,"KOLA","Saf",t2.getID());
        Joueur assistant1T2=new FieldPlayer(1012,"KIM","Kil",t2.getID());
        Joueur assistant2T2=new Joueur(333,"MARDEZ","Poof",t2.getID());
        Joueur gardienEncaisseurButT1=new Goalie(1980,"NAS","mou",t1.getID());
         t2.addJoueur (auteurButT2);
         t2.addJoueur (assistant1T2);
         t2.addJoueur (assistant2T2);
         t1.addJoueur (gardienEncaisseurButT1);
         Goal but3=new Goal(auteurButT2.getIDJoueur(),assistant1T2.getIDJoueur(),assistant2T2.getIDJoueur(),t2.getID(),t1.getID(),g.getIDGame(),gardienEncaisseurButT1.getIDJoueur());
        
          g.addGoal(but3);
          
          //MATCH entre t1 et t3
          
         
         Team t3 = new Team(1243,"POUR","FR");
         League.addTeam(t3);
       
        
       Joueur auteurButT3=new Joueur(79,"KOLA","Saf",t2.getID());
         Joueur gardienEncaisseurButT3=new Goalie(4567,"MARDEZ","mou",t3.getID());
        
         t3.addJoueur (gardienEncaisseurButT3);
                  
        Game g1=new Game(1265,t1.getID(),t3.getID());
        
         Goal butT3=new Goal(auteurBut.getIDJoueur(),t1.getID(),t3.getID(),g1.getIDGame(),gardienEncaisseurButT3.getIDJoueur());
        
         Goal butT4=new Goal(auteurButT3.getIDJoueur(),t3.getID(),t1.getID(),g1.getIDGame(),gardienEncaisseurButT1.getIDJoueur());
        g1.addGoal(butT3);
         g1.addGoal(butT4);
        // Ajout des games
        
       
           assertEquals(3,League.listeEquipe.size());
    }

    /**
     * Test of getGame method, of class League.
     */
    @Test
    public void testGetGame() {
        
         Team t1 = new Team(100,"ASP","Porto");
        Team t2 = new Team(109,"FC DIJON","FR");
        Team t3= new Team(101,"FC DIJON","PN");
        Team t4 = new Team(102,"LEVANTE","PS");
        
         
         
        Game g1=new Game(123,t1.getID(),t2.getID());
        Game g2=new Game(124,t2.getID(),t3.getID());
        Game g3=new Game(125,t1.getID(),t3.getID());
        
        League.addGame(g1);
        League.addGame(g2);
        League.addGame(g3);
        
        assertEquals(g2,l.getGame(124));
    }

    /**
     * Test of getNumberOfWins method, of class League.
     */
    @Test
    public void testGetNumberOfWins() {
        
         
        //match entre t1 et t2
        
         Team t1 = new Team(100,"ASP","Porto");
         Team t2 = new Team(109,"FC DIJON","FR");
         League.addTeam(t1);
         League.addTeam(t2);
         Joueur auteurBut=new Joueur(2345,"ola","mou",t1.getID());
         Joueur assistant1=new FieldPlayer(4555,"KOLA","Kil",t1.getID());
         Joueur assistant2=new FieldPlayer(4578,"YAYA","mou",t1.getID());
         Goalie gardienEncaisseurBut=new Goalie(9890,"MARDEZ","mou",t2.getID());
         
         t1.addJoueur (auteurBut);
         t1.addJoueur (assistant1);
         t1.addJoueur (assistant2);
         t2.addJoueur (gardienEncaisseurBut);
                  
        Game g=new Game(123,t1.getID(),t2.getID());
        
         Goal but1=new Goal(auteurBut.getIDJoueur(),assistant1.getIDJoueur(),assistant2.getIDJoueur(),t1.getID(),t2.getID(),g.getIDGame(),gardienEncaisseurBut.getIDJoueur());
        
         Goal but2=new Goal(auteurBut.getIDJoueur(),assistant1.getIDJoueur(),assistant2.getIDJoueur(),t1.getID(),t2.getID(),g.getIDGame(),gardienEncaisseurBut.getIDJoueur());
        g.addGoal(but1);
        g.addGoal(but2);
        
        Joueur auteurButT2=new Joueur(709,"KOLA","Saf",t2.getID());
        Joueur assistant1T2=new FieldPlayer(1012,"KIM","Kil",t2.getID());
        Joueur assistant2T2=new Joueur(333,"MARDEZ","Poof",t2.getID());
        Joueur gardienEncaisseurButT1=new Goalie(1980,"NAS","mou",t1.getID());
         t2.addJoueur (auteurButT2);
         t2.addJoueur (assistant1T2);
         t2.addJoueur (assistant2T2);
         t1.addJoueur (gardienEncaisseurButT1);
         Goal but3=new Goal(auteurButT2.getIDJoueur(),assistant1T2.getIDJoueur(),assistant2T2.getIDJoueur(),t2.getID(),t1.getID(),g.getIDGame(),gardienEncaisseurButT1.getIDJoueur());
        
          g.addGoal(but3);
          
          //MATCH entre t1 et t3
          
         
         Team t3 = new Team(1243,"POUR","FR");
         League.addTeam(t3);
       
        
       
         Joueur gardienEncaisseurButT3=new Goalie(4567,"MARDEZ","mou",t3.getID());
        
         t3.addJoueur (gardienEncaisseurButT3);
                  
        Game g1=new Game(1265,t1.getID(),t3.getID());
        
         Goal butT3=new Goal(auteurBut.getIDJoueur(),t1.getID(),t3.getID(),g1.getIDGame(),gardienEncaisseurButT3.getIDJoueur());
        
        
        g1.addGoal(butT3);
    
        // Ajout des games
         League.addGame(g);
         League.addGame(g1);
           assertEquals(2,l.getNumberOfWins(t1));
           assertEquals(0,l.getNumberOfWins(t2));
           assertEquals(0,l.getNumberOfWins(t3));
           
    }

    /**
     * Test of getNumberOfLoss method, of class League.
     */
    @Test
    public void testGetNumberOfLoss() {
        
          
        //match entre t1 et t2
        
         Team t1 = new Team(100,"ASP","Porto");
         Team t2 = new Team(109,"FC DIJON","FR");
         League.addTeam(t1);
         League.addTeam(t2);
         Joueur auteurBut=new Joueur(2345,"ola","mou",t1.getID());
         Joueur assistant1=new FieldPlayer(4555,"KOLA","Kil",t1.getID());
         Joueur assistant2=new FieldPlayer(4578,"YAYA","mou",t1.getID());
         Goalie gardienEncaisseurBut=new Goalie(9890,"MARDEZ","mou",t2.getID());
         
         t1.addJoueur (auteurBut);
         t1.addJoueur (assistant1);
         t1.addJoueur (assistant2);
         t2.addJoueur (gardienEncaisseurBut);
                  
        Game g=new Game(123,t1.getID(),t2.getID());
        
         Goal but1=new Goal(auteurBut.getIDJoueur(),assistant1.getIDJoueur(),assistant2.getIDJoueur(),t1.getID(),t2.getID(),g.getIDGame(),gardienEncaisseurBut.getIDJoueur());
        
         Goal but2=new Goal(auteurBut.getIDJoueur(),assistant1.getIDJoueur(),assistant2.getIDJoueur(),t1.getID(),t2.getID(),g.getIDGame(),gardienEncaisseurBut.getIDJoueur());
        g.addGoal(but1);
        g.addGoal(but2);
        
        Joueur auteurButT2=new Joueur(709,"KOLA","Saf",t2.getID());
        Joueur assistant1T2=new FieldPlayer(1012,"KIM","Kil",t2.getID());
        Joueur assistant2T2=new Joueur(333,"MARDEZ","Poof",t2.getID());
        Joueur gardienEncaisseurButT1=new Goalie(1980,"NAS","mou",t1.getID());
         t2.addJoueur (auteurButT2);
         t2.addJoueur (assistant1T2);
         t2.addJoueur (assistant2T2);
         t1.addJoueur (gardienEncaisseurButT1);
         Goal but3=new Goal(auteurButT2.getIDJoueur(),assistant1T2.getIDJoueur(),assistant2T2.getIDJoueur(),t2.getID(),t1.getID(),g.getIDGame(),gardienEncaisseurButT1.getIDJoueur());
        
          g.addGoal(but3);
          
          //MATCH entre t1 et t3
          
         
         Team t3 = new Team(1243,"POUR","FR");
         League.addTeam(t3);
       
        
       
         Joueur gardienEncaisseurButT3=new Goalie(4567,"MARDEZ","mou",t3.getID());
        
         t3.addJoueur (gardienEncaisseurButT3);
                  
        Game g1=new Game(1265,t1.getID(),t3.getID());
        
         Goal butT3=new Goal(auteurBut.getIDJoueur(),t1.getID(),t3.getID(),g1.getIDGame(),gardienEncaisseurButT3.getIDJoueur());
        
        
        g1.addGoal(butT3);
    
        // Ajout des games
         League.addGame(g);
         League.addGame(g1);
           assertEquals(0,l.getNumberOfLoss(t1));
           assertEquals(1,l.getNumberOfLoss(t2));
           assertEquals(1,l.getNumberOfLoss(t3));
           
    }

    /**
     * Test of getTotalGoalFor method, of class League.
     */
    @Test
    public void testGetTotalGoalFor() {
         //match entre t1 et t2
        
        Team t1 = new Team(100,"ASP","Porto");
         Team t2 = new Team(109,"FC DIJON","FR");
         
         League.addTeam(t1);
         League.addTeam(t2);
         
         Joueur auteurBut=new Joueur(2345,"ola","mou",t1.getID());
        Joueur assistant1=new FieldPlayer(4555,"KOLA","Kil",t1.getID());
        Joueur assistant2=new FieldPlayer(4578,"YAYA","mou",t1.getID());
         Joueur gardienEncaisseurBut=new Goalie(9890,"MARDEZ","mou",t2.getID());
              
                  
        Game g=new Game(123,t1.getID(),t2.getID());
        
         Goal but1=new Goal(auteurBut.getIDJoueur(),assistant1.getIDJoueur(),assistant2.getIDJoueur(),t1.getID(),t2.getID(),g.getIDGame(),gardienEncaisseurBut.getIDJoueur());
        
         Goal but2=new Goal(auteurBut.getIDJoueur(),assistant1.getIDJoueur(),assistant2.getIDJoueur(),t1.getID(),t2.getID(),g.getIDGame(),gardienEncaisseurBut.getIDJoueur());
        g.addGoal(but1);
        g.addGoal(but2);
        
        Joueur auteurButT2=new Joueur(709,"KOLA","Saf",t2.getID());
        Joueur assistant1T2=new FieldPlayer(1012,"KIM","Kil",t2.getID());
        Joueur assistant2T2=new Joueur(333,"MARDEZ","Poof",t2.getID());
        Joueur gardienEncaisseurButT1=new Goalie(1980,"NAS","mou",t1.getID());
         Goal but=new Goal(auteurButT2.getIDJoueur(),assistant1T2.getIDJoueur(),assistant2T2.getIDJoueur(),t2.getID(),t1.getID(),g.getIDGame(),gardienEncaisseurButT1.getIDJoueur());
        
          g.addGoal(but);
          
          //MATCH entre t1 et t3
          
         
         Team t3 = new Team(1243,"POUR","FR");
        League.addTeam(t3);
      
       
         Joueur gardienEncaisseurButT3=new Goalie(4567,"MARDEZ","mou",t3.getID());
              
                  
        Game g1=new Game(1265,t1.getID(),t3.getID());
        
         Goal butT3=new Goal(auteurBut.getIDJoueur(),t1.getID(),t3.getID(),g1.getIDGame(),gardienEncaisseurButT3.getIDJoueur());
        
        
        g1.addGoal(butT3);
        // Ajout des games
         League.addGame(g);
         League.addGame(g1);
         
          assertEquals(3,League.getTotalGoalFor(t1));
           assertEquals(1,League.getTotalGoalFor(t2));
            assertEquals(0,League.getTotalGoalFor(t3));
    }

    /**
     * Test of getTotalGoalAgainst method, of class League.
     */
    @Test
    public void testGetTotalGoalAgainst() {
        
        //match entre t1 et t2
        
         Team t1 = new Team(100,"ASP","Porto");
         Team t2 = new Team(109,"FC DIJON","FR");
         League.addTeam(t1);
         League.addTeam(t2);
         Joueur auteurBut=new Joueur(2345,"ola","mou",t1.getID());
         Joueur assistant1=new FieldPlayer(4555,"KOLA","Kil",t1.getID());
         Joueur assistant2=new FieldPlayer(4578,"YAYA","mou",t1.getID());
         Goalie gardienEncaisseurBut=new Goalie(9890,"MARDEZ","mou",t2.getID());
         
         t1.addJoueur (auteurBut);
         t1.addJoueur (assistant1);
         t1.addJoueur (assistant2);
         t2.addJoueur (gardienEncaisseurBut);
                  
        Game g=new Game(123,t1.getID(),t2.getID());
        
         Goal but1=new Goal(auteurBut.getIDJoueur(),assistant1.getIDJoueur(),assistant2.getIDJoueur(),t1.getID(),t2.getID(),g.getIDGame(),gardienEncaisseurBut.getIDJoueur());
        
         Goal but2=new Goal(auteurBut.getIDJoueur(),assistant1.getIDJoueur(),assistant2.getIDJoueur(),t1.getID(),t2.getID(),g.getIDGame(),gardienEncaisseurBut.getIDJoueur());
        g.addGoal(but1);
        g.addGoal(but2);
        
        Joueur auteurButT2=new Joueur(709,"KOLA","Saf",t2.getID());
        Joueur assistant1T2=new FieldPlayer(1012,"KIM","Kil",t2.getID());
        Joueur assistant2T2=new Joueur(333,"MARDEZ","Poof",t2.getID());
        Joueur gardienEncaisseurButT1=new Goalie(1980,"NAS","mou",t1.getID());
         t2.addJoueur (auteurButT2);
         t2.addJoueur (assistant1T2);
         t2.addJoueur (assistant2T2);
         t1.addJoueur (gardienEncaisseurButT1);
         Goal but3=new Goal(auteurButT2.getIDJoueur(),assistant1T2.getIDJoueur(),assistant2T2.getIDJoueur(),t2.getID(),t1.getID(),g.getIDGame(),gardienEncaisseurButT1.getIDJoueur());
        
          g.addGoal(but3);
          
          //MATCH entre t1 et t3
          
         
         Team t3 = new Team(1243,"POUR","FR");
         League.addTeam(t3);
       
        
       
         Joueur gardienEncaisseurButT3=new Goalie(4567,"MARDEZ","mou",t3.getID());
        
         t3.addJoueur (gardienEncaisseurButT3);
                  
        Game g1=new Game(1265,t1.getID(),t3.getID());
        
         Goal butT3=new Goal(auteurBut.getIDJoueur(),t1.getID(),t3.getID(),g1.getIDGame(),gardienEncaisseurButT3.getIDJoueur());
        
        
        g1.addGoal(butT3);
    
        // Ajout des games
         League.addGame(g);
         League.addGame(g1);
           assertEquals(1,League.getTotalGoalAgainst(t1));
           assertEquals(2,League.getTotalGoalAgainst(t2));
            assertEquals(1,League.getTotalGoalAgainst(t3));
    }

    /**
     * Test of getListeEquipe method, of class League.
     */
    @Test
    public void testGetListeEquipe() {
    }
    
}
