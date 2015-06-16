package pika.de.wwpointswizard2.core.wwpoints.simple.calculation;

/**
 * Created by pika on 16.06.15.
 */
public enum BodySize implements PointGetter {
    SMALL {
        @Override
        public double getPoints() {
            return 1.0;
        }
    },
    TALL {
        @Override
        public double getPoints() {
            return 2.0;
        }
    }
}
