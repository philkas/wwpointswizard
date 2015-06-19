package pika.de.wwpointswizard2.services.impl;

import java.util.ArrayList;
import java.util.List;

import pika.de.wwpointswizard2.core.dishes.PortionUnit;
import pika.de.wwpointswizard2.services.DishService;

/**
 * Created by pika on 19.06.15.
 */
public class DishServiceImpl implements DishService {
    /**
     * Collects all units defined in {@link PortionUnit} and returns a list.
     * @return A list of all units from {@link PortionUnit}
     */
    @Override
    public List<String> getPortionShortnames() {
        List<String> units = new ArrayList<>(PortionUnit.values().length);
        for(PortionUnit unit : PortionUnit.values()) {
            units.add(unit.getShortname());
        }
        return units;
    }
}
