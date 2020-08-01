package example.demo.api;

import example.demo.service.Calendar;
import example.demo.service.StringSeparator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/month")
public class MonthController {
    private final Calendar calendar;
    private final StringSeparator stringSeparator;

    public MonthController(Calendar calendar, StringSeparator stringSeparator) {
        this.calendar = calendar;
        this.stringSeparator = stringSeparator;
    }

    @GetMapping("/")
    public String parseStrings(@RequestParam String monthNumber) {
        final String month = calendar.getMonth(monthNumber);
        if (month == null)
            return "INCORRECT INPUT DATA";
        return stringSeparator.separate(month);
    }
}
