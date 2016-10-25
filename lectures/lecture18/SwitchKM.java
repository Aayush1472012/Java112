import java.util.Scanner;
/**
 * 
 * Lecture 18 using switch 
 * Application that asks a user to enter a kilometers or meters
 * 
 * @pmcampbell
 * @version 2016-10-25
 * 
 **/
public class SwitchKM {
    public static void main(String[] args) {
            String input; // To hold keyboard input
            char choice; // To store the user's choice
            Scanner kb = new Scanner(System.in);

            // Ask the user to enter K or M
            System.out.print("Enter K or M ");
            input = kb.nextLine();
            choice = input.charAt(0); // Get the first char
            
            System.out.println("result of if-else-if");
            if (choice == 'K' || choice == 'k') {
                System.out.println("Kilometers");
            }
            else if (choice == 'm' || choice == 'M') {
                System.out.println("Meters");
            } else {
                System.out.println("That's not K nor M :(" );
            }

            // Determine which character the user entered.
            System.out.println("\nresult of switch");
            switch (choice) {
                case 'k':
                case 'K':
                    System.out.println("Kilometers");
                    break;
                case 'm':
                case 'M':
                    System.out.println("Meters");
                    break;
                default:
                    System.out.println("That's not K nor M :(" );
            }
        } // main
} //SwitchABC
