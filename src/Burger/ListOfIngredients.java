package Burger;

import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ListOfIngredients {
    public static void listOfIngredients() {
        int i = 1;
        try {
            FileReader fileReader = new FileReader("BurgerIngredientsList.txt");
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.print(i + ". " + line + "\n");
                i++;
            }
            fileReader.close();
        } catch (Exception e) {
            HashMap<String, Integer> inputMap = new HashMap<>();
            inputMap.put("KOTLETA", 50);
            inputMap.put("SOUSE", 20);
            inputMap.put("CHEESE", 30);

            for (Map.Entry<String, Integer> entry : inputMap.entrySet()) {
                System.out.println(i++ + ". " + entry.getKey() + " - " + entry.getValue());
            }
        }
    }
}