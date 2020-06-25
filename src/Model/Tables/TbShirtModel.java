package Model.Tables;

import Model.EntitiesClasses.Shirt;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.table.TableStringConverter;

public class TbShirtModel extends AbstractTbModel<Shirt> {

    public TbShirtModel() {
        this.columnNames = new String[]{"Stock", "Cost", "Category",
            "Brand", "Team", "Player", "ShirtName", "Sleeves", "Number",
            "Color", "Size", "Id"};
    }

    public TbShirtModel(List<Shirt> shirtList, String[] columnNames) {
        this.list = shirtList;
        this.columnNames = columnNames;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        switch (columnIndex) {
            case 0:
                return list.get(rowIndex).getNumInStock();
            case 1:
                return costFormatter.formatCost(list.get(rowIndex).getCost());
            case 2:
                return list.get(rowIndex).getCategory().getName();
            case 3:
                return list.get(rowIndex).getBrand().getName();
            case 4:
                return list.get(rowIndex).getTeamName();
            case 5:
                return list.get(rowIndex).getPlayerPresent();
            case 6:
                return list.get(rowIndex).getPlayerNameOnShirt();
            case 7:
                return list.get(rowIndex).getSleeves();
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

    public void filter(JTable filterJtable, String[] viewFilters) {
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
                        return "ERRO";
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
        }
    }
}
