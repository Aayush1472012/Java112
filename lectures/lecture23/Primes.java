/**
 * Class to test isPrime() and primeRange() methods 
 * 420-112-DW
 * methods, isX type methods
 * nested while loops
 * @author PMC
 * @version 2015-2016
 */
public class Primes
{
  
  public static void main (String[] args)
  {
    primeRange (10, 100, 5);
    primeRange (11, 25, 10);            
  } // main()
  /**
   * Given a range of numbers for each one display if it is prime
   * uses isPrime(int) 
   * also prints a maximum number per line
   *
   * @author PMC
   * @param low start of range to be tested
   * @param high end of range to be tested
   * @param maxPerLine   limit of prime numbers displayed per line
   **/
  public static void primeRange( int low, int high, int maxPerLine) {
    int number = low;        // initialize major loop counter
    int perLine;
    System.out.println("\nPrime numbers between " +low+ " and "+ high);
    while ( number < high ) {       // major loop  
      perLine = 0;      // initialize minor loop counter
      // try removing the number < high & see if it tells you why it's here
      while (perLine < maxPerLine && number < high ) {   // minor loop
        if (isPrime(number)) { 
          System.out.print(number+ "\t");
          perLine++;      // increment minor loop counter
        }
        number++;         // increment major loop counter
      }           // end minor while loop
      System.out.println();
    }            // end major while loop
  }  // primeRange()
  
  /**
   * determine whether the input number is prime
   * https://en.wikipedia.org/wiki/Prime_number
   * "A prime number (or a prime) is a natural number greater than 1 that has no positive 
   * divisors other  than 1 and itself. A natural number greater than 1 that is not a 
   * prime number is called a composite number."
   *
   * @author PMC
   * @param number integer to be tested
   * @return true if the number is a prime number
   * @return false if the number is a composite number
   **/
  public static boolean isPrime(int number) {
    int i = 2;
    if (number <= 2)
      return false;
    while (i < number - 1) {
      // A zero remainder means that
      // it is divisible by that number, so it's not a prime 
      if (number % i++ == 0) 
        return false;
    }
    return true;
  } // isPrime();
} // Primes
