package pika.de.wwpointswizard2.core.wwpoints.simple;

/**
 * Created by pika on 17.06.15.
 */
public class IdentityRounder implements PointRounder {
    @Override
    public double round(double points) {
        return points;
    }
}
