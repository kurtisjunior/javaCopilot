package bowlcreatorkata;

import java.util.List;

public class BuddhaBowl {
    private List<Ingredient> ingredients;

    public BuddhaBowl(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }
}