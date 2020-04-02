package grades;

import java.util.ArrayList;
import java.util.OptionalDouble;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // returns the student's name
    public String getName() {
        return name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        grades.add(grade);
//        System.out.println(name + " Just scored a " + grade);
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        double total = 0;
        double avg;
        for (int grade : grades)
            total += grade;
        return total / grades.size();

    }

//    public static void main(String[] args) {
//        Student haah = new Student("Annnnndy" );
//        haah.addGrade(90);
//        haah.addGrade(70);
//        haah.addGrade(65);
//        System.out.println(haah.getGradeAverage());
//    }
}
