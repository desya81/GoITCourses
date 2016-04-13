package module2ForEnterprise;

import java.util.HashMap;

/**
 * Created by denys on 12.04.16.
 */
public class LongTask implements Task {

    protected Long value;
    public static HashMap<Long, Boolean> tmpStore = new HashMap<Long, Boolean>();

    public LongTask(Long value) throws Exception {
        if(this.tmpStore.containsKey(value) && this.tmpStore.get(value)){
            throw new Exception("Value already executed");
        }
        this.value = value;
    }

    @Override
    public void execute() {
        this.tmpStore.put(this.value, true);
        this.value *= 2;
    }

    @Override
    public Long getResult() {
        return this.value;
    }
}
