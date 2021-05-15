

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Game {
	private int IDGame;
        private int IDEquipeLocal;
        private int IDEquipeVisiteur;
        private ArrayList <Goal> listeButs;
        
    public Game(int IDGame, int IDEquipeLocal, int IDEquipeVisiteur) {
        this.IDGame = IDGame;
        this.IDEquipeLocal = IDEquipeLocal;
        this.IDEquipeVisiteur = IDEquipeVisiteur;
        listeButs = new ArrayList<>();
    }
   public void addGoal(Goal g){
   listeButs.add(g);
    
    }

    public int getIDGame() {
        return IDGame;
    }

    public int getIDEquipeLocal() {
        return IDEquipeLocal;
    }

    public int getIDEquipeVisiteur() {
        return IDEquipeVisiteur;
    }

    public ArrayList<Goal> getListeButs() {
        return listeButs;
    }
   
     public Team getTheWinner () {
       if(nbButsMarquesEquipe(League.getTeam(IDEquipeLocal))>nbButsMarquesEquipe(League.getTeam(IDEquipeVisiteur))){
        
        return League.getTeam(IDEquipeLocal);
        }else{
          
        return League.getTeam(IDEquipeVisiteur);
        }
    }
     
     public Team getThelooser () {
       if(nbButsMarquesEquipe(League.getTeam(IDEquipeLocal))>nbButsMarquesEquipe(League.getTeam(IDEquipeVisiteur))){
        
        return League.getTeam(IDEquipeVisiteur) ;
        }else{
          
        return League.getTeam(IDEquipeLocal);
        }
    }

    public int nbButEncaissesTeam (Team team) {
        
       int nombreButEncaisser=0;
        for(int i=0;i<this.listeButs.size();i++){
    if(this.listeButs.get(i).getIDTeamEcaisseur()==team.getID()){
        nombreButEncaisser=nombreButEncaisser+1;
    }
    
    }
        return nombreButEncaisser;
    }
    
     public int nbButDePasse (Joueur joueur) {
        int nombreButPasse=0;
        for(int i=0;i<listeButs.size();i++){
    if(listeButs.get(i).getIDJoueurAssistanat1()==joueur.getIDJoueur() || listeButs.get(i).getIDJoueurAssistant2()==joueur.getIDJoueur()){
        nombreButPasse=nombreButPasse+1;
        
    }
    
    
    }
        return nombreButPasse;
    }
    
       

    public int nbButsMarquesJoueur (Joueur joueur) {
        int nombreButMarquer=0;
        for(int i=0;i<listeButs.size();i++){
    if(listeButs.get(i).getIDJoueurAuteur()==joueur.getIDJoueur()){
        nombreButMarquer=nombreButMarquer+1;
        
    }
    
    
    }
        return nombreButMarquer;
    }
    
    public int nbButsEncaissesJoueur (Joueur joueur) {
      int nombreButEncaisser=0;
        for(int i=0;i<listeButs.size();i++){
    if(listeButs.get(i).getIDJoueurEncaisseur()==joueur.getIDJoueur()){
        nombreButEncaisser=nombreButEncaisser+1;
    }
    
    }
        return nombreButEncaisser;
    }
    
    public int nbButsMarquesEquipe (Team team) {
    int nombreButMarquer=0;
        for(int i=0;i<listeButs.size();i++){
    if(listeButs.get(i).getIDTeamMarquer()==team.getID()){
        nombreButMarquer=nombreButMarquer+1;
        
    }
    
    }
        return nombreButMarquer;
    }
    
    @Override
    public String toString(){
    return  IDGame+";"+ IDEquipeLocal+";"+IDEquipeVisiteur;
    }
    
    static void serialize(ArrayList<Game> games) throws IOException {
        
       FileWriter fi =new FileWriter("C:\\Users\\Utilisateur\\Documents\\game.txt",true);
       
       PrintWriter sorti=new PrintWriter(fi);
    if(games.isEmpty()){}else{
    for(int i=0;i<games.size();i++){
    sorti.print(games.get(i).toString());
    sorti.println();
    
    }
    sorti.close();
    }
    //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public static void unserialise() {
    
    
    
    try{
    Scanner scan=new Scanner(new File("C:\\Users\\Utilisateur\\Documents\\game.txt"));
    while(scan.hasNext()){
    String g=scan.nextLine();
    StringTokenizer token=new  StringTokenizer(g,";");
    int idgame=Integer.parseInt(token.nextToken());
    int idEquipeLocal=Integer.parseInt(token.nextToken());
    int idEquipeVisiteur=Integer.parseInt(token.nextToken());
    
   
    Game gam=new Game(idgame,idEquipeLocal,idEquipeVisiteur);
    League.addGame(gam);
    
    }
    scan.close();
    }catch(IOException e){
    System.out.println("Impossible de ouvrir le fichier");
    
    }
    
    }
}
