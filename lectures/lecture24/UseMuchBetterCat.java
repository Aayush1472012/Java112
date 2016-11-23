/**
 * Class to test MuchBetterCat class 
 * 420-112-DW
 * objects with properties & behaviours
 * 
 * @author PMC
 * @version 2015-2016
 */
public class UseMuchBetterCat {
  
  public static void main (String[] args)
  {
  MuchBetterCat garfield, simba;
  
  // using no parameter constructor
  garfield = new MuchBetterCat();
  // using multi parameter constructor
  simba = new MuchBetterCat("Simba", 5, true);
  
  // use the data in the objects 
  System.out.println(simba.getName() +  " age " + simba.getAge());
  simba.simpleMeow();
  simba.meow();
  
  System.out.println(garfield.getName() +  " age " + garfield.getAge());
  garfield.simpleMeow();
  garfield.meow();
  
  } // main()
} // UseMuchBetterCat
