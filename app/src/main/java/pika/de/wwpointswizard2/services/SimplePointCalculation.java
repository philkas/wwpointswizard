package pika.de.wwpointswizard2.services;

/**
 * Created by pika on 14.06.15.
 */
public interface SimplePointCalculation {
    /**
     * Calculates the simple points
     * @param kcal amount of kilo calories
     * @param fat amount of fat
     * @return the ww points
     */
    double calcSimplePoints(double kcal, double fat);

    /**
     * calculate the relative points
     * @param kcal kilo calories of the food
     * @param fat fat of the food in grams
     * @param baseValue the amount the kcal and fat belongs to
     * @param targetValue the target amount of the food wished to eat
     * @return
     */
    double calcRelativePoints(double kcal, double fat, double baseValue, double targetValue);
}
