import java.util.Scanner;  // Needed for JOptionPane class

/**
   This program demonstrates the logical && operator.
   @author  PMCampbell
   @version 1
*/

public class LogicalAnd
{
   public static void main(String[] args)
   {
      double salary;       // Annual salary
       int yearsOnJob;   // Years at current job
      String input;        // To hold string input
	  Scanner kb = new Scanner(System.in);
	  
      // Get the user's annual salary.
      System.out.print("Enter your anual salary");
	  salary = kb.nextDouble();

      // Get the number of years at the current job.
      System.out.print("Enter the number of " +
                                    "years at your current job.");
      yearsOnJob = kb.nextInt();

      // Determine whether the user qualifies for the loan.
      if (salary >= 30000 && yearsOnJob >= 2)
      {
            System.out.println("You qualify " +
                                               "for the loan.");
      }
      else
      {
            System.out.println("You do not " +
                                      "qualify for the loan.");
      }
      

   }
}
