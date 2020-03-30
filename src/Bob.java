import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
//        boolean userConfirm = true;
//
//        do {
//            Scanner input = new Scanner(System.in);
//            System.out.print("Ask Bob a question: ");
//            String userQ = input.nextLine().toUpperCase();
//            if (userQ.contains("?")) {
//                System.out.println("Sure.");
//            }
//            if (userQ.contains("!")) {
//                System.out.println("Whoa, chill out!");
//            }
//            if (userQ.contains("BOB")) {
//                System.out.println("Fine. Be that way!");
//            } else if (userQ.isEmpty()) {
//                System.out.println("Whatever.");
//            }
//            System.out.print("would you like to continue? y/N: ");
//        } while (userConfirm = true);
//    }


        boolean gradeContinue = true;
        do {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter a grade: ");
            int a = scan.nextInt();
            if (a >= 90 && a <= 100) {
                System.out.println("A");
            }
            else if (a >= 80 && a <= 90) {
                System.out.println("B");
            }
            else if (a >= 70 && a <= 80) {
                System.out.println("C");
            }
            else if (a >= 60 && a <= 70) {
                System.out.println("D");
            }
            else if (a >= 0 && a <= 60) {
                System.out.println("F");
            } else {
                System.out.println("The number you entered is not in range");
            }
            System.out.println("Would you like to enter a new grade? (y/n)");
            String userResponse = scan.next();

            if (!userResponse.equalsIgnoreCase("y")) {
                gradeContinue = false;

            }
        } while (gradeContinue);
    }
}


//    Write the Java code necessary so that a user of your command line application can have a conversation with Bob.
