/**
 * 
 * Lecture 20 methods/while 
 * code snippet
 * Display a table of the 
 * squares of numbers 1 - 10
 * cubes of the numbers 1 -10
 * 
 * @pmcampbell
 * @version 2016-10-25
 * 
 **/
public class Squares {
    public static void main(String[] args) {

            // table of square of numbers 1 to 10
            System.out.println("Number\t\tSquared\t\tCubed");
            System.out.println("------\t\t-------\t\t-----");

            int i = 1;
            while (i <= 10) {
                System.out.print(i + "\t\t" + Math.pow(i, 2));
                System.out.println("\t\t" + Math.pow(i, 3));
                i++;
            }

        } // main()
} //Squares
