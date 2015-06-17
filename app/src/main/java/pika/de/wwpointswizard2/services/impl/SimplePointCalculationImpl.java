package pika.de.wwpointswizard2.services.impl;

import com.google.inject.Inject;

import pika.de.wwpointswizard2.core.wwpoints.Points;
import pika.de.wwpointswizard2.core.wwpoints.simple.point.SimplePoints;
import pika.de.wwpointswizard2.services.SimplePointCalculation;

/**
 * Created by pika on 17.06.15.
 */
public class SimplePointCalculationImpl implements SimplePointCalculation {
    @Override
    public SimplePoints calcSimplePoints(double kcal, double fat) {
        return new SimplePoints(kcal, fat);
    }

    @Override
    public SimplePoints calcRelativePoints(double kcal, double fat, double baseValue, double targetValue) {
        return calcSimplePoints(kcal, fat).multiply(baseValue/targetValue);
    }
}
