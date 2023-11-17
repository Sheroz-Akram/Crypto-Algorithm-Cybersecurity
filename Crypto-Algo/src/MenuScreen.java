import java.util.Scanner;

public class MenuScreen {

    // Display a List of Algorithm
    private void displayAlgorithmList() {
        // Display the List
        System.out.println("Select Alogorithm from the following list.");
        System.out.println("1. Caesar Cipher ");
        System.out.println("0. Exit");
        System.out.print("Select Option: ");
    }

    // Display a Menu Showing a List of Algorithms availible
    public int displayAlgorithmSelection(Scanner input) {

        // Store Input Option
        int option = 0;

        // Display List
        displayAlgorithmList();

        // Get input until not correct input given
        while (true) {

            try {
                // get the input value
                option = input.nextInt();
            } catch (Exception e) {
                continue;
            }

            // Consume the newline character
            input.nextLine();

            // Break Loop if correct input given
            if (option > -1 && option < 2) {
                break;
            }
            System.out.println("Please select correct input from list.\n");
            displayAlgorithmList();
        }

        // Selected option returned
        return option;
    }

    // Get Input Plain Text from the User
    public String getPlainText(Scanner input) {
        // Varible to Store Plain text
        String plainText;

        // Display message
        System.out.print("Enter Plain Text Here: ");

        // get input
        plainText = input.nextLine();

        // return plain text
        return plainText;
    }

}
