package View.Forms;

import Model.Classes.AbstractJDialog;
import static Model.Classes.CPFValidator.isValidCPF;
import Model.Classes.TxtModelsTypes;
import Model.Classes.TxtTypes;
import Model.EntitiesClasses.Client;
import Model.Interfaces.IForms;

public class ClientForm extends AbstractJDialog<Client> implements IForms<Client> {

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
        txtNumber = new javax.swing.JTextField();
        labNumberAddress = new javax.swing.JLabel();
        btOk = new javax.swing.JButton();
        labZipCodeAddress = new javax.swing.JLabel();
        labStateAddress = new javax.swing.JLabel();
        labEmail = new javax.swing.JLabel();
        labCellPhone = new javax.swing.JLabel();
        labCityAddress = new javax.swing.JLabel();
        labNeighborhoodAddress = new javax.swing.JLabel();
        txtStreet = new javax.swing.JTextField();
        labCPF = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtNeighborhood = new javax.swing.JTextField();
        labTitle = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        btCancel = new javax.swing.JButton();
        txtCellPhone = new javax.swing.JFormattedTextField();
        labStreetAddress = new javax.swing.JLabel();
        txtZipCode = new javax.swing.JFormattedTextField();
        cbState = new javax.swing.JComboBox<>();
        txtCity = new javax.swing.JTextField();

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
        labStateAddress.setText("State*");

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
            txtZipCode.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        cbState.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(labName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labCellPhone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtZipCode)
                                        .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbState, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(txtCellPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(labZipCodeAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labNumberAddress)
                            .addComponent(labStateAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labCityAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labStreetAddress)
                            .addComponent(labNeighborhoodAddress)
                            .addComponent(labEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labCPF))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNeighborhood, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(78, 78, 78))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btOk, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btCancel)
                        .addGap(45, 45, 45))))
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
                    .addComponent(txtStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labNeighborhoodAddress)
                    .addComponent(labNumberAddress)
                    .addComponent(txtNeighborhood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labStateAddress)
                    .addComponent(cbState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labCityAddress)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btOk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCancel))
                .addGap(24, 24, 24))
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

    @Override
    public void initSetup() {
        setTxtModels();
    }

    @Override
    public void setVisibleAll() {
        btOk.setVisible(true);
        btCancel.setVisible(true);
    }

    @Override
    public void setEditableAll() {
        txtName.setEditable(true);
        txtCPF.setEditable(true);
        txtCellPhone.setEditable(true);
        txtEmail.setEditable(true);
        txtZipCode.setEditable(true);
        txtStreet.setEditable(true);
        txtNumber.setEditable(true);
        txtNeighborhood.setEditable(true);
        txtCity.setEditable(true);
    }

    @Override
    public void setNoEditableAll() {
        txtName.setEditable(false);
        txtCPF.setEditable(false);
        txtCellPhone.setEditable(false);
        txtEmail.setEditable(false);
        txtZipCode.setEditable(false);
        txtStreet.setEditable(false);
        txtNumber.setEditable(false);
        txtNeighborhood.setEditable(false);
        txtCity.setEditable(false);
    }

    @Override
    public void setEmptyAll() {
        txtName.setText("");
        txtCPF.setText("");
        txtCellPhone.setText("");
        txtEmail.setText("");
        txtZipCode.setText("");
        txtStreet.setText("");
        txtNumber.setText("");
        txtNeighborhood.setText("");
        cbState.setSelectedIndex(-1);
        txtCity.setText("");
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
    public Client getObjectCreated() {
        Client newClient = new Client();
        newClient.setName(txtName.getText());
        newClient.setCpf(txtCPF.getText());
        newClient.setCellPhone(txtCellPhone.getText());
        newClient.setEmail(txtEmail.getText());
        newClient.setZipCodeAddress(txtZipCode.getText());
        newClient.setStreetAddress(txtStreet.getText());
        newClient.setNumberAddress(txtNumber.getText());
        newClient.setNeighborhoodAddress(txtNeighborhood.getText());
        newClient.setCityAddress(txtCity.getText());
        newClient.setStateAddress(cbState.getSelectedItem().toString());
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

    @Override
    public void prepareRead() {
        btOk.setVisible(false);
        btCancel.setVisible(true);
        btCancel.setText("Close");
        setNoEditableAll();
        setNoEnabledAll();
    }

    @Override
    public void read(Client t) {
        prepareRead();
        txtName.setText(t.getName());
        txtCPF.setText(t.getCpf());
        txtCellPhone.setText(t.getCellPhone());
        txtEmail.setText(t.getEmail());
        txtZipCode.setText(t.getZipCodeAddress());
        txtStreet.setText(t.getStreetAddress());
        txtNumber.setText(t.getNumberAddress());
        txtNeighborhood.setText(t.getNeighborhoodAddress());
        cbState.setSelectedItem(t.getStateAddress());
        txtCity.setText(t.getCityAddress());
        showForm();
    }

    @Override
    public void prepareUpdate(Client t) {
        setVisibleAll();
        setEditableAll();
        setEnabledAll();
        txtName.setText(t.getName());
        txtCPF.setText(t.getCpf());
        txtCellPhone.setText(t.getCellPhone());
        txtEmail.setText(t.getEmail());
        txtZipCode.setText(t.getZipCodeAddress());
        txtStreet.setText(t.getStreetAddress());
        txtNumber.setText(t.getNumberAddress());
        txtNeighborhood.setText(t.getNeighborhoodAddress());
        cbState.setSelectedItem(t.getStateAddress());
        txtCity.setText(t.getCityAddress());
        btOk.setText("Update");
        btCancel.setText("Cancel");
    }

    @Override
    public Client getObjectUpdated(Client client) {
        client.setName(txtName.getText());
        client.setCpf(txtCPF.getText());
        client.setCellPhone(txtCellPhone.getText());
        client.setEmail(txtEmail.getText());
        client.setZipCodeAddress(txtZipCode.getText());
        client.setStreetAddress(txtStreet.getText());
        client.setNumberAddress(txtNumber.getText());
        client.setNeighborhoodAddress(txtNeighborhood.getText());
        client.setCityAddress(txtCity.getText());
        client.setStateAddress(cbState.getSelectedItem().toString());
        return client;
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
        txtName.setDocument(new TxtModelsTypes(TxtTypes.STRING));
        txtEmail.setDocument(new TxtModelsTypes(TxtTypes.STRING));
        txtStreet.setDocument(new TxtModelsTypes(TxtTypes.STRING));
        txtCity.setDocument(new TxtModelsTypes(TxtTypes.STRING));
        txtNeighborhood.setDocument(new TxtModelsTypes(TxtTypes.STRING));
        txtNumber.setDocument(new TxtModelsTypes(TxtTypes.INTEGER));
    }

    @Override
    public boolean fieldsAreEmpty() {
        //Email is not required. That's why it's not here
        //CPF has other verification type (checkCPF). That's why it's not here
        if (txtName.getText().isEmpty()
                || txtNeighborhood.getText().isEmpty()
                || txtStreet.getText().isEmpty()
                || txtNumber.getText().isEmpty()
                || txtCity.getText().isEmpty()
                || cbState.getSelectedItem() == null
                || "(  )     -    ".equals(txtCellPhone.getText())
                || "     -   ".equals(txtZipCode.getText())) {
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

    @Override
    public void setEnabledAll() {
        cbState.setEnabled(true);
    }

    @Override
    public void setNoEnabledAll() {
        cbState.setEnabled(false);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancel;
    private javax.swing.JButton btOk;
    private javax.swing.JComboBox<String> cbState;
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
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNeighborhood;
    private javax.swing.JTextField txtNumber;
    private javax.swing.JTextField txtStreet;
    private javax.swing.JFormattedTextField txtZipCode;
    // End of variables declaration//GEN-END:variables
}
