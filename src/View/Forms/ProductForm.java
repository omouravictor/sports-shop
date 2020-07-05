package View.Forms;

import Model.Classes.AbstractJDialog;
import Model.Classes.CostFormatter;
import Model.Classes.TxtModelsTypes;
import Model.Classes.TxtTypes;
import Model.EntitiesClasses.Brand;
import Model.EntitiesClasses.Category;
import Model.EntitiesClasses.Product;
import Model.Interfaces.IForms;
import Model.Tables.TbBrandModel;
import Model.Tables.TbCategoryModel;

public class ProductForm extends AbstractJDialog<Product> implements IForms<Product> {

    private boolean isConfirmed = false;
    private TbBrandModel tbBrandSearchModel;
    private TbCategoryModel tbCategorySearchModel;
    private TbBrandModel tbAddedBrandModel = new TbBrandModel();
    private TbCategoryModel tbAddedCategoryModel = new TbCategoryModel();
    private final CostFormatter costFormatter = new CostFormatter();

    public ProductForm(java.awt.Frame parent, boolean modal,
            TbCategoryModel tbCategorySearchModel, TbBrandModel tbBrandSearchModel) {
        super(parent, modal);
        this.tbCategorySearchModel = tbCategorySearchModel;
        this.tbBrandSearchModel = tbBrandSearchModel;
        initComponents();
        initSetup();
    }

    public ProductForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        initSetup();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labTitle = new javax.swing.JLabel();
        btOk = new javax.swing.JButton();
        btCancel = new javax.swing.JButton();
        panInputs = new javax.swing.JPanel();
        panGrid2 = new javax.swing.JScrollPane();
        tbBrandSearch = new javax.swing.JTable();
        btRemoveCategory = new javax.swing.JButton();
        btAddCategory = new javax.swing.JButton();
        txtCategory = new javax.swing.JTextField();
        labBrand = new javax.swing.JLabel();
        labCategory = new javax.swing.JLabel();
        panGrid3 = new javax.swing.JScrollPane();
        tbCategorySearch = new javax.swing.JTable();
        txtBrand = new javax.swing.JTextField();
        btAddBrand = new javax.swing.JButton();
        btRemoveBrand = new javax.swing.JButton();
        panGrid4 = new javax.swing.JScrollPane();
        tbAddedCategory = new javax.swing.JTable();
        txtSize = new javax.swing.JTextField();
        txtPlayerPresent = new javax.swing.JTextField();
        labCost = new javax.swing.JLabel();
        txtCost = new javax.swing.JFormattedTextField();
        labNumberPresent = new javax.swing.JLabel();
        labSize = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        txtNumStock = new javax.swing.JTextField();
        labNumStock = new javax.swing.JLabel();
        txtNumberPresent = new javax.swing.JTextField();
        labPlayerPresent = new javax.swing.JLabel();
        labR$ = new javax.swing.JLabel();
        txtTeam = new javax.swing.JTextField();
        labTeam = new javax.swing.JLabel();
        labColor = new javax.swing.JLabel();
        btCategorySearch = new javax.swing.JButton();
        btBrandSearch = new javax.swing.JButton();
        labCategorySelected = new javax.swing.JLabel();
        labBrandSelected = new javax.swing.JLabel();
        panGrid6 = new javax.swing.JScrollPane();
        tbAddedBrand = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        labTitle.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labTitle.setText("Product");
        labTitle.setToolTipText("");
        labTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btOk.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btOk.setText("Ok");
        btOk.setMaximumSize(new java.awt.Dimension(67, 25));
        btOk.setMinimumSize(new java.awt.Dimension(67, 25));
        btOk.setPreferredSize(new java.awt.Dimension(67, 25));
        btOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOkActionPerformed(evt);
            }
        });

        btCancel.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btCancel.setText("Cancel");
        btCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelActionPerformed(evt);
            }
        });

        panInputs.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Search Tables"));

        tbBrandSearch.setModel(this.tbBrandSearchModel);
        panGrid2.setViewportView(tbBrandSearch);

        btRemoveCategory.setText("Remove");
        btRemoveCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoveCategoryActionPerformed(evt);
            }
        });

        btAddCategory.setText("Add");
        btAddCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddCategoryActionPerformed(evt);
            }
        });

        txtCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCategoryActionPerformed(evt);
            }
        });

        labBrand.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        labBrand.setText("Brand");

        labCategory.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        labCategory.setText("Category");

        tbCategorySearch.setModel(this.tbCategorySearchModel);
        panGrid3.setViewportView(tbCategorySearch);

        txtBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBrandActionPerformed(evt);
            }
        });

        btAddBrand.setText("Add");
        btAddBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddBrandActionPerformed(evt);
            }
        });

        btRemoveBrand.setText("Remove");
        btRemoveBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoveBrandActionPerformed(evt);
            }
        });

        tbAddedCategory.setModel(this.tbAddedCategoryModel);
        panGrid4.setViewportView(tbAddedCategory);

        labCost.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        labCost.setText("Cost*");

        txtCost.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,###.00"))));

        labNumberPresent.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        labNumberPresent.setText("Number Present");

        labSize.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        labSize.setText("Size*");

        labNumStock.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        labNumStock.setText("NumStock*");

        labPlayerPresent.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        labPlayerPresent.setText("Player Present");

        labR$.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        labR$.setText("R$");

        labTeam.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        labTeam.setText("Team*");

        labColor.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        labColor.setText("Color*");

        btCategorySearch.setText("Search");
        btCategorySearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCategorySearchActionPerformed(evt);
            }
        });

        btBrandSearch.setText("Search");
        btBrandSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBrandSearchActionPerformed(evt);
            }
        });

        labCategorySelected.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        labCategorySelected.setText("Category Selected*");

        labBrandSelected.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        labBrandSelected.setText("Brand Selected*");

        tbAddedBrand.setModel(this.tbAddedBrandModel);
        panGrid6.setViewportView(tbAddedBrand);

        javax.swing.GroupLayout panInputsLayout = new javax.swing.GroupLayout(panInputs);
        panInputs.setLayout(panInputsLayout);
        panInputsLayout.setHorizontalGroup(
            panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panInputsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panInputsLayout.createSequentialGroup()
                        .addGroup(panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panInputsLayout.createSequentialGroup()
                                .addGroup(panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labNumStock)
                                    .addComponent(labCost, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(labR$)
                                .addGap(2, 2, 2)
                                .addGroup(panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtNumStock, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                                    .addComponent(txtCost)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panInputsLayout.createSequentialGroup()
                                .addGroup(panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labColor, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labSize, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                                .addGroup(panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSize)
                                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(181, 181, 181)
                        .addGroup(panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panInputsLayout.createSequentialGroup()
                                .addComponent(labNumberPresent)
                                .addGap(26, 26, 26)
                                .addComponent(txtNumberPresent, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panInputsLayout.createSequentialGroup()
                                .addGroup(panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labPlayerPresent)
                                    .addComponent(labTeam, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addGroup(panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPlayerPresent, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                                    .addComponent(txtTeam))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panInputsLayout.createSequentialGroup()
                        .addGroup(panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panInputsLayout.createSequentialGroup()
                                .addComponent(btAddCategory)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btRemoveCategory)
                                .addGroup(panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panInputsLayout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addComponent(panGrid4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                    .addGroup(panInputsLayout.createSequentialGroup()
                                        .addGap(72, 72, 72)
                                        .addComponent(labCategorySelected)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(panInputsLayout.createSequentialGroup()
                                .addComponent(labCategory)
                                .addGap(9, 9, 9)
                                .addComponent(txtCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btCategorySearch))
                            .addComponent(panGrid3, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panInputsLayout.createSequentialGroup()
                                .addGroup(panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(panGrid2, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panInputsLayout.createSequentialGroup()
                                        .addComponent(labBrand)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btBrandSearch)))
                                .addContainerGap())
                            .addGroup(panInputsLayout.createSequentialGroup()
                                .addComponent(btAddBrand)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btRemoveBrand)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panInputsLayout.createSequentialGroup()
                                        .addComponent(labBrandSelected)
                                        .addGap(65, 65, 65))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panInputsLayout.createSequentialGroup()
                                        .addComponent(panGrid6, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap())))))))
        );
        panInputsLayout.setVerticalGroup(
            panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panInputsLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panInputsLayout.createSequentialGroup()
                        .addGroup(panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labCategory)
                            .addComponent(btCategorySearch))
                        .addGap(18, 18, 18)
                        .addComponent(panGrid3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panInputsLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btAddCategory)
                                    .addComponent(btRemoveCategory)))
                            .addGroup(panInputsLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(labCategorySelected)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panGrid4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panInputsLayout.createSequentialGroup()
                        .addGroup(panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labBrand)
                            .addComponent(txtBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btBrandSearch))
                        .addGap(18, 18, 18)
                        .addComponent(panGrid2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btAddBrand)
                                .addComponent(btRemoveBrand))
                            .addGroup(panInputsLayout.createSequentialGroup()
                                .addComponent(labBrandSelected)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panGrid6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labR$)
                    .addComponent(labCost)
                    .addComponent(labTeam)
                    .addComponent(txtTeam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labPlayerPresent)
                    .addComponent(txtPlayerPresent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labNumStock))
                .addGap(18, 18, 18)
                .addGroup(panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labColor)
                    .addComponent(labNumberPresent)
                    .addComponent(txtNumberPresent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labSize))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 698, Short.MAX_VALUE))
                    .addComponent(panInputs, javax.swing.GroupLayout.DEFAULT_SIZE, 775, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btOk, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btCancel)
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labTitle)
                .addGap(18, 18, 18)
                .addComponent(panInputs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btOk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCancel))
                .addGap(25, 25, 25))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOkActionPerformed
        if (checkAll()) {
            isConfirmed = true;
            this.dispose();
            clearAllFilters();
            clearAllSelectedRows();
        }
    }//GEN-LAST:event_btOkActionPerformed

    private void btCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelActionPerformed
        isConfirmed = false;
        this.dispose();
        clearAllFilters();
        clearAllSelectedRows();
    }//GEN-LAST:event_btCancelActionPerformed

    private void btAddCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddCategoryActionPerformed
        if (!categoryIsAdded()) {
            int row = tbCategorySearch.getSelectedRow();
            Category addedClient = tbCategorySearchModel.getObjectByRow(row);
            tbAddedCategoryModel.addObjectRow(addedClient);
        }
    }//GEN-LAST:event_btAddCategoryActionPerformed

    private void btRemoveCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoveCategoryActionPerformed
        tbAddedCategoryModel.removeObjectRow(0);
    }//GEN-LAST:event_btRemoveCategoryActionPerformed

    private void btAddBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddBrandActionPerformed
        if (!brandIsAdded()) {
            int row = tbBrandSearch.getSelectedRow();
            Brand addedBrand = tbBrandSearchModel.getObjectByRow(row);
            tbAddedBrandModel.addObjectRow(addedBrand);
        }
    }//GEN-LAST:event_btAddBrandActionPerformed

    private void btRemoveBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoveBrandActionPerformed
        tbAddedBrandModel.removeObjectRow(0);
    }//GEN-LAST:event_btRemoveBrandActionPerformed

    private void btCategorySearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCategorySearchActionPerformed
        filterTbCategorySearch();
    }//GEN-LAST:event_btCategorySearchActionPerformed

    private void btBrandSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBrandSearchActionPerformed
        filterTbBrandSearch();
    }//GEN-LAST:event_btBrandSearchActionPerformed

    private void txtCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCategoryActionPerformed
        filterTbCategorySearch();
    }//GEN-LAST:event_txtCategoryActionPerformed

    private void txtBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBrandActionPerformed
        filterTbBrandSearch();
    }//GEN-LAST:event_txtBrandActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProductForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ProductForm dialog = new ProductForm(new javax.swing.JFrame(), true);
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

    @Override
    public void setVisibleAll() {
        btOk.setVisible(true);
        btCancel.setVisible(true);
        labR$.setVisible(true);
    }

    @Override
    public void setEnabledAll() {
        tbBrandSearch.setEnabled(true);
        tbAddedBrand.setEnabled(true);
        tbCategorySearch.setEnabled(true);
        tbAddedCategory.setEnabled(true);
        btBrandSearch.setEnabled(true);
        btCategorySearch.setEnabled(true);
        btAddBrand.setEnabled(true);
        btAddCategory.setEnabled(true);
        btRemoveBrand.setEnabled(true);
        btRemoveCategory.setEnabled(true);
        txtCost.setEnabled(true);
    }

    @Override
    public void setNoEnabledAll() {
        tbBrandSearch.setEnabled(false);
        tbAddedBrand.setEnabled(false);
        tbCategorySearch.setEnabled(false);
        tbAddedCategory.setEnabled(false);
        btBrandSearch.setEnabled(false);
        btCategorySearch.setEnabled(false);
        btAddBrand.setEnabled(false);
        btAddCategory.setEnabled(false);
        btRemoveBrand.setEnabled(false);
        btRemoveCategory.setEnabled(false);
        txtCost.setEnabled(false);
    }

    @Override
    public void setEditableAll() {
        txtSize.setEditable(true);
        txtColor.setEditable(true);
        txtNumStock.setEditable(true);
        txtTeam.setEditable(true);
        txtPlayerPresent.setEditable(true);
        txtNumberPresent.setEditable(true);
        txtCategory.setEditable(true);
        txtBrand.setEditable(true);
    }

    @Override
    public void setNoEditableAll() {
        txtSize.setEditable(false);
        txtColor.setEditable(false);
        txtNumStock.setEditable(false);
        txtTeam.setEditable(false);
        txtPlayerPresent.setEditable(false);
        txtNumberPresent.setEditable(false);
        txtCategory.setEditable(false);
        txtBrand.setEditable(false);
    }

    @Override
    public void setEmptyAll() {
        tbAddedCategoryModel.clearList();
        tbAddedBrandModel.clearList();
        txtCategory.setText("");
        txtBrand.setText("");
        txtSize.setText("");
        txtCost.setText("");
        txtColor.setText("");
        txtNumStock.setText("");
        txtTeam.setText("");
        txtPlayerPresent.setText("");
        txtNumberPresent.setText("");
    }

    @Override
    public void prepareCreate() {
        setVisibleAll();
        setEnabledAll();
        setEditableAll();
        setEmptyAll();
        btOk.setText("Create");
        btCancel.setText("Cancel");
    }

    @Override
    public Product getObjectCreated() {
        Product newProduct = new Product();
        newProduct.setBrand(tbAddedBrandModel.getObjectByRow(0));
        newProduct.setCategory(tbAddedCategoryModel.getObjectByRow(0));
        newProduct.setSizeProduct(txtSize.getText());
        newProduct.setColor(txtColor.getText());
        newProduct.setCost(parseTxtCostToDouble(txtCost));
        newProduct.setNumInStock(parseTxtTextToInt(txtNumStock));
        newProduct.setNumberPresent(txtNumberPresent.getText());
        newProduct.setPlayerPresent(txtPlayerPresent.getText());
        newProduct.setTeamName(txtTeam.getText());
        return newProduct;
    }

    @Override
    public Product create() {
        prepareCreate();
        showForm();
        if (isConfirmed) {
            return getObjectCreated();
        }
        return null;
    }

    @Override
    public void prepareRead() {
        btOk.setVisible(false);
        labR$.setVisible(false);
        btCancel.setText("Close");
        tbAddedCategoryModel.clearList();
        tbAddedBrandModel.clearList();
        setNoEditableAll();
        setNoEnabledAll();
    }

    @Override
    public void read(Product t) {
        prepareRead();
        tbAddedBrandModel.addObjectRow(t.getBrand());
        tbAddedCategoryModel.addObjectRow(t.getCategory());
        txtSize.setText(t.getSizeProduct());
        txtCost.setText(costFormatter.formatCost(t.getCost()));
        txtColor.setText(t.getColor());
        txtNumStock.setText("" + t.getNumInStock());
        txtTeam.setText(t.getTeamName());
        txtPlayerPresent.setText(t.getPlayerPresent());
        txtNumberPresent.setText(t.getNumberPresent());
        showForm();
    }

    @Override
    public void prepareUpdate(Product t) {
        setVisibleAll();
        setEnabledAll();
        setEditableAll();
        setEmptyAll();
        btOk.setText("Update");
        btCancel.setText("Cancel");
        tbAddedBrandModel.addObjectRow(t.getBrand());
        tbAddedCategoryModel.addObjectRow(t.getCategory());
        txtSize.setText(t.getSizeProduct());
        txtCost.setText(costFormatter.formatNumber(t.getCost()));
        txtColor.setText(t.getColor());
        txtNumStock.setText("" + t.getNumInStock());
        txtTeam.setText(t.getTeamName());
        txtPlayerPresent.setText(t.getPlayerPresent());
        txtNumberPresent.setText(t.getNumberPresent());
    }

    @Override
    public Product getObjectUpdated(Product oldT) {
        Product updatedProduct = oldT;
        updatedProduct.setBrand(tbAddedBrandModel.getObjectByRow(0));
        updatedProduct.setCategory(tbAddedCategoryModel.getObjectByRow(0));
        updatedProduct.setSizeProduct(txtSize.getText());
        updatedProduct.setColor(txtColor.getText());
        updatedProduct.setCost(parseTxtCostToDouble(txtCost));
        updatedProduct.setNumInStock(parseTxtTextToInt(txtNumStock));
        updatedProduct.setNumberPresent(txtNumberPresent.getText());
        updatedProduct.setPlayerPresent(txtPlayerPresent.getText());
        updatedProduct.setTeamName(txtTeam.getText());
        return updatedProduct;
    }

    @Override
    public Product update(Product t) {
        prepareUpdate(t);
        showForm();
        if (isConfirmed) {
            return getObjectUpdated(t);
        }
        return null;
    }

    @Override
    public void setTxtModels() {
        // When the txt already has a Mask, it doesn't needs a txtModel
        txtCategory.setDocument(new TxtModelsTypes(TxtTypes.String));
        txtBrand.setDocument(new TxtModelsTypes(TxtTypes.String));
        txtSize.setDocument(new TxtModelsTypes(TxtTypes.String));
        txtColor.setDocument(new TxtModelsTypes(TxtTypes.String));
        txtTeam.setDocument(new TxtModelsTypes(TxtTypes.String));
        txtPlayerPresent.setDocument(new TxtModelsTypes(TxtTypes.String));
        txtNumStock.setDocument(new TxtModelsTypes(TxtTypes.Integer));
        txtNumberPresent.setDocument(new TxtModelsTypes(TxtTypes.Integer));
    }

    @Override
    public boolean fieldsAreEmpty() {
        if (!brandIsAdded() || !categoryIsAdded()
                || txtNumStock.getText().isEmpty()
                || txtColor.getText().isEmpty()
                || txtSize.getText().isEmpty()
                || txtTeam.getText().isEmpty()
                || "".equals(txtCost.getText())) {
            showErrorMessage("Fill all the required fields.");
            return true;
        }
        return false;
    }

    @Override
    public boolean checkAll() {
        return !fieldsAreEmpty();
    }

    @Override
    public void initSetup() {
        setTxtModels();
    }

    @Override
    public void showForm() {
        this.setVisible(true);
    }

    public void filterTbCategorySearch() {
        if (!txtCategory.getText().isEmpty()) {
            String filter = txtCategory.getText();
            tbCategorySearchModel.filter(tbCategorySearch, filter);
        } else {
            tbCategorySearch.setRowSorter(null);
        }
    }

    public void filterTbBrandSearch() {
        if (!txtBrand.getText().isEmpty()) {
            String filter = txtBrand.getText();
            tbBrandSearchModel.filter(tbBrandSearch, filter);
        } else {
            tbBrandSearch.setRowSorter(null);
        }
    }

    public void clearAllSelectedRows() {
        tbBrandSearch.getSelectionModel().clearSelection();
        tbCategorySearch.getSelectionModel().clearSelection();
    }

    public void clearAllFilters() {
        tbBrandSearch.setRowSorter(null);
        tbCategorySearch.setRowSorter(null);
    }

    public boolean brandIsAdded() {
        return tbAddedBrand.getRowCount() != 0;
    }

    public boolean categoryIsAdded() {
        return tbAddedCategory.getRowCount() != 0;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAddBrand;
    private javax.swing.JButton btAddCategory;
    private javax.swing.JButton btBrandSearch;
    private javax.swing.JButton btCancel;
    private javax.swing.JButton btCategorySearch;
    private javax.swing.JButton btOk;
    private javax.swing.JButton btRemoveBrand;
    private javax.swing.JButton btRemoveCategory;
    private javax.swing.JLabel labBrand;
    private javax.swing.JLabel labBrandSelected;
    private javax.swing.JLabel labCategory;
    private javax.swing.JLabel labCategorySelected;
    private javax.swing.JLabel labColor;
    private javax.swing.JLabel labCost;
    private javax.swing.JLabel labNumStock;
    private javax.swing.JLabel labNumberPresent;
    private javax.swing.JLabel labPlayerPresent;
    private javax.swing.JLabel labR$;
    private javax.swing.JLabel labSize;
    private javax.swing.JLabel labTeam;
    private javax.swing.JLabel labTitle;
    private javax.swing.JScrollPane panGrid2;
    private javax.swing.JScrollPane panGrid3;
    private javax.swing.JScrollPane panGrid4;
    private javax.swing.JScrollPane panGrid6;
    private javax.swing.JPanel panInputs;
    private javax.swing.JTable tbAddedBrand;
    private javax.swing.JTable tbAddedCategory;
    private javax.swing.JTable tbBrandSearch;
    private javax.swing.JTable tbCategorySearch;
    private javax.swing.JTextField txtBrand;
    private javax.swing.JTextField txtCategory;
    private javax.swing.JTextField txtColor;
    private javax.swing.JFormattedTextField txtCost;
    private javax.swing.JTextField txtNumStock;
    private javax.swing.JTextField txtNumberPresent;
    private javax.swing.JTextField txtPlayerPresent;
    private javax.swing.JTextField txtSize;
    private javax.swing.JTextField txtTeam;
    // End of variables declaration//GEN-END:variables
}
