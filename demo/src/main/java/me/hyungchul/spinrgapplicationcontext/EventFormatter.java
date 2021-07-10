package me.hyungchul.spinrgapplicationcontext;

import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;

public class EventFormatter implements Formatter<Event> {
    @Override
    public Event parse(String s, Locale locale) throws ParseException {
        return null;
    }

    @Override
    public String print(Event event, Locale locale) {
        return null;
    }
}
