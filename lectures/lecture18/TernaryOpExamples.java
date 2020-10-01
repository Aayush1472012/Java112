import java.util.Scanner;
/**
 * 
 * Lecture 18 using ternary operator
 * 
 * answer = (Expression) ? ans1 : ans2;
 * It will give ans1 as answer if expression has true value,
 * else it will give ans2 as answer.
 * @pmcampbell
 * @version 2016-10-25
 * 
 **/
public class TernaryOpExamples {
    public static void main(String[] args) {
            example1();
            System.out.println(example2(10,12,5));
            System.out.println(example2(-40,12,1));
            
        } // main()
        
        public static void example1() {
            int x = 10, y = 12, z = 0; 
            z = x > y ? x : y; 
            System.out.println("z = x > y ? x : y;\t\t" + "z : " + z);
        }
        public static String example2(int a, int b, int cookieCount) {
            String returnString;
            int minVal, absVal;
            
            System.out.println("a "+ a + " b "+b);
            
            minVal = (a < b) ? a : b; 
            System.out.println("minVal "+minVal);
            
            absVal = (a < 0) ? -a : a; 
            System.out.println("absVal "+absVal);
            
            returnString = "There " + (cookieCount > 1 ? " are " + cookieCount + " cookies" : "is one cookie");
            return returnString;
        }  // example2
} //TernaryOpExamples
