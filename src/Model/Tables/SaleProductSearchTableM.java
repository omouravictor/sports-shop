package Model.Tables;

import Model.Classes.Product;
import Model.Classes.Shirt;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.table.TableStringConverter;

public class SaleProductSearchTableM extends AbstractModel<Product> {

    public SaleProductSearchTableM() {
        this.columnNames = new String[]{"QTD", "Stock", "Cost", "Category",
            "Brand", "Team", "Player", "ShirtName", "Sleeves", "Number",
            "Color", "Size", "Id"};
    }

    public SaleProductSearchTableM(List<Product> productList, String[] columnNames) {
        this.list = productList;
        this.columnNames = columnNames;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return list.get(rowIndex).getNumInStock();
            case 1:
                return "R$ " + list.get(rowIndex).getCost();
            case 2:
                return list.get(rowIndex).getCategory().getName();
            case 3:
                return list.get(rowIndex).getBrand().getName();
            case 4:
                return list.get(rowIndex).getTeamName();
            case 5:
                return list.get(rowIndex).getPlayerPresent();
            case 6:
                if (list.get(rowIndex) instanceof Shirt) {
                    Shirt shirt = (Shirt) list.get(rowIndex);
                    return shirt.getPlayerNameOnShirt();
                }
                return "------";
            case 7:
                if (list.get(rowIndex) instanceof Shirt) {
                    Shirt shirt = (Shirt) list.get(rowIndex);
                    return shirt.getSleeves();
                }
                return "------";
            case 8:
                return list.get(rowIndex).getNumberPresent();
            case 9:
                return list.get(rowIndex).getColor();
            case 10:
                return list.get(rowIndex).getSizeProduct();
            case 11:
                return list.get(rowIndex).getId();
        }
        return null;
    }

    @Override
    public void filter(JTable filterJtable, String[] viewfilters) {
        TableRowSorter tableRowSorter = new TableRowSorter(this);
        tableRowSorter.setStringConverter(new TableStringConverter() {
            @Override
            public String toString(TableModel model, int rowIndex, int columnIndex) {
                /* This function make all elements of the list starts to
                lower case, doing so is possible filter the rows ignoring cases.*/
                try {
                    return model.getValueAt(rowIndex, columnIndex).toString().toLowerCase();
                } catch (NullPointerException e) {
                    return null;
                }
            }
        });
        List<RowFilter<Object, Object>> filterTypes = new ArrayList<>();
        filterTypes.add(RowFilter.regexFilter(viewfilters[0].toLowerCase(), 2));
        // viewfilters[0] filter of category column
        filterTypes.add(RowFilter.regexFilter(viewfilters[1].toLowerCase(), 3));
        // viewfilters[1] filter of brand column
        filterTypes.add(RowFilter.regexFilter(viewfilters[2].toLowerCase(), 4));
        // viewfilters[2] filter of team column
        filterTypes.add(RowFilter.regexFilter(viewfilters[3].toLowerCase(), 5));
        // viewfilters[3] filter of player column
        filterTypes.add(RowFilter.regexFilter(viewfilters[4].toLowerCase(), 8));
        // viewfilters[4] filter of number column
        filterTypes.add(RowFilter.regexFilter(viewfilters[5].toLowerCase(), 10));
        // viewfilters[5] filter of size column
        filterTypes.add(RowFilter.regexFilter(viewfilters[6].toLowerCase(), 6));
        // viewfilters[6] filter of nameShirt column
        filterTypes.add(RowFilter.regexFilter(viewfilters[7].toLowerCase(), 7));
        // viewfilters[7] filter of sleeves column
        filterTypes.add(RowFilter.regexFilter(viewfilters[8].toLowerCase(), 9));
        // viewfilters[8] filter of color column
        filterTypes.add(RowFilter.regexFilter(viewfilters[9].toLowerCase(), 11));
        // viewfilters[9] filter of ID column
        RowFilter<Object, Object> rowFilters = RowFilter.andFilter(filterTypes);
        tableRowSorter.setRowFilter(rowFilters);
        filterJtable.setRowSorter(tableRowSorter);
    }
}
