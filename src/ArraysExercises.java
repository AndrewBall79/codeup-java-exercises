import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {

//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));


        Person person1 = new Person("Fraink");
        Person person2 = new Person("Craink");
        Person person3 = new Person("Draink");

        Person[] people =new Person[3];
        people[0] = new Person("Casey");
        people[1] = new Person("Cott");
        people[2] = new Person("Mitttts");

        for(Person person : people){
            System.out.println(person.getName());
        }

        Person addition = new Person("Chaz");
        Person[] updatedPeople = addPerson(people, addition);

        for (Person person : updatedPeople){
            System.out.println("\t" + person.getName());
        }
    }
    public static Person[] addPerson(Person[] inputPeople, Person inputPerson){
        Person[] newPeeps = new Person[inputPeople.length + 1];

        for (int i=0; i< inputPeople.length; i++){
            newPeeps[i] = inputPeople[i];
        }

        newPeeps[newPeeps.length-1]= inputPerson;

        return newPeeps;
    }
}
