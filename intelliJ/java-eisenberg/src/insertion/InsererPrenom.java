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

        // Ajoutez ci-dessous le code pour insérer le prénom.

        /*public static void insertion(String s, int n) {
            for(int i = 0; i < prenoms.length; i++) {
                if(prenoms[i].equals(n)) {
                    prenoms[i] = s;
                    break;
                }
            }
        }*/

        // Affichage des prénoms de la liste à la fin.
        System.out.println("\nAprès l'insertion");
        //afficherPrenoms(prenoms2);
    }

    // Fonction qui permet d'afficher la liste des prénoms d'un tableau reçu en paramètre.
    public static void afficherPrenoms(String[] tab) {
        for (int i = 0; i < tab.length; i++)
            System.out.print(tab[i] + " ");
        System.out.println();
    }
}
