package View.Forms;

import Model.Classes.AbstractJDialog;
import Model.Classes.CostFormatter;
import Model.Classes.Sleeves;
import Model.Classes.TxtModelsTypes;
import Model.Classes.TxtTypes;
import Model.EntitiesClasses.Brand;
import Model.EntitiesClasses.Category;
import Model.EntitiesClasses.Shirt;
import Model.Interfaces.IForms;
import Model.Tables.TbBrandModel;

public class ShirtForm extends AbstractJDialog<Shirt> implements IForms<Shirt> {

    private boolean isConfirmed = false;
    // Apagar o new do de baixo
    private TbBrandModel tbBrandSearchModel = new TbBrandModel();
    
    private TbBrandModel tbAddedBrandModel = new TbBrandModel();
    private final CostFormatter costFormatter = new CostFormatter();

    public ShirtForm(java.awt.Frame parent, boolean modal, TbBrandModel tbBrandSearchModel) {
        super(parent, modal);
        this.tbBrandSearchModel = tbBrandSearchModel;
        initComponents();
        initSetup();
    }

    public ShirtForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        initSetup();
        Brand b1 = new Brand("Nike");
        Brand b2 = new Brand("Adidas");
        tbBrandSearchModel.addObjectRow(b1);
        tbBrandSearchModel.addObjectRow(b2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btGroupSleeves = new javax.swing.ButtonGroup();
        labTitle = new javax.swing.JLabel();
        btOk = new javax.swing.JButton();
        btCancel = new javax.swing.JButton();
        panInputs = new javax.swing.JPanel();
        panGrid2 = new javax.swing.JScrollPane();
        tbBrandSearch = new javax.swing.JTable();
        labBrand = new javax.swing.JLabel();
        txtBrand = new javax.swing.JTextField();
        btAddBrand = new javax.swing.JButton();
        btRemoveBrand = new javax.swing.JButton();
        panGrid5 = new javax.swing.JScrollPane();
        tbAddedBrand = new javax.swing.JTable();
        txtSize = new javax.swing.JTextField();
        txtPlayerNameOnShirt = new javax.swing.JTextField();
        labCost = new javax.swing.JLabel();
        txtCost = new javax.swing.JFormattedTextField();
        labNumberPresent = new javax.swing.JLabel();
        labSize = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        txtNumStock = new javax.swing.JTextField();
        labNumStock = new javax.swing.JLabel();
        txtNumberPresent = new javax.swing.JTextField();
        labPlayerNameOnShirt = new javax.swing.JLabel();
        labR$ = new javax.swing.JLabel();
        txtTeam = new javax.swing.JTextField();
        labTeam = new javax.swing.JLabel();
        labColor = new javax.swing.JLabel();
        btBrandSearch = new javax.swing.JButton();
        labPlayerPresent = new javax.swing.JLabel();
        txtPlayerPresent = new javax.swing.JTextField();
        rbLong = new javax.swing.JRadioButton();
        rbShort = new javax.swing.JRadioButton();
        labSleeves = new javax.swing.JLabel();
        rbNoSleeves = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        labTitle.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labTitle.setText("Shirt");
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

        labBrand.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        labBrand.setText("Brand*");

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

        tbAddedBrand.setModel(this.tbAddedBrandModel);
        panGrid5.setViewportView(tbAddedBrand);

        labCost.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        labCost.setText("Cost*");

        txtCost.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,###.00"))));

        labNumberPresent.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        labNumberPresent.setText("Number Present");

        labSize.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        labSize.setText("Size*");

        labNumStock.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        labNumStock.setText("NumStock*");

        labPlayerNameOnShirt.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        labPlayerNameOnShirt.setText("Player Name on shirt");

        labR$.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        labR$.setText("R$");

        labTeam.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        labTeam.setText("Team*");

        labColor.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        labColor.setText("Color*");

        btBrandSearch.setText("Search");
        btBrandSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBrandSearchActionPerformed(evt);
            }
        });

        labPlayerPresent.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        labPlayerPresent.setText("Player Present");

        btGroupSleeves.add(rbLong);
        rbLong.setText("Long");

        btGroupSleeves.add(rbShort);
        rbShort.setText("Short");

        labSleeves.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        labSleeves.setText("Sleeves*");

        btGroupSleeves.add(rbNoSleeves);
        rbNoSleeves.setText("NoSleeves");

        javax.swing.GroupLayout panInputsLayout = new javax.swing.GroupLayout(panInputs);
        panInputs.setLayout(panInputsLayout);
        panInputsLayout.setHorizontalGroup(
            panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panInputsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addGroup(panInputsLayout.createSequentialGroup()
                            .addGroup(panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labColor, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labSize, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labTeam, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(45, 45, 45)
                            .addGroup(panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtTeam)
                                .addComponent(txtSize)
                                .addComponent(txtColor, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))))
                    .addGroup(panInputsLayout.createSequentialGroup()
                        .addComponent(btAddBrand)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btRemoveBrand))
                    .addComponent(panGrid2, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panInputsLayout.createSequentialGroup()
                        .addComponent(labBrand)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btBrandSearch)))
                .addGap(28, 28, 28)
                .addGroup(panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panInputsLayout.createSequentialGroup()
                        .addGroup(panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panGrid5, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panInputsLayout.createSequentialGroup()
                                .addGroup(panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labNumberPresent)
                                    .addComponent(labPlayerNameOnShirt)
                                    .addComponent(labPlayerPresent))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtPlayerNameOnShirt, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtNumberPresent, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtPlayerPresent, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panInputsLayout.createSequentialGroup()
                        .addComponent(labSleeves)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbLong)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbShort)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbNoSleeves)
                        .addContainerGap())))
        );
        panInputsLayout.setVerticalGroup(
            panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panInputsLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labBrand)
                    .addComponent(txtBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBrandSearch))
                .addGap(18, 18, 18)
                .addGroup(panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panGrid2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panGrid5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAddBrand)
                    .addComponent(btRemoveBrand))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panInputsLayout.createSequentialGroup()
                        .addGroup(panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panInputsLayout.createSequentialGroup()
                                .addGroup(panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labR$)
                                    .addComponent(labCost)
                                    .addComponent(labPlayerPresent))
                                .addGap(18, 18, 18)
                                .addGroup(panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panInputsLayout.createSequentialGroup()
                                        .addGroup(panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtNumStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(labNumStock))
                                        .addGap(18, 18, 18)
                                        .addGroup(panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(labColor)))
                                    .addGroup(panInputsLayout.createSequentialGroup()
                                        .addComponent(labPlayerNameOnShirt)
                                        .addGap(22, 22, 22)
                                        .addComponent(labNumberPresent))))
                            .addGroup(panInputsLayout.createSequentialGroup()
                                .addComponent(txtPlayerPresent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtPlayerNameOnShirt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtNumberPresent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labSize))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panInputsLayout.createSequentialGroup()
                        .addGroup(panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbLong)
                            .addComponent(rbShort)
                            .addComponent(labSleeves)
                            .addComponent(rbNoSleeves))
                        .addGap(1, 1, 1)))
                .addGroup(panInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labTeam)
                    .addComponent(txtTeam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(527, Short.MAX_VALUE)
                .addComponent(btOk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btCancel)
                .addGap(17, 17, 17))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panInputs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labTitle)
                .addGap(18, 18, 18)
                .addComponent(panInputs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
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
        }
    }//GEN-LAST:event_btOkActionPerformed

    private void btCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelActionPerformed
        isConfirmed = false;
        this.dispose();
    }//GEN-LAST:event_btCancelActionPerformed

    private void txtBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBrandActionPerformed
        filterTbBrandSearch();
    }//GEN-LAST:event_txtBrandActionPerformed

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

    private void btBrandSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBrandSearchActionPerformed
        filterTbBrandSearch();
    }//GEN-LAST:event_btBrandSearchActionPerformed

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
        tbBrandSearch.setEnabled(true);
        tbAddedBrand.setEnabled(true);
        txtCost.setEnabled(true);
        rbLong.setEnabled(true);
        rbShort.setEnabled(true);
        rbNoSleeves.setEnabled(true);
    }

    @Override
    public void setNoEnabledAll() {
        tbBrandSearch.setEnabled(false);
        tbAddedBrand.setEnabled(false);
        txtCost.setEnabled(false);
        rbLong.setEnabled(false);
        rbShort.setEnabled(false);
        rbNoSleeves.setEnabled(false);
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
        tbAddedBrandModel.clearList();
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
        newShirt.setBrand(tbAddedBrandModel.getObjectByRow(0));
        newShirt.setSizeProduct(txtSize.getText());
        newShirt.setColor(txtColor.getText());
        newShirt.setCost(parseTxtCostToDouble(txtCost));
        newShirt.setNumInStock(parseTxtTextToInt(txtNumStock));
        newShirt.setNumberPresent(txtNumberPresent.getText());
        newShirt.setPlayerPresent(txtPlayerPresent.getText());
        newShirt.setPlayerNameOnShirt(txtPlayerNameOnShirt.getText());
        newShirt.setSleeves(getSleeveSelected());
        btGroupSleeves.clearSelection();
        newShirt.setTeamName(txtTeam.getText());
        return newShirt;
    }

    public Sleeves getSleeveSelected() {
        if (rbLong.isSelected()) {
            return Sleeves.Long;
        } else if (rbShort.isSelected()) {
            return Sleeves.Short;
        } else if (rbNoSleeves.isSelected()) {
            return Sleeves.NoSleeves;
        }
        return null;
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
    public void prepareRead() {
        btOk.setVisible(false);
        labR$.setVisible(false);
        btCancel.setText("Close");
        tbAddedBrandModel.clearList();
        setNoEditableAll();
        setNoEnabledAll();
    }

    public void setSelectedRbSleeves(Shirt t) {
        switch (t.getSleeves()) {
            case Long:
                rbLong.setSelected(true);
                break;
            case Short:
                rbShort.setSelected(true);
                break;
            case NoSleeves:
                rbNoSleeves.setSelected(true);
                break;
        }
    }

    @Override
    public void read(Shirt t) {
        prepareRead();
        tbAddedBrandModel.addObjectRow(t.getBrand());
        txtSize.setText(t.getSizeProduct());
        txtCost.setText(costFormatter.formatCost(t.getCost()));
        txtColor.setText(t.getColor());
        txtNumStock.setText("" + t.getNumInStock());
        txtTeam.setText(t.getTeamName());
        txtPlayerPresent.setText(t.getPlayerPresent());
        txtPlayerNameOnShirt.setText(t.getPlayerNameOnShirt());
        setSelectedRbSleeves(t);
        txtNumberPresent.setText(t.getNumberPresent());
        showForm();
    }

    @Override
    public void prepareUpdate(Shirt t) {
        setVisibleAll();
        setEnabledAll();
        setEditableAll();
        setEmptyAll();
        btOk.setText("Update");
        btCancel.setText("Cancel");
        tbAddedBrandModel.addObjectRow(t.getBrand());
        txtSize.setText(t.getSizeProduct());
        txtCost.setText(costFormatter.formatNumber(t.getCost()));
        txtColor.setText(t.getColor());
        txtNumStock.setText("" + t.getNumInStock());
        txtTeam.setText(t.getTeamName());
        txtPlayerPresent.setText(t.getPlayerPresent());
        txtPlayerNameOnShirt.setText(t.getPlayerNameOnShirt());
        setSelectedRbSleeves(t);
        txtNumberPresent.setText(t.getNumberPresent());
    }

    @Override
    public Shirt getObjectUpdated(Shirt oldT) {
        Shirt updatedProduct = oldT;
        updatedProduct.setBrand(tbAddedBrandModel.getObjectByRow(0));
        updatedProduct.setSizeProduct(txtSize.getText());
        updatedProduct.setColor(txtColor.getText());
        updatedProduct.setCost(parseTxtCostToDouble(txtCost));
        updatedProduct.setNumInStock(parseTxtTextToInt(txtNumStock));
        updatedProduct.setTeamName(txtTeam.getText());
        updatedProduct.setPlayerPresent(txtPlayerPresent.getText());
        updatedProduct.setPlayerNameOnShirt(txtPlayerNameOnShirt.getText());
        updatedProduct.setSleeves(getSleeveSelected());
        btGroupSleeves.clearSelection();
        updatedProduct.setNumberPresent(txtNumberPresent.getText());
        return updatedProduct;
    }

    @Override
    public Shirt update(Shirt t) {
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
        txtSize.setDocument(new TxtModelsTypes(TxtTypes.String));
        txtColor.setDocument(new TxtModelsTypes(TxtTypes.String));
        txtTeam.setDocument(new TxtModelsTypes(TxtTypes.String));
        txtPlayerNameOnShirt.setDocument(new TxtModelsTypes(TxtTypes.String));
        txtPlayerPresent.setDocument(new TxtModelsTypes(TxtTypes.String));
        txtNumStock.setDocument(new TxtModelsTypes(TxtTypes.Integer));
        txtNumberPresent.setDocument(new TxtModelsTypes(TxtTypes.Integer));
    }

    @Override
    public boolean fieldsAreEmpty() {
        if (!brandIsAdded() || txtNumStock.getText().isEmpty()
                || txtColor.getText().isEmpty() || txtTeam.getText().isEmpty()
                || txtSize.getText().isEmpty() || "".equals(txtCost.getText())
                || (!rbLong.isSelected() && !rbShort.isSelected()
                && !rbNoSleeves.isSelected())) {
            showErrorMessage("Fill all the required fields.");
            return true;
        }
        return false;
    }

    public boolean checkPlayerPresentAndPlayerNameOnShirt() {
        if (txtPlayerNameOnShirt.getText().isEmpty()
                && !txtPlayerNameOnShirt.getText().isEmpty()) {
            showErrorMessage("The field 'PlayerPresent' can not be empty when "
                    + "the field 'PlayerNameOnShirt' is filled, fill the field "
                    + "'PlayerPresent' first.");
            return false;
        }
        return true;
    }
    
    public boolean brandIsAdded() {
        return tbAddedBrand.getRowCount() != 0;
    }
    
    public void filterTbBrandSearch() {
        if (!txtBrand.getText().isEmpty()) {
            String filter = txtBrand.getText();
            tbBrandSearchModel.filter(tbBrandSearch, filter);
        } else {
            tbBrandSearch.setRowSorter(null);
        }
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
    private javax.swing.JButton btAddBrand;
    private javax.swing.JButton btBrandSearch;
    private javax.swing.JButton btCancel;
    private javax.swing.ButtonGroup btGroupSleeves;
    private javax.swing.JButton btOk;
    private javax.swing.JButton btRemoveBrand;
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
    private javax.swing.JScrollPane panGrid2;
    private javax.swing.JScrollPane panGrid5;
    private javax.swing.JPanel panInputs;
    private javax.swing.JRadioButton rbLong;
    private javax.swing.JRadioButton rbNoSleeves;
    private javax.swing.JRadioButton rbShort;
    private javax.swing.JTable tbAddedBrand;
    private javax.swing.JTable tbBrandSearch;
    private javax.swing.JTextField txtBrand;
    private javax.swing.JTextField txtColor;
    private javax.swing.JFormattedTextField txtCost;
    private javax.swing.JTextField txtNumStock;
    private javax.swing.JTextField txtNumberPresent;
    private javax.swing.JTextField txtPlayerNameOnShirt;
    private javax.swing.JTextField txtPlayerPresent;
    private javax.swing.JTextField txtSize;
    private javax.swing.JTextField txtTeam;
    // End of variables declaration//GEN-END:variables
}
