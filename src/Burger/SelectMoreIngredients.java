package Burger;

public class SelectMoreIngredients {

    public static int order() {

        UserInput userInput = new UserInput();

        switch (userInput.input()) {
            case "1":
                System.out.println("KOTLETA стоит " + " " + 30);
                return 30;
            case "2":
                System.out.println("SOUSE стоит " + " " + 10);
                return 10;
            case "3":
                System.out.println("CHEESE стоит " + " " + 20);
                return 20;
            case "KOTLETA":
                System.out.println("KOTLETA стоит " + " " + 30);
                return 30;
            case "SOUSE":
                System.out.println("SOUSE стоит " + " " + 10);
                return 10;
            case "CHEESE":
                System.out.println("CHEESE стоит " + " " + 20);
                return 20;
            default:
                System.out.println("Ваш выбор не распознан");
                return 0;
        }
    }
}