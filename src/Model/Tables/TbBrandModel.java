package Model.Tables;

import Model.EntitiesClasses.Brand;
import java.util.List;
import javax.swing.JTable;

public class TbBrandModel extends AbstractTbModel<Brand> {

    public TbBrandModel() {
        this.columnNames = new String[]{"Id", "Name"};
    }

    public TbBrandModel(List<Brand> brandList, String[] columnNames) {
        this.list = brandList;
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

    @Override
    public void filter(JTable filterJtable, String[] viewfilters) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
