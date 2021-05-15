package practices;

/*
  * Use indexOf() and substring() to split input
  * int three separate words
 */

import java.util.Scanner;

public class SplitWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Enter up three words separate by commas: ");
        String phrase = input.nextLine();

        String word1 = "";
        String word2 = "";
        String word3 = "";

        int firstComma = phrase.indexOf(",");

        if (firstComma >= 0) {
            word1 = phrase.substring(0, firstComma);
            int secondComma = phrase.indexOf(",", firstComma + 1);

            if (secondComma >= 0) {
                word2 = phrase.substring(firstComma + 1, secondComma);
                word3 = phrase.substring(secondComma + 1);
            } else {
                word2 = phrase.substring(firstComma + 1);
            }

        } else {
            word1 = phrase;
        }

        word1 = word1.trim();
        word2 = word2.trim();
        word3 = word3.trim();

        System.out.println("Word 1: " + word1);
        System.out.println("Word 2: " + word2);
        System.out.println("Word 3: " + word3);
    }

}
