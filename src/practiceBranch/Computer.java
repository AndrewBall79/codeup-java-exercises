package practiceBranch;


public class Computer implements Electronic{
    private String name;
    private boolean isPowerOn;
    private boolean isBroken;

    public Computer(String newComputerName, boolean newCOmputerPowerStatus, boolean newComputerBroken) {
        this.name = newComputerName;
        this.isPowerOn = newCOmputerPowerStatus;
        this.isBroken = newComputerBroken;
    }


    @Override
    public void turnOn() {
        if (this.isBroken && !this.isPowerOn){
            this.isPowerOn = true;
            int chanceToFix = (int) Math.floor(Math.random() * 4);
            if(chanceToFix == 2){
                this.isBroken = false;
            }
        }else{
            this.isPowerOn = true;
        }
    }

    @Override
    public void turnOff() {
        this.isPowerOn = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPowerOn() {
        return isPowerOn;
    }

    public void setPowerOn(boolean powerOn) {
        isPowerOn = powerOn;
    }

    public boolean isBroken() {
        return isBroken;
    }



}

