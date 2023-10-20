package pract8;
class PrintNumber{
    public static void main(String[] args) {
        int n = 150;
        printNumberReqursive(n);
    }

    public static void printNumberReqursive(int n) {
        if (n == 0) return;
        System.out.print(n % 10 + " ");
        printNumberReqursive(n / 10);
    }
}