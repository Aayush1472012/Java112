/**
 * Metric Logic class  
 * completely static, like the Math class 
 * 
 * @author pmcampbell
 * @version today
*/

public class Metric {
   /*
   * attributes, what the class knows
   * what makes one instance of this class
   * different from another
   */
   public static final double KG2LBS = 2.2;
   public static final double LBS2KG = 0.454;
   private static int useCount;
   

   /**
      no constructors everything is used statically
    */

   /**
      getlbs2kilos() 
      converts lbs to kg
      @param lbs
      @returns kilos
   */

   public static double getlbs2kilos(double lbs)  {
      return lbs * LBS2KG;    // this is implied
   }

   /**
      getlbs2kilos() 
      converts kg to lbs
      @param kilos
      @returns lbs
   */

   public static double getkilos2lbs(double kilos)  {
      return kilos * KG2LBS;    // this is implied
      // return kilos * 2.2;        // also valid
   }

}  // Metric