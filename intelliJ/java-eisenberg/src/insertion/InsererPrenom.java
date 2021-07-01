package insertion;


class InsererPrenom {
    public static void main(String[] args) {

        // Initialisation de la liste des prénoms.
        String[] prenoms = {"Camille", "Emile", "Charlotte", "Veronique",
                "Raphael", "Aurelie", "Louis-Felix"};

        // Message pour indiquer comment utiliser le programme.

        System.out.println("Utilisation: java InsererPrenom <unPrenom> <unePosition>");
        System.out.println("\tou unPrenom est le prénom à insérer");
        System.out.println("\tet unePosition est un nombre entier indiquant ou le pr�nom doit être inséré (1, 2, 3, ...)");


        // Affichage des prénoms de la liste au départ.
        System.out.println("\nAvant l'insertion");
        afficherPrenoms(prenoms);



        // Affichage des prénoms de la liste à la fin.
        System.out.println("\nAprès l'insertion");
        afficherPrenoms(prenoms);
    }

    // Ajoutez ci-dessous le code pour insérer le prénom.

    public static void insertion(String[] prenoms, String n) {
        for(int i = 0; i < prenoms.length; i++) {
            if(prenoms[i].equals(n)) {
                prenoms[i] = n;
                break;
            }
        }
    }

    // Fonction qui permet d'afficher la liste des prénoms d'un tableau reçu en paramètre.
    public static void afficherPrenoms(String[] tab) {
        for ( String s : tab )
            System.out.print( s + " " );
        System.out.println();
    }
}
