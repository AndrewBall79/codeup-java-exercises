import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Person2 {
    //    Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
//    For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
//    public static int k = 17;
//    public  static int[] numberList = new int[]{14, 5, 7, 1};
//    Scanner sc = new Scanner(System.in);
//    public static void main(String[] args) {
//
//        for (int i = 0; i < numberList.length; i++) {
//            if (numberList[i] + numberList[i] == k) {
//                System.out.println(numberList[i] + " and " + numberList[i] +  " = K");
//            }
//
//
//        }
//    }

    public static void main(String[] args) throws IOException {
        String dataPathName = "data";
        String dataFileName = "data.txt";
        String groceriesFileName = "groceries.txt";

        Path datapath = Paths.get(dataPathName);
        if (!Files.exists(datapath)) {
            // creates directory
            Files.createDirectory(datapath);
        }

        //tests the directory
        System.out.println(Files.exists(datapath));

        //create a file
        Path dataFilePath = Paths.get(dataPathName, dataFileName);
        Files.createFile(dataFilePath);

        //write to file
        String line = "Whose line is it, anyway?";
        Files.write(dataFilePath, Arrays.asList(line), StandardOpenOption.CREATE);

        //append to the file
        List<String> groceries = Arrays.asList("eggs", "Tee Pee", "sandwiches", "noodles", "cake", "almond milk");
        Files.write(dataFilePath, Arrays.asList(line), StandardOpenOption.APPEND);

        //break groceries into it's own file
        Path groceriesPath = Paths.get(dataPathName, groceriesFileName);
//        List<String> groceries = Arrays.asList("eggs", "Tee Pee", "sandwiches", "noodles", "cake", "almond milk");
        Files.write(groceriesPath, groceries, StandardOpenOption.CREATE);

        line = "tissues";
        Files.write(groceriesPath, Arrays.asList(line), StandardOpenOption.APPEND);

        //read the list
        List<String> readList = Files.readAllLines(groceriesPath);

        //print the list
        System.out.println(readList);
    }
}
