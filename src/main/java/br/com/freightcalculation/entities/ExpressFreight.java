package br.com.freightcalculation.entities;

import br.com.freightcalculation.contractors.Freight;

/**
 *
 * @author gefer
 */
public class ExpressFreight implements Freight {

    private final int BASE_DISTANCE = 500;
    private final double FREIGHT_FOR_LONG_ROUTES = 1.25;
    private final double FREIGHT_FOR_SHORT_ROUTES = 1.35;

    @Override
    public double calculate(int distance) {
        return distance > BASE_DISTANCE ? distance * FREIGHT_FOR_LONG_ROUTES : distance * FREIGHT_FOR_SHORT_ROUTES;
    }
}
