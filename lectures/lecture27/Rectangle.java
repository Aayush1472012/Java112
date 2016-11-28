/**
 * Metric Logic class  
 * partly static, like the Math class 
 * 
 * @author pmcampbell
 * @version today
*/

public class Rectangle { 
  private static int rectCount = 0;
  private double length;
  private double width;
  /* 
  * The constructor increments the static field rectCount 
  * This keeps track of the number of instances of this class that are created
  */
  public Rectangle() {
      // incremented with each new instance
      rectCount++;
      }
  /*
  * the getRectCount method returns the number of instances of this class
  * that have been created
  * @return int value in rectCount field
  */
  public static int getRectCount() {
      return rectCount;
      }
 } // Rectangle
