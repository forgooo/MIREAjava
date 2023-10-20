package pract6;

interface Nameable {
    String getName();
}
class Planet implements Nameable {
    private String name;

    public Planet(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}

class Car implements Nameable {
    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}

class Animal implements Nameable {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}

public class Task003 {
    public static void main(String[] args) {
        Nameable planet = new Planet("Земля");
        Nameable car = new Car("Toyota");
        Nameable animal = new Animal("Лев");

        System.out.println("Планета: " + planet.getName());
        System.out.println("Машина: " + car.getName());
        System.out.println("Животное: " + animal.getName());
    }
}

