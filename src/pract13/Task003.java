package pract13;

import java.util.StringTokenizer;
public class Task003{
    public static void main(String[] args) {
        // Примеры использования с разными разделителями
        String addressString1 = "Страна, Регион, Город, Улица, Дом, Корпус, Квартира";
        String addressString2 = "Страна; Регион; Город; Улица; Дом; Корпус; Квартира";

        Address address1 = new Address(addressString1, ","); // Используем запятую в качестве разделителя
        Address address2 = new Address(addressString2, ";"); // Используем точку с запятой в качестве разделителя

        // Печать адресов
        System.out.println("Адрес 1:");
        System.out.println(address1);
        System.out.println("Адрес 2:");
        System.out.println(address2);
    }

}
class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String building;
    private String apartment;

    // Конструктор, который принимает адресную строку и разбирает ее
    public Address(String addressString, String delimiter) {
        String[] parts = addressString.split(delimiter);
        if (parts.length >= 7) {
            country = parts[0].trim();
            region = parts[1].trim();
            city = parts[2].trim();
            street = parts[3].trim();
            house = parts[4].trim();
            building = parts[5].trim();
            apartment = parts[6].trim();
        } else {
            System.out.println("Неверный формат адреса");
        }
    }
    // Переопределяем метод toString() для вывода адреса
    @Override
    public String toString() {
        return "Страна: " + country +
                "\nРегион: " + region +
                "\nГород: " + city +
                "\nУлица: " + street +
                "\nДом: " + house +
                "\nКорпус: " + building +
                "\nКвартира: " + apartment;
    }
}
