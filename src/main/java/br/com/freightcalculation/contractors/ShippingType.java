package br.com.freightcalculation.contractors;

import br.com.freightcalculation.entities.ExpressFreight;
import br.com.freightcalculation.entities.Normal;
import br.com.freightcalculation.entities.OneDayExpressShipping;

/**
 *
 * @author gefer
 */
public enum ShippingType {

    NORMAL {
        @Override
        public Freight getShippingType(int distance) {
            return new Normal();
        }
    },
    
    EXPRESS {
        @Override
        public Freight getShippingType(int distance) {
            return new ExpressFreight();
        }
    },
    
    EXPRESS_ONE_DAY {
        @Override
        public Freight getShippingType(int distance) {
            return new OneDayExpressShipping();
        }
    };

    public abstract Freight getShippingType(int distance);
}
