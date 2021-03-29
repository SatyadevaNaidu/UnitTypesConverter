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
}
