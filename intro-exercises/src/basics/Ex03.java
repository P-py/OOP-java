package basics;

import java.util.Scanner;

public class Ex03 {
    public static double calculateCircleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius of the circle (cm): ");
        double radius = sc.nextDouble();

        double area = calculateCircleArea(radius);

        System.out.printf("\nThe area of the circle with %.2f cm is: %.2f cm²", radius, area);
    }
}
