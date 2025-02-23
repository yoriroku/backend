package interfaces;

import data.MealDay;

import java.util.Date;
import java.util.List;

public interface IMenuCreator {

    public List<MealDay> CreateMenu(Date from, Date to);
}
