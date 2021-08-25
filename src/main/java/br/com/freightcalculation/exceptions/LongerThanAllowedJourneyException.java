package br.com.freightcalculation.exceptions;

/**
 *
 * @author gefer
 */
public class LongerThanAllowedJourneyException extends RuntimeException {

    public LongerThanAllowedJourneyException() {
        super("Desculpe.. mas a distância máxima para entrega em 24 horas é de 300km.");
    }
}
