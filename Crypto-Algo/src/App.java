import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Scanner to Store Input
        Scanner input = new Scanner(System.in);

        // Menu for the User
        MenuScreen menu = new MenuScreen();

        // Main Loop for our Program
        int option = menu.displayAlgorithmSelection(input);
        while(option != 0){
            
        }
    
        
    }
}
