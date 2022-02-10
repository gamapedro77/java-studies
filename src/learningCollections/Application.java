package learningCollections;

import java.util.ArrayList;
import java.util.LinkedList;

public class Application {

    public static void main(String[] args) {
        // creating a generic collection that only accepts strings
        ArrayList<String> words = new ArrayList<String>();
        words.add("hello");
        words.add("world");

        String item = words.get(0);

        // creating a generic collection that only accepts integers, but in this case it's a linked list
        LinkedList<Integer> numbers = new LinkedList<Integer>();
        numbers.add(69);
        numbers.add(15);

        for(int number : numbers) {
            System.out.println(number);
        }
    }
}
