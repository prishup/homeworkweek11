import java.util.HashMap;

/*
7. Create a HashMap object called people that will store String keys and Integer
values: And use for each loop to iterate the value from Map.
 */
public class HasMap_07 {
    public static void main(String[] args) {
        HashMap<String, Integer> people = new HashMap<>();
        people.put( "Kinjal" , 1);
        people.put( "Shikha" , 2);
        people.put( "Khushbu" , 3);
        people.put( "Ripti" , 4);
        people.put( "Avani" , 5);

        //for each loop created
        for (String a : people.keySet()) {
            System.out.println(a);
        }
    }
}


