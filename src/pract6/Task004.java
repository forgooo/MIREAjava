package pract6;

interface Priceable {
    double getPrice();
}

class Product implements Priceable {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}

class Service implements Priceable {
    private String serviceName;
    private double hourlyRate;

    public Service(String serviceName, double hourlyRate) {
        this.serviceName = serviceName;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double getPrice() {
        return hourlyRate; //Price per hour
    }
}

public class Task004 {
    public static void main(String[] args) {
        Priceable product = new Product("Книга", 799);
        Priceable service = new Service("Ремонт", 1000);

        System.out.printf("Цена товара: %.2f\nЦена услуги: %.2f", product.getPrice(), service.getPrice());
    }
}
