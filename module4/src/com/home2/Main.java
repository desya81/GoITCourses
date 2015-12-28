package com.home2;

/**
 * Created by denys on 28.12.15.
 */
public class Main {

    public static void main(String[] args){
        Temperature temperature = new Temperature(new Celsius(), new Fahrenheit());
        double res1 = temperature.createCelsius(100).toFarenheit();
        double res2 = temperature.createFahrenheit(res1).toCelsius();
        System.out.println("Celsius with temperature " + temperature.getCelsiusTemperature() + " equal " + res1 + " by Farenheit");
        System.out.println("Farenheit with temperature " + temperature.getFarenheitTemperature() + " equal " + res2 + " by Celsius");
    }
}
