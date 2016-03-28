import module1ForEnterprise.ObjectService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 * Created by denys on 22.03.16.
 */
@RunWith(Parameterized.class)
public class ObjectCalculationTest {

    String expected = null;
    ObjectService objService = null;

    public ObjectCalculationTest(int counter, String expected){
        this.objService = new ObjectService(counter);
    }

    @Parameterized.Parameters
    public static Object[][] dataProviderAdd() {
        Object[][] tests = new Object[][] {
                {10000, "test"},
        };
        return tests;
    }

    @Test
    public void testAddCounter() throws Exception {
        this.objService.showResultTable();
    }

}
