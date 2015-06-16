package pika.de.wwpointswizard2.core.wwpoints.simple.calculation;

/**
 * Created by pika on 16.06.15.
 */
public enum Gender implements PointGetter {
    MALE {
        @Override
        public double getPoints() {
            return 15.0;
        }
    },
    FEMALE {
        @Override
        public double getPoints() {
            return 7.0;
        }
    }
}
