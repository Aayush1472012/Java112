/**
 * this method takes a number and a power of 10
 * returns the digit at that position 
 * ex: 523 & 2
 * 2 is 100s position (10^2 => 100)
 * returns 5
 * 
 * @param int num  the number
 * @param int power the power of 10  
 **/
 public static int getPostion(int num, int power) {
     int tens;
     int digit;
     
     tens = Math.pow(10,power);
     
     digit = num/tens % 10;
     
     return digit;
 } // getPostion(int,int)
 