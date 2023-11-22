import java.util.ArrayList;

/* 3. Write a Java program to create a new array list, add some colours(string) and
printout the collection using for each loop. */
public class ArrayList_03 {
     public static void main(String[] args) {
         ArrayList<String> colourNames = new ArrayList<>();
         colourNames.add("Red");
         colourNames.add("Blue");
         colourNames.add("Pink");
         colourNames.add("Purple");
         colourNames.add("Yellow");
         colourNames.add("Green");
         colourNames.add("Black");

         //Print out of collection using a for each loop
         for(String allNames : colourNames){ //for each loop used to call string name colournames
             System.out.println(allNames);
         }
     }
}
