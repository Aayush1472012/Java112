import java.util.Scanner;
/**
 * lab15 methods/while solution
 * write a method that takes a number
 * then returns the factorial for that number
 * 
 * @pmcampbell
 * @version 2016-10-25
 * 
 **/

public class Lab15Factorial
{
  public static void main(String[] args)
  {
    int num1,factorial;
    Scanner kb = new Scanner(System.in);  
    
    System.out.println("Enter a number:"); 
    num1 = kb.nextInt();
    
    factorial = factorialOf(num1);
    
    System.out.printf("%d! is %d\n", num1, factorial); 
  } // main()
  
  /**
   * calculate factorial of the parameter
   * 
   * @param int number to n!
   * @return int factorial of n
   * @author pcampbell
   * @version today
   * */
  public static int factorialOf(int num)
  {
    int factorial = num;
    
    while (num > 1) {
      num--;
      factorial = factorial * num;
    }
    return factorial;
  }  //factorialOf(int)
  
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
