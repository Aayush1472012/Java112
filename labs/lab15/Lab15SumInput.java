import java.util.Scanner;
/**
 * lab15 methods/while solution
 * write a method that reads in numbers 
 * until a negative number is input, then 
 * display the sum.
 * 
 * @pmcampbell
 * @version 2016-10-25
 * 
 **/

public class Lab15SumInput
{
  public static void main(String[] args)
  {
    int countNums=0;
    int sumNums=0;

    System.out.printf("Sum Of Numbers", sumNumbers()); 
  } //
  
  /**
   * read in and sum numbers until sentinal of -1 is entered
   * 
   * @return int sum of numbers read in
   * 
   * @author pcampbell
   * @version today
   * */
  public static int sumNumbers()
  {
    final int SENTINAL = -1;
    int num1, countNums=0, sumNums =0;
    
    Scanner kb = new Scanner(System.in);  
    
    System.out.println("Enter a number:"); 
    num1 = kb.nextInt();
    
    while (num1 != SENTINAL) {
      countNums++;
      sumNums += num1;
      num1 = kb.nextInt();
    }
    
    System.out.printf("Summed %d numbers", countNums);
    
    return sumNums;
  }  //sumNumbers()

}  // Lab15SumInput 
