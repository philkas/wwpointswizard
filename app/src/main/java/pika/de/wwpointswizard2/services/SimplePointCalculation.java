package pika.de.wwpointswizard2.services;

import pika.de.wwpointswizard2.core.wwpoints.Points;

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
    Points calcSimplePoints(double kcal, double fat);

    /**
     * calculate the relative points
     * @param kcal kilo calories of the food
     * @param fat fat of the food in grams
     * @param baseValue the amount the kcal and fat belongs to
     * @param targetValue the target amount of the food wished to eat
     * @return
     */
    Points calcRelativePoints(double kcal, double fat, double baseValue, double targetValue);
}
