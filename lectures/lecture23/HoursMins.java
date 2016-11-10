/**
*  This class will display minutes 0-59 for every hour 0-23 
*  using nested loops 
*  minor loop = inner loop (minutes)
*  major loop = outer loop (hours) 
*     
*  @author pcampbell
*  @version 2015-2016
*
**/
public class HoursMins
{
    public static void main (String[] args)
    {
        int hh, mm;
        hh = 0;  	  	// init major loop counter
        while (hh <= 23)  	// major loop boundary
        {
            mm = 0;  		// init minor loop counter
            while (mm <= 59) 	// minor loop bounary
            {
                System.out.printf ("%02d:%03d", hh, mm);
                mm++;  		// increment minor loop counter
            } 			// minor loop end
            hh++;  		// increment major loop counter
        } 			// major loop end
    } // main()
} // HoursMins
