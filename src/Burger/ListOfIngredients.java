package Burger;

import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ListOfIngredients {

    public static void getList() {
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

            {

                HashMap<Integer, String> listOfIngrefients = new HashMap<>();
                listOfIngrefients.put(1, "KOTLETA");
                listOfIngrefients.put(2, "SOUSE");
                listOfIngrefients.put(3, "CHEESE");

                HashMap<String, Integer> priceOfIngrefients = new HashMap<>();
                priceOfIngrefients.put("KOTLETA", 30);
                priceOfIngrefients.put("SOUSE", 10);
                priceOfIngrefients.put("CHEESE", 20);


            {
                for (Map.Entry<Integer, String> entry1 : listOfIngrefients.entrySet())

                    for (Map.Entry<String, Integer> entry2 : priceOfIngrefients.entrySet())

                            if (entry1.getValue().equals(entry2.getKey()))

                                System.out.println(entry1.getKey() + ". " + " - " + " " + entry2.getKey() + " " + entry2.getValue());

                }
            }
        }
    }
}