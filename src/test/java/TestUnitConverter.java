import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestUnitConverter {

    private static UnitConverter uc;

    @BeforeClass
    public static void setup() {
        uc =new UnitConverter();
    }

    @Test
    //test case by SatyadevaNaidu
    public void test_distance_conveter() {
        assertEquals(3, uc.distace_converter(2));
    }

    @Test
    //test case by Jeevan Sai Koushik
    public void test_weight_conveter() {
        assertEquals(11,uc.weight_converter(5));
    }
}
