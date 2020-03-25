import java.util.InputMismatchException;
import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {

//        public static int add(int a, int b){ return a+ b;}
        int base = 1;
        int exponent = 7;
        int add = base + exponent;
        System.out.println("The base plus the exponent is: " + add);
        int sub = base - exponent;
        System.out.println("The base minus the exponent is: " + sub);
        int times = base * exponent;
        System.out.println("The base times the exponent is: " + times);
        int divide = base / exponent;
        System.out.println("The base divided by the exponent is: " + divide);
        int modulus = base % exponent;
        System.out.println("The base modulus the exponent is: " + modulus);


        Scanner input = new Scanner(System.in);

//public static int multWithLoop(int a, int b){
//    int j = a;
//    if (a<0) b = 0 - b;
//    int product = 0;
//    for (int i = a; i != 0; i -= j){
//        product += b;
//    }
//    return product;
//        }

//        public static int multWithRecursion(int a, int b){
//            int product = 0;
//            if (a> 0){
//                product = b + multWithRecursion(a-1,b);
//            }else if (a<0){
//                product = (0-b) + multWithRecursion(a+1, b);
//            }
//            return product;
//        }
//
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
//    }
//
//
//public static int getInteger(int min, int max) {
//    scanner = new Scanner(System.in);
//    boolean doAgain = true;
//    int num = 0;
//    do {
//        try {
//            num = scanner.nextInt();
//            if (num < min || num > max) {
//                System.out.printf("\nThe integer %d is out of range\n", num);
//                System.out.printf("Enter an integer beween %d and %d ", min, max);
//
//            } else {
//                doAgain = false;
//            }
//        } catch (InputMismatchException ime) {
//            System.out.println("That is not an integer.");
//            System.out.printf("Enter an integer beween %d and %d ", min, max);
//            scanner.nextLine();
//            num = 0;
//        }
//    } while (doAgain);
//    return num;
//}


//public static long calcFactorial(int num) throws ArithmeticException{
//    long factorial = 1;
//    long previousFactorial = 1;
//    for (int i = 1; i <= num; ++i){
//        factorial *= i;
//        if (previousFactorial > factorial);
//    }
//        }
//
//public static long recursiveCalcFactorial(int num) throws ArithmeticException{
//    if (num <=1) return; 1;
//    long fact = num * recursiveCalcFactorial(num-1)
//        }
//
//
//
//
//public static Scanner scanner;
//
//
//
//}
    }
}




