public class ShowDog {    
    private int size;
    private String breed;
    private String name;

    public ShowDog (int mySize, String myBreed, String myName) {
        this.size = mySize;
        this.breed = myBreed;
        this.name = myName;
    }
    public int getSize () {
        return this.size;
    }
    public String getBreed () {
        return this.breed;
    }
    public String getName () {
        return this.name;
    }
    public void setName (String newName) {
        this.name = newName;
    }
    public void bark ()   {
        System.out.println ("Woof woof");
    }
}
