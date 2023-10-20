package pract14;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class PriceExtractor {
    public static void main(String[] args) {
        String text = "Список цен: 25.98 USD, 500 RUB, 10.75 EUR. И так далее...";

        // Регулярные выражения для поиска цен в USD, RUB и EU
        String usdPattern = "\\d+(\\.\\d{1,2})? USD";
        String rubPattern = "\\d+ RUB";
        String euPattern = "\\d+(\\.\\d{1,2})? EUR";

        Pattern patternUSD = Pattern.compile(usdPattern);
        Pattern patternRUB = Pattern.compile(rubPattern);
        Pattern patternEU = Pattern.compile(euPattern);

        Matcher matcherUSD = patternUSD.matcher(text);
        Matcher matcherRUB = patternRUB.matcher(text);
        Matcher matcherEU = patternEU.matcher(text);

        System.out.println("Цены в USD:");
        while (matcherUSD.find()) {
            System.out.println(matcherUSD.group());
        }

        System.out.println("\nЦены в RUB:");
        while (matcherRUB.find()) {
            System.out.println(matcherRUB.group());
        }

        System.out.println("\nЦены в EUR:");
        while (matcherEU.find()) {
            System.out.println(matcherEU.group());
        }
    }
}
