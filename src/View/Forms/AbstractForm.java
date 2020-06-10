package View.Forms;

import Model.Tables.AbstractTbModel;
import java.text.DecimalFormat;
import java.text.ParseException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.text.NumberFormatter;

public abstract class AbstractForm<T> extends javax.swing.JDialog {

    public AbstractForm(java.awt.Frame parent, boolean modal) {
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

    public String formatCost(double totalCost) throws ParseException {
        NumberFormatter numFormatter = new NumberFormatter(new DecimalFormat("R$ #,###.00"));
        return numFormatter.valueToString(totalCost);
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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
