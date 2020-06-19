package Model.Tables;

import Model.Classes.CostFormatter;
import Model.EntitiesClasses.Product;
import Model.EntitiesClasses.Shirt;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.table.TableStringConverter;

public class TbProductModel extends AbstractTbModel<Product> {

    public TbProductModel() {
        this.columnNames = new String[]{"Stock", "Cost", "Category",
            "Brand", "Team", "Player", "ShirtName", "Sleeves", "Number",
            "Color", "Size", "Id"};
    }

    public TbProductModel(List<Product> productList, String[] columnNames) {
        this.list = productList;
        this.columnNames = columnNames;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        switch (columnIndex) {
            case 0:
                return list.get(rowIndex).getNumInStock();
            case 1: {
                try {
                    return new CostFormatter().formatCost(list.get(rowIndex).getCost());
                } catch (ParseException ex) {
                    return "ERRO";
                }
            }
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
    public void filter(JTable filterJtable, String[] viewFilters
    ) {
        TableRowSorter tableRowSorter = new TableRowSorter(this);
        if (viewFilters.length != 0) {
            tableRowSorter.setStringConverter(new TableStringConverter() {
                @Override
                /* This function change all elements of the list to lower case,
                doing so is possible filter the rows ignoring cases.*/
                public String toString(TableModel model, int row, int column) {
                    try {
                        return model.getValueAt(row, column).toString().toLowerCase();
                    } catch (NullPointerException e) {
                        return null;
                    }
                }
            });
            //viewFilters must to be on the same sequence of this model columns
            int column = 2;
            List<RowFilter<Object, Object>> filterTypes = new ArrayList<>();
            for (String viewFilter : viewFilters) {
                if (!viewFilter.isEmpty()) {
                    filterTypes.add(RowFilter.regexFilter(viewFilter.toLowerCase(), column));
                }
                column++;
            }
            RowFilter<Object, Object> rowFilters = RowFilter.andFilter(filterTypes);
            tableRowSorter.setRowFilter(rowFilters);
            filterJtable.setRowSorter(tableRowSorter);
        } else {
            tableRowSorter.setRowFilter(RowFilter.regexFilter("", 2));
            filterJtable.setRowSorter(tableRowSorter);
        }
    }
}