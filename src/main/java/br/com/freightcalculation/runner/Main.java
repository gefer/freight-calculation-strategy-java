package br.com.freightcalculation.runner;

import br.com.freightcalculation.contractors.Freight;
import br.com.freightcalculation.contractors.ShippingType;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        String[] buttons = {"Normal", "Expresso", "Expresso 24 horas", "Cancel"};
        int returnValue = JOptionPane.showOptionDialog(null, "Escolha um tipo de frete para prosseguir: ", "Escolha de frete", JOptionPane.WARNING_MESSAGE, 0, null, buttons, buttons[0]);

        ShippingType shippingType = ShippingType.values()[returnValue];
        Freight freight = shippingType.getShippingType(returnValue);

        try {
            double total = freight.calculate(700);
            JOptionPane.showMessageDialog(null, "O Valor do frete é: " + total);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
