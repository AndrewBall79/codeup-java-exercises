package util;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

        private Scanner scanner = new Scanner(System.in);
        String getString(){
            System.out.println("Enter something: ");
            String userInput = scanner.next();
            System.out.println("You entered: --> \"" + userInput + "\" <--");
            return userInput;
        }
        boolean yesNo () {
            System.out.println("Enter (y/N): ");
            String userYn = scanner.next();
            boolean confirmation = userYn.equalsIgnoreCase("y");
            System.out.println(confirmation);
            return confirmation;
        }
        int getInt ( int min, int max){
            System.out.println("Enter a Number Between 1 and 10");
            boolean doAgain = true;
            int num = 0;
            do {
                try {
                    num = scanner.nextInt();
                    if (num < min || num > max) {
                        System.out.printf("\nThe integer %d is out of range\n", num);
                        System.out.printf("Enter an integer between %d and %d ", min, max);

                    } else {
                        doAgain = false;
                    }
                } catch (InputMismatchException ime) {
                    System.out.println("That is not an integer. Plus i had sex during lunch muahahha");
                    System.out.printf("Enter an integer between %d and %d ", min, max);
                    scanner.nextLine();
                    num = 0;
                }
            } while (doAgain);
            return num;
        }
//    int getInt(){
//        System.out.println("Enter a Number: ");
//        int num = scanner.nextInt();
//        return num;
//    }
    double getDouble(double min, double max){
        System.out.println("Enter a Decimal number Between 1 and 10");
        boolean doAgain = true;
        double num = 0;
        do {
            try {
                num = scanner.nextInt();
                if (num < min || num > max) {
                    System.out.printf("\nThe integer %d is out of range\n", num);
                    System.out.printf("Enter an integer beween %d and %d ", min, max);

                } else {
                    doAgain = false;
                }
            } catch (InputMismatchException ime) {
                System.out.println("That is not an integer.");
                System.out.printf("Enter an integer beween %d and %d ", min, max);
                scanner.nextLine();
                num = 0;
            }
        } while (doAgain);
        return num;

    }
    double getDouble(){
        System.out.println("Enter a Decimal Number: ");
        int num = scanner.nextInt();
        return num;
    }
    }

