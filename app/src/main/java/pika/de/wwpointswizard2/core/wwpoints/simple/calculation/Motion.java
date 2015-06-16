package pika.de.wwpointswizard2.core.wwpoints.simple.calculation;

/**
 * Created by pika on 16.06.15.
 */
public enum Motion implements PointGetter {
    NONE {
        @Override
        public double getPoints() {
            return 0.0;
        }
    },
    LITTLE {
        @Override
        public double getPoints() {
            return 2.0;
        }
    },
    MUCH {
        @Override
        public double getPoints() {
            return 4.0;
        }
    },
    HARD {
        @Override
        public double getPoints() {
            return 6.0;
        }
    }
}
