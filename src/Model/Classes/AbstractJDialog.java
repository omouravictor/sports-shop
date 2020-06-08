package Model.Classes;

import java.text.DecimalFormat;
import java.text.ParseException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.text.NumberFormatter;

public abstract class AbstractJDialog extends javax.swing.JDialog {

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
    }// </editor-fold>//GEN-END:initComponents

    public boolean checkIfIsAIntengerNumber(String txtText) {
        try {
            Long num = Long.parseLong(txtText);//Long just accept intenger numbers
            return true;
        } catch (NumberFormatException e) {
            showErrorMessage("'" + txtText + "'" + " is not a intenger number.");
            return false;
        }
    }

    public boolean checkIfIsADoubleNumber(String txtText) {
        try {
            double num = Double.parseDouble(txtText);
            return true;
        } catch (NumberFormatException e) {
            showErrorMessage("'" + txtText + "'" + " is not a double number.");
            return false;
        }
    }

    public void showErrorMessage(String erroMsg) {
        JOptionPane.showMessageDialog(null, erroMsg, "Erro", JOptionPane.ERROR_MESSAGE);
    }
    
    public String costFormatters(double totalCost) throws ParseException {
        NumberFormatter numFormatter = new NumberFormatter(new DecimalFormat("R$ #,###.00"));
        return numFormatter.valueToString(totalCost);
    }
    
    public boolean rowIsSelected(JTable tbToVerifyFor) {
        return tbToVerifyFor.getSelectedRow() != -1;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
