package com.company;

import java.util.Scanner;
import java.util.Map;
import java.util.TreeMap;
public class Main {

    /*
       Joshua Woodson
       Enter different cities and 5 day forecast then gives you the avg forecast.
   */
        public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
            int cityNumber = 0;
            Map<String, Double> cities = new TreeMap<>();
            String cityName = " ";
        while (!cityName.equals("END")) {
            System.out.println("Please input a ciy name(Type END to exit)");
            cityName = input.nextLine();
            if (!cityName.equals("END")) {
                cities.put(cityName, 0.0);
            }
        }   for (Map.Entry<String, Double> enter : cities.entrySet()) {
                String city = enter.getKey();
                double temperature = 0;
                double newTemperature = 0;
                System.out.println("List the temps for the next 5 days for this city: " + city);
            for (int i = 1; i < 6; i++) {
                System.out.println("What is the temperature at " + city + " the " + i + " day?");
                temperature = input.nextDouble();
                input.nextLine();
                newTemperature = newTemperature + temperature;
            }
                cities.put(city, (newTemperature / 5));
        }   for (Map.Entry<String, Double> enter : cities.entrySet()) {
                String city = enter.getKey();
                double temperature = enter.getValue();
                System.out.println("City: " + city + "Temperature Avg:" + temperature);
        }
    }
}





