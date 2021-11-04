package Burger;

public class CalculateMoreIngredients {
//    public static int baseCost = 50;

    public static int more(int baseCost , int ingredientCost) {
        baseCost += ingredientCost;
        System.out.println("Суммарная стоимость бургера: " + baseCost);
        return baseCost;
    }
}

