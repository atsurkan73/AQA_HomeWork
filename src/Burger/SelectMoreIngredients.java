package Burger;

public class SelectMoreIngredients {

    public static int order() {

        UserInput userInput = new UserInput();

        switch (userInput.input()) {
            case "1":
                System.out.println("KOTLETA стоит " + " " + 50);
                return 50;
            case "2":
                System.out.println("SOUSE стоит " + " " + 20);
                return 20;
            case "3":
                System.out.println("CHEESE стоит " + " " + 30);
                return 30;
            case "KOTLETA":
                System.out.println("KOTLETA стоит " + " " + 50);
                return 50;
            case "SOUSE":
                System.out.println("SOUSE стоит " + " " + 20);
                return 20;
            case "CHEESE":
                System.out.println("CHEESE стоит " + " " + 30);
                return 30;
            default:
                System.out.println("Ваш выбор не распознан");
                return 0;
        }
    }
}