import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Ask Bob a question");
        String userQ = input.nextLine().toUpperCase();
        if (userQ.contains("?")) {
            System.out.println("Sure.");
        }
        if (userQ.contains("!")) {
            System.out.println("Whoa, chill out!");
        }
        if (userQ.contains("BOB")) {
            System.out.println("Fine. Be that way!");
        }
        else if (userQ.isEmpty()){
            System.out.println("Whatever.");
        }
    }
}
//    Write the Java code necessary so that a user of your command line application can have a conversation with Bob.
