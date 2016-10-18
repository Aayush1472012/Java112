public class PassByValue
{
   public static void main(String[] args)
   {
      int number = 99; // number starts with 99
      System.out.println("number is " + number); 
   
      changeMe(number); // Call changeMe
      
      // Display the value in number again.
      System.out.println("number is " + number); 
   }

   public static void changeMe(int myValue)
   {
      System.out.println("I am changing the value.");
      myValue = 0; // Change the myValue parameter variable 
      // Display myValue.
      System.out.println("Now the value is " + myValue); 
   }
}
