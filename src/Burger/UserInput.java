package Burger;

import java.util.Scanner;

public class UserInput {
    public static String input(){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.println("\n" + "Вы ввели: " + input);
        return (input);
    }
}
