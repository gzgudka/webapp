package example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class HelloServiceIT {

    @Test
    public void iAmVerySlow() throws Exception {
        Thread.sleep(1_000);
        assertTrue(true);
    }

    @Test
    public void iAmEvenSlower() throws Exception {
        Thread.sleep(1_100);
        assertTrue(true);
    }
}
