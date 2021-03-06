/**
 * This application class drives the methods in the lecture slides
 * 
 * @author PMCampbell
 * @version 1
 * */
public class DriveExamples { 
    public static void main (String [] args) {
        // example  2  (there's no 1 for some reason)
        displayPowerOf2(10);
        displayPowerOf2(100);
        // example 3
        int num = 1234667;
        System.out.println("\nReverse "+ num + " reversed "+ reverseNum(num));
        num = 102030401;
        System.out.println("Reverse "+ num + " reversed "+ reverseNum(num));
        // example 4
        displayTriangle1(6);
        displayTriangle1(9);
        displayTriangle1(10);
        // example 4 another 
        displayTriangle2(5);
        displayTriangle2(11);
        
    } // main()
    /**
     * display the values of powers of 2 up until the param
     * 
     * @param  int num   limit for powers of 2
     **/
    public static void displayPowerOf2(int num)
    {
    int count = 0;
    int power = 1;
    while (power <= num) {
        System.out.println();
        power = (int)Math.pow(2,count);
        System.out.print("two to the power of "+ count + " is: "+power);
        count++;
        if (count%10==0) //new line every ten
              System.out.println();
        }
    }
    /**
     * give an integer, reverse the digits and return that
     * 
     * @param  int num   integer
     * @return int   reversed value of num
     **/
    public static int reverseNum(int num)
    {
    int reverse = 0;
    while (num > 0) {
        reverse *= 10;
        reverse += num%10;
        num /= 10;
        }
    return reverse;
    }
    /**
     * give an integer, display a 
     * left justified ascending triangle using it
     * 2016 this is the one I asked for in class
     * 
     * @param  int num   integer
     **/
    public static void displayTriangle2(int num)     {
        int rows = 1;
        int cols = 1;
        int spaces = 1;

        while (rows <= num) {
            cols = 1;
            while (cols<=rows) {
                System.out.print(cols);
                cols++;
                }
            rows++;
            System.out.println();
       }
   }  // displayTriangle2
   /**
     * give an integer, display a 
     * right justified, descending triangle using it
     * 
     * @param  int num   integer
     **/
    public static void displayTriangle1(int num)     {
        int rows = 1;
        int cols = 1;
        int spaces = 1;

        while (rows <= num) {
            while (spaces < rows) {
                System.out.print(" ");
                spaces++;
                }
            while (cols<=num) {
                System.out.print(cols);
                cols++;
                }
            spaces = 1;
            rows++;
            cols = rows;
            System.out.println();
       }
   }  // displayTriangle1
} //DriveExamples