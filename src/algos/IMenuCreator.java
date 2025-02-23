package algos;

import data.day.Meal;
import data.day.MealDay;
import data.dish.Dish;
import data.user.User;

import java.util.Date;
import java.util.List;

public interface IMenuCreator {
    public List<Meal> CreateMenu(User user, List<Dish> possibleDishes, Date from, Date to);
}
