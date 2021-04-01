package za.ac.cput;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.juinit.Before;
import org.juinit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    private class Tester amt;

    @Before
    public void setup() {
        tester =new Tester();
    }

    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

//    not null test
    @Test
    public void App {
        assertNotNull("should not be null", new Object())
    }

//    false test
    @Test
    public static testAssertFalse {
        assterFalse("Failure, should be false", false)
    }

    BankAccount object1 = new BankAccount("Thato","AC001");
    //    not null test
    @Test
    public void App {
    assertNotNull("should not be null", new object1())
    }

}
