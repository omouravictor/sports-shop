package Model.Tables;

import Model.EntitiesClasses.Category;
import java.util.List;
import javax.swing.RowFilter;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.table.TableStringConverter;

public class TbCategoryModel extends AbstractTbModel<Category> {

    public TbCategoryModel() {
        this.columnNames = new String[]{"Id", "Name"};
    }

    public TbCategoryModel(List<Category> categoryList) {
        super(categoryList);
        this.columnNames = new String[]{"Id", "Name"};
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return list.get(rowIndex).getId();
            case 1:
                return list.get(rowIndex).getName();
        }
        return null;
    }

    public TableRowSorter getRowSorter(String filter) {
        if (!filter.isEmpty()) {
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
            RowFilter rowFilter = RowFilter.regexFilter(filter.toLowerCase(), 1);
            tableRowSorter.setRowFilter(rowFilter);
            return tableRowSorter;
        }
        return null;
    }
}
