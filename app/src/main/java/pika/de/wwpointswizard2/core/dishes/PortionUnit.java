package pika.de.wwpointswizard2.core.dishes;

/**
 * Created by pika on 18.06.15.
 */
public enum PortionUnit {
    GRAMS("g", "grams"),
    KILOGRAMS("kg", "kilograms"),
    TEASPOON("tsp", "teaspoon"),
    TABLESPOON("tbsp", "tablespoon"),
    LITRE("l", "litre"),
    MILLILITRE("ml", "millilitre"),
    PORTION("p", "portion");

    private final String shortname;
    private final String longname;

    PortionUnit(String shortname, String longname) {
        this.shortname = shortname;
        this.longname = longname;
    }

    public String getShortname() {
        return this.shortname;
    }

    public String getLongname() {
        return this.longname;
    }
}
