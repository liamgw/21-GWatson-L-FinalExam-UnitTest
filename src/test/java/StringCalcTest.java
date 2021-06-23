import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class StringCalcTest {

    private StringCalculator stringCalc;

    @BeforeEach
    public void setUp() {
        stringCalc = new StringCalculator();
    }

    @AfterEach
    public void tearDown() {
        stringCalc = null;
    }

    @Test
    public void testNegative() {
        assertThrows(IllegalArgumentException.class,() -> stringCalc.add("-1,5"));
    }

    @Test
    public void testBig() {
        assertEquals(1, stringCalc.add("1, 1001"));
    }


}
