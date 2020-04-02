import java.util.ArrayList;
import java.util.HashMap;

public class Collections {
    public static void main(String[] args) {

        // *************************************************** //
        // ********* ArrayList and its Methods *************** //
        // *************************************************** //

        // 1. Initialize an ArrayList of Strings, called roasts
        //   add light, medium, medium, dark to the array list, one at a time

        ArrayList<String> roasts = new ArrayList<>();
        roasts.add("light");
        roasts.add("medium");
        roasts.add("medium");
        roasts.add("dark");

//        System.out.println(roasts);

        // 2. Check to see if the list contains "dark" , and then "espresso"

        boolean result;
        result = roasts.contains("dark");
//        System.out.println();

        // 3. Find the last index of "medium" in the array
        int index = roasts.lastIndexOf("medium");
//        System.out.println(index);
        // 4. Check if the array list is empty
        result = roasts.isEmpty();
//        System.out.println(result);



//      5. Assign the array list an empty ArrayList object, and then check if empty

        ArrayList<String> emptyList = new ArrayList<>();
        result = emptyList.isEmpty();
//        System.out.println(result);


        roasts.add("espresso");
//        System.out.println(roasts);

        // 6. Remove the espresso roast

        roasts.remove("espresso");
//        System.out.println(roasts);

        roasts.add("espresso");
//        System.out.println(roasts);

        roasts.remove(4);
//        System.out.println(roasts);


        // 7. Remove the element at index 2

        roasts.remove(2);
//        System.out.println(roasts);

        // *************************************************** //
        // ********* Hash Maps and their Methods ************* //
        // *************************************************** //

        // 1. Create a HashMap called usernames that contains:
        //   a. first name
        //   b. Github username
        HashMap<String, String> usernames = new HashMap<>();

        usernames.put("Casey", "fridaynext");
        usernames.put("Viney", "cringeworthy");
        usernames.put("Tobias", "funke");

        System.out.println(usernames);


        // 2. re-initialize the HashMap using the .clear() method
        // 3. use the .put() method to add "Casey" -> "fridaynext" back to the map
        // 4. use the .putIfAbsent() method to add
        //   a. "Vivian" -> "viviancan"
        //   b. "Casey" -> "XpenguinX"
        usernames.putIfAbsent("Chobbo", "mcblarneysnuffle");
        usernames.putIfAbsent("Casey", "xfridaynextxx");
        System.out.println(usernames);


        // 5. What happend with the .putIfAbsent()? Did both items get added? Why/why not?
        // 6. Use the .remove() method to remove "Casey"
        usernames.remove("Chobbo");
        System.out.println(usernames);

        // 7. Use the .replace() method to change Vivian's username to "viviancandev"

        usernames.replace("Tobias", "McFlurry");
        System.out.println(usernames);


        // 8. Use the .clear() method to clear the map

        usernames.clear();
        System.out.println(usernames);



        // 9. Use the .isEmpty() method to verify that it was cleared

        System.out.println(usernames.isEmpty());

    }
}
