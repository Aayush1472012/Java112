import javax.swing.JOptionPane;
/**
 * this application is from Lecture 15 
 * it uses methods & JOptionPane instead of scanner
 * 
 * @author pcampbell
 * @version 1
 **/ 
public class UseMin {
  public static void main (String[] args) {
    int result, x,y;   // not good var names
    
    x = acceptInt("Enter first int");
    
    y = acceptInt("Enter second int");
    
    result = min(x,y);
      
      System.out.print("The min of x " +x 
                         +" and y "+ y +
                       " is " + result);
  } // main()
  public static int min(int a, int b) {
    int small;
    if (a > b) {
      small = b;
    }  else {
        small = a;
      }
      return small;
    } // min(int,int)
    public static int acceptInt(String msg) {
      int value;
      String input;
      
      input = JOptionPane.showInputDialog(msg);
      value = Integer.parseInt(input);
      return value;
    } // acceptInt(String)     
} // UseMin
