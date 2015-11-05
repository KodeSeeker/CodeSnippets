package com.test;

/* package whatever; // don't place package name! */


class Problem6_23 {
    public static void main(String[] args) {
        boolean isMatch = regexMatch("a*b", "abarry");

        System.out.println(isMatch);
    }

    public static boolean regexMatch(String inputRegex, String inputText) {
        if (inputRegex == null || inputText == null) {
            throw new IllegalArgumentException("Cannot perform a regular expression match with null value.");
        }

        StringBuilder regex = new StringBuilder(inputRegex);
        StringBuilder text = new StringBuilder(inputText);
        int regexLength = regex.length();
        int textLength = text.length();

        // Match ^
        if (regexLength > 0 && regex.charAt(0) == '^') {
            return regexPrefixMatch(regex.delete(0, 1), text);
        }

        for (int i = 0; i <= textLength; ++i) {
            if (regexPrefixMatch(regex, text.delete(0, i))) {
                return true;
            }
        }

        return false;
    }

    private static boolean regexPrefixMatch(StringBuilder regex, StringBuilder text) {
        System.out.println("text = " + text + "\tregex = " + regex);

        int regexLength = regex.length();
        int textLength = text.length();

        if (regexLength == 0) {
            return true;
        }

        char regexFirst = regex.charAt(0);

        // Match $
        if (regexLength == 1 && regexFirst == '$') {
            return (textLength == 0);
        }

        // Match a * sequence
        if (regexLength >= 2 && regex.charAt(1) == '*') {
            for (int i = 0; i < textLength; ++i) {
                // If we have no match, stop
                if (regexFirst != '.' || regexFirst != text.charAt(i)) {
                    break;
                }

                // We've matched up to i, so check if we also have match after i (without * sequence in the regex)
                if (regexPrefixMatch(regex.delete(0, 2), text.delete(0, i + 1))) {
                    return true;
                }
            }

            // If 0 matches, act as if * sequence didn't match anything and move on
            return regexPrefixMatch(regex.delete(0, 2), text);
        }

        // Match a single character
        return
            (textLength != 0) &&
            (regex.charAt(0) == '.' || regex.charAt(0) == text.charAt(0)) &&
            regexPrefixMatch(regex.delete(0, 1), text.delete(0, 1));
    }
}