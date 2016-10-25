/**
 * 
 * Lecture 20 methods/while 
 * Calculate compound intersest 
 * Code snippet, no validation
 * 
 * @pmcampbell
 * @version 2016-10-25
 * 
 **/
public class CompoundInt {
    public static void main(String[] args) {

            double bal = 1000; // initial balance
            double rate = 0.08; // interest rate
            //table heading
            System.out.println("Year\t\tBalance");
            int year = 0;
            while (year <= 10) {
                System.out.println(year + "\t\t " + bal);
                    bal = bal + rate * bal; bal = Math.round(100 * bal) / 100.; year++;
                }
    }  // main()
} //CompoundInt
