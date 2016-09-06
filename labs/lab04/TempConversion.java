//package dawson112.labexercises;
import java.util.Scanner;
/*
* Ask the user for a temperature in celcius
* convert the temperature into kelvin
* display both the celcius and kelvin results
*/

public class TempConversion
{
 public static void main (String[] args)
 {
 //variable declarations
 int celcius;
 double kelvin;
 
 Scanner reader = new Scanner(System.in);
 
 //Accept the required data
 System.out.print("Enter a temperature in Celcius:");
 celcius = reader.nextInt();

 // celcius temperature plus 273.15 is the temperature in kelvin
 kelvin = celcius + 273.15;
 
 System.out.println("Celcius:" + celcius);
 System.out.println("Kelvin:" + kelvin);
  } //end main method
}




