package pika.de.wwpointswizard2.core.wwpoints;

/**
 * Created by pika on 16.06.15.
 */
public interface PointArithmetic {
    WWPointType add(Points points);
    WWPointType sub(Points points);
    Points multiply(double factor);
}
