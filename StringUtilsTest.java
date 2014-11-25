import org.junit.*;
import org.junit.Assert.*;

public class StringUtilsTest {

    @Test
    public void join() {
        Assert.assertEquals("Joins an array by a delimiter.",
                            "butter, milk, eggs",
                            StringUtils.join(new String[] {"butter", "milk", "eggs"}, ", "));
    }

}
