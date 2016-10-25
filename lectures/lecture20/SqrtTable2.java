/**
 * 
 * Lecture 20 methods/while 
 * Display a table of the 
 * squareroots of numbers from 0.1 to 2.0 step .1
 * solution 2   make sure errors don't accumulate
 *				shift counter and limit up by 10 
 *				from .1 to 1 & 2.0 to 20
 * 
 * @pmcampbell
 * @version 2016-10-25
 * 
 **/
public class SqrtTable2 {
    public static void main(String[] args) {

        System.out.println( "x \tSquare root x" );
        int counter = 1;
        double x;
        while (counter <= 20) {
            x = counter/10.;
            System.out.println( x+"\t"+Math.sqrt(x));
            counter++; 
            }
    } // main()
} //SqrtTable2
