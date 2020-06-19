package Model.Tables;

import Model.Classes.CostFormatter;
import Model.EntitiesClasses.Sale;
import java.text.ParseException;
import java.util.List;
import javax.swing.JTable;

public class TbSaleModel extends AbstractTbModel<Sale> {

    public TbSaleModel() {
        this.columnNames = new String[]{"Id", "Client Name", "Client CPF", "Date", "Cost"};
    }

    public TbSaleModel(List<Sale> saleList, String[] columnNames) {
        this.list = saleList;
        this.columnNames = columnNames;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return list.get(rowIndex).getId();
            case 1:
                return list.get(rowIndex).getClient().getName();
            case 2:
                return list.get(rowIndex).getClient().getCpf();
            case 3:
                return list.get(rowIndex).getSaleDate();
            case 4: {
                try {
                    return new CostFormatter().formatCost(list.get(rowIndex).getSaleCost());
                } catch (ParseException ex) {
                    return "ERRO";
                }
            }
        }
        return null;
    }

    @Override
    public void filter(JTable filterJtable, String[] viewfilters) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}