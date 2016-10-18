import java.util.Scanner;
/**
 * this application is from Lecture 15 
 * it uses methods & JOptionPane instead of scanner
 * 
 * @author pcampbell
 * @version 1
 **/ 
public class Sum {
  public static void main (String[] args) {
    double num2=5, num1=10;
    double result;
    
    result = showSum(num2, num1);
    
    System.out.println("The sum of num1 " + num1
                         +" and num2 "+ num2 +
                       " is " + result);
  
    num2 = acceptInt("Enter 1st number ");
    num1 = acceptInt("Enter 2nd number ");
    
    result = showSum(num2, num1);
    
    System.out.println("The sum of num1 " + num1
                         +" and num2 "+ num2 +
                       " is " + result);
  } // main()
  
  public static double showSum(double num1, double num2) {
    double sum;
    
    sum = num1 +num2;
    
    return sum;
    } // min(int,int)
  
  public static int acceptInt(String msg) {
      Scanner kb = new Scanner(System.in);
      int value;
      
      System.out.print(msg);
      value = kb.nextInt();
      
      return value;
    } // acceptInt(String)     
} // UseMin
