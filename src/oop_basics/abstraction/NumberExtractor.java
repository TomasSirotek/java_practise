package oop_basics.abstraction;

import oop_basics.abstraction.super_class.Extractor;

import java.util.regex.Pattern;

public class NumberExtractor extends Extractor {

    private static final Pattern VALID_NUMBER_ADDRESS_REGEX =
            Pattern.compile("^[0-9]*$");
    @Override
    public Pattern getPattern() {
        return VALID_NUMBER_ADDRESS_REGEX;
    }

    @Override
    public String getReportName() {
        return "Phone Numbers";
    }

    @Override
    public String clean(String input) {
        return input;
    }

}
