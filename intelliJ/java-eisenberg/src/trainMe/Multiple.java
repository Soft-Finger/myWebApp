package trainMe;


public class Multiple {
    public static void main( String[] args ) {
       /**
        *  System.out.print("Entrez un nombre pour voir sa table de multiplication: ");
        Scanner scan = new Scanner( System.in );
        int nbr = scan.nextInt();

        System.out.println("La table de multiplication de " + nbr + " est : ");

        for ( int i = 1; i < 10; i++ ) {
            System.out.println(nbr + " x " + i + " = " + (nbr * i));
        }*/

       int[] tab1 = {1, 2, 3, 4, 5, 6, 7, 8};
       int[] tab2 = {9, 10, 11, 12, 13, 14, 15, 16};
       int[] test = fusion( tab1, tab2 );

       for ( int i = 0; i < test.length; i++ ) {
           System.out.print(test[i] + " ");
       }

    }
       public static int[] fusion(int tab1[], int tab2[]) {
           int  result[] = new int[tab1.length + tab2.length];

           int position = 0;
           for ( int i = 0; i < tab2.length; i++) {
               result[position] = tab1[i];
               position++;
           }

           for ( int i = 0; i < tab2.length; i++ ) {
               result[position] = tab2[i];
               position++;
           }
           return result;
       }
}
