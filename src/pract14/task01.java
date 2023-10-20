package pract14;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class StringSplitter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку:");
        String input = scanner.nextLine();

        System.out.println("Введите регулярное выражение для разделения:");
        String regex = scanner.nextLine();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        System.out.println("Элементы после разбиения:");

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
