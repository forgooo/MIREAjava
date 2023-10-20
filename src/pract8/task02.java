package pract8;
import java.util.Scanner;

class PrintNumbersUpToN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите натуральное число n: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}
