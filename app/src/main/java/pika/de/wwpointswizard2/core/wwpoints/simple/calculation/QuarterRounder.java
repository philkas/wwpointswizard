package pika.de.wwpointswizard2.core.wwpoints.simple.calculation;

import pika.de.wwpointswizard2.core.wwpoints.simple.PointRounder;

/**
 * Created by pika on 17.06.15.
 */
public class QuarterRounder implements PointRounder {
    @Override
    public double round(double points) {
        int intPoints = (int) (points * 2.0);
        return intPoints / 2.0;
    }
}
