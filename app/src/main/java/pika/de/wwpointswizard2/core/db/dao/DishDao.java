package pika.de.wwpointswizard2.core.db.dao;

import java.util.List;

import pika.de.wwpointswizard2.core.dishes.Dish;

/**
 * Created by pika on 21.06.15.
 */
public interface DishDao {
    Dish getDishById(final long id);
    List<Dish> getDishesByName(final String name);
    Dish getDishByBarcode(final String barcode);
    List<Dish> getAllDishes();
    void createDish(final Dish dish);
    void updateDish(final Dish dish);
    void deleteDish(final Dish dish);
}
