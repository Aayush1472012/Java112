/**
* Widening Conversions, the compiler thinks
* it's ok to go from a smaller container to a larger one
* Lecture 08 - 09   420-112-DW  Java I
*/
public class WideningConversions
{
    public static void main (String[] args)
    {
        char char1;
        byte byte1;
        short short1;
        int int1;
        long long1;
        float float1;
        double double1;

        // byte1 = (byte)260;   // high order bits truncated :(
        // byte1 = 260;         // compiler error out of range
        byte1 =  120;        // int but compiler takes care of it, no compiler error
        short1 = byte1;
        int1 = short1;
        long1 = int1;
        float1 = long1;
        double1 = float1;

        System.out.println ("double1 " + double1);

        char1 = 'A';	   // UTF-8 Unicode capital letter A has an integer value of 65
        //short1 = char1;  // compiler error, cannot assign char to short
        int1 = char1;
        long1 = int1;
        float1 = long1;
        double1 = float1;
        System.out.println ("double1 " + double1);
    }
}