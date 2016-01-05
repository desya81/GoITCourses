package module4.home2;

/**
 * Created by denys on 28.12.15.
 */
public class Fahrenheit {

    protected double temperature;

    public Fahrenheit(double temperature) {
        this.temperature = temperature;
    }

    public Fahrenheit(){

    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double toCelsius(){
        return (this.temperature - 32) / 1.8;
    }

    public double getTemperature() {
        return this.temperature;
    }
}
