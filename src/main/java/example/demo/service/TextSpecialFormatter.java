package example.demo.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TextSpecialFormatter {
    public List<String> format(List<String> strings) {
        final ArrayList<String> tempArray = new ArrayList<>();
        if (strings.isEmpty())
            return tempArray;

        return strings.stream()
                .sorted(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder()))
                .map(e -> "(" + e.length() + "): " + e).collect(Collectors.toList());
    }
}
