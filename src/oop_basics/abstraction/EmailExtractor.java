package oop_basics.abstraction;

import oop_basics.abstraction.super_class.Extractor;

import java.util.regex.Pattern;

public class EmailExtractor extends Extractor {

    public static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
    @Override
    public Pattern getPattern() {
        return VALID_EMAIL_ADDRESS_REGEX;
    }

    @Override
    public String getReportName() {
        return "Emails";
    }

    @Override
    public String clean(String input) {
        return input.toLowerCase();
    }
}
