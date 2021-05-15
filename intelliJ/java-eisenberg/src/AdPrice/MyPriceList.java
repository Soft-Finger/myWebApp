package AdPrice;

import java.util.ArrayList;
import java.util.Scanner;

public class MyPriceList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList <Double> priceList = new ArrayList<>();
        double onePrice;
        do {
            System.out.println("enter your price or press 0 when you finished:$ ");
            onePrice = input.nextDouble();
            if (onePrice > 0) {
                priceList.add(onePrice);
            }
        } while (onePrice != 0.0);

        int nPrices = priceList.size();
        if (nPrices > 0) {
            double maxPrice = priceList.get(0);
            for( int i = 0; i < nPrices; i++  ) {
                if (priceList.get(i) > maxPrice) {
                    maxPrice = priceList.get(i);
                }
            }

            for( int i = 0; i < nPrices; i++ ) {
                double percentageOfMax = (priceList.get(i) / maxPrice) * 100;
                priceList.set(i, percentageOfMax);
            }
            System.out.println("Here are the percentages of maximum price: ");
            for( double price: priceList ) {
                System.out.printf("%.3f%% ", price);
            }
            System.out.println();
        } else {
            System.out.println("No data entered");
        }

    /**
     * BOXING
     * Double dPrice = 29.95
     * double dPrice = Double.valueOf(29.95);
     *UNBOXING
     * double discounted = dPrice * 0.90;
     * double discounted = dPrice.doubleValueOf() * 0.90
    */


        input.close();
    }
}
