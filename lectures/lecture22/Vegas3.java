import java.util.Scanner;
/**
 * 
 * Sample for in class
 * 
 * @pmcampbell
 * @version 2016-11
 * 
 **/
public class Vegas3 {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    int testCount;
    // test toss with stubs for dice & coin flip
    System.out.println("How many times do you want to test the dice roll?");
    testCount = kb.nextInt();
    
    System.out.println("test for dice");
    while (testCount > 0) {
      System.out.println("toss "+ rollDice());
      testCount--;
    }
    
    System.out.println("How many times do you want to test the coin toss?");
    testCount = kb.nextInt();
    
    System.out.println("test for coin toss");
    while (testCount > 0) {
      testCount--;
      System.out.println("toss "+ rollDice());
    }
    System.out.println("test for coin flip");
    if (coinFlipHead()) {
      System.out.println("heads");
    }
    else  {
      System.out.println("tails");
    }
    
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
   generate random number
   @param int min    minimum of range for random 
   @param int max    maximum of range for random 
   @return int  the random number
   **/ 
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

