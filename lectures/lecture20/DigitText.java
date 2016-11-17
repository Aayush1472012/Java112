import java.util.Scanner;
/**
 * 
 * Lecture 20 methods/while 
 * Application that asks a user to enter a number between 1 and 5.
 * Validates that they followed the instructions
 * Displays the text equivalent of the digit in text
 * 
 * @author pmcampbell
 * @version 2016-10-25
 * 
 **/
public class DigitText {
    public static void main(String[] args) {
        int digit;
        String result;

        digit = getIntRange(1, 5);
        result = convDigitText(digit);

        System.out.println("You entered: " + result);
    }

    /**
     * get an integer input 
     * make sure it is within the range given by the parameters
     * 
     * @author pmcampbell
     * @version 2016-10-25
     * 
     * @param int min   low end of permitted range
     * @param int max   high end of permitted range
     * @return int      input validated between the range
     * 
     **/
    public static int getIntRange(int min, int max) {
            int num;
            //priming input
            num = acceptInt("Please enter a number between " + min + " and " + max + " ");
            //input validation
            while (num < min || num > max) {
                num = acceptInt("YO, please enter a number between " + min + " and " + max + " ");
            }
            return num;
        } //getIntInRange()

    /**
     * given a string display as a prompt
     * read in an integer input 
     * 
     * @pmcampbell
     * @version 2016-10-25
     * 
     * @param String  message prompt string
     * @return int    input 
     * 
     **/
    public static int acceptInt(String message) {
            int number;
            System.out.print(message);
            Scanner kb = new Scanner(System.in);
            number = kb.nextInt();
            return number;
        } // acceptInt()
    /**
     * return the string description of  a number 
     * uses nested ifs
     * 
     * @pmcampbell
     * @version 2016-10-25
     * 
     * @param int digit number 
     * @return String string representation of the number
     * 
     * ex:  getDigitText(4) returns "four"
     **/
    public static String getDigitText(int digit) {
            String numberString;
            if (digit == 1) {
                numberString = "one";
            }
            else if (digit == 2) {
                numberString = "two";
            }
            else if (digit == 3) {
                numberString = "three";
            }
            else if (digit == 4) {
                numberString = "four";
            }
            else if (digit == 5) {

                numberString = "five";
            }
            else {
                numberString = "Invalid digit";

            }
            return numberString;
        } //getDigitText()
    /**
     * return the string description of  a number 
     * uses switch
     * 
     * @pmcampbell
     * @version 2016-10-25
     * 
     * @param int digit number 
     * @return String string representation of the number
     * 
     * ex:  getDigitTextSwitch(4) returns "four"
     **/
    public static String getDigitTextSwitch(int digit) {
        String numberString;
            switch (digit) {
                case 1:
                    numberString = "one";
                    break;
                case 2:
                    numberString = "two";
                    break;
                case 3:
                    numberString = "three";
                    break;
                case 4:
                    numberString = "four";
                    break;
                case 5:
                    numberString = "five";
                    break;
                default:
                    numberString = "Invalid digit";
                    break;
            }
            return numberString;
        } //getDigitTextSwitch()
} //DemoLoops
