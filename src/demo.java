public class demo {
    // version 1
    public static void sayHello(int times) {
        for (int i = 0; i < times; i += 1) {
            sayHello();
        }

    }
//    public static void changeHorse(Horse h){
//        h.breed = "QuarterHorse";
//    }

    // version 2
    public static void sayHello() {
        sayHello("Hello", "World");
    }

    // version 3
    public static void sayHello(String name) {
        sayHello("Hello", name);
    }

    // version 4
    public static void sayHello(String greeting, String name) {
        System.out.println(greeting + " " + name + "!");
    }

    // CODE ALONG SECTION
    // TODO: create a main function
    public static void main(String[] args) {


        // TODO: Call version 1 so that it prints "Hello World!" three times.
        sayHello(3);

        // TODO: Call version 2.
        System.out.println("------V3-------");
        sayHello(4);

        // TODO: Call version 3 so that is says "Hello" on one line and "Goodbye!" on the second line.

        sayHello("Hello\n", "Goodbye!");

        // TODO: Call version 4 so that is says, "Salutations my friend!"

        System.out.println("------V4-------");

        sayHello("Salutations my", "friend!");

//        Horse horse = new Horse("Thoroughbred");
//        changeString(changeHorse);

    }
}

