import java.util.Scanner;
/**
 * 
 * Lab  using ternary operator
 * 
 * @pmcampbell
 * @version 2016-10-25
 * 
 **/
public class Ternary {
    public static void main(String[] args) {
        int x, y;
        Scanner kb = new Scanner(System.in);
        
        System.out.print("Enter a value for x:");
        x = kb.nextInt();
        System.out.print("Enter a value for y:");
        y = kb.nextInt();
        System.out.println("min of "+ x  + " and " +
                y+ " is " + min(x, y));
        System.out.println("max of "+x +" and " + y +" is" + max(x, y));
        System.out.println("abs value of "+x  +" is" + abs(x));
        System.out.println("abs value of "+y  +" is" + abs(y));
        cookies(x);
        cookies(y);
    } // main()
        
    public static void min(int x, int y) {
        return x < y ?  x : y;
    }
    public static void max(int x, int y) {
        return x > y ?  x : y;
    }
    public static void abs(int x) {
        return x < 0 ?  -x : x;
    }
    public static void cookies(int x) {
        System.out.print("You have " + x + "cookie" +
                        x == 1 ? "" : "s" + "\n");
    }

} //Ternary
