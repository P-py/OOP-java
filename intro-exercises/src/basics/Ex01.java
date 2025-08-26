package basics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Calculate averages
public class Ex01 {
    public static double calculateAverage(List<Double> numbers) {
        double sum = 0.0;
        int size = numbers.size();

        for (Double number : numbers) {
            sum += number;
        }

        return sum / size;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double> numbers = new ArrayList<Double>();

        System.out.println("Type in how many numbers you would like to get the average of: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.printf("\nType in number %d: ", i+1);
            numbers.add(sc.nextDouble());
        }

        System.out.printf("\nFinal average: %.2f", calculateAverage(numbers));
    }
}
