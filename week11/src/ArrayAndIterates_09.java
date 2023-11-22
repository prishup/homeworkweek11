import java.util.ArrayList;

/*
9. Write program and add all group names in to array and iterates through for
each loop.
 */
public class ArrayAndIterates_09 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();//declared Arraylist
        names.add("Agile");//add groupname
        names.add("Code1");//add groupname
        names.add("Rest Assured");//add groupname
        names.add("Selenium");//add groupname

        for(String n:names){
            if(n.equalsIgnoreCase("Agile")){
                System.out.println(n);
            }
        }
    }
}
