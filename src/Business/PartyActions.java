package Business;

import Data.Food;
import Data.FoodDB;

import java.util.Scanner;

public class PartyActions {
    private static Scanner scanner = new Scanner(System.in);

    public static void gifts() {
        System.out.println("Due to the amount of people coming, we have decided that it would be financially responsible to only buy for children this year.");
        System.out.print("Please enter the child's age to see if they deserve a gift: ");

        int childAge = scanner.nextInt();

        if (childAge <= 15){
            System.out.println("Congratulations! You have been approved to buy a gift!");
        } else if (childAge > 15){
            System.out.println("Sorry, they are are too old to receive a gift");
        }
    }

    public static void food() {
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("We will need everyone to bring a dish for the meal. (Except for Karen...you can't cook, Sweetheart)");
        System.out.println("*****MENU*****");
        System.out.println("Mashed Potatoes");
        System.out.println("Black eye peas");
        System.out.println("Sweet Potato Casserole");
        System.out.println("Ham");

        System.out.print("\nWhat do you want to make?: ");
        String foodDescription = scanner2.nextLine();

        FoodDB db = new FoodDB();
        Food food = db.getFood(foodDescription);

        System.out.println("\nYou have chosen to bring: "+ food.getCode());
        System.out.println("Amount: "+ food.getAmount());
        System.out.println("Side note: " + food.getDescription());

    }
}
