package pika.de.wwpointswizard2.core.wwpoints.simple.calculation;

/**
 * Created by pika on 16.06.15.
 */
public enum DietTarget implements PointGetter {
    KEEP {
        @Override
        public double getPoints() {
            return 4.0;
        }
    },
    SLIM {
        @Override
        public double getPoints() {
            return 0.0;
        }
    }
}
