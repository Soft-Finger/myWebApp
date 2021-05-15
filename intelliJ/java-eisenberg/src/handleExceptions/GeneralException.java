package handleExceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GeneralException {
    public static void main(String[] args) throws InputMismatchException {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Dividing numbers");

            System.out.print("Enter the dividend: ");
            int dividend = input.nextInt();

            System.out.print("Enter the divisor: ");
            int divisor = input.nextInt();

            System.out.printf("Quotient: %d\n", dividend / divisor);
            System.out.printf("Remainder: %d\n", dividend % divisor);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed");
        } catch (Exception e) {
            System.out.println("error in programme");
        }
    }
}
