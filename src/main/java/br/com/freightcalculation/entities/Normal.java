package br.com.freightcalculation.entities;

import br.com.freightcalculation.contractors.Freight;

/**
 *
 * @author gefer
 */
public class Normal implements Freight {

    private final double FREIGHT_COST = 1.15;

    @Override
    public double calculate(int distance) {
        return distance * FREIGHT_COST;
    }

}
