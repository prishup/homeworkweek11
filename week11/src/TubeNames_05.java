import java.util.ArrayList;

/*
5. Write a Java program to test an array list is empty or not. Define array list with
underground tube names
 */
public class TubeNames_05 {
    public static void main(String[] args) {
        ArrayList<String>tubeName = new ArrayList<>();
        tubeName.add("Piccadilly");
        tubeName.add("Bakerloo");
        tubeName.add("Baker Street");
        tubeName.add("Waterloo");
        tubeName.add("Oxford Circus");

        if(tubeName.isEmpty()){
            System.out.println("Empty List");
        }else{
            System.out.println("List is not Empty");
        }
        for(String name : tubeName){
            System.out.println(tubeName);
        }
    }
}
