/*
*ItemCheckerApp.java
*@author Jaime Moises
* 12/05/2022
*/

package ItemChecker;

import java.util.Scanner;

public class ItemCheckerApp{
    public static void main(String[] args) {

	//Declare variables
        
	String passportId;
	int newPass, numPass;

	//Declare and create objects
	Scanner sc = new Scanner(System.in);
	ItemChecker passCheck = new ItemChecker();

        // Input and Output
        
	System.out.println("Please enter how many passaport ID would you like to check.");
	
        numPass = sc.nextInt();
	
        sc.nextLine();

	for (int i = 0; i < numPass; i++){
	System.out.println("Please enter the passportID " + (i + 1) + ": ");

	passportId = sc.nextLine();
		                        
	passportId = passportId.toUpperCase();
		                        
	passCheck.validatePassport(passportId);


	}

            System.out.print("Thank you for using the app! \n");

	}
}