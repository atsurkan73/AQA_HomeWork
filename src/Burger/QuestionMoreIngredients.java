package Burger;

public class QuestionMoreIngredients {

    static UserInput userInput;

    public static boolean yes() {
        int baseCost = 50;
        System.out.println("Базовая стоимость Бургера: " + baseCost);
        System.out.println("Заказать дополнительный ингредиент? Введите Y или N");
        userInput = new UserInput();
        String yesOrNo = userInput.input();
                switch (yesOrNo) {
            case "Y":
                System.out.println("\n" + "Выберите дополнительный ингредиент из списка: номер или название");
                return true;
            case "N":
                System.out.println("\n" + "Базовая стоимость Бургера: " + baseCost);
                return false;
            default:
                System.out.println("\n" + "Ваш выбор не распознан");
                return false;
        }
    }

    public static boolean continueOrder() {
        System.out.println("\n" + "Продолжить заказ? Введите Y или N");

        switch (userInput.input()) {
            case "N":
                return false;
            case "Y":
                System.out.println("\n" + "Выберите дополнительный ингредиент из списка: номер или название");
                return true;
            default:
                System.out.println("\n" + "Извините, мы не распознали ваш выбор");
                return true;
        }
    }
}
