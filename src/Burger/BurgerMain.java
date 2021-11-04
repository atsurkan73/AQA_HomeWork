package Burger;


import static Burger.QuestionMoreIngredients.BASECOST;

public class BurgerMain {
    public static void main(String[] args) {

        BonAppetit bonAppetit = new BonAppetit();

        if (!QuestionMoreIngredients.yes()) {
            bonAppetit.wish();
        } else {
            ListOfIngredients.listOfIngredients();

            int more = SelectMoreIngredients.order();

            CalculateMoreIngredients moreIngredients = new CalculateMoreIngredients();

            int sumCost = moreIngredients.more(BASECOST, more);
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

