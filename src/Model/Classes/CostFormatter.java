package Model.Classes;

import java.text.DecimalFormat;
import java.text.ParseException;
import javax.swing.text.NumberFormatter;

public class CostFormatter {

    public CostFormatter() {
    }

    public String formatCost(double cost) {
        NumberFormatter numFormatter = new NumberFormatter(new DecimalFormat("R$ #,###.00"));
        try {
            return numFormatter.valueToString(cost);
        } catch (ParseException ex) {
            return "ERRO";
        }
    }

    public String formatNumber(double number) {
        NumberFormatter numFormatter = new NumberFormatter(new DecimalFormat("#,###.00"));
        try {
            return numFormatter.valueToString(number);
        } catch (ParseException ex) {
            return "ERRO";
        }
    }
}
