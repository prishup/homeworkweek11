import java.util.ArrayList;
import java.util.Iterator;

/*
4. Write a Java program to iterate through all elements in an array list using
Iterator.
 */
public class ArrayList_Iterator_04 {// main class

    public static void main(String[] args) { //main method
        ArrayList<String>colourNames = new ArrayList<>();
        colourNames.add("Red");
        colourNames.add("Blue");
        colourNames.add("Pink");
        colourNames.add("Purple");
        colourNames.add("Yellow");
        colourNames.add("Green");
        colourNames.add("Black");

        //Get the iterator
        Iterator<String>its = colourNames.iterator();
        while (its.hasNext()){ //Print all names with while loop
        System.out.println(its.next()); //Print the first item
    }
}
}

