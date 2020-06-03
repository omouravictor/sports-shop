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

public class SaleFormTbProductSearchModel extends AbstractTbModel<Product> {

    public SaleFormTbProductSearchModel() {
        this.columnNames = new String[]{"QTD", "Stock", "Cost", "Category",
            "Brand", "Team", "Player", "ShirtName", "Sleeves", "Number",
            "Color", "Size", "Id"};
    }

    public SaleFormTbProductSearchModel(List<Product> productList, String[] columnNames) {
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
        filterTypes.add(RowFilter.regexFilter(viewfilters[1].toLowerCase(), 3));
        filterTypes.add(RowFilter.regexFilter(viewfilters[2].toLowerCase(), 4));
        filterTypes.add(RowFilter.regexFilter(viewfilters[3].toLowerCase(), 5));
        filterTypes.add(RowFilter.regexFilter(viewfilters[4].toLowerCase(), 8));
        filterTypes.add(RowFilter.regexFilter(viewfilters[5].toLowerCase(), 10));
        filterTypes.add(RowFilter.regexFilter(viewfilters[6].toLowerCase(), 6));
        filterTypes.add(RowFilter.regexFilter(viewfilters[7].toLowerCase(), 7));
        filterTypes.add(RowFilter.regexFilter(viewfilters[8].toLowerCase(), 9));
        filterTypes.add(RowFilter.regexFilter(viewfilters[9].toLowerCase(), 11));
        RowFilter<Object, Object> rowFilters = RowFilter.andFilter(filterTypes);
        tableRowSorter.setRowFilter(rowFilters);
        filterJtable.setRowSorter(tableRowSorter);
    }
}
