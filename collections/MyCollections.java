package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyCollections {
	public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Orange");
        myList.add("Grapes");

        Collections.sort(myList);
        System.out.println("Sorted List: " + myList);

        Collections.reverse(myList);
        System.out.println("Reversed List: " + myList);

        Collections.shuffle(myList);
        System.out.println("Shuffled List: " + myList);

        int index = Collections.binarySearch(myList, "Orange");
        System.out.println("Index of 'Orange': " + index);

        String maxElement = Collections.max(myList);
        String minElement = Collections.min(myList);
        System.out.println("Max Element: " + maxElement);
        System.out.println("Min Element: " + minElement);
    }
}
