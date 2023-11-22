import java.util.ArrayList;
import java.util.Scanner;

/*
Write the program that tell you which line pass through particular stations.
Just use Zone 1 stations name. (Challenge)
 */
public class Quetion_08 {
    public static void main(String[] args) {
        ArrayList<String> station = new ArrayList<>(); //create Arraylist object
        station.add("Holborn"); //add station name of Zone 1
        station.add("Bank"); //add station name of Zone 1
        station.add("Temple"); //add station name of Zone 1
        station.add("Paddington"); //add station name of Zone 1
        station.add("Westminister"); //add station name of Zone 1

        Scanner scanner = new Scanner(System.in);//new scanner created
        System.out.println("Zone 1 station names are : " + station);
        System.out.println("-------------------------------------");
        System.out.println("Enter any zone 1 station name");
        String name = scanner.next();


        for (String a : station) {
            if (a.equalsIgnoreCase("Holborn")) {
                System.out.println("Lines Pass through Holborn : Picaadily Line,Central Line");
            }
            if (a.equalsIgnoreCase("Bank")) {
                System.out.println("Lines Pass through Holborn :Northen Line , District Line and Central Line ");
            }
            if (a.equalsIgnoreCase("Temple")) {
                System.out.println("Lines Pass through Holborn : Circle Line , District Line");
            }
            if (a.equalsIgnoreCase("Paddington")) {
                System.out.println("Lines Pass through Holborn : Circle line,District line,Elizabeth line," +
                        "Hammersmith and city,Bakerloo line");
            }
            if (a.equalsIgnoreCase("Westminister")) {
                System.out.println("Lines Pass through Westminister : Jubilee Line , Northen Line , Bakerloo Line, " +
                        "");
            } else {
                System.out.println("Invalid data");
            }
        }
    }
}
