/**
 * This application class implements the rounding algorithm
 * 
 * @author PMCampbell
 * @version 1
 * */
public class RoundMethods {
    public static void main (String[] args) {
     final double NUM = 77.56789;
     double d = NUM;
     double dround;
     long   l;
    
     // cast
     l = (long) d;
     System.out.println(" d " +d + " cast "+l);
    
     // round 
     l = Math.round(d);
     System.out.println(" d " +d + " rounded with Math.round() "+l);
    
     // note number of zeros == decimal places
     // round 2 decimal places
     System.out.println(" Magic for 2 decimal places");
     dround = roundThis(d,2);
     System.out.println(" d " +d + " rounded "+dround);
    
     d = NUM;
     // round 3 decimal places
     System.out.println(" Magic for 3 decimal places");
     dround = roundThis(d,3);
     System.out.println(" d " +d + " rounded "+dround);
    
     d = NUM;
     // round 4 decimal places
     System.out.println(" Magic for 4 decimal places");
     dround = roundThis(d,4);
     System.out.println(" d " +d + " rounded "+dround);
    
    } // main()
    /**
     * this method rounds a double to the 
     * number of digits given
     * ex: roundThis(1.456, 2) rounds to 1.47
     * 
     * @param double num   number to be rounded
     * @param int digits   number of digits to round to
     **/
    public static double roundThis(double num, int digits) {
        long roundedNum;
        double finalNum;
        double digitFactor;
        
        // 2 ->  10^2 -> 100
        digitFactor = Math.pow(10, digits);
        
        // 1.456 * 100 -> 145.6
        num *= digitFactor;
        // rounded 146
        roundedNum = Math.round(num);
        // 146/100 -> 1.46
        finalNum = roundedNum/digitFactor;
        
        return finalNum;
    }  //roundThis(double, int)
        
} // RoundMethods