package calculator;

import java.util.Scanner;

public class Main extends Calcualtor{ // inheritance used to extend class
    public static void main(String[] args) { //Main method
        Scanner scanner = new Scanner(System.in); //Scanner
        System.out.println("Enter First number : ");
        int number = scanner.nextInt();
        System.out.println("Enter second number : ");
        int number1 = scanner.nextInt();
        System.out.println("Enter symbol");
        char symbol = scanner.next().charAt(0);

        Main obj = new Main();
        obj.calcualtorResult(number,number1,symbol);
        System.out.println("would you like to do more calculation?");

        char choice = scanner.next().charAt(0);
        while(choice == 'Y'){
            System.out.println("Enter First Number");
            int num = scanner.nextInt();
            System.out.println("Enter second number : ");
            int num1 = scanner.nextInt();
            System.out.println("Enter symbol");
            symbol = scanner.next().charAt(0);

            obj.calcualtorResult(num,num1, symbol);
            System.out.println("would you like to do more calculation?");
            symbol = scanner.next().charAt(0);
        }
        System.out.println("Programme Terminate");
        System.exit(0);
    }
}
