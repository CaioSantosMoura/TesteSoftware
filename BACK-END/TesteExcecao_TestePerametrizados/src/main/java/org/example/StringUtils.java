package org.example;

public class StringUtils {

    public boolean isPalindrome(String input) {
        if (input.isEmpty()) {
            return false;
        }
        String clean = input.replaceAll("\\s+", "").toLowerCase();
        String reverse = new StringBuilder(clean).reverse().toString();
        return clean.equals(reverse);
    }
}
