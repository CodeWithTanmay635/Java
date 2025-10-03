import java.util.ArrayList;
import java.util.Scanner;

public class PhoneNumberList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> phoneNumbers = new ArrayList<>();
        String input;

        System.out.println("--- Phone Number Entry ---");
        System.out.println("Enter phone numbers one by one. Type 'done' and press Enter to finish.");

        // Loop to continuously read phone numbers from the user
        while (true) {
            System.out.print("Enter phone number: ");
            input = scanner.nextLine();

            // Check for the exit command
            if (input.equalsIgnoreCase("done")) {
                break;
            }

            // Add the input to our ArrayList
            phoneNumbers.add(input);
        }

        System.out.println("\n--- Your Phone Number List ---");

        // Check if the list is empty before printing
        if (phoneNumbers.isEmpty()) {
            System.out.println("No phone numbers were entered.");
        } else {
            // Print out all the entered phone numbers
            for (String number : phoneNumbers) {
                System.out.println(number);
            }
        }

        scanner.close();
    }
}
