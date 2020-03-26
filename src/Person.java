public class Person {
    private String name;

    Person(String n){
        this.name = n;
    }
    // returns the person's name
    public String getName(){
        return name;
    }
    // changes the name property to the passed value
    public void setName(String guyIs) {
        this.name = guyIs;
    }
    // prints a message to the console using the person's name
    public void sayHello() {
        System.out.println("Hello " + name);
    }
class PersonTest{
        //tests the Person class
        public void main(String[] args){
            Person person1 = new Person("John");
            Person person2 = person1;
            System.out.println(person1 == person2);

        }
}
}
