package pika.de.wwpointswizard2.core.wwpoints;

/**
 * Created by pika on 14.06.15.
 */
public class SimplePoints implements Points, PointArithmetic {
    private final double kcal;
    private final double fat;

    public SimplePoints(double kcal, double fat) {
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

    @Override
    public double add(Points points) {
        return this.calculatePoints() + points.calculatePoints();
    }

    @Override
    public double sub(Points points) {
        return this.calculatePoints() - points.calculatePoints();
    }

    @Override
    public Points multiply(double factor) {
        return new SimplePoints(this.kcal * factor, this.fat * factor);
    }
}
