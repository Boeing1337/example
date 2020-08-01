package example.demo.service;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TextSpecialFormatterTest {

    @Test
    void format() {
        TextSpecialFormatter textSpecialFormatter = new TextSpecialFormatter();
        List<String> raw = Arrays.asList(new String[]{
                "Тихо струится река серебристая",
                "В царстве вечернем зеленой весны.",
                "Солнце садится за горы лесистые.",
                "Рог золотой выплывает луны."
        });

        List<String> end = Arrays.asList(new String[]{
                "(27): Рог золотой выплывает луны.",
                "(30): Тихо струится река серебристая",
                "(32): Солнце садится за горы лесистые.",
                "(33): В царстве вечернем зеленой весны."
        });
        assertEquals(end.toString(), textSpecialFormatter.format(raw).toString());
    }
}
