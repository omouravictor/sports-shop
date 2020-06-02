package View.Forms;

import static Model.Classes.CPFValidator.isValidCPF;
import Model.Classes.Client;
import Interfaces.IForms;
import Model.Classes.TxtModelsTypes;
import Model.Classes.TxtTypes;

public class ClientForm extends jFrameFather implements IForms<Client> {

    public ClientForm() {
        initComponents();
        initSetup();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labTitle = new javax.swing.JLabel();
        labName = new javax.swing.JLabel();
        labCPF = new javax.swing.JLabel();
        labCellPhone = new javax.swing.JLabel();
        labEmail = new javax.swing.JLabel();
        labStreetAddress = new javax.swing.JLabel();
        labZipCodeAddress = new javax.swing.JLabel();
        labNeighborhoodAddress = new javax.swing.JLabel();
        labNumberAddress = new javax.swing.JLabel();
        labCityAddress = new javax.swing.JLabel();
        labStateAddress = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtStreetAddress = new javax.swing.JTextField();
        txtNeighborhoodAddress = new javax.swing.JTextField();
        txtCityAddress = new javax.swing.JTextField();
        txtStateAddress = new javax.swing.JTextField();
        btOk = new javax.swing.JButton();
        btCancel = new javax.swing.JButton();
        txtZipCodeAddress = new javax.swing.JFormattedTextField();
        txtNumberAddress = new javax.swing.JTextField();
        txtCellPhone = new javax.swing.JFormattedTextField();
        txtCPF = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        labTitle.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labTitle.setText("Client");

        labName.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        labName.setText("Name*");

        labCPF.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        labCPF.setText("CPF*");

        labCellPhone.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        labCellPhone.setText("CellPhone*");

        labEmail.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        labEmail.setText("Email");

        labStreetAddress.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        labStreetAddress.setText("Street*");

        labZipCodeAddress.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        labZipCodeAddress.setText("ZipCode*");

        labNeighborhoodAddress.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        labNeighborhoodAddress.setText("Neighborhood*");

        labNumberAddress.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        labNumberAddress.setText("Number*");

        labCityAddress.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        labCityAddress.setText("City*");

        labStateAddress.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        labStateAddress.setText("State* (Abbreviation)");

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

        try {
            txtZipCodeAddress.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtCellPhone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
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
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                                .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)))
                                        .addGap(16, 16, 16)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtStateAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btOk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addComponent(btCancel)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labCPF)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(labTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btOk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCancel))
                .addGap(26, 26, 26))
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
                new ClientForm().setVisible(true);
            }
        });
    }

    public void initSetup() {
        setTxtModels();
    }

    @Override
    public Client create() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void read(Client t) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Client update(Client t) {
        throw new UnsupportedOperationException("Not supported yet.");
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
    public boolean checkEmptyFields() {
        //Email is not required. That's why it's not here
        //CPF has other verification type (checkCPF). That's why it's not here
        if (txtName.getText().isEmpty()
                || txtStreetAddress.getText().isEmpty()
                || txtNumberAddress.getText().isEmpty()
                || txtNeighborhoodAddress.getText().isEmpty()
                || txtCityAddress.getText().isEmpty()
                || txtStateAddress.getText().isEmpty()
                || "(  )     -    ".equals(txtCellPhone.getText())
                || "     -   ".equals(txtZipCodeAddress.getText())) {
            showErrorMessage("Fill all the required fields.");
            return false;
        }
        return true;
    }

    public boolean checkCPF() {
        if (!isValidCPF(txtCPF.getText().replaceAll("\\.", "").replace("-", ""))) {
            showErrorMessage("Invalid CPF.");
            return false;
        }
        return true;
    }

    @Override
    public boolean checkAll() {
        return checkEmptyFields() && checkCPF();
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
