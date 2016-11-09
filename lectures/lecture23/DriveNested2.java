/**
 * Class to test drawTriangle() 
 * 420-112-DW
 * methods
 * nested while loops
 * @author PMC
 * @version 2015-2016
 */
public class DriveNested2 {
  
  public static void main (String[] args)
  {
	char num;
    drawTriangle ('A' , 10);
    drawTriangle ((char)125 , 15);    // right curly brace
	drawTriangle ((char)64 , 20);     // @ 
	num = (char)65;
	while (num > 60 ) {
		System.out.printf("Char %c is %d", num, (int)num);
		drawTriangle (num , 5); 
        num--;		
	}
  } // main()
  /**
   * Given a character and a base size of a triangle
   * display the character on the screen in triangle form
   *
   * @author PMC
   * @param char  what we are drawing on the screen
   * @param int   base length of table
 
   **/
  
public static void drawTriangle (char symbol, int size)
    {
	int row = 1, col = 1;

        while (row <= size)
        {
            col = 1;
            while (col <= row)
            {
                System.out.print (symbol);
                col++;
            }
            System.out.println ();
            row++;
        }
    } // drawTriangleable()
} // DriveNested
