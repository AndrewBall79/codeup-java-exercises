package util;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

        private static Scanner scanner = new Scanner(System.in);

    public static void setScanner(Scanner scanner) {
    }


    public static String getString(String prompt){
            System.out.print("Enter something: ");
            String userInput = scanner.next();
            System.out.println("You entered: --> \"" + userInput + "\" <--");
            return userInput;
        }

    public static boolean yesNo(String s) {
        return true;
    }

    public static boolean yesNo() {
            System.out.println("Enter (y/N): ");
            String userYn = scanner.next();
            boolean confirmation = userYn.equalsIgnoreCase("y");
            System.out.println(confirmation);
            return confirmation;
        }
        public static int getInt(int min, int max, String s){
            System.out.println("Enter a Number Between 1 and 10");
            boolean doAgain = true;
            int num = 0;
            do {
                try {
                    num = Integer.parseInt(getString(s));
                    scanner.nextLine();
                    if (num < min || num > max) {
                        System.out.printf("\nThe integer %d is out of range\n", num);
                        System.out.printf("Enter an integer between %d and %d ", min, max);

                    } else {
                        doAgain = false;
                    }
                } catch (InputMismatchException ime) {

                    System.out.println("That is not an integer.");
                    System.out.printf("Enter an integer between %d and %d ", min, max);
                    scanner.nextLine();
                    num = 0;

                }
            } while (doAgain);
            return num;
        }
//    public int getInt(){
//        System.out.println("Enter a Number: ");
//        int num = scanner.nextInt();
//        return num;
//    }
public static double getDouble(double min, double max){
        System.out.println("Enter a Decimal number Between 1 and 10");
        boolean doAgain = true;
        double num = 0;
        do {
            try {
                num = scanner.nextDouble();
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
//    public double getDouble(){
//        System.out.println("Enter a Decimal Number: ");
//        double num = scanner.nextDouble();
//        return num;
//    }
//    public int getBinary(String prompt){
//
//        do {
//            if (prompt != null){
//        }
//        try{
//            userInput = getString();
//            num = Integer.valueOf(userInput, 2);
//            validInput = true;
//        }
//
//    }

}

