package PersonalMeals;

public class MealType {
    //attributes
    private String mealOfDay;
    private String category;
    private String name;
    private double calories;
    private static double allCalories = 0;

    //constructor
    public MealType(String mealOfDay, String category, String name, double calories) {
        this.mealOfDay = mealOfDay;
        this.category = category;
        this.name = name;
        this.calories = calories;
        allCalories += calories;
    }

    public static double getAllCalories() {
        return allCalories;
    }

    @Override
    public String toString() {
        return mealOfDay + "\t" + category + "\t" + name + "\t" + calories + "\n";
    }
}
