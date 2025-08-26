package basics;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double minimumWage;
        double consumedEnergy;
        double baseTax;
        double energyDebt;

        System.out.println("Let's calculate the base energy unit tax...");
        System.out.println("Each kW of energy costs 1/500 of the minimum wage");

        System.out.println("Enter the minimum wage value in your country: ");
        minimumWage = sc.nextDouble();

        System.out.println("How many kW of energy did you consume last month: ");
        consumedEnergy = sc.nextDouble();

        baseTax = minimumWage/500;
        energyDebt = consumedEnergy * baseTax;

        System.out.printf("\nThe base energy unit tax is %.2f $", baseTax);
        System.out.printf("\nYou should pay %.2f $ this month", energyDebt);
        System.out.printf("\nIf you have a 15%% discount you should pay %.2f $", (energyDebt*0.85));
    }
}
