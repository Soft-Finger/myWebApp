

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Goal {
   
    public int IDJoueurAuteur;
    private int IDJoueurAssistanat1;
    private int IDJoueurAssistant2;
    private int IDTeamMarquer;
    private int IDTeamEcaisseur;
    private int IDGame;
    private int IDJoueurEncaisseur;

    public Goal(int IDJoueurAuteur, int IDJoueurAssistanat1, int IDJoueurAssistant2, int IDTeamMarquer, int IDTeamEcaisseur, int IDGame, int IDJoueurEncaisseur) {
        this.IDJoueurAuteur = IDJoueurAuteur;
        this.IDJoueurAssistanat1 = IDJoueurAssistanat1;
        this.IDJoueurAssistant2 = IDJoueurAssistant2;
        this.IDTeamMarquer = IDTeamMarquer;
        this.IDTeamEcaisseur = IDTeamEcaisseur;
        this.IDGame = IDGame;
        this.IDJoueurEncaisseur = IDJoueurEncaisseur;
    }

    public Goal(int IDJoueurAuteur, int IDJoueurAssistanat1, int IDJoueurAssistant2, int IDTeamMarquer, int IDTeamEcaisseur, int IDGame) {
        this.IDJoueurAuteur = IDJoueurAuteur;
        this.IDJoueurAssistanat1 = IDJoueurAssistanat1;
        this.IDJoueurAssistant2 = IDJoueurAssistant2;
        this.IDTeamMarquer = IDTeamMarquer;
        this.IDTeamEcaisseur = IDTeamEcaisseur;
        this.IDGame = IDGame;
    }

    public Goal(int IDJoueurAuteur, int IDTeamMarquer, int IDTeamEcaisseur, int IDGame, int IDJoueurEncaisseur) {
        this.IDJoueurAuteur = IDJoueurAuteur;
        this.IDTeamMarquer = IDTeamMarquer;
        this.IDTeamEcaisseur = IDTeamEcaisseur;
        this.IDGame = IDGame;
        this.IDJoueurEncaisseur = IDJoueurEncaisseur;
    }

    public Goal(int IDJoueurAuteur, int IDTeamMarquer, int IDTeamEcaisseur, int IDGame) {
        this.IDJoueurAuteur = IDJoueurAuteur;
        this.IDTeamMarquer = IDTeamMarquer;
        this.IDTeamEcaisseur = IDTeamEcaisseur;
        this.IDGame = IDGame;
    }

    public int getIDJoueurAuteur() {
        return IDJoueurAuteur;
    }

    public int getIDJoueurAssistanat1() {
        return IDJoueurAssistanat1;
    }

    public int getIDJoueurAssistant2() {
        return IDJoueurAssistant2;
    }

    public int getIDTeamMarquer() {
        return IDTeamMarquer;
    }

    public int getIDTeamEcaisseur() {
        return IDTeamEcaisseur;
    }

    public int getIDGame() {
        return IDGame;
    }

    public int getIDJoueurEncaisseur() {
        return IDJoueurEncaisseur;
    }
    
    
 @Override
    public String toString(){
    return  IDJoueurAuteur+";"+ IDJoueurAssistanat1+";"+IDJoueurAssistant2+";"+IDTeamMarquer+";"+IDTeamEcaisseur+";"+IDGame+";"+IDJoueurEncaisseur;
    }
    
    static void serialize(ArrayList<Goal> goals) throws IOException {
        
       FileWriter fi =new FileWriter("C:\\Users\\Utilisateur\\Documents\\goal.txt",true);
       
       PrintWriter sorti=new PrintWriter(fi);
    if(goals.isEmpty()){
    
    }else{
    for(int i=0;i<goals.size();i++){
    sorti.print(goals.get(i).toString());
    sorti.println();
    
    }
    sorti.close();
    }
    //To change body of generated methods, choose Tools | Templates.
    }
    
     public static void unserialise() {
    
    
    
    try{
    Scanner scan=new Scanner(new File("C:\\Users\\Utilisateur\\Documents\\goal.txt"));
    while(scan.hasNext()){
    String g=scan.nextLine();
    StringTokenizer token=new  StringTokenizer(g,";");
  
    int idJoueurAuteur=Integer.parseInt(token.nextToken());
   int idJoueurAssistanat1=Integer.parseInt(token.nextToken());
   int idJoueurAssistant2=Integer.parseInt(token.nextToken());
    int idTeamMarquer=Integer.parseInt(token.nextToken());
    int idTeamEcaisseur=Integer.parseInt(token.nextToken());
    int idGame=Integer.parseInt(token.nextToken());
    int idJoueurEncaisseur=Integer.parseInt(token.nextToken());
    
    for(int i=0;i<League.matchesCompletes.size();i++){
    if(League.matchesCompletes.get(i).getIDGame()==idGame){
      Goal gao=new Goal(idJoueurAuteur,idJoueurAssistanat1,idJoueurAssistant2,idTeamMarquer,idTeamEcaisseur,idGame,idJoueurEncaisseur);
      League.matchesCompletes.get(i).addGoal(gao);
    
    }
    
    }
   
     
    
    }
    scan.close();
    }catch(IOException e){
    System.out.println("Impossible de ouvrir le fichier");
    
    }
    
    }
    
}