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
        double cessna172Endurance;
        double piperEndurance;

        aircraft cessna172 = new aircraft(4, 140, 56.5, 9.5);    //creates object of class aircraft
        cessna172.captain = "Stevo";
        cessna172.plateNumber = "ev5768";
        cessna172.calculateEndurance();
        System.out.println("For Cessna 172 to fly for 2.5 hours, it takes: " + cessna172.fuelNeeded(2.5)+ " gallons of fuel.\n");
        System.out.println("Cessna 172 Endurance is \n"+ cessna172.calculateEndurance());
//        cessna172Endurance = cessna172.fuelCapacity / cessna172.fuelBurnRate;
//        System.out.println("Cessna 172 Cruise Speed: "+ cessna172.cruiseSpeed +"\n"); //
//        System.out.println("Cessna 172 Fuel Burn Rate: " + cessna172.fuelBurnRate + " GPH \n");
//        System.out.printf("A Cessna 172 can stay aloft for %.3f hours \n", cessna172Endurance);
        aircraft piperSaratoga = new aircraft(6, 201, 102.5, 20.5); //creates object contains all class variables
        double enduranceSaratoga = piperSaratoga.calculateEndurance();
        System.out.println("For Piper Saratoga to fly for 4.2 hours, it takes: " + piperSaratoga.fuelNeeded(4.2)+ " gallons of fuel.\n");
        System.out.println("Piper Saratoga Endurance is "+ enduranceSaratoga +"\n");


//        System.out.println("Piper Saratoga Cruise Speed: "+ piperSaratoga.cruiseSpeed + " MPH"); //
//        piperEndurance = piperSaratoga.fuelCapacity / piperSaratoga.fuelBurnRate;
//        System.out.println("A piper Saratoga can stay aloft for " + piperEndurance + " hours");

//        aircraft g4 = new aircraft();

    }
}

class aircraft {
    String captain;
    int passengers;       //number of people
    int cruiseSpeed;      //mph
    double fuelCapacity;  //gallons
    double fuelBurnRate;  //gallons per hour
    String plateNumber;

    aircraft(int p, int c, double fc, double fbr){
        passengers = p;
        cruiseSpeed = c;
        fuelCapacity = fc;
        fuelBurnRate = fbr;
    }


    // method to calculate aircraft endurance
    double calculateEndurance() {
        double endurance;
        endurance = fuelCapacity / fuelBurnRate;
        return endurance;
    }

    double fuelNeeded(double time ){
        return fuelBurnRate * time;
    }
}

