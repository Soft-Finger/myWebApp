
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Joueur {

    static void serialize(ArrayList<Joueur> players) throws IOException {
        
       FileWriter fi =new FileWriter("C:\\Users\\Utilisateur\\Documents\\joueur.txt",true);
       
       PrintWriter sorti=new PrintWriter(fi);
    if(players.isEmpty()){}else{
    for(int i=0;i<players.size();i++){
    sorti.print(players.get(i).toString());
    sorti.println();
    
    }
    sorti.close();
    }
    //To change body of generated methods, choose Tools | Templates.
    }
    protected int IDJoueur;
    protected String nomJoueur;
    protected String preNomJoueur;
    protected int IDEquipeJoueur;

    public Joueur(int IDJoueur, String nomJoueur, String preNomJoueur, int IDEquipeJoueur) {
        this.IDJoueur = IDJoueur;
        this.nomJoueur = nomJoueur;
        this.preNomJoueur = preNomJoueur;
        this.IDEquipeJoueur = IDEquipeJoueur;
    }

    public int getIDJoueur() {
        return IDJoueur;
    }

    public String getPreNomJoueur() {
        return preNomJoueur;
    }

    public int getIDEquipeJoueur() {
        return IDEquipeJoueur;
    }

    public String getNomJoueur() {
        return nomJoueur;
    }

    public void setPreNomJoueur(String preNomJoueur)throws IllegalArgumentException {
       if(preNomJoueur==null){
         throw new IllegalArgumentException("prenom ne peut êtrenull");
        }else{
        this.preNomJoueur = preNomJoueur;
        
        }
    }
    
   public int nbButMarques() {
     int nombreDeBut=0;
      for(int i=0;i<League.matchesCompletes.size();i++){
          if(League.matchesCompletes.get(i).getIDEquipeLocal()==getIDEquipeJoueur() || League.matchesCompletes.get(i).getIDEquipeVisiteur()==getIDEquipeJoueur() ){
              
         
            nombreDeBut=nombreDeBut+League.matchesCompletes.get(i).nbButsMarquesJoueur(this);
    
          
          }
          
    
    }
   
    
      return nombreDeBut;
   
   }
   
    public int nbButDePasse() {
     int nombreDeBut=0;
      for(int i=0;i<League.matchesCompletes.size();i++){
          if(League.matchesCompletes.get(i).getIDEquipeLocal()==getIDEquipeJoueur() || League.matchesCompletes.get(i).getIDEquipeVisiteur()==getIDEquipeJoueur() ){
              
         
            nombreDeBut=nombreDeBut+League.matchesCompletes.get(i).nbButDePasse(this);
    
          
          }
          
    
    }
   
    
      return nombreDeBut;
   
   }
    @Override
    public String toString(){
    return IDJoueur+";"+nomJoueur+";"+preNomJoueur+";"+IDEquipeJoueur;
    }
    
    public static void unserialise() {
    
    
    
    try{
    Scanner scan=new Scanner(new File("C:\\Users\\Utilisateur\\Documents\\joueur.txt"));
    while(scan.hasNext()){
    String g=scan.nextLine();
    StringTokenizer token=new  StringTokenizer(g,";");
    int id=Integer.parseInt(token.nextToken());
    String nom=token.nextToken();
    String prenom=token.nextToken();
    int ide=Integer.parseInt(token.nextToken());
    
    for(int i=0;i<League.listeEquipe.size();i++){
    if(League.listeEquipe.get(i).getID()==ide){
      Joueur j=new Joueur(id,nom,prenom,ide);
      League.listeEquipe.get(i).addJouer(j);
    
    }
    
    }
   
     
    
    }
    scan.close();
    }catch(IOException e){
    System.out.println("Impossible de ouvrir le fichier");
    
    }
    
    }
    
   

}