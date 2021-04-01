package za.ac.cput.Group19;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {
    private PasswordValidator pv1;
    private PasswordValidator pv2;

    int numberOfPassword = 0;
    int totalNumberOfAcceptablePswd = 1;

  @BeforeEach
void setData(){
this.numberOfPassword = 2;
}

    @Test
    void testEquality(){

            assertEquals(true,pv1.isValid("Adp362S"));
}
@Test
    void testIdentity(){
        assertSame(pv1, pv2);
}

    @Test
    @Timeout(5)
    public void shouldCheckTimeout() throws InterruptedException {
        Thread.sleep(1000);
    }

    @Disabled("Disabled until network is back")
    @Test
    void testFail(){
        assertFalse((this.numberOfPassword != this.totalNumberOfAcceptablePswd));
    }
    }
