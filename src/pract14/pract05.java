package pract14;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class DateValidator {
    public static void main(String[] args) {
        String[] testDates = {
                "29/02/2000",
                "30/04/2003",
                "01/01/2003",
                "29/02/2001",
                "30-04-2003",
                "1/1/1899"
        };

        for (String testDate : testDates) {
            if (isValidDate(testDate)) {
                System.out.println(testDate + " is a valid date.");
            } else {
                System.out.println(testDate + " is not a valid date.");
            }
        }
    }

    public static boolean isValidDate(String input) {
        String pattern = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/((19|20)\\d{2}|9999)$";
        Pattern datePattern = Pattern.compile(pattern);
        Matcher matcher = datePattern.matcher(input);
        return matcher.matches();
    }
}
