package pract3;
import java.util.*;

class Main {
    public static void main(String[] args) {
        //t1.start();
        //Tester.start();
        //t3.start();
        t4.start();
    }
}

class t1 {
    public static void start() {
        double[] data = new double[10];
        double buff;
        Random r = new Random();
        for (double item : data) {
            item = Math.random();
        }
        outData(data);
        for (int i = 0; i < data.length; i++) {
            for (int j = 1; j < (data.length - i); j++) {
                if (data[j - 1] > data[j]) {
                    buff = data[j - 1];
                    data[j - 1] = data[j];
                    data[j] = buff;
                }
            }
        }
        outData(data);
        for (double item : data) {
            item = r.nextDouble();
        }
        outData(data);
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - 1 - i; j++) {
                if (data[j] > data[j + 1]) {
                    buff = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = buff;
                }
            }
        }
        outData(data);
    }

    public static void outData(double[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%s ", data[i]);
        }
        System.out.println();
    }
}

class Point {
    private double x;
    private double y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    @Override
    public String toString() {
        return String.format("x=%f y=%f", this.x, this.y);
    }
}

class Circle {
    private Point point;
    private double radius;

    Circle() {
        setRandomPoint();
        setRandomRadius();
    }

    public void setRandomPoint() {
        this.point = new Point(Math.random() * 1000, Math.random() * 1000);
    }

    public void setRandomRadius() {
        this.radius = Math.random() * 1000;
    }

    public Point getPoint() {
        return this.point;
    }

    public double getRadius() {
        return this.radius;
    }
}

class Tester {
    public static ArrayList<Circle> data = new ArrayList<>();
    public static void start() {
        for (int i = 0; i < 10; i++) {
            data.add(new Circle());
            System.out.printf("%s r=%f\n", data.get(i).getPoint().toString(), data.get(i).getRadius());
        }
        findMaxRadius();
    }

    public static void findMaxRadius(){
        Circle maxRadiusCircle = data.get(0);
        for (int i = 1; i < 10; i++) {
            if(data.get(i).getRadius() > maxRadiusCircle.getRadius()){
                maxRadiusCircle = data.get(i);
            }
        }
        System.out.printf("Circle with max radius is %s r=%f", maxRadiusCircle.getPoint().toString(), maxRadiusCircle.getRadius());
    }

    public static void findMinRadius(){
        Circle minRadiusCircle = data.get(0);
        for (int i = 1; i < 10; i++) {
            if(data.get(i).getRadius() < minRadiusCircle.getRadius()){
                minRadiusCircle = data.get(i);
            }
        }
        System.out.printf("Circle with min radius is %s r=%f", minRadiusCircle.getPoint().toString(), minRadiusCircle.getRadius());
    }
}

class t3{
    public static void start(){
        ArrayList<Integer> data = new ArrayList<Integer>(4);
        ArrayList<Integer> datatmp = new ArrayList<Integer>(4);
        Random r = new Random();
        for(int i = 0; i < 4; i++){
            data.add(r.nextInt(89)+10);
            datatmp.add(data.get(i));
        }
        Collections.sort(data);
        if(data.equals(datatmp)) System.out.println("Yes");
        else System.out.println("No");
    }
}

class t4{
    public static void start(){
        Scanner sc = new Scanner(System.in);
        int n;
        while (true){
            n = sc.nextInt();
        }
    }
}
