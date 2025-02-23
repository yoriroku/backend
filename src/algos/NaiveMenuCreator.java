package algos;

import data.MealDay;
import interfaces.IMenuCreator;

import java.util.Date;
import java.util.List;

public class NaiveMenuCreator implements IMenuCreator {

    @Override
    public List<MealDay> CreateMenu(Date from, Date to) {
        return List.of();
    }
}