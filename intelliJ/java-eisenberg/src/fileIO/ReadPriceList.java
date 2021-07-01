package fileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadPriceList {
    public static void main ( String[] args ) throws FileNotFoundException {
       /* final double TAX_RATE = 0.05;
        double subtotal = 0.0;
        int nItems = 0;

        // Create a file from file prices.txt
        File priceFile = new File ( "prices.txt" );

        // Create Scanner to read from file
        try {
            Scanner input = new Scanner ( priceFile );
            while ( input.hasNext () ) {
                double price = input.nextDouble ();
                subtotal += price;
                nItems++;
            }

            // close Scanner
            input.close ();

            // calculate and print summary information
            double tax = subtotal * TAX_RATE;
            System.out.printf ( "Number of items: %d\n", nItems );
            System.out.printf ( "subtotal : $%7.2f\n", subtotal );
            System.out.printf ( "Tax: $%7.2f\n", tax );
            System.out.printf ( "Total: $%7.2f\n", subtotal + tax );
        } catch ( FileNotFoundException e ) {
            System.out.println ("file no found");
        } catch ( InputMismatchException ex ) {
            System.out.println ("Bad data in file");
        }*/

        System.out.println(add(4));

    }

    public static int add(int multiple) {
        int res = 1;
        for ( int i = 1; i < multiple; i++ ) {
           res *= i;
        }
        return res;
    }
}
