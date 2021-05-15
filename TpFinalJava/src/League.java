

import java.io.IOException;
import java.util.ArrayList;

public class League {
   
   
   
    public static ArrayList <Team> listeEquipe;
    public static ArrayList <Game> matchesCompletes;

    public League() {
        
        
        listeEquipe=new ArrayList<>();
        matchesCompletes= new ArrayList<>();
        
       
    }
    public static void addTeam(Team team) {
        listeEquipe.add(team);

    }

    public void removeTeam(Team team) {
       removeTeam(team.getID());
    }

    public void removeTeam(int id) {
int indice=-1;
        if(id<0){
             throw new  IllegalArgumentException(" impossible d'ajouter null");
        }else{
    for(int i=0;i<listeEquipe.size();i++){
    if(listeEquipe.get(i).getID()==id){
        indice=i;
        break;
    }
    
    }
    
    if(indice!=-1){
    
    listeEquipe.remove(indice);
    }
    }
    }
    
    
    public static Team getTeam(int id) {
        
        int indice=-1;
        if(id<0){
             throw new  IllegalArgumentException(" impossible d'ajouter null");
        }else{
    for(int i=0;i<listeEquipe.size();i++){
    if(listeEquipe.get(i).getID()==id){
        indice=i;
        break;
    }
    
    }
    
   
    }
        
         if(indice!=-1){
    
    return listeEquipe.get(indice);
    }else{
        return null;
    }
    }
    

    public static void addGame(Game game) {
    matchesCompletes.add(game);
    }

    public static ArrayList<Game> getGames() {
    return matchesCompletes;
    }


    // a revoir
    public static ArrayList<Game> getGames(Team team) {
        ArrayList <Game> match=new ArrayList<>();
         for(int i=0;i<matchesCompletes.size();i++){
    if(matchesCompletes.get(i).getIDEquipeLocal()==team.getID() ||matchesCompletes.get(i).getIDEquipeVisiteur()==team.getID() ){
       match.add(matchesCompletes.get(i));
    }
    
    }
        
        return match;
    }

    public Game getGame(int id) {
        int indice=-1;
        if(id<0){
             throw new  IllegalArgumentException(" impossible d'ajouter null");
        }else{
    for(int i=0;i<matchesCompletes.size();i++){
    if(matchesCompletes.get(i).getIDGame()==id){
        indice=i;
        break;
    }
    
    }
    
   
    }
        
         if(indice!=-1){
    
    return matchesCompletes.get(indice);
    }else{
        return null;
    }
    }

    public int getNumberOfWins(Team team) {
        int nbWin=0;
         for(int i=0;i<matchesCompletes.size();i++){
    if(matchesCompletes.get(i).getTheWinner().getID()==team.getID()  ){
      nbWin=nbWin+1;
    }
   
    }
      return nbWin;
    }

    public int getNumberOfLoss(Team team) {
        int nbLoss=0;
         for(int i=0;i<matchesCompletes.size();i++){
    if((matchesCompletes.get(i).getThelooser().getID()==team.getID())){
      nbLoss=nbLoss+1;
    }
   
    }
      return nbLoss;
    }
    

    public static int getTotalGoalFor(Team team) {
       int totalGoalFor=0;
      ArrayList <Game> match=new ArrayList<>();
          
        match=getGames(team);
        
        for(int i=0;i<match.size();i++){    
              totalGoalFor=totalGoalFor+match.get(i).nbButsMarquesEquipe(team);
          }
          
    
    
   
    
      return totalGoalFor;
    }
    

    public static int getTotalGoalAgainst(Team team) {
     int totalGoalAgainst=0;
      ArrayList <Game> match=new ArrayList<>();
          
        match=getGames(team);
        
        for(int i=0;i<match.size();i++){
            
        totalGoalAgainst=totalGoalAgainst+match.get(i).nbButEncaissesTeam(team);
        }
        
              
    
      return totalGoalAgainst;
    }

    public ArrayList<Team> getListeEquipe() {
        return listeEquipe;
    }
    
    // sauvegarde
    public static void save() throws IOException{
    for(int i=0;i<listeEquipe.size();i++){
    Joueur.serialize(listeEquipe.get(i).players);
    
    }
    
    Team.serialize(listeEquipe);
    
    
    for(int i=0;i<matchesCompletes.size();i++){
    Goal.serialize(matchesCompletes.get(i).getListeButs());
    
    }
    
    Game.serialize(matchesCompletes);
    
    }
    
    public static void load(){
       Team.unserialise();
       Joueur.unserialise();
       Game.unserialise();
       Goal.unserialise();
      
    }

    
}

