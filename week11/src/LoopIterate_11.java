import java.util.ArrayList;

/*
11. Declare global variables of your name, Add all your group names in list, using
for each loop iterate and print ONLY your name.
 */
public class LoopIterate_11 {
    static String name = "Kinjal";
    public static void main(String[] args) {
        ArrayList<String>names = new ArrayList<>(); // declare arraylist

        names.add(name);
        names.add("Ripti");
        names.add("Shikha");
        names.add("Nayan");
        names.add("Avani");
        names.add("Khushbu");

       for (String myName : names){
           if(myName.equalsIgnoreCase("Kinjal")){
               System.out.println("My Name - " +myName);
           }
       }
    }
}
