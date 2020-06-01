package View.Forms;

import Model.Classes.Brand;
import Model.Classes.Category;
import Model.Classes.Client;
import Model.Classes.Product;
import Model.Classes.Sale;
import Model.Classes.Shirt;
import Model.Classes.Sleeves;
import Model.Tables.SaleClientSearchTableModel;
import Model.Tables.SaleProductSearchTableModel;
import Model.Tables.SaleSelectedClientTableModel;
import Model.Tables.SaleSelectedProductTableModel;
import java.util.List;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import Interfaces.IForms;
import Model.Classes.TxtIntegerNumbersModel;
import Model.Classes.TxtMaxCharactersModel;

public class SaleForm extends jFrameFather implements IForms<Sale> {

    SaleClientSearchTableModel clientSearchTableModel = new SaleClientSearchTableModel();
    SaleSelectedClientTableModel selectedClientTableModel = new SaleSelectedClientTableModel();
    SaleProductSearchTableModel productSearchTableModel = new SaleProductSearchTableModel();
    SaleSelectedProductTableModel selectedProductTableModel = new SaleSelectedProductTableModel();

    public SaleForm() {
        initComponents();
        initSetup();
        Category c1 = new Category("Mug");
        Category c2 = new Category("Shirt");
        Category c3 = new Category("T-Shirt");
        Brand b1 = new Brand("Nike");
        Brand b2 = new Brand("Adidas");
        Product p1 = new Product(c1, b1, "Barcelona", "Dyballa", null, "White", "300ml", 20, 0, 10);
        p1.setId(Long.parseLong("100"));
        Shirt p2 = new Shirt(c2, b1, "Barcelona", "Leonel Messi", "Messi", "10", Sleeves.Short, "Azul", "M", 15, 0, 50);
        p2.setId(Long.parseLong("200"));
        Shirt p3 = new Shirt(c2, b2, "Real Madrid", "Cristiano Ronaldo", "C. Ronaldo", "7", Sleeves.Long, "White", "G", 10, 0, 50);
        p3.setId(Long.parseLong("300"));
        Shirt p4 = new Shirt(c3, b2, "Chelsea", null, null, null, Sleeves.NoSleeves, "Blue", "P", 5, 0, 50);
        p4.setId(Long.parseLong("400"));
        productSearchTableModel.addObjectRow(p1);
        productSearchTableModel.addObjectRow(p2);
        productSearchTableModel.addObjectRow(p3);
        productSearchTableModel.addObjectRow(p4);
        Client cli1 = new Client("Victor Gabriel Siqueira Moura", "12733863614", "(31)98591-6080", "victorgabriel.moura@hotmail.com", "35182-278", "Dinamarca", "238", "Ana rita", "Timóteo", "MG");
        Client cli2 = new Client("Maria de Lourdes Marcelino", "sdvsvsvds", "(31)98727-3572", "victorgabriel.moura@hotmail.com", "35182-278", "Honduras", "238", "Ana rita", "Timóteo", "SP");
        Client cli3 = new Client("Gleison Francis Siqueira Moura", "dsvsvds", "(31)98503-9135", "victorgabriel.moura@hotmail.com", "35182-278", "Portugal", "238", "Ana rita", "Timóteo", "RJ");
        clientSearchTableModel.addObjectRow(cli1);
        clientSearchTableModel.addObjectRow(cli2);
        clientSearchTableModel.addObjectRow(cli3);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labTitle = new javax.swing.JLabel();
        labName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        btClientSearch = new javax.swing.JButton();
        labCategory = new javax.swing.JLabel();
        txtCategory = new javax.swing.JTextField();
        btProductSearch = new javax.swing.JButton();
        labQuantity = new javax.swing.JLabel();
        labCostByProduct = new javax.swing.JLabel();
        txtCostByProduct = new javax.swing.JTextField();
        labTotalCost = new javax.swing.JLabel();
        txtTotalCost = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbClientSearch = new javax.swing.JTable();
        labClientSearchTable = new javax.swing.JLabel();
        labProductSearchTable = new javax.swing.JLabel();
        btFinishSale = new javax.swing.JButton();
        btCancelSale = new javax.swing.JButton();
        btAddProduct = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbSelectedClient = new javax.swing.JTable();
        labSelectedClient = new javax.swing.JLabel();
        btRemoveClient = new javax.swing.JButton();
        btAddClient = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbSelectedProduct = new javax.swing.JTable();
        labSelectedProducts = new javax.swing.JLabel();
        btRemoveClient1 = new javax.swing.JButton();
        labDate = new javax.swing.JLabel();
        txtDate = new javax.swing.JFormattedTextField();
        spQuantity = new javax.swing.JSpinner();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbProductSearch = new javax.swing.JTable();
        labBrand = new javax.swing.JLabel();
        labTeam = new javax.swing.JLabel();
        txtBrand = new javax.swing.JTextField();
        txtTeam = new javax.swing.JTextField();
        labPlayer = new javax.swing.JLabel();
        txtPlayer = new javax.swing.JTextField();
        labSize = new javax.swing.JLabel();
        txtSize = new javax.swing.JTextField();
        labNumber = new javax.swing.JLabel();
        txtNumber = new javax.swing.JTextField();
        labColor = new javax.swing.JLabel();
        txtShirtName = new javax.swing.JTextField();
        txtSleeves = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        labShirtName = new javax.swing.JLabel();
        labSleeves = new javax.swing.JLabel();
        labID = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        labCPF = new javax.swing.JLabel();
        txtCPF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        labTitle.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labTitle.setText("Sale");

        labName.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        labName.setText("Name");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        btClientSearch.setText("Search");
        btClientSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClientSearchActionPerformed(evt);
            }
        });

        labCategory.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        labCategory.setText("Category");

        txtCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCategoryActionPerformed(evt);
            }
        });

        btProductSearch.setText("Search");
        btProductSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProductSearchActionPerformed(evt);
            }
        });

        labQuantity.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        labQuantity.setText("Quantity");

        labCostByProduct.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        labCostByProduct.setText("Cost by Product");

        txtCostByProduct.setText("R$ 0.0");

        labTotalCost.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        labTotalCost.setText("Total Cost");

        txtTotalCost.setText("R$ 0.0");

        tbClientSearch.setModel(this.clientSearchTableModel);
        jScrollPane1.setViewportView(tbClientSearch);

        labClientSearchTable.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        labClientSearchTable.setText("Client Search Table");

        labProductSearchTable.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        labProductSearchTable.setText("Product Search Table");

        btFinishSale.setText("Finish Sale");
        btFinishSale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFinishSaleActionPerformed(evt);
            }
        });

        btCancelSale.setText("Cancel Sale");
        btCancelSale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelSaleActionPerformed(evt);
            }
        });

        btAddProduct.setText("Add Product");
        btAddProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddProductActionPerformed(evt);
            }
        });

        tbSelectedClient.setModel(this.selectedClientTableModel);
        jScrollPane3.setViewportView(tbSelectedClient);

        labSelectedClient.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        labSelectedClient.setText("Selected Client*");

        btRemoveClient.setText("Remove Client");
        btRemoveClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoveClientActionPerformed(evt);
            }
        });

        btAddClient.setText("Add Client");
        btAddClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddClientActionPerformed(evt);
            }
        });

        tbSelectedProduct.setModel(this.selectedProductTableModel);
        jScrollPane4.setViewportView(tbSelectedProduct);

        labSelectedProducts.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        labSelectedProducts.setText("Selected Products*");

        btRemoveClient1.setText("Remove Product");
        btRemoveClient1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoveClient1ActionPerformed(evt);
            }
        });

        labDate.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        labDate.setText("Data*");

        try {
            txtDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        spQuantity.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spQuantityStateChanged(evt);
            }
        });

        tbProductSearch.setModel(this.productSearchTableModel);
        tbProductSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbProductSearchMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tbProductSearch);

        labBrand.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        labBrand.setText("Brand");

        labTeam.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        labTeam.setText("Team");

        txtBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBrandActionPerformed(evt);
            }
        });

        txtTeam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTeamActionPerformed(evt);
            }
        });

        labPlayer.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        labPlayer.setText("Player");

        txtPlayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlayerActionPerformed(evt);
            }
        });

        labSize.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        labSize.setText("Size");

        txtSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSizeActionPerformed(evt);
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

        txtColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtColorActionPerformed(evt);
            }
        });

        labShirtName.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        labShirtName.setText("ShirtName");

        labSleeves.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        labSleeves.setText("Sleeves");

        labID.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        labID.setText("ID");

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        labCPF.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        labCPF.setText("CPF");

        txtCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCPFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(248, 248, 248)
                                .addComponent(btAddClient))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(597, 597, 597)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(230, 230, 230)
                                        .addComponent(btRemoveClient))
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(labDate)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btProductSearch)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labTitle)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(labName)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(labCPF)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btClientSearch))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(495, 495, 495)
                                        .addComponent(btCancelSale)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(230, 230, 230)
                                                .addComponent(labSelectedProducts))
                                            .addComponent(btFinishSale))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labProductSearchTable)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labQuantity)
                                        .addGap(3, 3, 3)
                                        .addComponent(spQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(labCostByProduct)
                                        .addGap(4, 4, 4)
                                        .addComponent(txtCostByProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btAddProduct))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(labTeam)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtTeam, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(labCategory)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(labBrand)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labPlayer)
                                            .addComponent(labNumber)
                                            .addComponent(labSize))
                                        .addGap(8, 8, 8)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtSize, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labSleeves)
                                            .addComponent(labShirtName)
                                            .addComponent(labColor))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtSleeves, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtShirtName, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(labID))))
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btRemoveClient1)
                                .addGap(44, 44, 44)
                                .addComponent(labTotalCost)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTotalCost, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labClientSearchTable)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labSelectedClient)
                        .addGap(255, 255, 255))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(labTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btClientSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(labName)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(12, 12, 12)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(labCPF)
                                .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labDate)
                        .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labClientSearchTable)
                    .addComponent(labSelectedClient))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btRemoveClient)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btAddClient)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labCategory)
                        .addComponent(txtCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labPlayer))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtShirtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labShirtName)
                        .addComponent(labID)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labNumber)
                                    .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labBrand)
                                    .addComponent(labSleeves))
                                .addGap(0, 1, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(txtSleeves, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTeam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labSize)
                            .addComponent(txtSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labTeam)
                            .addComponent(labColor)
                            .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btProductSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labProductSearchTable)
                    .addComponent(labSelectedProducts))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labQuantity)
                            .addComponent(spQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labCostByProduct)
                            .addComponent(txtCostByProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btAddProduct)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labTotalCost)
                            .addComponent(btRemoveClient1)
                            .addComponent(txtTotalCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btFinishSale)
                            .addComponent(btCancelSale))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btFinishSaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFinishSaleActionPerformed
        /*if (checkAll()) {
            this.dispose();
        }*/
        System.out.println(txtCPF.getText());
    }//GEN-LAST:event_btFinishSaleActionPerformed

    private void btCancelSaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelSaleActionPerformed
        this.dispose();
    }//GEN-LAST:event_btCancelSaleActionPerformed

    private void btAddClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddClientActionPerformed
        clientAddButtonAction();
    }//GEN-LAST:event_btAddClientActionPerformed

    private void btRemoveClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoveClientActionPerformed
        clientRemoveButtonAction();
    }//GEN-LAST:event_btRemoveClientActionPerformed

    private void btAddProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddProductActionPerformed
        productAddButtonAction();
    }//GEN-LAST:event_btAddProductActionPerformed

    private void btRemoveClient1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoveClient1ActionPerformed
        productRemoveButtonAction();
    }//GEN-LAST:event_btRemoveClient1ActionPerformed

    private void spQuantityStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spQuantityStateChanged
        updateCostByProductValue();
    }//GEN-LAST:event_spQuantityStateChanged

    private void tbProductSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbProductSearchMouseClicked
        updateCostByProductValue();
    }//GEN-LAST:event_tbProductSearchMouseClicked

    private void btProductSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProductSearchActionPerformed
        filterTbProductSearch();
    }//GEN-LAST:event_btProductSearchActionPerformed

    private void txtCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCategoryActionPerformed
        filterTbProductSearch();
    }//GEN-LAST:event_txtCategoryActionPerformed

    private void txtBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBrandActionPerformed
        filterTbProductSearch();
    }//GEN-LAST:event_txtBrandActionPerformed

    private void txtTeamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTeamActionPerformed
        filterTbProductSearch();
    }//GEN-LAST:event_txtTeamActionPerformed

    private void txtPlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlayerActionPerformed
        filterTbProductSearch();
    }//GEN-LAST:event_txtPlayerActionPerformed

    private void txtNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumberActionPerformed
        filterTbProductSearch();
    }//GEN-LAST:event_txtNumberActionPerformed

    private void txtSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSizeActionPerformed
        filterTbProductSearch();
    }//GEN-LAST:event_txtSizeActionPerformed

    private void txtShirtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtShirtNameActionPerformed
        filterTbProductSearch();
    }//GEN-LAST:event_txtShirtNameActionPerformed

    private void txtSleevesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSleevesActionPerformed
        filterTbProductSearch();
    }//GEN-LAST:event_txtSleevesActionPerformed

    private void txtColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtColorActionPerformed
        filterTbProductSearch();
    }//GEN-LAST:event_txtColorActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        filterTbProductSearch();
    }//GEN-LAST:event_txtIDActionPerformed

    private void btClientSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClientSearchActionPerformed
        filterTbClientSearch();
    }//GEN-LAST:event_btClientSearchActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        filterTbClientSearch();
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPFActionPerformed
        filterTbClientSearch();
    }//GEN-LAST:event_txtCPFActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SaleForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SaleForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SaleForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SaleForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SaleForm().setVisible(true);
            }
        });
    }

    public void filterTbProductSearch() {
        String[] filters = {txtCategory.getText(), txtBrand.getText(), txtTeam.getText(),
            txtPlayer.getText(), txtNumber.getText(), txtSize.getText(), txtShirtName.getText(),
            txtSleeves.getText(), txtColor.getText(), txtID.getText()
        };
        productSearchTableModel.filter(tbProductSearch, filters);
    }

    public void filterTbClientSearch() {
        String[] filters = {txtName.getText(), txtCPF.getText()};
        clientSearchTableModel.filter(tbClientSearch, filters);
    }

    public void setTableModelListenerInTbSelectedProduct() {
        TableModelListener selectedProductTableListener = (TableModelEvent event) -> {
            if (event.getType() == TableModelEvent.INSERT
                    || event.getType() == TableModelEvent.DELETE
                    || event.getType() == TableModelEvent.UPDATE) {
                updateTotalCostValue();
            }
        };
        tbSelectedProduct.getModel().addTableModelListener(selectedProductTableListener);
    }
    
    @Override
    public void setTxtModels() {
        // When the txt already has a Mask, it doesn't needs a txtModel
        txtNumber.setDocument(new TxtIntegerNumbersModel(10));
        txtCPF.setDocument(new TxtMaxCharactersModel(11));
    }

    public void setTablesColumnSize() {
        // tbClientSearch
        tbClientSearch.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); // Enable the horizontal ScrollBar
        tbClientSearch.getColumnModel().getColumn(0).setPreferredWidth(60); // Id Column
        tbClientSearch.getColumnModel().getColumn(1).setPreferredWidth(200); // Name Column   
        tbClientSearch.getColumnModel().getColumn(2).setPreferredWidth(90); // CPF Column
        tbClientSearch.getColumnModel().getColumn(3).setPreferredWidth(100); // Phone Column
        tbClientSearch.getColumnModel().getColumn(4).setPreferredWidth(220); // Email Column
        tbClientSearch.getColumnModel().getColumn(5).setPreferredWidth(75); // ZipCode Column
        tbClientSearch.getColumnModel().getColumn(6).setPreferredWidth(100); // Street Column
        tbClientSearch.getColumnModel().getColumn(7).setPreferredWidth(55); // Number Column
        tbClientSearch.getColumnModel().getColumn(8).setPreferredWidth(95); // Neyghborhood Column
        tbClientSearch.getColumnModel().getColumn(9).setPreferredWidth(80); // City Column
        tbClientSearch.getColumnModel().getColumn(10).setPreferredWidth(40); // State Column

        // tbSelectedClient
        tbSelectedClient.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); // Enable the horizontal ScrollBar
        tbSelectedClient.getColumnModel().getColumn(0).setPreferredWidth(60); // Id Column
        tbSelectedClient.getColumnModel().getColumn(1).setPreferredWidth(200); // Name Column   
        tbSelectedClient.getColumnModel().getColumn(2).setPreferredWidth(90); // CPF Column
        tbSelectedClient.getColumnModel().getColumn(3).setPreferredWidth(100); // Phone Column
        tbSelectedClient.getColumnModel().getColumn(4).setPreferredWidth(220); // Email Column
        tbSelectedClient.getColumnModel().getColumn(5).setPreferredWidth(75); // ZipCode Column
        tbSelectedClient.getColumnModel().getColumn(6).setPreferredWidth(100); // Street Column
        tbSelectedClient.getColumnModel().getColumn(7).setPreferredWidth(55); // Number Column
        tbSelectedClient.getColumnModel().getColumn(8).setPreferredWidth(95); // Neyghborhood Column
        tbSelectedClient.getColumnModel().getColumn(9).setPreferredWidth(80); // City Column
        tbSelectedClient.getColumnModel().getColumn(10).setPreferredWidth(40); // State Column

        // tbProductSearch
        tbProductSearch.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); // Enable the horizontal ScrollBar
        tbProductSearch.getColumnModel().getColumn(0).setPreferredWidth(45); // Stock Column
        tbProductSearch.getColumnModel().getColumn(1).setPreferredWidth(75); // Cost Column   
        tbProductSearch.getColumnModel().getColumn(2).setPreferredWidth(65); // Category Column   
        tbProductSearch.getColumnModel().getColumn(3).setPreferredWidth(70); // Brand Column
        tbProductSearch.getColumnModel().getColumn(4).setPreferredWidth(80); // Team Column
        tbProductSearch.getColumnModel().getColumn(5).setPreferredWidth(100); // Player Column
        tbProductSearch.getColumnModel().getColumn(6).setPreferredWidth(75); // NameShirt Column
        tbProductSearch.getColumnModel().getColumn(7).setPreferredWidth(70); // Sleeves Column
        tbProductSearch.getColumnModel().getColumn(8).setPreferredWidth(55); // Number Column
        tbProductSearch.getColumnModel().getColumn(9).setPreferredWidth(70); // Color Column
        tbProductSearch.getColumnModel().getColumn(10).setPreferredWidth(60); // Size Column
        tbProductSearch.getColumnModel().getColumn(11).setPreferredWidth(60); // Id Column

        // tbSelectedProducts
        tbSelectedProduct.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); // Enable the horizontal ScrollBar
        tbSelectedProduct.getColumnModel().getColumn(0).setPreferredWidth(45); // QTD Column
        tbSelectedProduct.getColumnModel().getColumn(1).setPreferredWidth(45); // Stock Column
        tbSelectedProduct.getColumnModel().getColumn(2).setPreferredWidth(75); // Cost Column   
        tbSelectedProduct.getColumnModel().getColumn(3).setPreferredWidth(65); // Category Column   
        tbSelectedProduct.getColumnModel().getColumn(4).setPreferredWidth(70); // Brand Column
        tbSelectedProduct.getColumnModel().getColumn(5).setPreferredWidth(80); // Team Column
        tbSelectedProduct.getColumnModel().getColumn(6).setPreferredWidth(100); // Player Column
        tbSelectedProduct.getColumnModel().getColumn(7).setPreferredWidth(75); // NameShirt Column
        tbSelectedProduct.getColumnModel().getColumn(8).setPreferredWidth(70); // Sleeves Column
        tbSelectedProduct.getColumnModel().getColumn(9).setPreferredWidth(55); // Number Column
        tbSelectedProduct.getColumnModel().getColumn(10).setPreferredWidth(70); // Color Column
        tbSelectedProduct.getColumnModel().getColumn(11).setPreferredWidth(60); // Size Column
        tbSelectedProduct.getColumnModel().getColumn(12).setPreferredWidth(60); // Id Column
    }

    public void setJSpinnerQuantityModel() {
        // Parameters (InitialValue, Minimumn, Máximumn, StepSize)
        spQuantity.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1)); // null = infinite
    }

    public void initSetup() {
        setTxtModels();
        setTablesColumnSize();
        setJSpinnerQuantityModel();
        setTableModelListenerInTbSelectedProduct();
    }

    public void clientAddButtonAction() {
        if (!selectedClientTableModel.getClientList().isEmpty()) {
            showErrorMessage("There is already a selected client.");
        } else {
            Client selectedClient = clientSearchTableModel.getObjectByRow(tbClientSearch.getSelectedRow());
            selectedClientTableModel.addObjectRow(selectedClient);
        }
    }

    public void clientRemoveButtonAction() {
        selectedClientTableModel.removeObjectRow(0); // There is just one client in a sale
    }

    public void updateCostByProductValue() {
        if (tbProductSearch.getSelectedRow() == -1) {
            // JTable.getSelectedRow() returns -1 when there is no row selected.
            setJSpinnerQuantityModel(); // Return the JSpinnerQuantity value back to 0
            showErrorMessage("Select a product first.");
        } else {
            Product selectedProduct = productSearchTableModel.getObjectByRow(tbProductSearch.getSelectedRow());
            int qtd = Integer.parseInt(spQuantity.getValue().toString());
            double costByProduct = qtd * selectedProduct.getCost();
            txtCostByProduct.setText("R$ " + costByProduct);
        }
    }

    public void updateTotalCostValue() {
        if (selectedProductTableModel.getProductList().isEmpty()) {
            txtTotalCost.setText("R$ 0.0");
        } else {
            List<Product> selectedProducts = selectedProductTableModel.getProductList();
            double totalCost = 0;
            for (int i = 0; i < selectedProducts.size(); i++) {
                totalCost += selectedProducts.get(i).getCost() * selectedProducts.get(i).getQuantity();
            }
            txtTotalCost.setText("R$ " + totalCost);
        }
    }

    public void productAddButtonAction() {
        if (tbProductSearch.getSelectedRow() != -1) {
            Product selectedProduct = productSearchTableModel.getObjectByRow(tbProductSearch.getSelectedRow());
            int qtd = Integer.parseInt(spQuantity.getValue().toString());
            if (selectedProductTableModel.getProductList().contains(selectedProduct)) {
                Product newProduct = selectedProduct;
                newProduct.setQuantity(qtd + selectedProduct.getQuantity());
                selectedProductTableModel.updateObjectRow(selectedProduct, newProduct);
            } else {
                selectedProduct.setQuantity(qtd);
                selectedProductTableModel.addObjectRow(selectedProduct);
            }
        }
    }

    public void productRemoveButtonAction() {
        if (tbSelectedProduct.getSelectedRow() != -1) {
            selectedProductTableModel.removeObjectRow(tbSelectedProduct.getSelectedRow());
        }
    }

    @Override
    public Sale create() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void read(Sale t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Sale update(Sale t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean checkEmptyFields() {
        if ("  /  /    ".equals(txtDate.getText()) || tbSelectedClient.getRowCount() == 0
                || tbSelectedProduct.getRowCount() == 0) {
            showErrorMessage("Fill all the required fields.");
            return false;
        }
        return true;
    }

    @Override
    public boolean checkAll() {
        return checkEmptyFields();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAddClient;
    private javax.swing.JButton btAddProduct;
    private javax.swing.JButton btCancelSale;
    private javax.swing.JButton btClientSearch;
    private javax.swing.JButton btFinishSale;
    private javax.swing.JButton btProductSearch;
    private javax.swing.JButton btRemoveClient;
    private javax.swing.JButton btRemoveClient1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel labBrand;
    private javax.swing.JLabel labCPF;
    private javax.swing.JLabel labCategory;
    private javax.swing.JLabel labClientSearchTable;
    private javax.swing.JLabel labColor;
    private javax.swing.JLabel labCostByProduct;
    private javax.swing.JLabel labDate;
    private javax.swing.JLabel labID;
    private javax.swing.JLabel labName;
    private javax.swing.JLabel labNumber;
    private javax.swing.JLabel labPlayer;
    private javax.swing.JLabel labProductSearchTable;
    private javax.swing.JLabel labQuantity;
    private javax.swing.JLabel labSelectedClient;
    private javax.swing.JLabel labSelectedProducts;
    private javax.swing.JLabel labShirtName;
    private javax.swing.JLabel labSize;
    private javax.swing.JLabel labSleeves;
    private javax.swing.JLabel labTeam;
    private javax.swing.JLabel labTitle;
    private javax.swing.JLabel labTotalCost;
    private javax.swing.JSpinner spQuantity;
    private javax.swing.JTable tbClientSearch;
    private javax.swing.JTable tbProductSearch;
    private javax.swing.JTable tbSelectedClient;
    private javax.swing.JTable tbSelectedProduct;
    private javax.swing.JTextField txtBrand;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtCategory;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtCostByProduct;
    private javax.swing.JFormattedTextField txtDate;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNumber;
    private javax.swing.JTextField txtPlayer;
    private javax.swing.JTextField txtShirtName;
    private javax.swing.JTextField txtSize;
    private javax.swing.JTextField txtSleeves;
    private javax.swing.JTextField txtTeam;
    private javax.swing.JTextField txtTotalCost;
    // End of variables declaration//GEN-END:variables
}
