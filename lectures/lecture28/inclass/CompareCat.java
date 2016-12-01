//import java.util.Scanner;
public class CompareCat {
  public static void main(String[] args) {
    MuchBetterCat c1 = new MuchBetterCat();
    MuchBetterCat c2 = new MuchBetterCat("pablo", 5, false);
    MuchBetterCat c3 = new MuchBetterCat("escobar", 10, false);
    MuchBetterCat c4 = new MuchBetterCat("juan", 5, true);
    MuchBetterCat c5 = new MuchBetterCat("pablo", 5, false);
    System.out.println("c1 " +c1.getName() + " and c2 " + c2.getName() + " are "
                         + compareCat(c1,c2));
    System.out.println("c2 " +c2.getName() + " and c5 " + c5.getName() + " are "
                         + compareCat(c2,c5));
  } //main ()
  /* 
   * compare two Cat objects
   * @author  PMCAMPBELL
   * @version  2016-12-01
   * @param Cat first cat
   * @param Cat second cat
   * @return true if same
   * @return false if different
   */
  public static boolean compareCat(MuchBetterCat cat1, MuchBetterCat cat2) {
    if (cat1.getAge() != cat2.getAge()) {
         return false;
    }
    if (cat1.getName() != cat2.getName()) {
         return false;
    }    
    if (cat1.getGiant() != cat2.getGiant()) {
         return false;
    }    
    return true;
  }  // compareCat
} //CompareCat