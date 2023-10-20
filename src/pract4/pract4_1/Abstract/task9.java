package pract4.pract4_1.Abstract;

// Абстрактный класс для сущности мебель
abstract class Furniture {
    private String name;
    private double price;

    public Furniture(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public abstract void displayInfo();

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

// Подклассы, представляющие разные виды мебели
class Chair extends Furniture {
    private int numberOfLegs;

    public Chair(String name, double price, int numberOfLegs) {
        super(name, price);
        this.numberOfLegs = numberOfLegs;
    }

    @Override
    public void displayInfo() {
        System.out.println("Chair: " + getName() + ", Price: $" + getPrice() + ", Number of Legs: " + numberOfLegs);
    }
}

class Table extends Furniture {
    private int numberOfSeats;

    public Table(String name, double price, int numberOfSeats) {
        super(name, price);
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public void displayInfo() {
        System.out.println("Table: " + getName() + ", Price: $" + getPrice() + ", Number of Seats: " + numberOfSeats);
    }
}

// Класс, моделирующий магазин мебели
class FurnitureShop {
    private Furniture[] inventory;

    public FurnitureShop(int capacity) {
        inventory = new Furniture[capacity];
    }

    public void addFurniture(Furniture furniture, int index) {
        if (index >= 0 && index < inventory.length) {
            inventory[index] = furniture;
        }
    }

    public void displayInventory() {
        System.out.println("Furniture Shop Inventory:");
        for (Furniture furniture : inventory) {
            if (furniture != null) {
                furniture.displayInfo();
            }
        }
    }
}

public class task9 {
    public static void main(String[] args) {
        FurnitureShop shop = new FurnitureShop(3);

        Chair chair = new Chair("Wooden Chair", 50.0, 4);
        Table table = new Table("Dining Table", 150.0, 6);

        shop.addFurniture(chair, 0);
        shop.addFurniture(table, 1);

        shop.displayInventory();
    }
}

