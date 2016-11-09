/**
 * Class to test drawTable() 
 * 420-112-DW
 * methods
 * nested while loops
 * @author PMC
 * @version 2015-2016
 */
public class DriveNested {
  
  public static void main (String[] args)
  {
	char num;
    drawTable ('A' , 10);
    drawTable ((char)125 , 15);    // right curly brace
	drawTable ((char)64 , 20);     // @ 
	num = (char)65;
	while (num > 60 ) {
		System.out.printf("Char %c is %d\n", num, (int)num);
		drawTable (num , 5); 
        num--;		
	}
  } // main()
  /**
   * Given a character and a size of a cube
   * display the character on the screen
   *
   * @author PMC
   * @param char  what we are drawing on the screen
   * @param int   x by x table this is x
 
   **/
  
public static void drawTable (char symbol, int size)
    {
	int row = 1, col = 1;

        while (row <= size)
        {
            col = 1;
            while (col <= size)
            {
                System.out.print (symbol);
                col++;
            }
            System.out.println ();
            row++;
        }
    } // drawTable()
} // DriveNested
