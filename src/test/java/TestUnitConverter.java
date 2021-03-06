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
    public void test_distance_converter(){
        assertEquals(3, uc.distance_converter(2));
    }
    @Test
    public void test_weight_converter() {
        assertEquals(11,uc.weight_converter(5));
    }
    @Test
    public void test_temperature_converter() {
        assertEquals(68,uc.temperature_converter(20));
    }
    @Test
    public void test_volume_converter() {
        assertEquals(1,uc.volume_converter(4));
    }
}
