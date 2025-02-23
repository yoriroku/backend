package data.dish;

import data.day.MealType;
import data.product.Product;

import java.util.List;

public class Dish {
    public long id;
    public String name;
    public List<Product> ingredients;
    public List<MealType> mealTypes;
}
