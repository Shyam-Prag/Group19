package za.ac.cput;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class TestBot {
    //Checking the Object Equality Test
    @Test
    void testBot(){

        Bot bot1 = new Bot("Auto", 36);
        Bot bot2 = new Bot("Auto", 36);
        assertEquals(bot1,bot2);

    }

    //Checking the Object Identity Test
    @Test
    void testGetPower() {

        Bot bot = new Bot("Auto", 36);
        assertSame(bot.getPower(),36);

    }

    //Checking the Failing Test
    @Test
    void testFailingBot(){

        Bot bot1 = new Bot("Auto", 36);
        Bot bot2 = new Bot("Manual", 48);
        assertNotEquals(bot1,bot2);

    }
    //This is the Failing Test but actually fails
    @Test
    void testButActuallyFailingBot(){

        Bot bot1 = new Bot("Auto", 36);
        Bot bot2 = new Bot("Manual", 48);
        assertEquals(bot1,bot2);

    }

    //Checking the Timeouts Test
    @Test
    void testTimeoutBot(){
        assertTimeout(Duration.ofSeconds(1),()->{
            Bot bot1 = new Bot("Auto", 36);
            Bot bot2 = new Bot("Manual", 48);
        });
    }

    //Checking the Disabling Test
    @Disabled("Disabled for Disable test")
    @Test
    void testDisabledBot(){

        Bot bot1 = new Bot("Auto", 36);
        Bot bot2 = new Bot("Auto", 36);
        assertEquals(bot1,bot2);
    }
}

