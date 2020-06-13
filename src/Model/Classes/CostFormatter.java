package Model.Classes;

import java.text.DecimalFormat;
import java.text.ParseException;
import javax.swing.text.NumberFormatter;

public class CostFormatter {

    public CostFormatter() {
    }

    public String formatCost(double cost) throws ParseException {
        NumberFormatter numFormatter = new NumberFormatter(new DecimalFormat("R$ #,###.00"));
        return numFormatter.valueToString(cost);
    }
    
    public String formatNumber(double number) throws ParseException {
        NumberFormatter numFormatter = new NumberFormatter(new DecimalFormat("#,###.00"));
        return numFormatter.valueToString(number);
    }
}
