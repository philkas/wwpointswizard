package pika.de.wwpointswizard2.core.wwpoints.simple;

import java.util.Objects;

import pika.de.wwpointswizard2.core.wwpoints.WWPointType;

/**
 * Created by pika on 17.06.15.
 */
public class QuarterPointType implements WWPointType {
    /**
     * Internal representation of a point. In this case it is an integer which stores the points
     * value. The value is doubled for rounding.
     */
    private final int internalPoints;

    public QuarterPointType(final double rawPoint) {
        internalPoints = (int) (rawPoint * 2.0);
    }

    /**
     * Get the real point value.
     * @return the real points calculated from its internal representation;
     */
    @Override
    public double getPointValue() {
        return internalPoints / 2.0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuarterPointType that = (QuarterPointType) o;
        return internalPoints == that.internalPoints;
    }

    @Override
    public int hashCode() {
        return ((Integer) internalPoints).hashCode();
    }
}
