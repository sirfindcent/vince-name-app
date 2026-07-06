import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class GreetingAppTest {
    @Test
    void testGreetingAppDefault() {
        GreetingApp greeting = new GreetingApp();
        var list = new String[]{};
        var value = GreetingApp.returnGreeting(list);
        Assertions.assertEquals("Hello Vincent", value);
    }

    @Test
    void testGreetingAppWithMessage() {
        GreetingApp greeting = new GreetingApp();
        var list = new String[]{"farell"};
        var value = GreetingApp.returnGreeting(list);
        Assertions.assertEquals("Hello farell", value);
    }
}