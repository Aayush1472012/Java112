/**
 * 
 * Sample for in class
 * 
 * @pmcampbell
 * @version 2016-11
 * 
 **/
public class Vegas {
  public static void main(String[] args) {
    // test toss with stubs for dice and coin flip
    System.out.println("test for dice");
    System.out.println("toss "+ toss(1,6));
    System.out.println("toss "+ toss(1,6));
    System.out.println("toss "+ toss(1,6));
    System.out.println("toss "+ toss(1,6));
    System.out.println("toss "+ toss(1,6));
    System.out.println("toss "+ toss(1,6));
    System.exit(0);
    System.out.println("test for coin flip");
    
    System.out.println("toss "+ toss(1,2));
    System.out.println("toss "+ toss(1,2));
    System.out.println("toss "+ toss(1,2));
    
  }  // main()
  /**
   generate random number
   @param int min    minimum of range for random 
   @param int max    maximum of range for random 
   @return int  the random number
   **/ 
  public static int toss(int min, int max) {
    int scalingFactor, randomNumber;
    scalingFactor = max - min +1;
    randomNumber = (int)(Math.random() * scalingFactor) + min;
    return randomNumber; 
    
  } // toss
  
  
} // Vegas

