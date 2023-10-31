package bowlcreatorkata;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;

public class BuddhaBowlTest {

    // write me a canary test
    @Test
    public void canary() {
        assertTrue(true);
    }

    // write me a test that verifies that the BuddhaBowl class exists
    @Test
    public void testBuddhaBowlClassExists() throws BuddhaBowlException {
        BuddhaBowl bowl = new BuddhaBowl(
                Arrays.asList(
                        new Ingredient("Brown Rice"),
                        new Ingredient("Kidney Beans"),
                        new Ingredient("Kale"),
                        new Ingredient("Tomato"),
                        new Ingredient("Sesame"),
                        new Ingredient("Tahini Lemon")));
        assertNotNull(bowl);
    }
}
