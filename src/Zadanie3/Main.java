package Zadanie3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        TemperatureConverter tc = new TemperatureConverter();
        Scanner sc = new Scanner(System.in);

        System.out.println("Wybierz konwersję:");
        System.out.println("1: Celsjusz - Kelvin");
        System.out.println("2: Kelvin - Celsjusz");
        System.out.println("3: Celsjusz - Fahrenheit");
        System.out.println("4: Fahrenheit - Celsjusz");
        System.out.println("5: Kelvin - Fahrenheit");
        System.out.println("6: Fahrenheit - Kelvin");

        int option = sc.nextInt();

        System.out.print("Podaj temperaturę: ");

        double temperature = sc.nextDouble();

        switch (option){
            case 1:
                System.out.println(temperature + " stopni Celsjusza to " + tc.celciusToKelvin(temperature) + " Kelvinów.");
                break;
            case 2:
                System.out.println(temperature + " Kelvinów " + tc.kelvinToCelcius(temperature) + " stopni Celsjusza.");
                break;
            case 3:
                System.out.println(temperature + " stopni Celsjusza to " + tc.celciusToFahrenheit(temperature) + " stopni Fahrenheita.");
                break;
            case 4:
                System.out.println(temperature + " stopni Fahrenheita to " + tc.fahrenheitToCelcius(temperature) + " stopni Celsjusza.");
                break;
            case 5:
                System.out.println(temperature + " Kelvinów to " + tc.kelvinToFahrenheit(temperature) + " stopni Fahrenheita.");
                break;
            case 6:
                System.out.println(temperature + " stopni Fahrenheita to " + tc.fahrenheitToKelvin(temperature) + " Kelvinów.");
        }


    }
}
