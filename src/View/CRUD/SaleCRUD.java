package View.CRUD;

import Control.SaleControl;
import Model.Entities.Brand;
import Model.Entities.Category;
import Model.Entities.Client;
import Model.Entities.Product;
import Model.Classes.AbstractJDialog;
import Model.Entities.Sale;
import Model.Tables.TbSaleModel;
import Model.Interfaces.ICRUDview;
import java.util.ArrayList;
import java.util.List;

public class SaleCRUD extends AbstractJDialog<Sale> implements ICRUDview<Sale> {

    private SaleControl saleControl = new SaleControl();
    private TbSaleModel tbSaleModel = new TbSaleModel();

    public SaleCRUD(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        Category c1 = new Category("Mug");
        Brand b1 = new Brand("Nike");
        Client c = new Client("Victor", "127.338.636-14", "(31)98591-6080", "",
                "35182-278", "Dinamarca", "238", "Ana Rita", "Timóteo", "MG");
        Product p1 = new Product(c1, b1, "Barcelona", "Dyballa", null, "White", "300ml", 20, 5, 10);
        p1.setId(Long.parseLong("100"));
        List<Product> l = new ArrayList<>();
        l.add(p1);
        Sale s1 = new Sale(c, l, "16/06/2020");
        s1.setId(Long.parseLong("100"));
        tbSaleModel.addObjectRow(s1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panFilter = new javax.swing.JPanel();
        btSearch = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        labName = new javax.swing.JLabel();
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

        panFilter.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Search"));

        btSearch.setText("Search");

        labName.setText("Name");

        javax.swing.GroupLayout panFilterLayout = new javax.swing.GroupLayout(panFilter);
        panFilter.setLayout(panFilterLayout);
        panFilterLayout.setHorizontalGroup(
            panFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panFilterLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labName)
                .addGap(28, 28, 28)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btSearch)
                .addGap(124, 124, 124))
        );
        panFilterLayout.setVerticalGroup(
            panFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panFilterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSearch)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labName))
                .addContainerGap(18, Short.MAX_VALUE))
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
                .addComponent(panGrid, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)
                .addContainerGap())
        );
        panTbSearchLayout.setVerticalGroup(
            panTbSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTbSearchLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(panGrid, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
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
                .addComponent(panFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panTbSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panFooter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCreateActionPerformed
        create();
    }//GEN-LAST:event_btCreateActionPerformed

    private void btReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btReadActionPerformed
        read();
    }//GEN-LAST:event_btReadActionPerformed

    private void btUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUpdateActionPerformed
        update();
    }//GEN-LAST:event_btUpdateActionPerformed

    private void btDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteActionPerformed
        delete();
    }//GEN-LAST:event_btDeleteActionPerformed

    private void btCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btCloseActionPerformed

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btClose;
    private javax.swing.JButton btCreate;
    private javax.swing.JButton btDelete;
    private javax.swing.JButton btRead;
    private javax.swing.JButton btSearch;
    private javax.swing.JButton btUpdate;
    private javax.swing.JLabel labName;
    private javax.swing.JPanel panFilter;
    private javax.swing.JPanel panFooter;
    private javax.swing.JScrollPane panGrid;
    private javax.swing.JPanel panTbSearch;
    private javax.swing.JTable tbSale;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables

    @Override
    public void create() {
        Sale newSale = saleControl.create();
        tbSaleModel.addObjectRow(newSale);
        clearSelectedRows(tbSale);
    }

    @Override
    public void read() {
        if (rowIsSelected(tbSale)) {
            Sale saleSelected = getObjectSelectedInTb(tbSale, tbSaleModel);
            saleControl.read(saleSelected);
            clearSelectedRows(tbSale);
        }
    }

    @Override
    public void update() {
        if (rowIsSelected(tbSale)) {
            Sale oldSale = getObjectSelectedInTb(tbSale, tbSaleModel);
            Sale updatedSale = saleControl.update(oldSale);
            tbSaleModel.updateObjectRow(oldSale, updatedSale);
            clearSelectedRows(tbSale);
        }
    }

    @Override
    public void delete() {
        if (rowIsSelected(tbSale)) {
            Sale saleSelected = getObjectSelectedInTb(tbSale, tbSaleModel);
            saleControl.delete(saleSelected);
            tbSaleModel.removeObjectRow(saleSelected);
            clearSelectedRows(tbSale);
        }
    }
}
