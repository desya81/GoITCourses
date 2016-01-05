package module6;

/**
 * Created by Denis on 05.01.2016.
 */
public class BigNumberFormat extends Exception {
    private int numberValue;

    public BigNumberFormat(int numberValue) {
        this.numberValue = numberValue;
    }


    public int getNumberValue() {
        return numberValue;
    }
}
