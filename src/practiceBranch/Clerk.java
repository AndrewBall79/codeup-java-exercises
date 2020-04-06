package practiceBranch;

import java.util.ArrayList;

public class Clerk extends Human {
    public Clerk(String name) {
        super(name);
    }

    public void recieveComputer(Computer incomingBrokenComputer, ArrayList<Computer> thisStoresBrokenComputerPile){
        thisStoresBrokenComputerPile.add(incomingBrokenComputer);
    }

    public void customerService(Customer customerCurrentlyComplaining, ArrayList<Computer> thisStoresBrokenPile){
        Computer thisCustomersComputer = customerCurrentlyComplaining.getPersonalComputer();
        thisStoresBrokenPile.add(thisCustomersComputer);
    }
}
