package br.com.freightcalculation.entities;

import br.com.freightcalculation.contractors.Freight;
import br.com.freightcalculation.exceptions.LongerThanAllowedJourneyException;

/**
 *
 * @author gefer
 */
public class OneDayExpressShipping implements Freight {

    private final int MAXIMUM_ALLOWED_DISTANCE = 300;
    private final double FREIGHT_COST = 1.60;
    private final int MINIMUM_VALUE = 50;

    @Override
    public double calculate(int distance) {
        if (distance > MAXIMUM_ALLOWED_DISTANCE) {
            throw new LongerThanAllowedJourneyException();
        }
        return distance * FREIGHT_COST + MINIMUM_VALUE;
    }
}
