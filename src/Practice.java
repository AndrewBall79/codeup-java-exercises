public class Practice {
    public static void main(String[] args) {
//        int num1 = 7;
//        int num2 = 78;
//
//        int answer1;
//        int answer2;
//        boolean answer3;
//
//        answer1 = multNumbers(num1);
//        System.out.println("When we multiply num1 by 7 we get: " + answer1);
//        answer2 = addNumbers(num1, num2);
//        System.out.println("When we add num1 and num2, we get: " + answer2);
//
//        answer3 = equalNumbers(num1, num2);
//        System.out.println("num1 and num2 are equal: " + answer3);
//    }
//    public static int multNumbers(int a){
//        return a * 7;
//    }
//
//    public static int addNumbers(int x, int y){
//        return x + y;
//    }
//    public static boolean equalNumbers(int r, int t){
//        return r == t;

        int var1 = 5;
        double var2 = 3.65;

        aircraft cessna172 = new aircraft();    //creates object of class aircraft

        aircraft piperSaratoga = new aircraft(); //creates object contains all class variables

        aircraft g4 = new aircraft(); //

        cessna172.passengers = 4;
        cessna172.cruiseSpeed = 140;
        cessna172.fuelCapacity = 56.5;
        cessna172.fuelBurnRate = 9.5;

        System.out.println("Cessna 172 Passengers: "+ cessna172.cruiseSpeed); //
        System.out.println("Cessna 172 Fuel Burn Rate:" + cessna172.fuelBurnRate + " GPH");

        piperSaratoga.passengers = 6;
        piperSaratoga.cruiseSpeed = 201;
        piperSaratoga.fuelCapacity = 102.5;
        piperSaratoga.fuelBurnRate = 20.5;

        System.out.println("Piper Saratoga Cruise Speed: "+ cessna172.cruiseSpeed + " MPH"); //

    }
}

class aircraft {
    int passengers;       //number of people
    int cruiseSpeed;      //mph
    double fuelCapacity;  //gallons
    double fuelBurnRate;  //gallons per hour
}
