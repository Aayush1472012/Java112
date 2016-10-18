public class PassByValue2Deep
{
   public static void main(String[] args) {
      int num1= 10, num2=5; 
      num1 = method1(num2, num1);
      System.out.println("num1 is " + num1); 
      System.out.println("num2 is " + num2); 

   } // main() 
   
   public static int method1(int num1, int num2) {
	   num1= method2(num1, num2);
	   return num2;
   } //method1(int,int)
   
   public static int method2(int x, int y)  {
	   int myValue = x + y; 
	   y = 9;
	   return myValue;
   } //method2(int,int)
   
} // PassByValue2Deep
