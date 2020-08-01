package example.demo.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class CalendarTest {

    private Calendar calendar;

    @BeforeEach
    private void createNewCalendar() {
        calendar = new Calendar(new StringParser());
    }

    @Test
    void getMonth() {
        assertNull(calendar.getMonth("0"));
    }

    @Test
    void getMonth2() {
        assertNull(calendar.getMonth("13"));
    }

    @Test
    void getMonth3() {
        assertEquals("ФЕВРАЛЬ", calendar.getMonth("2"));
    }
}