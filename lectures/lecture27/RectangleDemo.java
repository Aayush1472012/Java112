/**
 * This program is an application class,
 * It is used to test/drive the Rectangle static logic class
 * 
 * @author pmcampbell
 * @version today
*/
public class RectangleDemo {
   public static void main(String[] args) {
      int objectCount;
      // Create three instances of the
      // Rectangle class.
      Rectangle r1 = new Rectangle ();
      Rectangle r2 = new Rectangle ();
      Rectangle r3 = new Rectangle ();
      //static method
      objectCount = Rectangle.getRectCount();
      System.out.println(objectCount + 
                    " instances of the class were created."); 
      Rectangle r4 = new Rectangle ();
      // 4th instance of Rectangle class
      // static method Classname.methodname()
      objectCount = Rectangle.getRectCount();
      System.out.println(objectCount + 
                    " instances of the class were created.");

} // main()
} // RectangleDemo
