package za.ac.cput.Group19;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {
    @Test
    public void testPasswordLength(){
        PasswordValidator pv = new PasswordValidator();
        Assert.assertEquals(true, pv.isValid(""))
    }

}