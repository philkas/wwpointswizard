package pika.de.wwpointswizard2.core.wwpoints;

/**
 * Created by pika on 14.06.15.
 */
public class SimplePoint {
    private int kcal;
    private double fat;

    public SimplePoint(int kcal, double fat) {
        this.kcal = kcal;
        this.fat = fat;
    }

    public int getKcal() {
        return this.kcal;
    }

    public double getFat() {
        return this.fat;
    }
}
