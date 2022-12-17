package Data;

public class FoodDB {
    public Food getFood(String foodCode) {

        Food food;

        if(foodCode.equalsIgnoreCase("Mashed Potatoes")){
             food = new Food(foodCode, "Must be homemade... NOT Bob Evans", "12 lbs");
        } else if (foodCode.equalsIgnoreCase("black eye peas")) {
            food = new Food(foodCode, "Not everyone likes these so be prepared to take some home", "5 lbs");
        } else if(foodCode.equalsIgnoreCase("Sweet Potato Casserole")) {
            food = new Food(foodCode,"MUST have marshmallows on top ", "5 lbs");
        } else if(foodCode.equalsIgnoreCase("ham")) {
            food = new Food(foodCode, "A honey baked ham would be a good option", "14 lbs");
        } else {
            food = new Food(foodCode, " ", " ");
        } return food;

    }
}
