package tranMe2;

import java.util.Scanner;

public class Candy {
    public static void main( String[] args ) {

    }

    public void afficher() {
        System.out.println("MENU : ");
        System.out.println("1. Sneakers\n" +
                "2.\n");
    }

    public void  menu() {
        Scanner input = new Scanner( System.in );
        afficher();
        System.out.println("Entrez votre choix : ");
        String str = input.nextLine();
        char c = str.charAt( 0 );
        input.close();

        while ( c != 0 ) {

        }
    }
}
