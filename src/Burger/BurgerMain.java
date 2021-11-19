package Burger;


import static Burger.MoreIngredients.*;//import static Burger.UserInput.bonAppetit;

public class BurgerMain {
    public static void main(String[] args) {

        if (!MoreIngredients.orderMore()) {
            bonAppetit();
        } else {
            ListOfIngredients.getList();

            int more = MoreIngredients.order();

            int sumCost = calculateMoreIngredients(BASECOST, more);
            if (MoreIngredients.orderMore()) {
                ListOfIngredients.getList();

                calculateMoreIngredients(sumCost, MoreIngredients.order());
                bonAppetit();
            } else {
                System.out.println("Суммарная стоимость бургера: " + sumCost);
                bonAppetit();
            }
        }
    }
}

