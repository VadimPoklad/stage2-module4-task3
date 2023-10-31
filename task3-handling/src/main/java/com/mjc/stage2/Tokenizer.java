package com.mjc.stage2;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tokenizer {
    public static List<String> getMatches(String regex, String string) {
        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);

        List<String> results = new ArrayList<>();
        while (matcher.find()) {
            results.add( matcher.group(0));
        }
        return results;
    }
    public static void print(List<String> results){
        results.forEach(System.out::println);
    }
}