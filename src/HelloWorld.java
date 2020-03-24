public class HelloWorld {
    public static void main(String[] args){
        int myFavoriteNum = 5;
        System.out.println("Hello, World!");
        System.out.print("Hello ");
        System.out.print("World!\n");
        System.out.println("My Favorite Number is: " + myFavoriteNum);
        String myString = "Strings And Things";
        System.out.println(myString);


        long myNumber = 123L;
        System.out.println(myNumber);


        float myFloatNumber = (float) 3.14;
        System.out.println(myFloatNumber);


//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

//        class operation{
//        };

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
//        System.out.println(three);

        int x = 4;
        System.out.println(x+=5);

//        int x = 3;
//        int y = 4;
//        System.out.println(y*=x);


//        byte x = 127;
//        int y = 22;
//        System.out.println(x += y);
//        System.out.println(y -= x);
    }
public static int addInts001(int a, int b){
    return a + b;
}
    public static double performIndicatedOperation011(String operation, double op1, double op2) {
        if (operation.equals("ADD")) {
            return op1 + op2;
        }else if (operation.equals("SUB")) {
            return op1-op2;
        }else if (operation.equals("MUL")) {
            return op1 * op2;
        }else if (operation.equals("DIV")) {
            return op1 / op2;
        }
        return 0;
    }
    public static int getNearestIntegerToRealSum013(double firstRealAddend, double secondRealAddend){
        int output = (int) Math.rint(firstRealAddend + secondRealAddend);
        return output;
    }
}



//** THis is a method to determine if a string is a valid number
//** True if a number, else false
//public static boolean isNumber