package module11;

/**
 * Created by Denis on 09.02.2016.
 */

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class CaesarCryptographyTest {

    private final int range;
    private String expected;
    private String input;

    public CaesarCryptographyTest(String input, int range, String expected) throws Exception {
        this.expected = expected;
        this.range = range;
        this.input = input;
    }

    @Parameterized.Parameters
    public static Object[][] dataProviderAdd() {
        Object[][] tests = new Object[][] {
                {"test", 5, "test"},
        };
        return tests;
    }

    @Test
    public void testDecoder() throws Exception {
        String encoded = CaesarCryptography.encode(this.input, this.range);
        Assert.assertEquals(this.expected, CaesarCryptography.decode(encoded,  this.range));
    }
}
