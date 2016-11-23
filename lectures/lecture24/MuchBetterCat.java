/**
 * MuchBetterCat is created from 
 * the starting point of BetterCat
 * 
 * It has two constructors
 * a default no parameter constructor
 * and a multi parameter constructor
 * 
 * @author pmcampbell
 **/
public class MuchBetterCat {
    // all values relate to a cat, in an object
    private String name;
    private int age;
    private boolean isGiantCat;

    // no parameter constructor
    public MuchBetterCat() {
        // my default cat values
        this.name ="default cat name";
        this.age = 1;
        this.isGiantCat = false;
    }
    // multi parameter constructor
    public MuchBetterCat(String newName, int newAge, boolean giantCat) {
        // my default cat values
        this.name = newName;
        this.age = newAge;
        this.isGiantCat = giantCat;
    }
    // mutators
    public void setName(String newName) {
      this.name = newName;
    }
  
    // accessors
    public String getName() {
      return this.name;
    }
    
    public int getAge() {
      return this.age;
    }
    public void simpleMeow() {
      System.out.println("Meoooooooow");
      } // simpleMeow()
    
    public void meow() {
      if (this.isGiantCat) {
        System.out.println("Roooooooaaaaarrrr!");
        } else {
        System.out.println("Meoooooooow");
        }
      } // meow()
      
    public void growOlder() {
      this.age++;
    } //growOlder()
    
    public void growOlderFaster(int years) {
       this.age += years;
    } //growOlder()

} // Cat
