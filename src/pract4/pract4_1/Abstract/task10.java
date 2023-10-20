package pract4.pract4_1.Abstract;

abstract class Transport {
    protected String name;
    protected int passengerCapacity;
    protected double cargoCapacity;
    protected double fuelConsumption;

    public Transport(String name, int passengerCapacity, double cargoCapacity, double fuelConsumption) {
        this.name = name;
        this.passengerCapacity = passengerCapacity;
        this.cargoCapacity = cargoCapacity;
        this.fuelConsumption = fuelConsumption;
    }

    public abstract double calculatePassengerTransportCost(int distance);

    public abstract double calculateCargoTransportCost(double weight, int distance);

    public abstract double calculatePassengerTransportTime(int distance);

    public abstract double calculateCargoTransportTime(double weight, int distance);

    public String getName() {
        return name;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }
}


class Car extends Transport {


    public Car(String name, int passengerCapacity, double cargoCapacity, double fuelConsumption) {
        super(name, passengerCapacity, cargoCapacity, fuelConsumption);
    }

    @Override
    public double calculatePassengerTransportCost(int distance) {
        // Расчет стоимости перевозки пассажиров
        return distance * fuelConsumption * 1112; //rubs per liter
    }

    @Override
    public double calculateCargoTransportCost(double weight, int distance) {
        // Расчет стоимости перевозки груза
        return weight + this.calculatePassengerTransportCost(distance);
    }

    @Override
    public double calculatePassengerTransportTime(int distance) {
        // Расчет времени перевозки пассажиров
        return (double) distance / 80; //km per hour
    }

    @Override
    public double calculateCargoTransportTime(double weight, int distance) {
        // Расчет времени перевозки груза
        return calculatePassengerTransportTime(distance);
    }
}

class Airplane extends Transport {
    public Airplane(String name, int passengerCapacity, double cargoCapacity, double fuelConsumption) {
        super(name, passengerCapacity, cargoCapacity, fuelConsumption);
    }

    @Override
    public double calculatePassengerTransportCost(int distance) {
        // Расчет стоимости перевозки пассажиров
        return distance * fuelConsumption * 5499; // rubs per liter
    }

    @Override
    public double calculateCargoTransportCost(double weight, int distance) {
        // Расчет стоимости перевозки груза
        return weight + this.calculatePassengerTransportCost(distance);
    }

    @Override
    public double calculatePassengerTransportTime(int distance) {
        // Расчет времени перевозки пассажиров
        return (double) distance / 700; //km per hour
    }

    @Override
    public double calculateCargoTransportTime(double weight, int distance) {
        // Расчет времени перевозки груза
        return calculatePassengerTransportTime(distance);
    }
}

class Train extends Transport {
    public Train(String name, int passengerCapacity, double cargoCapacity, double fuelConsumption) {
        super(name, passengerCapacity, cargoCapacity, fuelConsumption);
    }

    @Override
    public double calculatePassengerTransportCost(int distance) {
        // Расчет стоимости перевозки пассажиров
        return distance * fuelConsumption * 2399;
    }

    @Override
    public double calculateCargoTransportCost(double weight, int distance) {
        // Расчет стоимости перевозки груза
        return weight + this.calculatePassengerTransportCost(distance);
    }

    @Override
    public double calculatePassengerTransportTime(int distance) {
        // Расчет времени перевозки пассажиров
        return (double) distance / 100;
    }

    @Override
    public double calculateCargoTransportTime(double weight, int distance) {
        // Расчет времени перевозки груза
        return calculatePassengerTransportTime(distance);
    }
}

class Ship extends Transport {
    public Ship(String name, int passengerCapacity, double cargoCapacity, double fuelConsumption) {
        super(name, passengerCapacity, cargoCapacity, fuelConsumption);
    }

    @Override
    public double calculatePassengerTransportCost(int distance) {
        // Расчет стоимости перевозки пассажиров
        return distance * fuelConsumption * 4999;
    }

    @Override
    public double calculateCargoTransportCost(double weight, int distance) {
        // Расчет стоимости перевозки груза
        return weight + this.calculatePassengerTransportCost(distance);
    }

    @Override
    public double calculatePassengerTransportTime(int distance) {
        // Расчет времени перевозки пассажиров
        return (double) distance / 70;
    }

    @Override
    public double calculateCargoTransportTime(double weight, int distance) {
        // Расчет времени перевозки груза
        return calculatePassengerTransportTime(distance);
    }
}

public class task10 {
    public static void main(String[] args) {
        // Пример использования классов и расчета стоимости и времени перевозки
        Car car = new Car("Sedan", 4, 500.0, 8.0);
        Airplane airplane = new Airplane("Boeing 747", 400, 50000.0, 20.0);
        Train train = new Train("Express", 300, 10000.0, 10.0);
        Ship ship = new Ship("Cargo Ship", 50, 200000.0, 15.0);

        int distance = 1000;
        double weight = 500.0;

        System.out.printf("Car Transport Cost: %.2f rub\n", car.calculatePassengerTransportCost(distance));
        System.out.printf("Airplane Transport Cost: %.2f rub\n", airplane.calculatePassengerTransportCost(distance));
        System.out.printf("Train Transport Cost: %.2f rub\n", train.calculatePassengerTransportCost(distance));
        System.out.printf("Ship Transport Cost: %.2f rub\n", ship.calculatePassengerTransportCost(distance));

        System.out.printf("Car Transport Time: %.2f hours\n", car.calculatePassengerTransportTime(distance));
        System.out.printf("Airplane Transport Time:  %.2f hours\n", airplane.calculatePassengerTransportTime(distance));
        System.out.printf("Train Transport Time:  %.2f hours\n", train.calculatePassengerTransportTime(distance));
        System.out.printf("Ship Transport Time:  %.2f hours\n", ship.calculatePassengerTransportTime(distance));
    }
}

