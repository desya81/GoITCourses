package module4.home2;

/**
 * Created by denys on 28.12.15.
 */
public class Temperature {

    protected Celsius celsius;
    protected Fahrenheit fahrenheit;

    public Temperature(Celsius celsius, Fahrenheit fahrenheit) {
        this.celsius = celsius;
        this.fahrenheit = fahrenheit;
    }

    public Celsius createCelsius(double temperature){
        this.celsius.setTemperature(temperature);
        return this.celsius;
    }

    public Fahrenheit createFahrenheit(double temperature){
        this.fahrenheit.setTemperature(temperature);
        return this.fahrenheit;
    }

    public double toFarenheit(){
        return this.celsius.toFarenheit();
    }

    public double toCelsius(double temperature){
        return this.fahrenheit.toCelsius();
    }

    public double getCelsiusTemperature() {
        return this.celsius.getTemperature();
    }

    public double getFarenheitTemperature() {
        return this.fahrenheit.getTemperature();
    }
}
