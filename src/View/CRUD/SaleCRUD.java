package View.CRUD;

import Control.Managers.SaleManager;
import Model.Classes.AbstractJDialog;
import Model.Classes.TxtModelsTypes;
import Model.Classes.TxtTypes;
import Model.EntitiesClasses.Sale;
import Model.Tables.TbSaleModel;
import javax.swing.JOptionPane;

public class SaleCRUD extends AbstractJDialog<Sale> {

    private SaleManager saleManager;
    private TbSaleModel tbSaleModel;

    public SaleCRUD(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        initSetup();
    }

    public SaleCRUD(java.awt.Frame parent, boolean modal,
            SaleManager saleManager, TbSaleModel model) {
        super(parent, modal);
        this.saleManager = saleManager;
        this.tbSaleModel = model;
        initComponents();
        initSetup();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panFilter = new javax.swing.JPanel();
        btSearch = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();
        labID = new javax.swing.JLabel();
        labDate = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        labClientName = new javax.swing.JLabel();
        txtClientName = new javax.swing.JTextField();
        labClientCPF = new javax.swing.JLabel();
        txtClientCpf = new javax.swing.JTextField();
        btClear = new javax.swing.JButton();
        panTbSearch = new javax.swing.JPanel();
        panGrid = new javax.swing.JScrollPane();
        tbSale = new javax.swing.JTable();
        panFooter = new javax.swing.JPanel();
        btCreate = new javax.swing.JButton();
        btRead = new javax.swing.JButton();
        btUpdate = new javax.swing.JButton();
        btDelete = new javax.swing.JButton();
        btClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panFilter.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Filters"));

        btSearch.setText("Search");
        btSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSearchActionPerformed(evt);
            }
        });

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        labID.setText("ID");

        labDate.setText("Date");

        txtDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateActionPerformed(evt);
            }
        });

        labClientName.setText("Client Name");

        txtClientName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClientNameActionPerformed(evt);
            }
        });

        labClientCPF.setText("Client CPF");

        txtClientCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClientCpfActionPerformed(evt);
            }
        });

        btClear.setText("Clear");
        btClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panFilterLayout = new javax.swing.GroupLayout(panFilter);
        panFilter.setLayout(panFilterLayout);
        panFilterLayout.setHorizontalGroup(
            panFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panFilterLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(panFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panFilterLayout.createSequentialGroup()
                        .addComponent(labID)
                        .addGap(31, 31, 31)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panFilterLayout.createSequentialGroup()
                        .addComponent(labDate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labClientCPF)
                    .addComponent(labClientName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtClientName, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtClientCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btClear, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panFilterLayout.setVerticalGroup(
            panFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panFilterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labID)
                    .addComponent(txtClientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labClientName)
                    .addComponent(btSearch))
                .addGap(6, 6, 6)
                .addGroup(panFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labDate)
                    .addComponent(txtClientCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labClientCPF)
                    .addComponent(btClear))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        panTbSearch.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Search Table"));

        tbSale.setModel(this.tbSaleModel);
        panGrid.setViewportView(tbSale);

        javax.swing.GroupLayout panTbSearchLayout = new javax.swing.GroupLayout(panTbSearch);
        panTbSearch.setLayout(panTbSearchLayout);
        panTbSearchLayout.setHorizontalGroup(
            panTbSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTbSearchLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panGrid)
                .addContainerGap())
        );
        panTbSearchLayout.setVerticalGroup(
            panTbSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTbSearchLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(panGrid, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );

        btCreate.setText("Create");
        btCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCreateActionPerformed(evt);
            }
        });

        btRead.setText("Read");
        btRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btReadActionPerformed(evt);
            }
        });

        btUpdate.setText("Update");
        btUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUpdateActionPerformed(evt);
            }
        });

        btDelete.setText("Delete");
        btDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteActionPerformed(evt);
            }
        });

        btClose.setText("Close");
        btClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panFooterLayout = new javax.swing.GroupLayout(panFooter);
        panFooter.setLayout(panFooterLayout);
        panFooterLayout.setHorizontalGroup(
            panFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panFooterLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btRead, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btClose, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        panFooterLayout.setVerticalGroup(
            panFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panFooterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCreate)
                    .addComponent(btRead)
                    .addComponent(btUpdate)
                    .addComponent(btDelete)
                    .addComponent(btClose))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panFooter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panTbSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panFilter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(panFilter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panTbSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panFooter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCreateActionPerformed
        try {
            Sale newSale = saleManager.create();
            tbSaleModel.addObjectRow(newSale);
        } catch (Exception ex) {
            showErrorMessage(ex.getMessage());
        }
        tbSale.clearSelection();
    }//GEN-LAST:event_btCreateActionPerformed

    private void btReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btReadActionPerformed
        if (rowIsSelected(tbSale)) {
            try {
                Sale saleSelected = getObjectSelectedInTb(tbSale, tbSaleModel);
                saleManager.read(saleSelected);
            } catch (Exception ex) {
                showErrorMessage(ex.getMessage());
            }
            tbSale.clearSelection();
        }
    }//GEN-LAST:event_btReadActionPerformed

    private void btUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUpdateActionPerformed
        if (rowIsSelected(tbSale)) {
            Sale saleSelected = getObjectSelectedInTb(tbSale, tbSaleModel);
            Sale saleOriginal = new Sale(saleSelected);
            try {
                Sale updatedSale = saleManager.update(saleSelected);
                tbSaleModel.updateObjectRow(saleSelected, updatedSale);
            } catch (Exception ex) {
                showErrorMessage(ex.getMessage());
                tbSaleModel.updateObjectRow(saleSelected, saleOriginal);
            }
            tbSale.clearSelection();
        }
    }//GEN-LAST:event_btUpdateActionPerformed

    private void btDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteActionPerformed
        if (rowIsSelected(tbSale)) {
            try {
                Sale saleSelected = getObjectSelectedInTb(tbSale, tbSaleModel);
                int answer = JOptionPane.showConfirmDialog(null, "Are you sure?", null, 0, 2);
                if (answer == 0) {
                    saleManager.delete(saleSelected);
                    tbSaleModel.removeObjectRow(tbSale.getSelectedRow());
                }
            } catch (Exception ex) {
                showErrorMessage(ex.getMessage());
            }
            tbSale.clearSelection();
        }
    }//GEN-LAST:event_btDeleteActionPerformed

    private void btCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCloseActionPerformed
        tbSale.clearSelection();
        this.dispose();
    }//GEN-LAST:event_btCloseActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        filterTbSale();
    }//GEN-LAST:event_txtIDActionPerformed

    private void txtDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateActionPerformed
        filterTbSale();
    }//GEN-LAST:event_txtDateActionPerformed

    private void txtClientNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClientNameActionPerformed
        filterTbSale();
    }//GEN-LAST:event_txtClientNameActionPerformed

    private void txtClientCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClientCpfActionPerformed
        filterTbSale();
    }//GEN-LAST:event_txtClientCpfActionPerformed

    private void btSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSearchActionPerformed
        filterTbSale();
    }//GEN-LAST:event_btSearchActionPerformed

    private void btClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClearActionPerformed
        clearSaleFilters();
    }//GEN-LAST:event_btClearActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SaleCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SaleCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SaleCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SaleCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SaleCRUD dialog = new SaleCRUD(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    public void initSetup() {
        txtID.setDocument(new TxtModelsTypes(TxtTypes.ID));
        txtDate.setDocument(new TxtModelsTypes(TxtTypes.STRING));
        txtClientName.setDocument(new TxtModelsTypes(TxtTypes.STRING));
        txtClientCpf.setDocument(new TxtModelsTypes(TxtTypes.CPF));
    }

    public void clearSaleFilters() {
        txtID.setText("");
        txtDate.setText("");
        txtClientName.setText("");
        txtClientCpf.setText("");
        tbSale.setRowSorter(null);
    }

    public boolean saleFiltersAreEmpty() {
        return txtID.getText().isEmpty() && txtDate.getText().isEmpty()
                && txtClientName.getText().isEmpty() && txtClientCpf.getText().isEmpty();
    }

    public void filterTbSale() {
        if (!saleFiltersAreEmpty()) {
            String[] filters = {txtID.getText(), txtDate.getText(),
                txtClientName.getText(), txtClientCpf.getText()};
            tbSale.setRowSorter(tbSaleModel.getRowSorter(filters));
        } else {
            tbSale.setRowSorter(null);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btClear;
    private javax.swing.JButton btClose;
    private javax.swing.JButton btCreate;
    private javax.swing.JButton btDelete;
    private javax.swing.JButton btRead;
    private javax.swing.JButton btSearch;
    private javax.swing.JButton btUpdate;
    private javax.swing.JLabel labClientCPF;
    private javax.swing.JLabel labClientName;
    private javax.swing.JLabel labDate;
    private javax.swing.JLabel labID;
    private javax.swing.JPanel panFilter;
    private javax.swing.JPanel panFooter;
    private javax.swing.JScrollPane panGrid;
    private javax.swing.JPanel panTbSearch;
    private javax.swing.JTable tbSale;
    private javax.swing.JTextField txtClientCpf;
    private javax.swing.JTextField txtClientName;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtID;
    // End of variables declaration//GEN-END:variables
}
