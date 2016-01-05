package module4.home2;

/**
 * Created by denys on 28.12.15.
 */
public class Celsius {

    protected double temperature;

    public Celsius(double temperature) {
        this.temperature = temperature;
    }

    public Celsius(){

    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double toFarenheit(){
        return (this.temperature * 1.8) + 32;
    }

    public double getTemperature() {
        return this.temperature;
    }
}
