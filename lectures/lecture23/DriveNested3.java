/**
 * Class to test drawTriangleUpsideDown() 
 *   and drawTriangleNumbers()
 * 420-112-DW
 * methods
 * nested while loops
 * @author PMC
 * @version 2015-2016
 */
public class DriveNested3 {
  
  public static void main (String[] args)
  {
	char num;
    drawTriangleUpsideDown ('A' , 10);
    drawTriangleUpsideDown ((char)125 , 15);    // right curly brace
	drawTriangleUpsideDown ((char)64 , 20);     // @ 
	num = (char)65;
	while (num > 60 ) {
		System.out.printf("Char %c is %d\n", num, (int)num);
		drawTriangleUpsideDown (num , 5); 
        num--;		
	}
	 
	drawTriangleNumbers(3);
	drawTriangleNumbers(5);
	drawTriangleNumbers(11);
	 
	drawDiagonal ('x' , 9);

  } // main()
  /**
   * Given a character and a base size of a triangle
   * display the character on the screen in triangle form
   * with the slope on the right base first
   *
   * @author PMC
   * @param char  what we are drawing on the screen
   * @param int   base length of table
 
   **/
 
public static void drawTriangleUpsideDown (char symbol, int size)
    {
        int row = size, col = 1;

        while (row >= 1)
        {
            col = row;
            while (col >= 1)
            {
				System.out.print (symbol);
				col--;
            }
            System.out.println ();
            row--;
        }
    } // drawTriangleUpsideDown()
   /**
   * Given a size 
   * display numbers on the screen 
   * until size is reached 
   *  drawTriangleNumbers (3)  results in
   *    1
   *	12
   *	123
   *
   * @author PMC
   * @param int size maximum rows in our triangle
   **/	
	 public static void drawTriangleNumbers (int size)
    {
        int row = 1;
        int col = 1;
        while (row <= size)
        {
            while (col <= row)
            {
                System.out.print(col);
                col++;
            }
            System.out.println();
            row++;
            col=1;
       }
    } // drawTriangleNumbers
  /**
   * Given a character and a base size of a square
   * display the character on the screen 
   * with a number across the angle of the square
   *
   * @author PMC
   * @param char  what we are drawing on the screen
   * @param int   base length of table
   **/

	public static void drawDiagonal (char symbol, int size)
    {
	int row = 1, col = 1;
        while (row <= size)   {
            col = 1;
            while (col <= size) {
	      if (col==row)
		System.out.print(col);
               else
               System.out.print (symbol);
               col++;
            }
            System.out.println ();
            row++;
        }
    }  // drawDiagonal()
} // DriveNested3
