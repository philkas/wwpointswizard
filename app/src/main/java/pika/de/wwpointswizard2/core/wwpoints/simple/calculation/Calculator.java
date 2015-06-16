package pika.de.wwpointswizard2.core.wwpoints.simple.calculation;

/**
 * Created by pika on 16.06.15.
 */
public class Calculator {
    private BodySize bodySize;
    private Gender gender;
    private Motion motion;
    private DietTarget target;
    private double weight;

    public double calculatePoints() {
        return gender.getPoints() +
                bodySize.getPoints() +
                motion.getPoints() +
                target.getPoints() +
                pointsForWeight();
    }

    public BodySize getBodySize() {
        return bodySize;
    }

    public Gender getGender() {
        return gender;
    }

    public Motion getMotion() {
        return motion;
    }

    public DietTarget getTarget() {
        return target;
    }

    public double getWeight() {
        return weight;
    }

    private double pointsForWeight() {
        return Math.floor(this.weight / 10.0);
    }
}
