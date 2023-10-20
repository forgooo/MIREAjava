package pract8;
import java.util.Scanner;

class TriangularSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество членов последовательности (n): ");
        int n = scanner.nextInt();

        int currentNumber = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(currentNumber + " ");
            }
            currentNumber++;
        }
    }
}
