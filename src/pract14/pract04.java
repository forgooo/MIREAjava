package pract14;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class DigitChecker {
    public static void main(String[] args) {
        String text = "(1+8+2)-9/4";

        // Регулярное выражение для поиска цифр без знака "+"
        String pattern = "\\d(?!\\+)";

        Pattern digitPattern = Pattern.compile(pattern);
        Matcher matcher = digitPattern.matcher(text);

        while (matcher.find()) {
            System.out.println("Найдена цифра без знака \"+\": " + matcher.group());
        }
    }
}
