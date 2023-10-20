package pract4.pract4_1;

public class task1 {
    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println(c.getArea());
    }
}

class Shape {
    protected String type;
    protected double area;
    protected double perimeter;

    String getType() {
        return this.type;
    }

    double getArea() {
        return this.area;
    }

    ;

    double getPerimeter() {
        return this.perimeter;
    }
}

class Circle extends Shape {
    double radius = 5;

    @Override
    double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape {
    double a = 5;
    double b = 10;

    @Override
    double getArea() {
        return a * b;
    }

    @Override
    double getPerimeter() {
        return 2 * (a + b);
    }
}

class Square extends Shape {
    double a = 5;

    @Override
    double getArea() {
        return Math.pow(a, 2);
    }

    @Override
    double getPerimeter() {
        return 4 * a;
    }
}
