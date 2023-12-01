import java.util.ArrayList;
import java.util.Iterator;

// Task - Java Collection, ArrayList Exercises: 
// Write a Java program to create an array list, add some colors (strings) and print out the collection.
// Write a Java program to iterate through all elements in an array list.

public class ColourCollection {

    ArrayList<String> arrayofColours = new ArrayList<String>();

    public ColourCollection() {

        arrayofColours.add("red");
        arrayofColours.add("Green");
        arrayofColours.add("Orange");
        arrayofColours.add("White");
        arrayofColours.add("Black");

        System.out.println("This array of colours contain:" + arrayofColours);



    Iterator<String> it =  arrayofColours.iterator();

    while(it.hasNext())
    {
        System.out.println(it.next());
    }
    }


}
