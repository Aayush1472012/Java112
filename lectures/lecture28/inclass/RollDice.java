public  class RollDice {
  public static void main(String[] args) {
    
    int rollCount =0;
    Dice d1 = new Dice();
    Dice d2 = new Dice();
    
    //while (d1.getValue() + d2.getValue() != 12) {
    //while (d1.getValue() == 6 && d2.getValue() == 6)  {
   while (d1.getValue() != 6 || d2.getValue() != 6)  {
      rollCount++;
      System.out.println("d1 " +rollCount+" " +d1.roll());
      System.out.println("d2 " +rollCount+" "+d2.roll());
    }
     System.out.println("d1 after" +d1.getValue());
     System.out.println("d2 after" +d2.getValue());
   
    System.out.printf("It took %d rolls to get double sixes\n", rollCount);
    /*
    System.out.println("d1 " +d1.getValue());
    System.out.println("d2 " +d2.getValue());

    System.out.println("d1 " +d1.roll());
    System.out.println("d2 " +d2.roll());
    */
  } // main()
} // RollDice