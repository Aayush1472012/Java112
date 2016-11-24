import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 * This program is an application class,
 * It is used to test/drive the Metric static logic class
 * it uses JoptionPane & Double.parseDouble()
 * @author pmcampbell
 * @version today
*/
public class MetricDemo
{
   public static void main(String[] args)
   {
          double kilos, pounds;
          boolean usingCloud9 = false;
          
          if (args.length >= 1 && args[0].equalsIgnoreCase("c9")) {
              usingCloud9 = true;
          }
          
          // ask the user for pounds then convert to kg
          kilos = acceptDub("Enter Kilograms: ", usingCloud9);  
          // since methods are static no new keyword used
          pounds = Metric.getkilos2lbs(kilos);
          System.out.println("Kilos :\t "+kilos +
                        " in Pounds:\t " + pounds);
                        
          // ask the user for kilos then convert to lbs
          pounds = acceptDub("Enter Pounds: ", usingCloud9);  
          // since methods are static no new keyword used
          kilos = Metric.getlbs2kilos(pounds);
          System.out.println("Kilos :\t "+kilos +
                         " in Pounds:\t " + pounds);
                        
          // since the fields are static no new keyword used             
          System.out.println("Brought to you by\n Kilos to Pounds @ " 
                        +Metric.KG2LBS +
                        "\n and \n Pounds to Kilos @ "+
                        +Metric.LBS2KG);
                        
          System.out.println("Bye! ");
   }//main()
   
   public static double acceptDub(String msg, boolean usingCloud9) {
       double numOut = 0;
       if (!usingCloud9) {
           String numIn =  JOptionPane.showInputDialog(msg);
           numOut = Double.parseDouble(numIn);
       } else {
          System.out.print(msg);
          Scanner kb = new Scanner(System.in);
          numOut = kb.nextDouble();
       }
       return numOut;
   } //acceptDub
} // Metric RectangleDemo