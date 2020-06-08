package Model.Tables;

import Model.Entities.Client;
import java.util.List;
import javax.swing.JTable;

public class SaleFormTbAddedClientModel extends AbstractTbModel<Client> {

    public SaleFormTbAddedClientModel() {
        this.columnNames = new String[]{"Id", "Name", "CPF", "Phone", "Email",
            "ZipCode", "Street", "Number", "Neyghborhood", "City", "State"};
    }

    public SaleFormTbAddedClientModel(List<Client> clientList, String[] columnNames) {
        this.list = clientList;
        this.columnNames = columnNames;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return list.get(rowIndex).getId();
            case 1:
                return list.get(rowIndex).getName();
            case 2:
                return list.get(rowIndex).getCpf();
            case 3:
                return list.get(rowIndex).getCellPhone();
            case 4:
                return list.get(rowIndex).getEmail();
            case 5:
                return list.get(rowIndex).getZipCodeAddress();
            case 6:
                return list.get(rowIndex).getStreetAddress();
            case 7:
                return list.get(rowIndex).getNumberAddress();
            case 8:
                return list.get(rowIndex).getNeighborhoodAddress();
            case 9:
                return list.get(rowIndex).getCityAddress();
            case 10:
                return list.get(rowIndex).getStateAddress();
        }
        return null;
    }

    @Override
    public void filter(JTable filterJtable, String[] viewfilters) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
