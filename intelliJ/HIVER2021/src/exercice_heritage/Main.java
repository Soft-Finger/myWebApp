package exercice_heritage;

public class Main {
    public static void main(String[] args) {
        Personne enseigant = new Personne("Code permannet", "Mazier");
        Enseigant mazier = new Enseigant("m.mazier", "mazizer", 2500, "John Snow");
        Etudiant mike = new Etudiant("m.mike", "mike", 98, "420-255");
        enseigant.setmCodePermanent("MKDIR@#$%??");

        System.out.println(enseigant);
        System.out.println("-----");
        System.out.println(mazier);
        System.out.println("-----");
        System.out.println(mike);
        System.out.println("------");
        System.out.println(enseigant.getmCodePermanent());
    }
}
