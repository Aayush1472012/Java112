/**
 * Dice 
 * models a six sided dice
 * roll will return the random value of the dice
 * 
 * @author pmcampbell
 **/

public class Dice
{
   private int value;  // current value showing on the die
  // Parameterless Constructor: Sets the initial face value of this die.
  public Die()
   {
      value = 1;
   }
  // One parameter constructor.
  public Die(int value)
   {
     this.value = value;
   }
  //Accessor
  public int getValue()
   {
      return value;
   }
  //  roll computes a new face value for this die and returns the result.
   public int roll()
   {
      value = (int)(Math.random() * 6) + 1;
      return value;
   }
}
