package View.CRUD;

import Control.Managers.ProductManager;
import Model.Classes.AbstractJDialog;
import Model.Classes.TxtModelsTypes;
import Model.Classes.TxtTypes;
import Model.EntitiesClasses.Product;
import Model.EntitiesClasses.Shirt;
import Model.Tables.TbProductModel;
import javax.swing.JOptionPane;

public class ProductCRUD extends AbstractJDialog<Product> {

    private ProductManager productManager;
    private TbProductModel tbProductModel;

    public ProductCRUD(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        initSetup();
    }

    public ProductCRUD(java.awt.Frame parent, boolean modal,
            ProductManager productManager, TbProductModel model) {
        super(parent, modal);
        this.productManager = productManager;
        this.tbProductModel = model;
        initComponents();
        initSetup();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panFilter = new javax.swing.JPanel();
        labCategory = new javax.swing.JLabel();
        txtCategory = new javax.swing.JTextField();
        labBrand = new javax.swing.JLabel();
        txtBrand = new javax.swing.JTextField();
        labTeam = new javax.swing.JLabel();
        txtTeam = new javax.swing.JTextField();
        labSleeves = new javax.swing.JLabel();
        labShirtName = new javax.swing.JLabel();
        labPlayer = new javax.swing.JLabel();
        txtPlayer = new javax.swing.JTextField();
        txtShirtName = new javax.swing.JTextField();
        txtSleeves = new javax.swing.JTextField();
        labNumber = new javax.swing.JLabel();
        txtNumber = new javax.swing.JTextField();
        labColor = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        labSize = new javax.swing.JLabel();
        txtSize = new javax.swing.JTextField();
        btClearProductSearch = new javax.swing.JButton();
        btProductSearch = new javax.swing.JButton();
        panTbSearch = new javax.swing.JPanel();
        panGrid = new javax.swing.JScrollPane();
        tbProduct = new javax.swing.JTable();
        panFooter = new javax.swing.JPanel();
        btCreate = new javax.swing.JButton();
        btRead = new javax.swing.JButton();
        btUpdate = new javax.swing.JButton();
        btDelete = new javax.swing.JButton();
        btClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panFilter.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Filters"));

        labCategory.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        labCategory.setText("Category");

        txtCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCategoryActionPerformed(evt);
            }
        });

        labBrand.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        labBrand.setText("Brand");

        txtBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBrandActionPerformed(evt);
            }
        });

        labTeam.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        labTeam.setText("Team");

        txtTeam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTeamActionPerformed(evt);
            }
        });

        labSleeves.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        labSleeves.setText("Sleeves");

        labShirtName.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        labShirtName.setText("ShirtName");

        labPlayer.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        labPlayer.setText("Player");

        txtPlayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlayerActionPerformed(evt);
            }
        });

        txtShirtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtShirtNameActionPerformed(evt);
            }
        });

        txtSleeves.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSleevesActionPerformed(evt);
            }
        });

        labNumber.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        labNumber.setText("Number");

        txtNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumberActionPerformed(evt);
            }
        });

        labColor.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        labColor.setText("Color");

        txtColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtColorActionPerformed(evt);
            }
        });

        labSize.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        labSize.setText("Size");

        txtSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSizeActionPerformed(evt);
            }
        });

        btClearProductSearch.setText("Clear");
        btClearProductSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClearProductSearchActionPerformed(evt);
            }
        });

        btProductSearch.setText("Search");
        btProductSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProductSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panFilterLayout = new javax.swing.GroupLayout(panFilter);
        panFilter.setLayout(panFilterLayout);
        panFilterLayout.setHorizontalGroup(
            panFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panFilterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(panFilterLayout.createSequentialGroup()
                        .addComponent(labTeam)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTeam, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panFilterLayout.createSequentialGroup()
                        .addComponent(labCategory)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panFilterLayout.createSequentialGroup()
                        .addComponent(labBrand)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labPlayer)
                    .addComponent(labShirtName)
                    .addComponent(labSleeves))
                .addGap(8, 8, 8)
                .addGroup(panFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSleeves, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtShirtName, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labColor)
                    .addComponent(labNumber)
                    .addComponent(labSize))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panFilterLayout.createSequentialGroup()
                        .addGroup(panFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSize, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(panFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btClearProductSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btProductSearch))))
                .addContainerGap(144, Short.MAX_VALUE))
        );
        panFilterLayout.setVerticalGroup(
            panFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panFilterLayout.createSequentialGroup()
                .addGroup(panFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panFilterLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(panFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(labCategory)
                                .addComponent(txtCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labPlayer))
                            .addGroup(panFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labNumber)))
                        .addGap(20, 20, 20)
                        .addGroup(panFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labShirtName)
                            .addComponent(txtShirtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labBrand)
                            .addComponent(labColor)
                            .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 20, Short.MAX_VALUE)
                        .addGroup(panFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTeam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labSleeves)
                            .addComponent(txtSleeves, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labTeam)
                            .addComponent(labSize)))
                    .addGroup(panFilterLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panFilterLayout.createSequentialGroup()
                                .addComponent(btProductSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btClearProductSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(32, 32, 32))
        );

        panTbSearch.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Search Table"));

        tbProduct.setModel(this.tbProductModel);
        panGrid.setViewportView(tbProduct);

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
                .addContainerGap()
                .addComponent(panFilter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panTbSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(panFooter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCreateActionPerformed
        try {
            Object answer = JOptionPane.showInputDialog(null,
                    "Choose a type below to be created", null, 3, null,
                    new String[]{"Common", "Shirt's"}, null);
            if (answer != null) {
                if (answer.equals("Common")) {
                    Product newProduct = productManager.create(0);
                    tbProductModel.addObjectRow(newProduct);
                } else if (answer.equals("Shirt's")) {
                    Shirt newShirt = (Shirt) productManager.create(1);
                    tbProductModel.addObjectRow(newShirt);
                }
            }
        } catch (Exception ex) {
            showErrorMessage(ex.getMessage());
        }
        tbProduct.clearSelection();
    }//GEN-LAST:event_btCreateActionPerformed

    private void btReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btReadActionPerformed
        if (rowIsSelected(tbProduct)) {
            try {
                Product productSelected = getObjectSelectedInTb(tbProduct, tbProductModel);
                productManager.read(productSelected);
            } catch (Exception ex) {
                showErrorMessage(ex.getMessage());
            }
            tbProduct.clearSelection();
        }
    }//GEN-LAST:event_btReadActionPerformed

    private void btUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUpdateActionPerformed
        if (rowIsSelected(tbProduct)) {
            Product productSelected = getObjectSelectedInTb(tbProduct, tbProductModel);
            Product productOriginal = new Product(productSelected);
            try {
                Product updatedProduct = productManager.update(productSelected);
                tbProductModel.updateObjectRow(productSelected, updatedProduct);
            } catch (Exception ex) {
                showErrorMessage(ex.getMessage());
                tbProductModel.updateObjectRow(productSelected, productOriginal);
            }
            tbProduct.clearSelection();
        }
    }//GEN-LAST:event_btUpdateActionPerformed

    private void btDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteActionPerformed
        if (rowIsSelected(tbProduct)) {
            try {
                int answer = JOptionPane.showConfirmDialog(null,
                        "Are you sure?", null, 0, 2);
                if (answer == 0) {
                    Product productSelected = getObjectSelectedInTb(tbProduct, tbProductModel);
                    productManager.delete(productSelected);
                    tbProductModel.removeObjectRow(tbProduct.getSelectedRow());
                }
            } catch (Exception ex) {
                showErrorMessage(ex.getMessage());
            }
            tbProduct.clearSelection();
        }
    }//GEN-LAST:event_btDeleteActionPerformed

    private void btCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCloseActionPerformed
        tbProduct.clearSelection();
        this.dispose();
    }//GEN-LAST:event_btCloseActionPerformed

    private void txtCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCategoryActionPerformed
        filterTbProduct();
    }//GEN-LAST:event_txtCategoryActionPerformed

    private void txtBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBrandActionPerformed
        filterTbProduct();
    }//GEN-LAST:event_txtBrandActionPerformed

    private void txtTeamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTeamActionPerformed
        filterTbProduct();
    }//GEN-LAST:event_txtTeamActionPerformed

    private void txtPlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlayerActionPerformed
        filterTbProduct();
    }//GEN-LAST:event_txtPlayerActionPerformed

    private void txtShirtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtShirtNameActionPerformed
        filterTbProduct();
    }//GEN-LAST:event_txtShirtNameActionPerformed

    private void txtSleevesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSleevesActionPerformed
        filterTbProduct();
    }//GEN-LAST:event_txtSleevesActionPerformed

    private void txtNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumberActionPerformed
        filterTbProduct();
    }//GEN-LAST:event_txtNumberActionPerformed

    private void txtColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtColorActionPerformed
        filterTbProduct();
    }//GEN-LAST:event_txtColorActionPerformed

    private void txtSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSizeActionPerformed
        filterTbProduct();
    }//GEN-LAST:event_txtSizeActionPerformed

    private void btClearProductSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClearProductSearchActionPerformed
        clearProductFilters();
    }//GEN-LAST:event_btClearProductSearchActionPerformed

    private void btProductSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProductSearchActionPerformed
        filterTbProduct();
    }//GEN-LAST:event_btProductSearchActionPerformed

    public void initSetup() {
        txtCategory.setDocument(new TxtModelsTypes(TxtTypes.STRING));
        txtBrand.setDocument(new TxtModelsTypes(TxtTypes.STRING));
        txtTeam.setDocument(new TxtModelsTypes(TxtTypes.STRING));
        txtPlayer.setDocument(new TxtModelsTypes(TxtTypes.STRING));
        txtShirtName.setDocument(new TxtModelsTypes(TxtTypes.STRING));
        txtSleeves.setDocument(new TxtModelsTypes(TxtTypes.STRING));
        txtNumber.setDocument(new TxtModelsTypes(TxtTypes.INTEGER));
        txtColor.setDocument(new TxtModelsTypes(TxtTypes.STRING));
        txtSize.setDocument(new TxtModelsTypes(TxtTypes.STRING));
    }

    public void clearProductFilters() {
        txtCategory.setText("");
        txtBrand.setText("");
        txtTeam.setText("");
        txtPlayer.setText("");
        txtShirtName.setText("");
        txtSleeves.setText("");
        txtNumber.setText("");
        txtColor.setText("");
        txtSize.setText("");
        tbProduct.setRowSorter(null);
    }

    public boolean productFiltersAreEmpty() {
        return txtCategory.getText().isEmpty() && txtBrand.getText().isEmpty()
                && txtTeam.getText().isEmpty() && txtPlayer.getText().isEmpty()
                && txtShirtName.getText().isEmpty() && txtSleeves.getText().isEmpty()
                && txtNumber.getText().isEmpty() && txtColor.getText().isEmpty()
                && txtSize.getText().isEmpty();
    }

    public void filterTbProduct() {
        if (!productFiltersAreEmpty()) {
            String[] filters = {txtCategory.getText(), txtBrand.getText(),
                txtTeam.getText(), txtPlayer.getText(), txtShirtName.getText(),
                txtSleeves.getText(), txtNumber.getText(), txtColor.getText(),
                txtSize.getText()};
            tbProduct.setRowSorter(tbProductModel.getRowSorter(filters));
        } else {
            tbProduct.setRowSorter(null);
        }
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProductCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ProductCRUD dialog = new ProductCRUD(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btClearProductSearch;
    private javax.swing.JButton btClose;
    private javax.swing.JButton btCreate;
    private javax.swing.JButton btDelete;
    private javax.swing.JButton btProductSearch;
    private javax.swing.JButton btRead;
    private javax.swing.JButton btUpdate;
    private javax.swing.JLabel labBrand;
    private javax.swing.JLabel labCategory;
    private javax.swing.JLabel labColor;
    private javax.swing.JLabel labNumber;
    private javax.swing.JLabel labPlayer;
    private javax.swing.JLabel labShirtName;
    private javax.swing.JLabel labSize;
    private javax.swing.JLabel labSleeves;
    private javax.swing.JLabel labTeam;
    private javax.swing.JPanel panFilter;
    private javax.swing.JPanel panFooter;
    private javax.swing.JScrollPane panGrid;
    private javax.swing.JPanel panTbSearch;
    private javax.swing.JTable tbProduct;
    private javax.swing.JTextField txtBrand;
    private javax.swing.JTextField txtCategory;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtNumber;
    private javax.swing.JTextField txtPlayer;
    private javax.swing.JTextField txtShirtName;
    private javax.swing.JTextField txtSize;
    private javax.swing.JTextField txtSleeves;
    private javax.swing.JTextField txtTeam;
    // End of variables declaration//GEN-END:variables
}
