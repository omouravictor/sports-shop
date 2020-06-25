package Model.Tables;

import Model.EntitiesClasses.Category;
import java.util.List;
import javax.swing.JTable;

public class TbCategoryModel extends AbstractTbModel<Category> {

    public TbCategoryModel() {
        this.columnNames = new String[]{"Id", "Name"};
    }

    public TbCategoryModel(List<Category> categoryList, String[] columnNames) {
        this.list = categoryList;
        this.columnNames = columnNames;
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

    public void filter(JTable filterJtable, String[] viewfilters) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
