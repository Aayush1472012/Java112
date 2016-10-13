// use your imagination
// everything we need is here
double grade;
Scanner kb = new Scanner(System.in);

System.out.print("enter grade: ");
grade = kb.nextDouble();

if (grade >= 60.0 && grade <90) {
	System.out.println("Passed!");
} else {  // 1st else
    if (grade >= 90) {
	    System.out.print("A!\n");
	} else { 
	    System.out.println("Failed");
		}
}  // end 1st else
