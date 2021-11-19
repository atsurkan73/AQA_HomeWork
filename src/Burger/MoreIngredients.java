package Burger;

import java.util.Scanner;

public class MoreIngredients {

    public final static int BASECOST = 50;


    public static String input() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.println("\n" + "Вы ввели: " + input);
        return (input);
    }

    public static boolean orderMore() {

        System.out.println("Заказать дополнительный ингредиент? Введите Y или N");


        switch (input()) {
            case "Y":
                System.out.println("\n" + "Выберите дополнительный ингредиент из списка: номер или название");
                return true;
            case "N":
                System.out.println("\n" + "Базовая стоимость Бургера: " + BASECOST);
                return false;
            default:
                System.out.println("\n" + "Ваш выбор не распознан");
                return false;
        }
    }

    public static int calculateMoreIngredients(int baseCost, int ingredientCost) {
        baseCost += ingredientCost;
        System.out.println("Суммарная стоимость бургера: " + baseCost);
        return baseCost;
    }

    public static int order() {

        switch (input()) {
            case "1":
            case "KOTLETA":
                System.out.println("KOTLETA стоит " + " " + 30);
                return 30;
            case "2":
            case "SOUSE":
                System.out.println("SOUSE стоит " + " " + 10);
                return 10;
            case "3":
            case "CHEESE":
                System.out.println("CHEESE стоит " + " " + 20);
                return 20;
            default:
                System.out.println("Ваш выбор не распознан");
                return 0;
        }
    }

    public static void bonAppetit() {
        System.out.println("Приятного аппетита!");
    }
}
