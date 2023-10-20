package pract8;

import java.util.Scanner;

class PrintNumbersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число A: ");
        int A = scanner.nextInt();

        System.out.print("Введите целое число B: ");
        int B = scanner.nextInt();

        if (A < B) {
            for (int i = A; i <= B; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = A; i >= B; i--) {
                System.out.println(i);
            }
        }
    }
}
