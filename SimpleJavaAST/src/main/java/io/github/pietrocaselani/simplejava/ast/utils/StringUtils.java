package io.github.pietrocaselani.simplejava.ast.utils;

public final class StringUtils {

    private StringUtils() {
        throw new AssertionError("No instances for you!");
    }

    public static String capitalize(String s) {
        return capitalize(s, false);
    }

    public static String capitalize(String s, boolean onlyFirstChar) {
        String finalString = s.substring(1);
        return String.valueOf(s.charAt(0)).toUpperCase().concat(onlyFirstChar ? finalString : finalString.toLowerCase());
    }
}