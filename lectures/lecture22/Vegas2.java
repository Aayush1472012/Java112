/**
 * 
 * Sample for in class
 * 
 * @pmcampbell
 * @version 2016-11
 * 
 **/
public class Vegas2 {
  public static void main(String[] args) {
    int count=1;
    // test toss with stubs for dice
    
    System.out.println("test for dice");
    
    System.out.println("toss "+ rollDice());
    
    System.out.println("test for coin flip");
    if (coinFlipHead()) {
      System.out.println("heads");
    }
    else  {
      System.out.println("tails");
    }
    // how many tosses until I get heads
    while ( coinFlipHead() ) {   
      count++;
    }
    System.out.println(count + "tosses to get heads");
    // how many tosses until I get tails
    while ( !coinFlipHead() ) {   
      count++;
    }
    System.out.println(count + " tosses to get tails");
  }  // main()
  /**
   return true if coin flip is head
   return false if coin flip is tail
   (design decision 1 == head 2 == tail)
   @return boolean   true == heads, false == tails
   **/
  public static boolean coinFlipHead() {
    final int HEAD = 1;
    final int TAIL = 2;
    if (toss(1,2) == HEAD) {
      return true;
    } else {
      return false;
    }
  } //coinFlipHead()
  /**
   * wrapper for toss, implements dice roll number between 1-6
   *  @return int number rolled
   */
  public static int rollDice() {
    return toss(1,6);
  } // rollDice()
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

