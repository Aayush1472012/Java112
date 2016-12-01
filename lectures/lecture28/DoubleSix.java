public class DoubleSix
{
//  Creates two Dice objects and rolls them both until double sixes 
   public static void main (String[] args)
   {
      int count = 0;
      int num1, num2;
      boolean doubleSix = false;

      Dice dice1 = new Die();
      Dice dice2 = new Die();

      while(!doubleSix)
      {
         num1 = die1.roll();
         num2 = die2.roll();
         count++;

         if (num1 == 6 && num2 == 6)    // check for sixes
	 doubleSix = true;
      }

      System.out.println ("Number of rolls: " + count);
   }
}
