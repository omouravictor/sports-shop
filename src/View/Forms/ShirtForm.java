package View.Forms;

import Model.Classes.AbstractJDialog;
import Model.Classes.CostFormatter;
import Model.Classes.Sleeves;
import Model.Classes.TxtModelsTypes;
import Model.Classes.TxtTypes;
import Model.ComboBoxs.SimpleComboBoxModel;
import Model.EntitiesClasses.Brand;
import Model.EntitiesClasses.Category;
import Model.EntitiesClasses.Shirt;
import Model.Interfaces.IForms;

public class ShirtForm extends AbstractJDialog<Shirt> implements IForms<Shirt> {

    private boolean isConfirmed = false;
    private final SimpleComboBoxModel<Brand> cbBrandModel = new SimpleComboBoxModel();
    private final CostFormatter costFormatter = new CostFormatter();

    public ShirtForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        initSetup();
        Brand a = new Brand("Nike");
        cbBrandModel.addObjectInCombo(a);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupSleeves = new javax.swing.ButtonGroup();
        labTitle = new javax.swing.JLabel();
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
        txtPlayerNameOnShirt = new javax.swing.JTextField();
        labPlayerNameOnShirt = new javax.swing.JLabel();
        rbShort = new javax.swing.JRadioButton();
        rbLong = new javax.swing.JRadioButton();
        labSleeves = new javax.swing.JLabel();
        txtCost = new javax.swing.JFormattedTextField();
        labR$ = new javax.swing.JLabel();
        labColor = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        labTitle.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labTitle.setText("Shirt");

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
        labPlayerPresent.setText("PlayerPresent");

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

        cbBrand.setModel(this.cbBrandModel);

        labPlayerNameOnShirt.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        labPlayerNameOnShirt.setText("PlayerNameOnShirt");

        buttonGroupSleeves.add(rbShort);
        rbShort.setText("Short");

        buttonGroupSleeves.add(rbLong);
        rbLong.setText("Long");

        labSleeves.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        labSleeves.setText("Sleeves*");

        txtCost.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,###.00"))));

        labR$.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        labR$.setText("R$");

        labColor.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        labColor.setText("Color*");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btOk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btCancel)
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labSize, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labCost, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labR$))
                            .addComponent(labNumStock))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtNumStock, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(82, 82, 82))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSize, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCost, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(49, 49, 49))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labSleeves)
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbShort)
                                    .addComponent(rbLong))))
                        .addGap(89, 89, 89)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labPlayerNameOnShirt)
                            .addComponent(labNumberPresent))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPlayerNameOnShirt, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumberPresent, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labTeam, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labPlayerPresent))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTeam, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPlayerPresent, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(labColor))
                        .addGap(54, 54, 54)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labTitle)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labBrand)
                            .addComponent(cbBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labTeam)
                            .addComponent(txtTeam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPlayerPresent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labPlayerPresent)
                            .addComponent(txtSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labSize))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labPlayerNameOnShirt)
                            .addComponent(txtPlayerNameOnShirt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labCost)
                            .addComponent(txtCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labR$))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNumStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labNumStock)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labNumberPresent)
                                    .addComponent(txtNumberPresent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(labColor)
                                .addComponent(txtColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(rbShort)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(labSleeves)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbLong)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btOk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCancel))
                .addGap(20, 20, 20))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOkActionPerformed
        if (checkAll()) {
            isConfirmed = true;
            this.dispose();
        }
    }//GEN-LAST:event_btOkActionPerformed

    private void btCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelActionPerformed
        isConfirmed = false;
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
            java.util.logging.Logger.getLogger(ShirtForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShirtForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShirtForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShirtForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ShirtForm dialog = new ShirtForm(new javax.swing.JFrame(), true);
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
    public void initSetup() {
        setTxtModels();
    }

    @Override
    public void setVisibleAll() {
        btOk.setVisible(true);
        btCancel.setVisible(true);
        labR$.setVisible(true);
    }

    @Override
    public void setEnabledAll() {
        cbBrand.setEnabled(true);
        txtCost.setEnabled(true);
        rbLong.setEnabled(true);
        rbShort.setEnabled(true);
    }

    @Override
    public void setNoEnabledAll() {
        cbBrand.setEnabled(false);
        txtCost.setEnabled(false);
        rbLong.setEnabled(false);
        rbShort.setEnabled(false);
    }

    @Override
    public void setEditableAll() {
        txtSize.setEditable(true);
        txtColor.setEditable(true);
        txtNumStock.setEditable(true);
        txtTeam.setEditable(true);
        txtPlayerPresent.setEditable(true);
        txtPlayerNameOnShirt.setEditable(true);
        txtNumberPresent.setEditable(true);
    }

    @Override
    public void setNoEditableAll() {
        txtSize.setEditable(false);
        txtColor.setEditable(false);
        txtNumStock.setEditable(false);
        txtTeam.setEditable(false);
        txtPlayerPresent.setEditable(false);
        txtPlayerNameOnShirt.setEditable(false);
        txtNumberPresent.setEditable(false);
    }

    @Override
    public void setEmptyAll() {
        cbBrand.setSelectedItem(null);
        txtSize.setText("");
        txtCost.setText("");
        txtColor.setText("");
        txtNumStock.setText("");
        txtTeam.setText("");
        txtPlayerPresent.setText("");
        txtPlayerNameOnShirt.setText("");
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
    public Shirt getObjectCreated() {
        Shirt newShirt = new Shirt();
        newShirt.setCategory(new Category("Shirt"));
        newShirt.setBrand((Brand) cbBrand.getSelectedItem());
        newShirt.setSizeProduct(txtSize.getText());
        newShirt.setColor(txtColor.getText());
        newShirt.setCost(parseTxtCostToDouble(txtCost));
        newShirt.setNumInStock(parseTxtTextToInt(txtNumStock));
        newShirt.setNumberPresent(txtNumberPresent.getText());
        newShirt.setPlayerPresent(txtPlayerPresent.getText());
        newShirt.setPlayerNameOnShirt(txtPlayerNameOnShirt.getText());
        newShirt.setSleeves(getSleeveSelected());
        newShirt.setTeamName(txtTeam.getText());
        return newShirt;
    }

    public Sleeves getSleeveSelected() {
        if (rbLong.isSelected()) {
            return Sleeves.Long;
        }
        return Sleeves.Short;
    }

    @Override
    public Shirt create() {
        prepareCreate();
        showForm();
        if (isConfirmed) {
            return getObjectCreated();
        }
        return null;
    }

    @Override
    public void read(Shirt t) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Shirt update(Shirt t) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setTxtModels() {
        // When the txt already has a Mask, it doesn't needs a txtModel
        txtSize.setDocument(new TxtModelsTypes(TxtTypes.String));
        txtColor.setDocument(new TxtModelsTypes(TxtTypes.String));
        txtTeam.setDocument(new TxtModelsTypes(TxtTypes.String));
        txtPlayerPresent.setDocument(new TxtModelsTypes(TxtTypes.String));
        txtPlayerNameOnShirt.setDocument(new TxtModelsTypes(TxtTypes.String));
        txtNumStock.setDocument(new TxtModelsTypes(TxtTypes.Integer));
        txtNumberPresent.setDocument(new TxtModelsTypes(TxtTypes.Integer));
    }

    @Override
    public boolean fieldsAreEmpty() {
        if (cbBrandModel.getSelectedItem() == null
                || txtNumStock.getText().isEmpty()
                || txtColor.getText().isEmpty()
                || txtTeam.getText().isEmpty()
                || txtSize.getText().isEmpty()
                || "".equals(txtCost.getText())
                || (!rbLong.isSelected() && !rbShort.isSelected())) {
            showErrorMessage("Fill all the required fields.");
            return true;
        }
        return false;
    }

    public boolean checkPlayerPresentAndPlayerNameOnShirt() {
        if (txtPlayerPresent.getText().isEmpty()
                && !txtPlayerNameOnShirt.getText().isEmpty()) {
            showErrorMessage("The field 'PlayerPresent' can not be empty when "
                    + "the field 'PlayerNameOnShirt' is filled, fill the field "
                    + "'PlayerPresent' first.");
            return false;
        }
        return true;
    }

    @Override
    public boolean checkAll() {
        return !fieldsAreEmpty() && checkPlayerPresentAndPlayerNameOnShirt();
    }

    @Override
    public void showForm() {
        this.setVisible(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancel;
    private javax.swing.JButton btOk;
    private javax.swing.ButtonGroup buttonGroupSleeves;
    private javax.swing.JComboBox<String> cbBrand;
    private javax.swing.JLabel labBrand;
    private javax.swing.JLabel labColor;
    private javax.swing.JLabel labCost;
    private javax.swing.JLabel labNumStock;
    private javax.swing.JLabel labNumberPresent;
    private javax.swing.JLabel labPlayerNameOnShirt;
    private javax.swing.JLabel labPlayerPresent;
    private javax.swing.JLabel labR$;
    private javax.swing.JLabel labSize;
    private javax.swing.JLabel labSleeves;
    private javax.swing.JLabel labTeam;
    private javax.swing.JLabel labTitle;
    private javax.swing.JRadioButton rbLong;
    private javax.swing.JRadioButton rbShort;
    private javax.swing.JTextField txtColor;
    private javax.swing.JFormattedTextField txtCost;
    private javax.swing.JTextField txtNumStock;
    private javax.swing.JTextField txtNumberPresent;
    private javax.swing.JTextField txtPlayerNameOnShirt;
    private javax.swing.JTextField txtPlayerPresent;
    private javax.swing.JTextField txtSize;
    private javax.swing.JTextField txtTeam;
    // End of variables declaration//GEN-END:variables

    @Override
    public void prepareRead() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void prepareUpdate(Shirt t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Shirt getObjectUpdated(Shirt oldT) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
