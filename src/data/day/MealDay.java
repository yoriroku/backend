package data.day;

import data.dish.Dish;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class MealDay {
    Date date;
    Map<MealType, List<Dish>> menu;
}
