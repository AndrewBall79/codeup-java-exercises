import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
//        int base = 1;
//        int exponent = 7;
//        int add = base + exponent;
//        System.out.println("The base plus the exponent is: " + add);
//        int sub = base - exponent;
//        System.out.println("The base minus the exponent is: " + sub);
//        int times = base * exponent;
//        System.out.println("The base times the exponent is: " + times);
//        int divide = base / exponent;
//        System.out.println("The base divided by the exponent is: " + divide);
//        int modulus = base % exponent;
//        System.out.println("The base modulus the exponent is: " + modulus);
//

        Scanner input = new Scanner(System.in);
//        boolean cContinue = true;
//        do {
//            System.out.println("Please enter a number between 1 and 10: ");
//            int userNumber = input.nextInt();
//            System.out.println("You Entered: "+ userNumber);
//            if (userNumber < 1 || userNumber > 10) {
//                cContinue = false;
//            }else {
//                System.out.println("You Know Your Way Around A Keyboard!");
//            }
//        } while (cContinue) ;
//    System.out.println("No sorry that's not right");

        boolean cContinue = true;
        do {
            System.out.println("Please enter a number between 1 and 10: ");
            int userNumber = input.nextInt();
            System.out.println("You Entered: "+ userNumber);
            if (userNumber < 1 || userNumber > 10) {
                cContinue = false;
            }else {
                System.out.println("You Know Your Way Around A Keyboard!");
            }
        } while (cContinue) ;
    System.out.println("No sorry that's not right");}


}





