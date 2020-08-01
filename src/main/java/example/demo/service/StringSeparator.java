package example.demo.service;

import com.google.common.primitives.Chars;
import org.springframework.stereotype.Component;

@Component
public class StringSeparator {
    /**
     * All method require @NoNull arguments;
     */
    private static String DEFAULT_SEPARATOR = "-";

    public String separate(String separator, String string) {
        return executeSeparate(separator, string);
    }

    public String separate(String string) {
        return executeSeparate(DEFAULT_SEPARATOR, string);
    }

    private String executeSeparate(String separator, String string) {
        if (string.isEmpty())
            return string;
        return Chars.join(separator, string.toCharArray());
    }
}
