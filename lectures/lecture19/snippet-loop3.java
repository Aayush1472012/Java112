/**
 * this method adds all the odd numbers 
 * between 53 and 247 inclusive, 
 * leaving out 121 and 227
 *  
 * @author pcampbell
 * @version 1.0
 * 
 * @param int sum of numbers 
 *  
 **/
 public static int sumNums() {
     int start=53;
     int sum=0;
     
     while (start < 246) {
        if (start == 121 || start == 227)
            continue;
        sum += start;
        start +=2;
     }
     return sum;
 } // sumNums()
