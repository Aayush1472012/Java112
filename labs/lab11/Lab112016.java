import java.util.Scanner;
/*
 * lab11 methods solution
 * read in 4 salaries
 * calculate the pension 
 * display the lowest and  highest salaries
 * display the pension
 * 
 * @pmcampbell
 * @version 2016-10-04
 * 
 **/

public class Lab112016
{
  public static void main(String[] args)
  {
    double salary1, salary2, salary3, salary4, pension, best3, highest, lowest;
    Scanner kb = new Scanner(System.in);  
    
    System.out.println("Input salary 1"); 
    salary1 = kb.nextInt();
    System.out.println("Input salary 2"); 
    salary2 = kb.nextInt();
    System.out.println("Input salary 3"); 
    salary3 = kb.nextInt();
    System.out.println("Input salary 4"); 
    salary4 = kb.nextInt();
    
    lowest = determineLowest(salary1, salary2, salary3, salary4);
    
    best3 = salary1 + salary2 + salary3 + salary4 - lowest;
    
    pension = calculatePension(best3);
    
    highest = determineHighest(salary1, salary2, salary3, salary4);
    
    
    System.out.printf("Lowest Salary: $%.2f\n", lowest); 
    System.out.printf("Highest Salary: $%.2f\n", highest); 
    System.out.printf("Pension: $%.2f\n", pension); 
  }
  /**
   * calculate pension given the sum of the best 3 salaries
   * @param double sum of best 3 salaries
   * @return double pension
   * @author pcampbell
   * @version today
   * */
  public static double calculatePension(double best3)
  {
    final double PENSION_FACTOR = 0.70;
    double average, pension;
    average = best3/3;
    pension = average * PENSION_FACTOR;
    return pension;
  }
  /**
   * return the smallest of 4 numbers
   * @param double 4 numbers
   * @return double smallest number
   * @author pcampbell
   * @version today
   * */
  public static double determineLowest(double num1, double num2, double num3, double num4)
  {
    double small;
    small = num1;
    if (num2 <= num1) {
      small = num2;
    }
    if (small >= num3) {
      small = num3;
    } 
    if (small >= num4) {
      small = num4;
    }
    return small;
  }  // determineLowest()
/**
   * return the largest of 4 numbers
   * @param double 4 numbers
   * @return double largest number
   * @author pcampbell
   * @version today
   * */
  public static double determineHighest(double num1, double num2, double num3, double num4)
  {
    double large;
    large = num1;
    if (num2 >= num1) {
      large = num2;
    }
    if (large <= num3) {
      large = num3;
    } 
    if (large <= num4) {
      large = num4;
    }
    return large;
  }
} 
