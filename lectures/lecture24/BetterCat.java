public class BetterCat {
    // all values relate to a cat, in an object
    private String name;
    private int age;
    private boolean isGiantCat;

    public void setAge(int newAge) {
      this.age = newAge;
    }
    public void setIsGiantCat(boolean giant) {
      this.isGiantCat = giant;
    }
    public void setName(String newName) {
      this.name = newName;
    }
    public int getAge() {
      return this.age;
    }
    public boolean setIsGiantCat() {
      return this.isGiantCat;
    }
    public String getName() {
      return this.name;
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
