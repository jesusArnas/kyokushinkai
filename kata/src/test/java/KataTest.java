import static org.junit.jupiter.api.Assertions.*;

class KataTest {

    Kata someKata = new Kata();

    @org.junit.jupiter.api.Test
    void hello() {
        assertEquals(someKata.hello(),"world");
    }

    @org.junit.jupiter.api.Test
    void hello1() {
        assertEquals(someKata.hello("Hello"), "Hello");
    }
}