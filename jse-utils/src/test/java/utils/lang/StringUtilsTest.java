package utils.lang;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static utils.lang.StringUtils.*;
import static org.junit.jupiter.api.Assertions.*;


public class StringUtilsTest {
    
    @BeforeAll
    public static void init() {
    }

    @Test
    public void nullTests() {
        String string = null;

        assertNull(substring(string, 0, 1));
        assertNull(substring(string, 9999, 1));
        assertNull(substring(string, -1, 99999));
        
        assertNull(lenghtSubstring(string, 0, 1));
        assertNull(lenghtSubstring(string, 99999, 1));
        assertNull(lenghtSubstring(string, -1, 99999));
    }

    @Test
    public void emptyTests() {
        String string = "";

        assertEquals(substring(string, 0, 1), "");
        assertEquals(substring(string, 9999, 1), "");
        assertEquals(substring(string, -1, 99999), "");

        assertEquals(lenghtSubstring(string, 0, 1), "");
        assertEquals(lenghtSubstring(string, 99999, 1), "");
        assertEquals(lenghtSubstring(string, -1, 99999), "");
    }

    @Test
    public void testSubstring() {
        String string = "abcdefghijk";

        assertEquals(substring(string, 0, 1), "a");
        assertEquals(substring(string, 0, 2), "ab");
        assertEquals(substring(string, 1, 3), "bc");
        assertEquals(substring(string, 1, 4), "bcd");
        assertEquals(substring(string, 2, 12), "cdefghijk");
        assertEquals(substring(string, 13, 24), "");

        assertThrows(IllegalArgumentException.class, () -> {
            substring(string, -1, 10);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            substring(string, 0, -10);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            substring(string, 1, 1);
        });
    }

    @Test
    public void testLengthSubstring() {
        String string = "abcdefghijk";

        assertEquals(lenghtSubstring(string, 0, 1), "a");
        assertEquals(lenghtSubstring(string, 0, 2), "ab");
        assertEquals(lenghtSubstring(string, 1, 3), "bcd");
        assertEquals(lenghtSubstring(string, 1, 4), "bcde");
        assertEquals(lenghtSubstring(string, 2, 12), "cdefghijk");
        assertEquals(lenghtSubstring(string, 13, 24), "");


        assertEquals(lenghtSubstring(string, -1, 1), "k");
        assertEquals(lenghtSubstring(string, -1, 2), "jk");
        assertEquals(lenghtSubstring(string, -2, 3), "hij");
        assertEquals(lenghtSubstring(string, -2, 4), "ghij");
        assertEquals(lenghtSubstring(string, -3, 12), "abcdefghi");
        assertEquals(lenghtSubstring(string, -14, 24), "");

        assertThrows(IllegalArgumentException.class, () -> {
            lenghtSubstring(string, 0, -10);
        });
    }
}
