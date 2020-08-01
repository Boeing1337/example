package example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class Calendar {
    private final static int MIN_MONTH_VALUE = 1;
    private final static int MAX_MONTH_VALUE = 12;
    private final static int SHIFT = 1;
    private final StringParser stringParser;

    @Autowired
    public Calendar(StringParser stringParser) {
        this.stringParser = stringParser;
    }

    public String getMonth(String rawString) {
        final Integer month = stringParser.parseToInt(rawString);
        if (month == null || month < MIN_MONTH_VALUE || month > MAX_MONTH_VALUE)
            return null;
        return Month.values()[month - SHIFT].getRusMonth();
    }

}
