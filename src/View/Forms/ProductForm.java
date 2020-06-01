package View.Forms;

import Model.Classes.Product;
import Model.ComboBoxs.BrandComboBoxModel;
import Model.ComboBoxs.CategoryComboBoxModel;
import Interfaces.IForms;
import Model.Classes.Brand;
import Model.Classes.Category;
import Model.Classes.TxtModelsTypes;
import Model.Classes.TxtTypes;

public class ProductForm extends jFrameFather implements IForms<Product> {

    private final CategoryComboBoxModel categoryComboBoxModel = new CategoryComboBoxModel();
    private final BrandComboBoxModel brandComboBoxModel = new BrandComboBoxModel();

    public ProductForm() {
        initComponents();
        initSetup();
        Category c1 = new Category("Shirt");
        Category c2 = new Category("Mug");
        Brand b1 = new Brand("Nike");
        Brand b2 = new Brand("Adidas");
        categoryComboBoxModel.addCategoryInCombo(c1);
        categoryComboBoxModel.addCategoryInCombo(c2);
        brandComboBoxModel.addBrandInCombo(b1);
        brandComboBoxModel.addBrandInCombo(b2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labTitle = new javax.swing.JLabel();
        labCategory = new javax.swing.JLabel();
        labNumberPresent = new javax.swing.JLabel();
        labBrand = new javax.swing.JLabel();
        labCost = new javax.swing.JLabel();
        labNumStock = new javax.swing.JLabel();
        labTeam = new javax.swing.JLabel();
        labPlayerPresent = new javax.swing.JLabel();
        labSize = new javax.swing.JLabel();
        txtNumStock = new javax.swing.JTextField();
        txtSize = new javax.swing.JTextField();
        btOk = new javax.swing.JButton();
        btCancel = new javax.swing.JButton();
        txtNumberPresent = new javax.swing.JTextField();
        txtPlayerPresent = new javax.swing.JTextField();
        cbBrand = new javax.swing.JComboBox<>();
        txtTeam = new javax.swing.JTextField();
        cbCategory = new javax.swing.JComboBox<>();
        txtCost = new javax.swing.JFormattedTextField();
        labCost1 = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        labColor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        labTitle.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labTitle.setText("Product");

        labCategory.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        labCategory.setText("Category*");

        labNumberPresent.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        labNumberPresent.setText("Number Present");

        labBrand.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        labBrand.setText("Brand*");

        labCost.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        labCost.setText("Cost*");

        labNumStock.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        labNumStock.setText("NumStock*");

        labTeam.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        labTeam.setText("Team*");

        labPlayerPresent.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        labPlayerPresent.setText("Player Present");

        labSize.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        labSize.setText("Size*");

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

        txtCost.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,###.00"))));

        labCost1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        labCost1.setText("R$");

        labColor.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        labColor.setText("Color*");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(384, 408, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labCost, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labCost1)
                                .addGap(2, 2, 2))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(labCategory)
                                        .addComponent(labBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(labSize, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labColor, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCost, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSize, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btOk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(btCancel))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(labPlayerPresent)
                                                .addComponent(labNumberPresent))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(24, 24, 24)
                                                    .addComponent(txtNumberPresent, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(txtPlayerPresent, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(labNumStock)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtNumStock))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(labTeam, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtTeam, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(46, 46, 46))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(labTitle)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labCategory)
                    .addComponent(txtNumStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labNumStock)
                    .addComponent(cbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labBrand)
                    .addComponent(cbBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labTeam)
                    .addComponent(txtTeam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labSize)
                    .addComponent(txtSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPlayerPresent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labPlayerPresent))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labCost)
                    .addComponent(labNumberPresent)
                    .addComponent(txtNumberPresent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labCost1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labColor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btOk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCancel))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOkActionPerformed
        if (checkAll()) {
            this.dispose();
        }
    }//GEN-LAST:event_btOkActionPerformed

    private void btCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_btCancelActionPerformed

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
                new ProductForm().setVisible(true);
            }
        });
    }

    @Override
    public Product create() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void read(Product t) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Product update(Product t) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setTxtModels() {
        // When the txt already has a Mask, it doesn't needs a txtModel
        txtSize.setDocument(new TxtModelsTypes(TxtTypes.String));
        txtColor.setDocument(new TxtModelsTypes(TxtTypes.String));
        txtTeam.setDocument(new TxtModelsTypes(TxtTypes.String));
        txtPlayerPresent.setDocument(new TxtModelsTypes(TxtTypes.String));
        txtNumStock.setDocument(new TxtModelsTypes(TxtTypes.Integer));
        txtNumberPresent.setDocument(new TxtModelsTypes(TxtTypes.Integer));
    }

    @Override
    public boolean checkEmptyFields() {
        if (categoryComboBoxModel.getSelectedItem() == null || brandComboBoxModel.getSelectedItem() == null
                || txtNumStock.getText().isEmpty() || txtSize.getText().isEmpty() || "".equals(txtCost.getText())
                || txtTeam.getText().isEmpty() || txtColor.getText().isEmpty()) {
            showErrorMessage("Fill all the required fields.");
            return false;
        }
        return true;
    }

    @Override
    public boolean checkAll() {
        return checkEmptyFields();
    }

    public void initSetup() {
        setCombosModel();
        setTxtModels();
    }

    public void setCombosModel() {
        cbCategory.setModel(categoryComboBoxModel);
        cbBrand.setModel(brandComboBoxModel);
    }

    public double parseTxtCostTextToDouble() {
        if (!txtCost.getText().isEmpty()) {
            return Double.parseDouble(txtCost.getText().replaceAll("\\.", "").replace(",", "."));
        }
        return -1;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancel;
    private javax.swing.JButton btOk;
    private javax.swing.JComboBox<String> cbBrand;
    private javax.swing.JComboBox<String> cbCategory;
    private javax.swing.JLabel labBrand;
    private javax.swing.JLabel labCategory;
    private javax.swing.JLabel labColor;
    private javax.swing.JLabel labCost;
    private javax.swing.JLabel labCost1;
    private javax.swing.JLabel labNumStock;
    private javax.swing.JLabel labNumberPresent;
    private javax.swing.JLabel labPlayerPresent;
    private javax.swing.JLabel labSize;
    private javax.swing.JLabel labTeam;
    private javax.swing.JLabel labTitle;
    private javax.swing.JTextField txtColor;
    private javax.swing.JFormattedTextField txtCost;
    private javax.swing.JTextField txtNumStock;
    private javax.swing.JTextField txtNumberPresent;
    private javax.swing.JTextField txtPlayerPresent;
    private javax.swing.JTextField txtSize;
    private javax.swing.JTextField txtTeam;
    // End of variables declaration//GEN-END:variables
}
