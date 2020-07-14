package Model.Tables;

import Model.Classes.SleeveTypes;
import Model.EntitiesClasses.Product;
import Model.EntitiesClasses.Shirt;
import java.util.ArrayList;
import java.util.List;
import javax.swing.RowFilter;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.table.TableStringConverter;

public class TbProductModel extends AbstractTbModel<Product> {

    public TbProductModel(List<Product> productList) {
        super(productList);
        this.columnNames = new String[]{"Stock", "Cost", "Category",
            "Brand", "Team", "Player Present", "ShirtName", "ShirtSleeves", "Number",
            "Color", "Size", "Id"};
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        switch (columnIndex) {
            case 0:
                return list.get(rowIndex).getNumInStock();
            case 1:
                return costFormatter.formatCost(list.get(rowIndex).getCost());
            case 2:
                if (list.get(rowIndex) instanceof Shirt) {
                    Shirt shirt = (Shirt) list.get(rowIndex);
                    if (shirt.getSleeves().equals(SleeveTypes.NoSleeves)) {
                        return "T-Shirt";
                    }
                    return "Shirt";
                }
                return list.get(rowIndex).getCategory().getName();
            case 3:
                return list.get(rowIndex).getBrand().getName();
            case 4:
                return list.get(rowIndex).getTeamName();
            case 5:
                if (list.get(rowIndex).getPlayerPresent() == null
                        || list.get(rowIndex).getPlayerPresent().isEmpty()) {
                    return "------";
                }
                return list.get(rowIndex).getPlayerPresent();
            case 6:
                if (list.get(rowIndex) instanceof Shirt) {
                    Shirt shirt = (Shirt) list.get(rowIndex);
                    if (shirt.getPlayerNameOnShirt() == null
                            || shirt.getPlayerNameOnShirt().isEmpty()) {
                        return "------";
                    }
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
                if (list.get(rowIndex).getNumberPresent() == null
                        || list.get(rowIndex).getNumberPresent().isEmpty()) {
                    return "------";
                }
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

    public TableRowSorter getRowSorter(String[] filters) {
        if (filters.length != 0) {
            TableRowSorter tableRowSorter = new TableRowSorter(this);
            tableRowSorter.setStringConverter(new TableStringConverter() {
                @Override
                /* This function change all elements of the list to lower case,
                doing so is possible filter the rows ignoring cases.*/
                public String toString(TableModel model, int row, int column) {
                    try {
                        return model.getValueAt(row, column).toString().toLowerCase();
                    } catch (NullPointerException e) {
                        return "ERRO";
                    }
                }
            });
            //viewFilters must to be on the same sequence of this model columns
            int column = 2;
            List<RowFilter<Object, Object>> filterTypes = new ArrayList<>();
            for (String filter : filters) {
                if (!filter.isEmpty()) {
                    filterTypes.add(RowFilter.regexFilter(filter.toLowerCase(), column));
                }
                column++;
            }
            RowFilter<Object, Object> rowFilters = RowFilter.andFilter(filterTypes);
            tableRowSorter.setRowFilter(rowFilters);
            return tableRowSorter;
        }
        return null;
    }
}
