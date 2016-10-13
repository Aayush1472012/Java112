// use your imagination
// everything we need is here
double grade;
Scanner kb = new Scanner(System.in);

System.out.print("enter grade: ");
grade = kb.nextDouble();

if (grade >= 60.0) {
    if (grade > 90) {
	    System.out.print("A!\n");
	} else {
	    System.out.println("Passed!");
		}
		} else {
		    System.out.println("Failed");
			}
