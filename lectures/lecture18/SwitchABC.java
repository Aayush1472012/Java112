import java.util.Scanner;
/**
 * 
 * Lecture 18 using switch 
 * Application that asks a user to enter a letter grade
 * Tell them what mark applies
 * 
 * @pmcampbell
 * @version 2016-10-25
 * 
 **/
public class SwitchABC {
    public static void main(String[] args) {
            String input; // To hold keyboard input
            char choice; // To store the user's choice
            Scanner kb = new Scanner(System.in);

            // Ask the user to enter A, B, or C.
            System.out.print("Enter A, B, or C: ");
            input = kb.nextLine();
            choice = input.charAt(0); // Get the first char
            
            System.out.println("result of if-else-if");
            if (choice == 'A') {
                System.out.println("You entered A. >80%");
            }
            else if (choice == 'B') {
                System.out.println("You entered B. 70-80% ");
            }
            else if (choice == 'C') {
                System.out.println("You entered C. 60-69%");
            }
            else {
                System.out.println("That's not A, B, or C");
            }

            // Determine which character the user entered.
            // what's wrong with this??
            System.out.println("\nresult of first switch");
            switch (choice) {
                case 'A':
                    System.out.println("You entered A. >80%");
                case 'B':
                    System.out.println("You entered B. 70-80% ");
                case 'C':
                    System.out.println("You entered C. 60-69%");
                default:
                    System.out.println("That's not A, B, or C");
            }
            // Determine which character the user entered.
            // better but what's wrong with this??
            System.out.println("\nresult of second switch");
            switch (choice) {
                case 'A':
                    System.out.println("You entered A. >80%");
                    break;
                case 'B':
                    System.out.println("You entered B. 70-80% ");
                    break;
                case 'C':
                case 'c':
                    System.out.println("You entered C. 60-69%");
                    break;
                default:
                    System.out.println("That's not A, B, or C");
            }
            // Determine which character the user entered.
            // just right! 
            System.out.println("\nresult of third switch");
            switch (choice) {
                case 'A':
                case 'a':
                    System.out.println("You entered A. >80%");
                    break;
                case 'B':
                case 'b':
                    System.out.println("You entered B. 70-80% ");
                    break;
                case 'C':
                case 'c':
                    System.out.println("You entered C. 60-69%");
                    break;
                default:
                    System.out.println("That's not A, B, or C");
            }
        } // main
} //SwitchABC
