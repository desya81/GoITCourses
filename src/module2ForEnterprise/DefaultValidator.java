package module2ForEnterprise;

/**
 * Created by denys on 13.04.16.
 */
public class DefaultValidator implements Validator {
    @Override
    public boolean isValid(Object result) {
        if(result != null){
            return true;
        }
        return false;
    }
}
