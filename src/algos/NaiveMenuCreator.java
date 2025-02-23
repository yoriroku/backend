package algos;

import data.day.Meal;
import data.day.MealDay;
import data.day.MealType;
import data.dish.Dish;
import data.user.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NaiveMenuCreator implements IMenuCreator {

    public List<Meal> CreateMenu(User user, List<Dish> possibleDishes, Date from, Date to) {
        var excludeProducts = user.excludeProductTypes;

        var possibleDishesWOUserExclude = new ArrayList<Dish>();
        var allBreakfasts = possibleDishesWOUserExclude.stream().allMatch(dish -> dish.mealTypes.contains(MealType.BREAKFAST));
        var allLunches = possibleDishesWOUserExclude.stream().allMatch(dish -> dish.mealTypes.contains(MealType.LUNCH));
        var allDinners = possibleDishesWOUserExclude.stream().allMatch(dish -> dish.mealTypes.contains(MealType.DINNER));
        return List.of();
    }
}