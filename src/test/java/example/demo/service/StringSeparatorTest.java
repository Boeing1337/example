package example.demo.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringSeparatorTest {

    StringSeparator stringSeparator;

    @BeforeEach
    void createSeparator() {
        stringSeparator = new StringSeparator();
    }

    @Test
    void separate() {
        assertEquals("a-b-c", stringSeparator.separate("abc"));
    }

    @Test
    void separate2() {
        assertEquals("a", stringSeparator.separate("a"));
    }

    @Test
    void separate3() {
        assertEquals("a!b!c", stringSeparator.separate("!", "abc"));
    }

    @Test
    void separate4() {
        assertEquals("a", stringSeparator.separate("!", "a"));
    }

    @Test
    void separate5() {
        assertEquals("", stringSeparator.separate("567", ""));
    }
}