package basics;

import java.util.Scanner;

// Calculate area
public class Ex02 {
    public static double calculateArea(double width, double height) {
        return width * height;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter width: ");
        double width = sc.nextDouble();
        System.out.print("\nEnter height: ");
        double height = sc.nextDouble();

        double area = calculateArea(width, height);

        System.out.printf("\nArea of %.2f m and %.2f m is: %.2f m²", height, width, area);
    }
}
