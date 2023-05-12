import java.sql.SQLOutput;
import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        int inputUser = 0;

        do {
            System.out.println("Select an option: ");
            System.out.println("1. Movies");
            System.out.println("2. Series");
            System.out.println("3. Exit");

            Scanner scanner = new Scanner(System.in);
            inputUser = Integer.parseInt(scanner.nextLine());

            switch (inputUser) {
                case 1:
                    System.out.println("Movies");
                    break;
                case 2:
                    System.out.println("Series");
                    break;
                default:
                    System.out.println("Thank you");
                    break;
            }

        } while(inputUser != 3 && inputUser != 0);
        System.out.println("The program had finished");
    }
}