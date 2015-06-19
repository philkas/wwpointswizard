package pika.de.wwpointswizard2.services;

import java.util.List;

/**
 * Created by pika on 19.06.15.
 */
public interface DishService {
    /**
     * Get a list of units for the portion
     * @return A list of units using the shortname.
     */
    List<String> getPortionShortnames();
}
