import java.util.Scanner;

public class ControlStatementsLec {
    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Continue? [y/N]");
//        String userInput = sc.next();
//        boolean confirmation = userInput.equalsIgnoreCase("y");
//        System.out.print(confirmation);
        int caseSwitch = 1;

//        switch (caseSwitch) {
//            case 1:
//                System.out.println("Case 1");
//                // Fall through!
//            case 2:
//                System.out.println("Case 2");
//                break;
//            default:
//                System.out.println("Default case");
//                break;
//        }
//        int i = 0;
//        while (i < 10) {
//            System.out.println("i is " + i);
//            i++;
//        }
//        for(int i = 0; i < 10; i += 1) {
//            System.out.println("i is " + i);
//        }
//        for(int i = 1; i < 100; i++) {
//            System.out.println(i);
//            if (i == 5) {
//                break;
//            }
//        }
        for(int i = 1; i <= 10; i++) {
            if(i % 2 == 1) {
                continue;
            }
            System.out.println(i);
        }
    }
}
