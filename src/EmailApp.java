import java.util.Scanner;

public class EmailApp {

    public static void main(String[] args) {
        // Take input for first name
        System.out.print("Enter first name: ");
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();

        // Take input for last name
        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();

        // Create an instance of the Email class with the provided names
        Email em1 = new Email(firstName, lastName);
        
        // Display information
        System.out.println(em1.showInfo());
    }
}
