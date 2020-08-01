package example.demo.api;

import example.demo.service.TextSpecialFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/strings")
public class StringsCounterController {

    private final TextSpecialFormatter textSpecialFormatter;

    @Autowired
    public StringsCounterController(TextSpecialFormatter textSpecialFormatter) {
        this.textSpecialFormatter = textSpecialFormatter;
    }

    @PostMapping
    public List<String> parseStrings(@RequestBody ArrayList<String> strings) {
        return textSpecialFormatter.format(strings);
    }
}
