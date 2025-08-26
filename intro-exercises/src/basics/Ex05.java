package basics;

import java.util.Scanner;

public class Ex05 {
    public static final int PRESENT_YEAR = 2025;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name;
        int birthYear;

        System.out.println("Enter your name: ");
        name = sc.nextLine();

        System.out.println("Enter your birth year: ");
        birthYear = sc.nextInt();

        System.out.printf("\n%s, you are %d years old today", name, (PRESENT_YEAR - birthYear));
    }
}
