/**
 * This application class is an example used to trace
 * method calls
 * 
 * @author PMCampbell
 * @version 1
 * */public class FinalExam
{
     public static void main (String[] args)
     {
         int w = 30, x = 13, y = 44;
         w = methodA(x, y, w);
         System.out.println("x: " + x + "y: " + y + "w: " + w);
         x = methodA(w, x, y);
         System.out.println("x: " + x + "y: " + y + "w: " + w);
     } // main method

     public static int methodA(int x, int y, int w)
     {
 	    int z = 5;
         y = y - 2;
         w = w + y;
         System.out.println("y: " + y + "x: " + x + "w: " + w  + "z: " + z);
         z = z + 10;
         return w;
     }//end methodA()   
}//end FinalExam
