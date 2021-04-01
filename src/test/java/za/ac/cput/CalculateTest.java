package za.ac.cput;

import org.junit.jupiter.api.*;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class CalculateTest
{

    //objects are created
    public Calculate number1, number2, number3;

    //Method setUp() runs before each method is tested
    @BeforeEach
    void setUp()
    {
        //Objects are initialized and instantiated
        number1=new Calculate();
        number2=new Calculate();
        number3=number1;
    }

    //Testing if objects are identical
    @Test
    void testIdentity()
    {
        assertSame(number1, number3);
        System.out.print("Identicality is tested and present. Identity test PASSED");
    }

    //Testing if objects are equal
    @Test
    void testEquality()
    {
        assertEquals(number1, number3);
        System.out.print("Equality is tested and present. Equality test PASSED");
    }

    //Test to deliberately fail
    @Test
    void testFail()
    {
        assertSame(number1,number3);
        fail("This test was done to deliberately failed."); //purposely fail test and message as to why test was made to fail
    }

    //Test to disable method.
    @Test
    @Disabled("Test disabled for demonstration purposes.") //message reasoning as to why test was disabled
    void testDisabled()
    {
        assertEquals(number1, number3);
        System.out.println("Numbers are equal.");
    }

    //Method to perform a timeout test
    @Test
    @Timeout(1) //test should time out after 1 second
    void testTimeout()
    {
        try
        {
            TimeUnit.SECONDS.sleep(2); //line will run for 2 seconds before being put to sleep
            System.out.println("Timeout test PASSED");
        }
        catch(InterruptedException iEx)
        {
            System.out.println("Exception: "+iEx.getMessage());
            System.out.println("Test timed out");
        }
    }

}