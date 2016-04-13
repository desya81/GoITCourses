package module2ForEnterprise;

import java.util.*;

/**
 * Created by denys on 12.04.16.
 */
public class ExecutorImpl implements Executor {

    private HashMap<Task, Validator> intTasks = new HashMap<Task, Validator>();

    private Integer countOfValidResult = 0;
    private Integer countOfInvalidResult = 0;

    public ExecutorImpl() {
    }

    @Override
    public void addTask(Task task) {
        this.intTasks.put(task, new DefaultValidator());
    }

    @Override
    public void addTask(Task task, Validator validator) {
        this.intTasks.put(task, validator);
    }

    @Override
    public void execute() {
        Iterator<Map.Entry<Task, Validator>> iterator = this.intTasks.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Task, Validator> pair = iterator.next();
            Task task = pair.getKey();
            Validator validator = pair.getValue();
            task.execute();
            if (validator != null) {
                if(validator.isValid(task.getResult())){
                    this.countOfValidResult++;
                }else{
                    this.countOfInvalidResult++;
                }
            }
            iterator.remove(); // avoids a ConcurrentModificationException
        }
    }

    @Override
    public Integer getValidResults() {
        return this.countOfValidResult;
    }

    @Override
    public Integer getInvalidResults() {
        return this.countOfInvalidResult;
    }
}
