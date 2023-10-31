package bowlcreatorkata;

public enum IngredientEnum {
    BROWN_RICE("Brown Rice"),
    YOGURT("Yogurt"),
    TOFU("Tofu"),
    YOGURT_DRESSING("Yogurt dressing"),
    OATS("Oats"),
    MUSHROOMS("Mushrooms"),
    KALE("Kale"),
    WHEAT("Wheat"),
    HAZELNUTS("Hazelnuts"),
    TAHINI_LEMON_DRESSING("Tahini Lemon dressing");

    private final String name;

    IngredientEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}