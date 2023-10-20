package pract13;

public class Task005 {

    public static String convertPhoneNumber(String phoneNumber) {
        // Удаляем все нецифровые символы из входящей строки
        String digitsOnly = phoneNumber.replaceAll("[^0-9]", "");

        // Если длина строки без кода страны не является 10, возвращаем исходный номер
        if (digitsOnly.length() != 10) {
            return phoneNumber;
        }

        // Преобразуем номер в нужный формат
        String countryCode = "+7"; // Для России
        String areaCode = digitsOnly.substring(1, 4);
        String localPart = digitsOnly.substring(4, 7);
        String lineNumber = digitsOnly.substring(7);

        return countryCode + areaCode + "-" + localPart + "-" + lineNumber;
    }

    public static void main(String[] args) {
        String phoneNumber1 = "+79175655655";
        String phoneNumber2 = "+104289652211";
        String phoneNumber3 = "89175655655";

        String convertedNumber1 = convertPhoneNumber(phoneNumber1);
        String convertedNumber2 = convertPhoneNumber(phoneNumber2);
        String convertedNumber3 = convertPhoneNumber(phoneNumber3);

        System.out.println("Converted Number 1: " + convertedNumber1);
        System.out.println("Converted Number 2: " + convertedNumber2);
        System.out.println("Converted Number 3: " + convertedNumber3);
    }
}
