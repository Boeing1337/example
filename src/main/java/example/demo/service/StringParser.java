package example.demo.service;

import org.springframework.stereotype.Component;

@Component
public class StringParser {
    public Integer parseToInt(String rawString) {
        Integer i = null;
        try {
            i = Integer.parseInt(rawString);
        } catch (Exception e) {
            System.out.println("[STRING PARSER] ILLEGAL VALUE " + rawString);
        }
        return i;
    }
}
