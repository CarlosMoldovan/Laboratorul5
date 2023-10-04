package CalculateGrade;

import java.util.Scanner;

public class main1 {
    public static void main(String[] args) {
        Grade grade = new Grade();
        Scanner sc = new Scanner(System.in);
        /*double gradeCelcius, gradeFahrenheit;
        int meniu = 10;

        while (meniu != 0) {
            System.out.println("0.Iesire");
            System.out.println("1.Convertor Celcius to Fahrenheit");
            System.out.println("2.Convertor Fahrenheit to Celcius");
            System.out.println("Introdu o opțiune:");
            meniu = sc.nextInt();
            sc.nextLine(); // Consume the newline character

            switch (meniu) {
                case 0:
                    break;
                case 1:
                    System.out.println("Introdu gradele Celsius:");
                    gradeCelcius = sc.nextDouble();
                    System.out.println(gradeCelcius + " grade Celsius sunt " + grade.convertCtoF(gradeCelcius) + " grade Fahrenheit");
                    break;
                case 2:
                    System.out.println("Introdu gradele Fahrenheit:");
                    gradeFahrenheit = sc.nextDouble();
                    System.out.println(gradeFahrenheit + " grade Fahrenheit sunt " + grade.convertFtoC(gradeFahrenheit) + " grade Celsius");
                    break;
                default:
                    System.out.println("Opțiune invalidă. Te rog să introduci din nou.");
            }
        }*/

        sc.close();
    }
}
