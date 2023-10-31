package bowlcreatorkata;

import static org.junit.Assert.assertNotNull;

import java.util.Arrays;

import org.junit.Test;

public class AppTest {
    @Test
    public void testAppCreatesBuddhaBowl() {
        Ingredient ingredient1 = new Ingredient("Brown Rice");
        Ingredient ingredient2 = new Ingredient("Kidney Beans");

        BuddhaBowl bowl = new BuddhaBowl(
                Arrays.asList(
                        ingredient1,
                        ingredient2));

        assertNotNull(bowl);
    }

    // write a test for the exception
    @Test(expected = BuddhaBowlException.class)
    public void testAppThrowsExceptionWhenIngredientsDontMix() throws BuddhaBowlException {
        Ingredient ingredient1 = new Ingredient("Tofu");
        Ingredient ingredient2 = new Ingredient("Yogurt dressing");

        App.createBuddhaBowl(
                Arrays.asList(
                        ingredient1,
                        ingredient2));
    }
}