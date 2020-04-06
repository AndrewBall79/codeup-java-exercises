package practiceBranch;

import java.util.ArrayList;
import java.util.Arrays;

public class AndrewClass {
    private static ArrayList<Computer> brokenComputers = new ArrayList<>();
    private static ArrayList<Computer> fixedComputers = new ArrayList<>();

    private static Clerk brance = new Clerk("Brance");
    private static Repairer moss = new Repairer("Moss");

    public static void main(String[] args) {
        Computer jimsComputer = new Computer("Lapple", false, true);
        Customer jim = new Customer("Jim", jimsComputer);

        Computer testComputerOne = new Computer("Dell", false, true);
        Computer testComputerTwo = new Computer("AlienWare", false, true);
        Computer testComputerThree = new Computer("Apple", false, true);


        brance.recieveComputer(testComputerOne, brokenComputers);
        brance.recieveComputer(testComputerTwo, brokenComputers);
        brance.customerService(jim, brokenComputers);

        for(Computer computer : brokenComputers){
            System.out.println("Computer getName" + computer.getName());
        }

        moss.repairComputer(brokenComputers, fixedComputers);
        moss.repairComputer(brokenComputers, fixedComputers);

        System.out.println("-------------");

        for(Computer computer : brokenComputers){
            System.out.println("Computer  getName" + computer.getName());

    }

    }
}
