package arrayliste;

import java.util.Scanner;
import java.util.ArrayList;

public class Percentages {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Double> priceList = new ArrayList<>();
        double onePrice = 0.0;
        do {
            System.out.print("Enter a price, or zero when finished: $");
            onePrice = input.nextDouble();
            if (onePrice > 0) {
                priceList.add(onePrice);
            }
        } while (onePrice != 0.0);

        int nPrices = priceList.size();
        if (nPrices > 0) {
            double maxPrice = priceList.get(0);
            for (int i = 1; i < nPrices; i++) {
                if(priceList.get(i) > maxPrice) {
                    maxPrice = priceList.get(i);
                }
            }

            for (int i = 0; i < nPrices; i ++) {
                double percentOfMax = priceList.get(i) / maxPrice;
                priceList.set(i, percentOfMax);
            }

            System.out.println("Here are the percentages of maximum price: ");
            for (double price : priceList) {
                System.out.printf("%.3f ", price);
            }
            System.out.println();
        }else {
            System.out.println("No data entered");
        }

        input.close();
    }
}
