package Burger;

import java.io.IOException;

public class BurgerMain {
    public static void main(String[] args) throws IOException {
        int baseCost = 50;

        BonAppetit bonAppetit = new BonAppetit();

        if (!QuestionMoreIngredients.yes()) {
            bonAppetit.wish();
        } else {
            ListOfIngredients.listOfIngredients();

            int more = SelectMoreIngredients.order();

            CalculateMoreIngredients moreIngredients = new CalculateMoreIngredients();

            int sumCost = moreIngredients.more(baseCost, more);
            if (QuestionMoreIngredients.continueOrder()) {
                ListOfIngredients.listOfIngredients();

                moreIngredients.more(sumCost, SelectMoreIngredients.order());
                bonAppetit.wish();
            } else {
                System.out.println("Суммарная стоимость бургера: " + sumCost);
                bonAppetit.wish();
            }
        }
    }
}

