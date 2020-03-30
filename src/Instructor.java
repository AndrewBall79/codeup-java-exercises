public class Instructor {
    private String firstName;
    private String lastName;
    private int brainWaveFreq;
    private static int numInstructors = 0;

    public Instructor(String first, String last){
        this.firstName = first;
        this.lastName = last;
        this.brainWaveFreq = 0;
        numInstructors++; // another instructor to add to the count

        System.out.printf("\t%s was just created\n", firstName);
        System.out.printf("\tInstructor count: %d\n\n", numInstructors);
    }
    //getter and setter for first name

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String first) {
        this.firstName = first;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String last) {
        this.lastName = last;
    }

    //getter and setter for BW freq

    public int getBrainWaveFreq() {
        return brainWaveFreq;
    }

    public void setBrainWaveFreq(int bWFreq) {
        this.brainWaveFreq = bWFreq;
    }

    // method to display info
    public String displayStats(){
        return String.format("%s %s, Brainwave Frequency: %d", firstName, lastName, brainWaveFreq);
    }

    //  lets doo iiiiiitttttt

}
