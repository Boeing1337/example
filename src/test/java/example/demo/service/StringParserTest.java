package example.demo.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class StringParserTest {
    private StringParser stringParser;

    @BeforeEach
    private void createStringParser() {
        stringParser = new StringParser();
    }

    @Test
    void parseToInt() {
       assertEquals(1,stringParser.parseToInt("1"));
    }

    @Test
    void parseToInt2() {
        assertNull(stringParser.parseToInt("fdsg"));
    }
}