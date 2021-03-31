package za.ac.cput.Group19;
/**
 * @author SIPHELELE NYATHI
 * 218334028
 * This class validates a password
 */

public class PasswordValidator {

    /**
     * This method checks if the password is valid and returns a boolean
     */
    public boolean isValid(String password){
        if (password.length() >=5 && password.length() <=10)
            return true;
        else
            return false;
    }

}
