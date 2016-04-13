package module2ForEnterprise;

/**
 * Created by denys on 13.04.16.
 */
public class StringValidator implements Validator {
    @Override
    public boolean isValid(Object result) {
        if(result instanceof String){
            return true;
        }
        return false;
    }
}
