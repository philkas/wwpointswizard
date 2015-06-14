package pika.de.wwpointswizard2.core.wwpoints;

/**
 * Created by pika on 14.06.15.
 */
public class SimplePoints implements PointsCalculator {
    private final double kcal;
    private final double fat;

    public SimplePoints(int kcal, double fat) {
        this.kcal = kcal;
        this.fat = fat;
    }

    public double getKcal() {
        return this.kcal;
    }

    public double getFat() {
        return this.fat;
    }

    @Override
    public double calculatePoints() {
        return getKcal() / 60.0 + getFat() / 9.0;
    }
}
