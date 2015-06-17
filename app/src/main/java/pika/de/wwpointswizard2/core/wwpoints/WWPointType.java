package pika.de.wwpointswizard2.core.wwpoints;

/**
 * Created by pika on 17.06.15.
 */
public abstract class WWPointType implements Comparable<WWPointType> {
    public abstract double getPointValue();

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
