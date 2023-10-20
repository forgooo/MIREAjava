package pract14;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class PasswordValidator {
    public static void main(String[] args) {
        String[] testPasswords = {
                "F032_Password",
                "TrySpy1",
                "smart_pass",
                "A007",
                "onlylowercase",
                "ONLYUPPERCASE"
        };

        for (String testPassword : testPasswords) {
            if (isStrongPassword(testPassword)) {
                System.out.println(testPassword + " is a strong password.");
            } else {
                System.out.println(testPassword + " is not a strong password.");
            }
        }
    }

    public static boolean isStrongPassword(String password) {
        String pattern = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d_]{8,}$";
        Pattern passwordPattern = Pattern.compile(pattern);
        Matcher matcher = passwordPattern.matcher(password);
        return matcher.matches();
    }
}
