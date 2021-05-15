

public class Goal {
   
    public int IDJoueurAuteur;
    private int IDJoueurAssistant1;
    private int IDJoueurAssistant2;
    private int IDTeamMarqueur;
    private int IDTeamEcaisseur;
    private int IDGame;
    private int IDJoueurEncaisseur;

    public Goal(int IDJoueurAuteur, int IDJoueurAssistant1, int IDJoueurAssistant2, int IDTeamMarqueur, int IDTeamEcaisseur, int IDGame, int IDJoueurEncaisseur) {
        this.IDJoueurAuteur = IDJoueurAuteur;
        this.IDJoueurAssistant1 = IDJoueurAssistant1;
        this.IDJoueurAssistant2 = IDJoueurAssistant2;
        this.IDTeamMarqueur = IDTeamMarqueur;
        this.IDTeamEcaisseur = IDTeamEcaisseur;
        this.IDGame = IDGame;
        this.IDJoueurEncaisseur = IDJoueurEncaisseur;
    }

    public Goal(int IDJoueurAuteur, int IDJoueurAssistant1, int IDJoueurAssistant2, int IDTeamMarqueur, int IDTeamEcaisseur, int IDGame) {
        this.IDJoueurAuteur = IDJoueurAuteur;
        this.IDJoueurAssistant1 = IDJoueurAssistant1;
        this.IDJoueurAssistant2 = IDJoueurAssistant2;
        this.IDTeamMarqueur = IDTeamMarqueur;
        this.IDTeamEcaisseur = IDTeamEcaisseur;
        this.IDGame = IDGame;
    }

    public Goal(int IDJoueurAuteur, int IDTeamMarqueur, int IDTeamEcaisseur, int IDGame, int IDJoueurEncaisseur) {
        this.IDJoueurAuteur = IDJoueurAuteur;
        this.IDTeamMarqueur = IDTeamMarqueur;
        this.IDTeamEcaisseur = IDTeamEcaisseur;
        this.IDGame = IDGame;
        this.IDJoueurEncaisseur = IDJoueurEncaisseur;
    }

    public Goal(int IDJoueurAuteur, int IDTeamMarqueur, int IDTeamEcaisseur, int IDGame) {
        this.IDJoueurAuteur = IDJoueurAuteur;
        this.IDTeamMarqueur = IDTeamMarqueur;
        this.IDTeamEcaisseur = IDTeamEcaisseur;
        this.IDGame = IDGame;
    }

    public int getIDJoueurAuteur() {
        return IDJoueurAuteur;
    }

    public int getIDJoueurAssistant1 () {
        return IDJoueurAssistant1;
    }

    public int getIDJoueurAssistant2() {
        return IDJoueurAssistant2;
    }

    public int getIDTeamMarqueur () {
        return IDTeamMarqueur;
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
    
    

    
}