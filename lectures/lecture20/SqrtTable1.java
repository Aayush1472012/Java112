/**
 * 
 * Lecture 20 methods/while 
 * Display a table of the 
 * squareroots of numbers from 0.1 to 2.0 step .1
 * solution 1   round to closest 10th
 * 
 * @pmcampbell
 * @version 2016-10-25
 * 
 **/
public class SqrtTable1 {
    public static void main(String[] args) {

        System.out.println( "x \t Square root x" );
		double x=0.1;
		while (x <= 2.0)  {
		   System.out.println(x + "\t"+Math.sqrt(x));
		   // oritinally: x += 0.1; 
		   // round to nearest 10th
           x = Math.round((x+0.1)*10)/10.; 
		}
    } // main()
} //SqrtTable1
