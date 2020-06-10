package View.Forms;

import static Model.Classes.CPFValidator.isValidCPF;
import Model.Classes.TxtModelsTypes;
import Model.Classes.TxtTypes;
import Model.Entities.Client;
import Model.Interfaces.IForms;

public class ClientForm extends AbstractForm<Client> implements IForms<Client> {

    private boolean isConfirmed = false;

    public ClientForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        initSetup();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCPF = new javax.swing.JFormattedTextField();
        labName = new javax.swing.JLabel();
        txtNumberAddress = new javax.swing.JTextField();
        txtStateAddress = new javax.swing.JTextField();
        labNumberAddress = new javax.swing.JLabel();
        btOk = new javax.swing.JButton();
        labZipCodeAddress = new javax.swing.JLabel();
        labStateAddress = new javax.swing.JLabel();
        labEmail = new javax.swing.JLabel();
        labCellPhone = new javax.swing.JLabel();
        txtCityAddress = new javax.swing.JTextField();
        labCityAddress = new javax.swing.JLabel();
        labNeighborhoodAddress = new javax.swing.JLabel();
        txtStreetAddress = new javax.swing.JTextField();
        labCPF = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtNeighborhoodAddress = new javax.swing.JTextField();
        labTitle = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        btCancel = new javax.swing.JButton();
        txtCellPhone = new javax.swing.JFormattedTextField();
        labStreetAddress = new javax.swing.JLabel();
        txtZipCodeAddress = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        labName.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        labName.setText("Name*");

        labNumberAddress.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        labNumberAddress.setText("Number*");

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

        labZipCodeAddress.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        labZipCodeAddress.setText("ZipCode*");

        labStateAddress.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        labStateAddress.setText("State* (Abbreviation)");

        labEmail.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        labEmail.setText("Email");

        labCellPhone.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        labCellPhone.setText("CellPhone*");

        labCityAddress.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        labCityAddress.setText("City*");

        labNeighborhoodAddress.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        labNeighborhoodAddress.setText("Neighborhood*");

        labCPF.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        labCPF.setText("CPF*");

        labTitle.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labTitle.setText("Client");

        btCancel.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btCancel.setText("Cancel");
        btCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelActionPerformed(evt);
            }
        });

        try {
            txtCellPhone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        labStreetAddress.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        labStreetAddress.setText("Street*");

        try {
            txtZipCodeAddress.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labCityAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(txtCityAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(labName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labCellPhone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtCellPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labZipCodeAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labNumberAddress))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtZipCodeAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                                    .addComponent(txtNumberAddress))))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(labStreetAddress)
                                            .addGap(8, 8, 8)
                                            .addComponent(txtStreetAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(labStateAddress))
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(labNeighborhoodAddress)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtNeighborhoodAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(labEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtEmail)))
                                    .addGap(16, 16, 16)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtStateAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btOk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(btCancel))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labCPF)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(labTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(labTitle)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labName)
                    .addComponent(labCPF)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labCellPhone)
                    .addComponent(labEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCellPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labStreetAddress)
                    .addComponent(labZipCodeAddress)
                    .addComponent(txtStreetAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtZipCodeAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labNeighborhoodAddress)
                    .addComponent(labNumberAddress)
                    .addComponent(txtNeighborhoodAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumberAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labCityAddress)
                    .addComponent(labStateAddress)
                    .addComponent(txtCityAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStateAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btOk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCancel))
                .addGap(26, 26, 26))
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
            java.util.logging.Logger.getLogger(ClientForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ClientForm dialog = new ClientForm(new javax.swing.JFrame(), true);
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
        setTxtModels();
    }

    public void setVisibleAll() {
        btOk.setVisible(true);
        btCancel.setVisible(true);
    }

    public void setEditableAll() {
        txtName.setEditable(true);
        txtCPF.setEditable(true);
        txtCellPhone.setEditable(true);
        txtEmail.setEditable(true);
        txtZipCodeAddress.setEditable(true);
        txtStreetAddress.setEditable(true);
        txtNumberAddress.setEditable(true);
        txtNeighborhoodAddress.setEditable(true);
        txtCityAddress.setEditable(true);
        txtStateAddress.setEditable(true);
    }

    public void setEmptyTextAll() {
        txtName.setText("");
        txtCPF.setText("");
        txtCellPhone.setText("");
        txtEmail.setText("");
        txtZipCodeAddress.setText("");
        txtStreetAddress.setText("");
        txtNumberAddress.setText("");
        txtNeighborhoodAddress.setText("");
        txtCityAddress.setText("");
        txtStateAddress.setText("");
    }

    public void prepareCreate() {
        setVisibleAll();
        setEditableAll();
        setEmptyTextAll();
        btOk.setText("Create");
        btCancel.setText("Cancel");
    }

    @Override
    public Client getObjectCreated() {
        Client newClient = new Client();
        newClient.setName(txtName.getText());
        newClient.setCpf(txtCPF.getText());
        newClient.setCellPhone(txtCellPhone.getText());
        newClient.setEmail(txtEmail.getText());
        newClient.setZipCodeAddress(txtZipCodeAddress.getText());
        newClient.setStreetAddress(txtStreetAddress.getText());
        newClient.setNumberAddress(txtNumberAddress.getText());
        newClient.setNeighborhoodAddress(txtNeighborhoodAddress.getText());
        newClient.setCityAddress(txtCityAddress.getText());
        newClient.setStateAddress(txtStateAddress.getText());
        return newClient;
    }

    @Override
    public Client create() {
        prepareCreate();
        showForm();
        if (isConfirmed) {
            return getObjectCreated();
        }
        return null;
    }

    public void setNoEditableAll() {
        txtName.setEditable(false);
        txtCPF.setEditable(false);
        txtCellPhone.setEditable(false);
        txtEmail.setEditable(false);
        txtZipCodeAddress.setEditable(false);
        txtStreetAddress.setEditable(false);
        txtNumberAddress.setEditable(false);
        txtNeighborhoodAddress.setEditable(false);
        txtCityAddress.setEditable(false);
        txtStateAddress.setEditable(false);
    }

    public void prepareRead() {
        btOk.setVisible(false);
        btCancel.setVisible(true);
        btCancel.setText("Close");
        setNoEditableAll();
    }

    @Override
    public void read(Client t) {
        prepareRead();
        txtName.setText(t.getName());
        txtCPF.setText(t.getCpf());
        txtCellPhone.setText(t.getCellPhone());
        txtEmail.setText(t.getEmail());
        txtZipCodeAddress.setText(t.getZipCodeAddress());
        txtStreetAddress.setText(t.getStreetAddress());
        txtNumberAddress.setText(t.getNumberAddress());
        txtNeighborhoodAddress.setText(t.getNeighborhoodAddress());
        txtCityAddress.setText(t.getCityAddress());
        txtStateAddress.setText(t.getStateAddress());
        showForm();
    }

    public void prepareUpdate(Client t) {
        setVisibleAll();
        setEditableAll();
        txtName.setText(t.getName());
        txtCPF.setText(t.getCpf());
        txtCellPhone.setText(t.getCellPhone());
        txtEmail.setText(t.getEmail());
        txtZipCodeAddress.setText(t.getZipCodeAddress());
        txtStreetAddress.setText(t.getStreetAddress());
        txtNumberAddress.setText(t.getNumberAddress());
        txtNeighborhoodAddress.setText(t.getNeighborhoodAddress());
        txtCityAddress.setText(t.getCityAddress());
        txtStateAddress.setText(t.getStateAddress());
        btOk.setText("Update");
        btCancel.setText("Cancel");
    }
    
    @Override
    public Client getObjectUpdated(Client oldT) {
        Client updatedClient = oldT;
        updatedClient.setName(txtName.getText());
        updatedClient.setCpf(txtCPF.getText());
        updatedClient.setCellPhone(txtCellPhone.getText());
        updatedClient.setEmail(txtEmail.getText());
        updatedClient.setZipCodeAddress(txtZipCodeAddress.getText());
        updatedClient.setStreetAddress(txtStreetAddress.getText());
        updatedClient.setNumberAddress(txtNumberAddress.getText());
        updatedClient.setNeighborhoodAddress(txtNeighborhoodAddress.getText());
        updatedClient.setCityAddress(txtCityAddress.getText());
        updatedClient.setStateAddress(txtStateAddress.getText());
        return updatedClient;
    }

    @Override
    public Client update(Client t) {
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
        txtName.setDocument(new TxtModelsTypes(TxtTypes.String));
        txtEmail.setDocument(new TxtModelsTypes(TxtTypes.String));
        txtStreetAddress.setDocument(new TxtModelsTypes(TxtTypes.String));
        txtNeighborhoodAddress.setDocument(new TxtModelsTypes(TxtTypes.String));
        txtStateAddress.setDocument(new TxtModelsTypes(TxtTypes.String));
        txtCityAddress.setDocument(new TxtModelsTypes(TxtTypes.String));
        txtNumberAddress.setDocument(new TxtModelsTypes(TxtTypes.Integer));
    }

    @Override
    public boolean fieldsAreEmpty() {
        //Email is not required. That's why it's not here
        //CPF has other verification type (checkCPF). That's why it's not here
        if (txtName.getText().isEmpty()
                || txtNeighborhoodAddress.getText().isEmpty()
                || txtStreetAddress.getText().isEmpty()
                || txtNumberAddress.getText().isEmpty()
                || txtStateAddress.getText().isEmpty()
                || txtCityAddress.getText().isEmpty()
                || "(  )     -    ".equals(txtCellPhone.getText())
                || "     -   ".equals(txtZipCodeAddress.getText())) {
            showErrorMessage("Fill all the required fields.");
            return true;
        }
        return false;
    }

    public boolean checkCPF() {
        if (!"   .   .   -  ".equals(txtCPF.getText())) {
            String cpf = txtCPF.getText().replaceAll("\\.", "").replace("-", "");
            if (isValidCPF(cpf)) {
                return true;
            }
        }
        showErrorMessage("Invalid CPF.");
        return false;
    }

    @Override
    public boolean checkAll() {
        return !fieldsAreEmpty() && checkCPF();
    }

    @Override
    public void showForm() {
        this.setVisible(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancel;
    private javax.swing.JButton btOk;
    private javax.swing.JLabel labCPF;
    private javax.swing.JLabel labCellPhone;
    private javax.swing.JLabel labCityAddress;
    private javax.swing.JLabel labEmail;
    private javax.swing.JLabel labName;
    private javax.swing.JLabel labNeighborhoodAddress;
    private javax.swing.JLabel labNumberAddress;
    private javax.swing.JLabel labStateAddress;
    private javax.swing.JLabel labStreetAddress;
    private javax.swing.JLabel labTitle;
    private javax.swing.JLabel labZipCodeAddress;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JFormattedTextField txtCellPhone;
    private javax.swing.JTextField txtCityAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNeighborhoodAddress;
    private javax.swing.JTextField txtNumberAddress;
    private javax.swing.JTextField txtStateAddress;
    private javax.swing.JTextField txtStreetAddress;
    private javax.swing.JFormattedTextField txtZipCodeAddress;
    // End of variables declaration//GEN-END:variables
}
