package pika.de.wwpointswizard2.core.wwpoints;

import com.google.inject.Inject;

import pika.de.wwpointswizard2.core.wwpoints.simple.IdentityRounder;
import pika.de.wwpointswizard2.core.wwpoints.simple.PointRounder;

/**
 * Created by pika on 17.06.15.
 */
public class WWPointType implements Comparable<WWPointType> {
    private double points;

    private static PointRounder pointRounder = new IdentityRounder();

    public static void setPointRounder(final PointRounder rounder) {
        pointRounder = rounder;
    }

    public WWPointType(final double points) {
        this.points = pointRounder.round(points);
    }

    public double getPointValue() {
        return points;
    }

    public WWPointType add(final WWPointType other) {
        return new WWPointType(this.points + other.points);
    }

    public WWPointType sub(final WWPointType other) {
        return new WWPointType(this.points - other.points);
    }

    @Override
    public int compareTo(final WWPointType another) {
        return new Double(getPointValue()).compareTo(another.getPointValue());
    }

    @Override
    public boolean equals(final Object another) {
        if(this == another) return true;
        if(another == null) {
            return false;
        } else if (another instanceof WWPointType) {
            WWPointType other = (WWPointType) another;
            return this.compareTo(other) == 0;
        }
        return false;
    }
}
