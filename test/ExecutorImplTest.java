import module2ForEnterprise.ExecutorImpl;
import module2ForEnterprise.LongTask;
import module2ForEnterprise.NumberValidator;
import module2ForEnterprise.StringValidator;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by denys on 13.04.16.
 */
public class ExecutorImplTest {

    private ExecutorImpl executor = new ExecutorImpl();

    @Test
    public void testValidResults() throws Exception {
        this.executor.addTask(new LongTask(10L));
        this.executor.addTask(new LongTask(20L), new NumberValidator());
        this.executor.addTask(new LongTask(30L), new NumberValidator());
        this.executor.execute();
        Integer result = this.executor.getValidResults();
        Assert.assertTrue(3 == result);
    }

    @Test
    public void testInvalidResults() throws Exception {
        this.executor.addTask(new LongTask(1L), new StringValidator());
        this.executor.execute();
        Integer result = this.executor.getInvalidResults();
        Assert.assertTrue(1 == result);
    }

    @Test(expected = Exception.class)
    public void testAssertions() throws Exception {
        this.executor.addTask(new LongTask(10L));
        this.executor.addTask(new LongTask(10L));
    }
}
