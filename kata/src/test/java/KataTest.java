import org.junit.Test;

import static org.junit.Assert.*;

public class KataTest {
    Kata someKata = new Kata();

    @Test
    public void hello() {
        assertEquals(someKata.hello(),"world");
    }

    @Test
    public void hello1() {
        assertEquals(someKata.hello("Hello"), "Hello");
    }
}