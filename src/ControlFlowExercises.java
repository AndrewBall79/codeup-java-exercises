import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {


        int i = 5;
        while (i < 15) {
            System.out.println(i + " ");
            i++;
        }


        int p = 0;
        do {
            System.out.println(p);
            p += 2;
        } while (p <= 100);

        int a = 100;
//        do{
//            System.out.println((a));
//            a-=5;
//
//        }


//        long i = 2;

//        do {
//            System.out.println(i *= i);
//        } while (i < 1000000);


//        for (long i = 2; i <= 1000000; i *= i) {
//            System.out.println(i);
//        }


        //************* fizz buzz **************/

//        for(int i =1; i <= 100; i++){
//            if(i %15 == 0){
//                System.out.println("FizzBuzz");
//            }else if(i% 3 ==0){
//                System.out.println("FizzBuzz");
//            }else if (i % 5 == 0){
//                System.out.println("Buzz");
//            }else {
//                System.out.println(i);
//            }
//        }


        Scanner input = new Scanner(System.in);
//
//        String userConfirm = "Y";
//        while(userConfirm.equalsIgnoreCase("y"))
//        System.out.println("Please enter a number");
//        int userNumber = input.nextInt();
//        System.out.println("number | squared | cubed ");
//        System.out.println("------ | ------- | ----- ");
//        for (var i = 1; i <= userNumber; i++) {
//            System.out.printf("%-9d |%-10d | %-8d%n", i, (i * i), (i * i * i));
//        }
//        System.out.println("Would You Like to Enter another Number?  y/N ");
//        userNumber.


//        do{
//            System.out.println("Please enter a number between 1-100");
//            int userNumber = input.nextInt();
//            if (userNumber >= 88) {
//                System.out.println("A");
//            } else if (userNumber >= 80) {
//                System.out.println("B");
//            } else if (userNumber >= 67) {
//                System.out.println("C");
//            } else if (userNumber >= 60) {
//                System.out.println("D");
//            } else if (userNumber >= 0) {
//                System.out.println("F");
//            }
//            Scanner sc = new Scanner(System.in);
//            System.out.print("Continue? [y/N]");
//            String userInput = sc.next();
//            boolean confirmation = userInput.equalsIgnoreCase("");
//        }
//        if(!userResponse.equalsIgnoreCase("y"));
//
//        }
//    }
//        boolean gradeContinue = true;
//        do {
//            System.out.println("Please enter a number grade");
//            int numericGrade = input.nextInt();
//
//            if (numericGrade >= 88) {
//                System.out.println("A");
//            } else if (numericGrade >= 80) {
//                System.out.println("B");
//            } else if (numericGrade >= 67) {
//                System.out.println("C");
//            } else if (numericGrade >= 60) {
//                System.out.println("D");
//            } else {
//                System.out.println("F");
//            }
//
//            System.out.println("Would you like to enter a new grade? (y/n)");
//            String userResponse = input.next();
//
//            if (!userResponse.equalsIgnoreCase("y")) {
//                gradeContinue = false;
//            }
//
//        } while (gradeContinue);
    }
}


