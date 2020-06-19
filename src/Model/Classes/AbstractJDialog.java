package Model.Classes;

import Model.Tables.AbstractTbModel;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public abstract class AbstractJDialog<T> extends javax.swing.JDialog {

    public AbstractJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void showErrorMessage(String erroMsg) {
        JOptionPane.showMessageDialog(null, erroMsg, "Erro", JOptionPane.ERROR_MESSAGE);
    }

    public boolean rowIsSelected(JTable tbToLookFor) {
        return tbToLookFor.getSelectedRow() != -1;
    }

    public void clearSelectedRows(JTable tbToLookFor) {
        tbToLookFor.getSelectionModel().clearSelection();
    }

    public T getObjectSelectedInTb(JTable tbToLookFor, AbstractTbModel tbModelToLookFor) {
        int row = tbToLookFor.getSelectedRow();
        T selectedObject = (T) tbModelToLookFor.getObjectByRow(row);
        return selectedObject;
    }
    
    public double parseTxtCostToDouble(JFormattedTextField txt) {
        if (!txt.getText().isEmpty()) {
            String cost = txt.getText().replaceAll("\\.", "").replace(",", ".");
            return Double.parseDouble(cost);
        }
        return -1;
    }

    public double parseTxtCostValueToDouble(JFormattedTextField txt) {
        if (!txt.getText().isEmpty()) {
            String cost = txt.getText().replace("R$ ", "").replaceAll("\\.", "").replace(",", ".");
            return Double.parseDouble(cost);
        }
        return -1;
    }
    
    public int parseTxtTextToInt(JTextField txt) {
        if (!txt.getText().isEmpty()) {
            int numStock = Integer.parseInt(txt.getText());
            return numStock;
        }
        return -1;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
