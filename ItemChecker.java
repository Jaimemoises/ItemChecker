/*
*ItemChecker.java
*@author Jaime 
* 12/05/2022
*/

package ItemChecker;

public class ItemChecker{
    
	//Declare variables
    private String passportId;
    private boolean isValid; //Boolean to false and true

    public ItemChecker() {

    }

    private boolean check(String passportId){
        
        // Size validation
        if(passportId.length() != 11){
            return false;
        }

        // Value declared
        char chr1 = passportId.charAt(0);
        char chr2 = passportId.charAt(1);
        char chr3 = passportId.charAt(2);
        char chr4 = passportId.charAt(3);
        char chr5 = passportId.charAt(4);
        char chr6 = passportId.charAt(5);
        char chr7 = passportId.charAt(6);
        char chr8 = passportId.charAt(7);
        char chr9 = passportId.charAt(8);
        char chr10 = passportId.charAt(9);
        char chr11 = passportId.charAt(10);

        // P and L only as first letter
        if(!"P".equals(chr1 + "") && !"L".equals(chr1 + "")){
            return false;
        }

        // Set that must have space between the letters
        if(!(chr2 == " ".charAt(0))){
            return false;
        }

        // Set that Must have a second letter
         if(!(Character.isLetter(chr3))){
            return false;
        }

        // Must have a dash "-"
        if(!(chr4 == "-".charAt(0))){
            return false;
        }

        // Digit (1-9)
        if(!(Character.isDigit(chr5))) {
            return false;
        }

        // Digit (1-9)
        if(!(Character.isDigit(chr6))) {
            return false;
        }

        // Digit (1-9)
        if(!(Character.isDigit(chr7))) {
            return false;
        }

        // Digit (1-9)
        if(!(Character.isDigit(chr8))) {
            return false;
        }

        // Digit (1-9)
        if(!(Character.isDigit(chr9))) {
            return false;
        }

        // Digit (1-9)
        if(!(Character.isDigit(chr10))) {
            return false;
        }
        // Digit (1-9)

        return Character.isDigit(chr11);
    }

    //Validation to say if it is valid or not.
    
    public void validatePassport(String passportId){
        this.passportId = passportId;
        if(check(passportId)){
            System.out.println("The passport ID is valid \n");
        }
        else{
            System.out.println("The passport ID is invalid \n");
        }
    }
}