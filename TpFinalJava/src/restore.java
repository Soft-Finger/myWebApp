

import java.io.IOException;


/**
 *
 * @author Utilisateur
 */
public class restore {
     public static void main(String[] args) throws IOException {
        // TODO code application logic here
    League l=new League();
    
    League.load();
  
   for(int i=0;i<League.listeEquipe.size();i++){
       System.out.println(League.listeEquipe.get(i).toString());
       System.out.println();
       
     for(int j=0;j<League.listeEquipe.get(i).getPlayers().size();j++){
        System.out.println( League.listeEquipe.get(i).getPlayers().get(j).toString());
   
   }
    
    }
   
   for(int i=0;i<League.matchesCompletes.size();i++){
       System.out.println(League.matchesCompletes.get(i).toString());
       System.out.println();
       
     for(int j=0;j<League.matchesCompletes.get(i).getListeButs().size();j++){
        System.out.println( League.matchesCompletes.get(i).getListeButs().get(j).toString());
   
   }
    
    }
    
    
}

}
