package module2ForEnterprise;

/**
 * Created by denys on 13.04.16.
 */
public class NumberValidator implements Validator {
    @Override
    public boolean isValid(Object result) {
        if(result instanceof Number){
            return true;
        }
        return false;
    }
}
