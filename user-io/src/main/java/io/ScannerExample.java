import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Different data types
        int x = sc.nextInt();
        double y = sc.nextDouble();
        String z = sc.next();

        System.out.println("Integer: " + x);
        System.out.println("Double: " + y);
        System.out.println("String: " + z);

        sc.close(); // Always close the scanner
    }
}