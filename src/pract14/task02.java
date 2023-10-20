package pract14;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class StringChecker {
    public static void main(String[] args) {
        String pattern = "abcdefghijklmnopqrstuv18340";
        String[] testStrings = {
                "abcdefghijklmnopqrstuv18340",
                "abcdefghijklmnoasdfasdpqrstuv18340.",
                "xyzabcdefghijklmnopqrstuv18340"
        };

        for (String testString : testStrings) {
            if (checkString(testString, pattern)) {
                System.out.println(testString + " is a valid match.");
            } else {
                System.out.println(testString + " is not a valid match.");
            }
        }
    }

    public static boolean checkString(String input, String pattern) {
        Pattern regexPattern = Pattern.compile("^" + pattern + "$");
        Matcher matcher = regexPattern.matcher(input);
        return matcher.matches();
    }
}
