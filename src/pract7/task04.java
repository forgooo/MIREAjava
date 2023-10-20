package pract7;

interface MathCalculable {
    double power(double base, double exponent);
    double calculateComplexNumberModule(double realPart, double imaginaryPart);
    double getPi();
}

class MathFunc implements MathCalculable {
    @Override
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    @Override
    public double calculateComplexNumberModule(double realPart, double imaginaryPart) {
        return Math.sqrt(realPart * realPart + imaginaryPart * imaginaryPart);
    }

    @Override
    public double getPi() {
        return Math.PI;
    }

    public double calculateCircleLength(double radius) {
        return 2 * getPi() * radius;
    }
}

class task04{
    public static void main(String[] args) {
        MathCalculable mc1 = new MathFunc();
        System.out.println("Power of 2 raised to 3: " + mc1.power(2, 3));
        System.out.println("Module of complex number (3, 4): " + mc1.calculateComplexNumberModule(3, 4));

        double radius = 5.0;
        double circleLength = ((MathFunc) mc1).calculateCircleLength(radius);
        System.out.println("Circle length with radius " + radius + " is: " + circleLength);
    }
}
