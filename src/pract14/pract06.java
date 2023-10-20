package pract14;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class EmailValidator {
    public static void main(String[] args) {
        String[] testEmails = {
                "user@example.com",
                "root@localhost",
                "myhost@@@com.ru",
                "@my.ru",
                "Julia String"
        };

        for (String testEmail : testEmails) {
            if (isValidEmail(testEmail)) {
                System.out.println(testEmail + " is a valid email address.");
            } else {
                System.out.println(testEmail + " is not a valid email address.");
            }
        }
    }

    public static boolean isValidEmail(String input) {
        String pattern = "^[\\w\\.-]+@[\\w\\.-]+\\.[A-Za-z]{2,}$";
        Pattern emailPattern = Pattern.compile(pattern);
        Matcher matcher = emailPattern.matcher(input);
        return matcher.matches();
    }
}
