package ch1;

public class printOut {
    public static void main(String[] args) {
        print(12345);
    }

    public static void print(int n) {
        if (n >= 10) {
            print( n / 10);
        }

        printDigital(n % 10);
    }

    public static void printDigital(int n) {
        System.out.print(n);
    }
}
