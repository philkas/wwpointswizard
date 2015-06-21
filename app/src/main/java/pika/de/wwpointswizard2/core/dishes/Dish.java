package pika.de.wwpointswizard2.core.dishes;

import java.math.BigDecimal;

import pika.de.wwpointswizard2.core.wwpoints.WWPointType;

/**
 * Created by pika on 18.06.15.
 */
public class Dish {
    private Long id;
    private String name;
    private int kcal;
    private BigDecimal fat;
    private BigDecimal sugar;
    private BigDecimal protein;
    private WWPointType points;
    private String barcode;
    private Portion portion;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Argument name must not be null or empty.");
        }
        this.name = name;
    }

    public int getKcal() {
        return kcal;
    }

    public void setKcal(int kcal) {
        this.kcal = kcal;
    }

    public BigDecimal getFat() {
        return fat;
    }

    public void setFat(BigDecimal fat) {
        this.fat = fat;
    }

    public BigDecimal getSugar() {
        return sugar;
    }

    public void setSugar(BigDecimal sugar) {
        this.sugar = sugar;
    }

    public BigDecimal getProtein() {
        return protein;
    }

    public void setProtein(BigDecimal protein) {
        this.protein = protein;
    }

    public WWPointType getPoints() {
        return points;
    }

    public void setPoints(WWPointType points) {
        if(points == null) {
            throw new IllegalArgumentException("Argument points must not be null");
        }
        this.points = points;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public Portion getPortion() {
        return portion;
    }

    public void setPortion(Portion portion) {
        if(portion == null) {
            throw new IllegalArgumentException("Argument portion must not be null");
        }
        this.portion = portion;
    }

    public Dish(String name, WWPointType points, Portion portion) {
        this(null, name, points, portion);
    }

    public Dish(Long id, String name, WWPointType points, Portion portion) {
        setName(name);
        setPoints(points);
        setPortion(portion);
        this.id = id;
    }

}
