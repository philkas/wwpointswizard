package pika.de.wwpointswizard2.core.wwpoints;

/**
 * Created by pika on 14.06.15.
 */
public class SimplePointCalc implements PointCalculator<SimplePoint> {
    @Override
    public double calculatePoints(SimplePoint simplePoint) {
        double point =  (double) simplePoint.getKcal() / 60.0 + simplePoint.getFat() / 9.0;
        return point;
    }
}
