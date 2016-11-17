/**
 * Class to test Cat class 
 * 420-112-DW
 * objects with properties & behaviours
 * 
 * @author PMC
 * @version 2015-2016
 */
public class CrazyCatLady {
  
  public static void main (String[] args)
  {
  Cat garfield, simba;
  
  garfield = new Cat();
  garfield.name = "Garfield";
  garfield.age =2;
  garfield.growOlderFast(10);
  System.out.println(garfield.name +  " age " + garfield.age);
  garfield.simpleMeow();
  garfield.meow();
    
  
  simba = new Cat();
  simba.name ="Simba";
  garfield.age = 5;
  simba.growOlder();
  System.out.println(simba.name +  " age " + simba.age);
  simba.simpleMeow();
  simba.meow();
  
  
  } // main()
} // CrazyCatLady
