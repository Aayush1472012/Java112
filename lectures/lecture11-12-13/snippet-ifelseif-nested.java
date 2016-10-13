// nested ifs
// code snippet 
// mark int declared and assigned via input from scanner
if ( mark >= 60 ) {
	if (mark >= 90 ) {
		System.out.printf("Student passed %d with A\n", mark);
	} else {
		if (mark >= 70 ) {
			System.out.printf("Student passed %d with B\n", mark);
		} else { 
			if (mark >= 60 ) {
				System.out.printf("Student passed %d with C\n", mark);
			}  else  {
					System.out.println("Code error, fire the programmer");
				} 
} else {
	System.out.println("Student failed " + mark);
}  // if mark >= 60 

// else ifs
// code snippet 
// mark int declared and assigned via input from scanner
if ( mark >= 60 ) {
	if (mark >= 90 ) {
		System.out.printf("Student passed %d with A\n", mark);
	} else if (mark >= 70 ) {
			System.out.printf("Student passed %d with B\n", mark);
			} else 	if (mark >= 60 ) {
						System.out.printf("Student passed %d with C\n", mark);
					}  else  {
						System.out.println("Code error, fire the programmer");
						} 
} else {
	System.out.println("Student failed " + mark);
}  // if mark >= 60 