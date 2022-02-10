package learningCollections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Application {

    public static void main(String[] args) {
        // creating a generic collection that only accepts strings
        ArrayList<String> words = new ArrayList<>();
        words.add("hello");
        words.add("world");

        String item = words.get(0);
        System.out.println(item);

        // creating a generic collection that only accepts integers, but in this case it's a linked list
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(69);
        numbers.add(15);

        // for loop commented for reasons idk
        for (int number : numbers) System.out.println(number);


        // creating a generic collection of a HashSet
        LinkedHashSet<Integer> values = new LinkedHashSet<>();
        values.add(2);
        values.add(4);
        values.add(8);
        values.add(16);

        for (Integer value : values) {
            System.out.println(value);
        }

        // creating a hash map
        HashMap<String, String> dict = new HashMap<>();
        dict.put("Key Placeholder", "Value Placeholder");
        
    }
}
