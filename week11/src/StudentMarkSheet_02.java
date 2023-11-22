import java.util.Scanner;

/*
    2. Re write the student mark sheet program using if else and while loop.
 */
public class StudentMarkSheet_02 { //
    public static void main(String[] args) { //main method

        Scanner scanner = new Scanner(System.in); //scanner create
        System.out.println("Enter Student name");
        String name = scanner.next();  //print in next line

        System.out.println("Enter English marks");
        int englishMarks = scanner.nextInt(); //print in next line

        System.out.println("Enter Maths marks");
        int mathsmarks = scanner.nextInt(); //print in next line

        System.out.println("Enter Science marks");
        int sciencemarks = scanner.nextInt(); //print in next line

        // Check if marks are valid
        while (englishMarks < 0 || englishMarks > 100 || mathsmarks < 0 || mathsmarks > 100 || sciencemarks < 0 ||
                sciencemarks > 100) {
            System.out.println("Invalid input. Marks should be between 0 and 100. Please enter again.");

            System.out.println("Enter English marks");
            englishMarks = scanner.nextInt();

            System.out.println("Enter Maths marks");
            mathsmarks = scanner.nextInt();

            System.out.println("Enter Science marks");
            sciencemarks = scanner.nextInt();
        }

        double Total = englishMarks + mathsmarks + sciencemarks;
        System.out.println("Total : " + Total);

        double Average = Total / 3;
        System.out.println("Average : " + Average);

        char Grade;

        if (Average >= 90) {
            Grade = 'A';
        } else if (Average >= 80 && Average < 90) {
            Grade = 'B';
        } else if (Average >= 70 && Average < 80) {
                Grade = 'C';
        } else if (Average >= 55 && Average < 70) {
                Grade = 'D';
        } else if (Average >= 35 && Average < 55) {
                Grade = 'E';
        } else {
                Grade = 'F';

            System.out.println("Grade: " + Grade);
        }
    }
}
