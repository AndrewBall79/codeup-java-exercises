package grades;

import util.Input;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;


public class GradesApplication {
    public static void main(String[] args) {

        ArrayList<Integer> grades = new ArrayList<>();

        HashMap<String, Student> students = new HashMap<>();


        students.put("JOJo", new Student("Sllappy"));
        students.put("Koplorsly", new Student("NobleJoble"));
        students.put("Gotcha", new Student("Bill"));
        students.put("Frrrrreeeeze", new Student("Hoaiuou"));
        students.put("Smile-no-Ren", new Student("Fornky"));


        //random grades
        Random random = new Random();
        for (int i=0; i<4; i++);
            students.get("JOJo").addGrade(random.nextInt(100));
            students.get("Koplorsly").addGrade(random.nextInt(100));
            students.get("Gotcha").addGrade(random.nextInt(100));
            students.get("Frrrrreeeeze").addGrade(random.nextInt(100));
            students.get("Smile-no-Ren").addGrade(random.nextInt(100));






        System.out.println("\tWelcome!"+
                           "\nHere are the GitHub user names of our students: \n" +
                            students.keySet() +'|');

        Scanner scanner = new Scanner(System.in);
        Input.setScanner(scanner);

        String ghUser;
        boolean confirmation = true;
        do{
            System.out.println("HOO TOO VUUUU?");
            ghUser = Input.getString("Which Students would you like to view?");
            if(!students.containsKey(ghUser)) {
                System.out.println("\nNot a student )(:");
            }else {
                Student thisStudent = students.get(ghUser);
                System.out.println("\n\nName: " + thisStudent.getName() + "|| GH u/n: " + ghUser + "|| Current Grade Average: " + thisStudent.getGradeAverage());
            }
            confirmation = Input.yesNo("Input y/N: ");

        }while(confirmation);
    }
}