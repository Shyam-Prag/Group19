package za.ac.cput;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.time.Duration;

/**
 * Unit test for simple App.
 */
public class PersonTest
{
    /**
     * Equality test
     */
    @Test
    public void equalityTest()
    {
        Person person1 = new Person("martin", 21);
        Person person2 = new Person("martin", 21);
        assertEquals(person1, person2);
    }

    /**
     * Identity test
     */
    @Test
    public void identityTest(){
        Person person1 = new Person("martin", 21);
        Person person2 = new Person("martin", 21);
        Person person3 = person1;
        assertSame(person1, person3);
    }

    /**
     * Failing test
     */
    @Test
    public void failingTest(){
        Person person1 = new Person("martin", 21);
        Person person2 = new Person("Garrix", 21);
        assertEquals(person1, person2);
    }

    /**
     * using assertNotEquals to prove person objects are not equal
     */
    @Test
    public void passFailingTest(){
        Person person1 = new Person("martin", 21);
        Person person2 = new Person("Garrix", 21);
        assertNotEquals(person1, person2);
    }

    /**
     * timeout test to prove that the code runs successfully under 1 second
     */
    @Test
    public void timeouts(){
        assertTimeout(Duration.ofSeconds(1),()->{
            Person person1 = new Person("martin", 21);
            Person person2 = new Person("Garrix", 21);
        });
    }

    /**
     * Disbled test
     */
    @Test
    @Disabled("Disable test")
    public void disable(){
        Person person1 = new Person("martin", 21);
        Person person2 = new Person("Garrix", 21);
        assertEquals(person1, person2);
    }
}
