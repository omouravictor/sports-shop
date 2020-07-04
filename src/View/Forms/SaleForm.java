package View.Forms;

import Model.Classes.AbstractJDialog;
import Model.Classes.CostFormatter;
import Model.Classes.Sleeves;
import Model.Classes.TxtModelsTypes;
import Model.Classes.TxtTypes;
import Model.EntitiesClasses.Brand;
import Model.EntitiesClasses.Category;
import Model.EntitiesClasses.Client;
import Model.EntitiesClasses.Product;
import Model.EntitiesClasses.Sale;
import Model.EntitiesClasses.Shirt;
import Model.Interfaces.IForms;
import Model.Tables.TbAddedProductModel;
import Model.Tables.TbClientModel;
import Model.Tables.TbProductSearchModel;
import java.util.List;
import javax.swing.JTable;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;

public class SaleForm extends AbstractJDialog<Sale> implements IForms<Sale> {

    private boolean isConfirmed = false;
    // Apagar os news dos dois de baixo
    private TbClientModel tbClientSearchModel = new TbClientModel();
    private TbProductSearchModel tbProductSearchModel = new TbProductSearchModel();

    private TbClientModel tbAddedClientModel = new TbClientModel();
    private TbAddedProductModel tbAddedProductModel = new TbAddedProductModel();
    private CostFormatter costFormatter = new CostFormatter();

    public SaleForm(java.awt.Frame parent, boolean modal, TbClientModel tbClientSearchModel, TbProductSearchModel tbProductSearchModel) {
        super(parent, modal);
        this.tbClientSearchModel = tbClientSearchModel;
        this.tbProductSearchModel = tbProductSearchModel;
        initComponents();
        initSetup();
    }

    public SaleForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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
        tbProductSearchModel.addObjectRow(p1);
        tbProductSearchModel.addObjectRow(p2);
        tbProductSearchModel.addObjectRow(p3);
        tbProductSearchModel.addObjectRow(p4);
        Client cli1 = new Client("Victor Gabriel Siqueira Moura", "12733863614", "(31)98591-6080", "victorgabriel.moura@hotmail.com", "35182-278", "Dinamarca", "238", "Ana rita", "Timóteo", "MG");
        Client cli2 = new Client("Maria de Lourdes Marcelino", "sdvsvsvds", "(31)98727-3572", "victorgabriel.moura@hotmail.com", "35182-278", "Honduras", "238", "Ana rita", "Timóteo", "SP");
        Client cli3 = new Client("Gleison Francis Siqueira Moura", "dsvsvds", "(31)98503-9135", "victorgabriel.moura@hotmail.com", "35182-278", "Portugal", "238", "Ana rita", "Timóteo", "RJ");
        tbClientSearchModel.addObjectRow(cli1);
        tbClientSearchModel.addObjectRow(cli2);
        tbClientSearchModel.addObjectRow(cli3);
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
        labTotalCost = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbClientSearch = new javax.swing.JTable();
        labClientSearchTable = new javax.swing.JLabel();
        labProductSearchTable = new javax.swing.JLabel();
        btOk = new javax.swing.JButton();
        btCancel = new javax.swing.JButton();
        btAddProduct = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbAddedClient = new javax.swing.JTable();
        labAddedClient = new javax.swing.JLabel();
        btRemoveClient = new javax.swing.JButton();
        btAddClient = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbAddedProducts = new javax.swing.JTable();
        labAddedProducts = new javax.swing.JLabel();
        btRemoveProduct = new javax.swing.JButton();
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
        labSleeves = new javax.swing.JLabel();
        txtSleeves = new javax.swing.JTextField();
        labShirtName = new javax.swing.JLabel();
        txtShirtName = new javax.swing.JTextField();
        labSize = new javax.swing.JLabel();
        txtNumber = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        txtSize = new javax.swing.JTextField();
        labNumber = new javax.swing.JLabel();
        labColor = new javax.swing.JLabel();
        labID = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        labCPF = new javax.swing.JLabel();
        txtCPF = new javax.swing.JTextField();
        txtTotalCost = new javax.swing.JFormattedTextField();
        txtCostByProduct = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
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

        labTotalCost.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        labTotalCost.setText("Total Cost");

        tbClientSearch.setModel(this.tbClientSearchModel);
        jScrollPane1.setViewportView(tbClientSearch);

        labClientSearchTable.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        labClientSearchTable.setText("Client Search Table");

        labProductSearchTable.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        labProductSearchTable.setText("Product Search Table");

        btOk.setText("Finish Sale");
        btOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOkActionPerformed(evt);
            }
        });

        btCancel.setText("Cancel Sale");
        btCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelActionPerformed(evt);
            }
        });

        btAddProduct.setText("Add Product");
        btAddProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddProductActionPerformed(evt);
            }
        });

        tbAddedClient.setModel(this.tbAddedClientModel);
        jScrollPane3.setViewportView(tbAddedClient);

        labAddedClient.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        labAddedClient.setText("Added Client*");

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

        tbAddedProducts.setModel(this.tbAddedProductModel);
        jScrollPane4.setViewportView(tbAddedProducts);

        labAddedProducts.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        labAddedProducts.setText("Added Products*");

        btRemoveProduct.setText("Remove Product");
        btRemoveProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoveProductActionPerformed(evt);
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

        tbProductSearch.setModel(this.tbProductSearchModel);
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

        labSleeves.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        labSleeves.setText("Sleeves");

        txtSleeves.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSleevesActionPerformed(evt);
            }
        });

        labShirtName.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        labShirtName.setText("ShirtName");

        txtShirtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtShirtNameActionPerformed(evt);
            }
        });

        labSize.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        labSize.setText("Size");

        txtNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumberActionPerformed(evt);
            }
        });

        txtColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtColorActionPerformed(evt);
            }
        });

        txtSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSizeActionPerformed(evt);
            }
        });

        labNumber.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        labNumber.setText("Number");

        labColor.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        labColor.setText("Color");

        labID.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        labID.setText("ID");

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        labCPF.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        labCPF.setText("CPF (Just Numbers)");

        txtCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCPFActionPerformed(evt);
            }
        });

        txtTotalCost.setText("R$ 0,00");

        txtCostByProduct.setText("R$ 0,00");

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
                            .addComponent(labTitle)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labName)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(labCPF)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btClientSearch))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btOk)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(labProductSearchTable)
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
                                                .addComponent(labShirtName)
                                                .addComponent(labSleeves))
                                            .addGap(8, 8, 8)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtSleeves, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtShirtName, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(labColor)
                                                .addComponent(labNumber)
                                                .addComponent(labSize))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtSize, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(labID))))
                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(labQuantity)
                                            .addGap(3, 3, 3)
                                            .addComponent(spQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(labCostByProduct)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtCostByProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btAddProduct))))
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btRemoveProduct)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(labTotalCost)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtTotalCost, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(230, 230, 230)
                                        .addComponent(labAddedProducts))
                                    .addComponent(btCancel))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labClientSearchTable)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labAddedClient)
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
                    .addComponent(labAddedClient))
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
                        .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labNumber)
                        .addComponent(labID)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labShirtName)
                                    .addComponent(txtShirtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labBrand)
                                    .addComponent(labColor))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTeam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labSleeves)
                            .addComponent(txtSleeves, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labTeam)
                            .addComponent(labSize)
                            .addComponent(txtSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btProductSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labProductSearchTable)
                    .addComponent(labAddedProducts))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labTotalCost)
                            .addComponent(btRemoveProduct)
                            .addComponent(txtTotalCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labQuantity)
                            .addComponent(spQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labCostByProduct)
                            .addComponent(btAddProduct)
                            .addComponent(txtCostByProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btOk)
                            .addComponent(btCancel))
                        .addContainerGap())))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        filterTbClientSearch();
    }//GEN-LAST:event_txtNameActionPerformed

    private void btClientSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClientSearchActionPerformed
        filterTbClientSearch();
    }//GEN-LAST:event_btClientSearchActionPerformed

    private void txtCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCategoryActionPerformed
        filterTbProductSearch();
    }//GEN-LAST:event_txtCategoryActionPerformed

    private void btProductSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProductSearchActionPerformed
        filterTbProductSearch();
    }//GEN-LAST:event_btProductSearchActionPerformed

    private void btOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOkActionPerformed
        if (checkAll()) {
            isConfirmed = true;
            clearAllSelectedRows();
            resetCostAndQtdByProduct();
            clearAllFilters();
            this.dispose();
        }
    }//GEN-LAST:event_btOkActionPerformed

    private void btCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelActionPerformed
        isConfirmed = false;
        clearAllSelectedRows();
        resetCostAndQtdByProduct();
        clearAllFilters();
        this.dispose();
    }//GEN-LAST:event_btCancelActionPerformed

    private void btAddProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddProductActionPerformed
        if (rowIsSelected(tbProductSearch)) {
            Product selectedProduct = getProductSelectedInTbSearchProduct();
            int qtd = getSpQuantity();
            if (tbAddedProductModel.getList().contains(selectedProduct)) {
                Product newProduct = selectedProduct;
                newProduct.setQuantity(qtd + selectedProduct.getQuantity());
                tbAddedProductModel.updateObjectRow(selectedProduct, newProduct);
            } else {
                selectedProduct.setQuantity(qtd);
                tbAddedProductModel.addObjectRow(selectedProduct);
            }
        }
    }//GEN-LAST:event_btAddProductActionPerformed

    private void btRemoveClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoveClientActionPerformed
        tbAddedClientModel.removeObjectRow(0);
    }//GEN-LAST:event_btRemoveClientActionPerformed

    private void btAddClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddClientActionPerformed
        if (!clientIsAdded()) {
            int row = tbClientSearch.getSelectedRow();
            Client addedClient = tbClientSearchModel.getObjectByRow(row);
            tbAddedClientModel.addObjectRow(addedClient);
        }
    }//GEN-LAST:event_btAddClientActionPerformed

    private void btRemoveProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoveProductActionPerformed
        if (productsAreAdded()) {
            int row = tbAddedProducts.getSelectedRow();
            tbAddedProductModel.removeObjectRow(row);
        }
    }//GEN-LAST:event_btRemoveProductActionPerformed

    private void spQuantityStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spQuantityStateChanged
        updateCostByProductValue();
    }//GEN-LAST:event_spQuantityStateChanged

    private void tbProductSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbProductSearchMouseClicked
        updateCostByProductValue();
    }//GEN-LAST:event_tbProductSearchMouseClicked

    private void txtBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBrandActionPerformed
        filterTbProductSearch();
    }//GEN-LAST:event_txtBrandActionPerformed

    private void txtTeamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTeamActionPerformed
        filterTbProductSearch();
    }//GEN-LAST:event_txtTeamActionPerformed

    private void txtPlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlayerActionPerformed
        filterTbProductSearch();
    }//GEN-LAST:event_txtPlayerActionPerformed

    private void txtSleevesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSleevesActionPerformed
        filterTbProductSearch();
    }//GEN-LAST:event_txtSleevesActionPerformed

    private void txtShirtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtShirtNameActionPerformed
        filterTbProductSearch();
    }//GEN-LAST:event_txtShirtNameActionPerformed

    private void txtNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumberActionPerformed
        filterTbProductSearch();
    }//GEN-LAST:event_txtNumberActionPerformed

    private void txtColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtColorActionPerformed
        filterTbProductSearch();
    }//GEN-LAST:event_txtColorActionPerformed

    private void txtSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSizeActionPerformed
        filterTbProductSearch();
    }//GEN-LAST:event_txtSizeActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        filterTbProductSearch();
    }//GEN-LAST:event_txtIDActionPerformed

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
                SaleForm dialog = new SaleForm(new javax.swing.JFrame(), true);
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
    }

    public void setAlwaysNoEditable() {
        txtCostByProduct.setEditable(false);
        txtTotalCost.setEditable(false);
    }

    @Override
    public void setEnabledAll() {
        spQuantity.setEnabled(true);
        btAddClient.setEnabled(true);
        btAddProduct.setEnabled(true);
        btClientSearch.setEnabled(true);
        btRemoveClient.setEnabled(true);
        btRemoveProduct.setEnabled(true);
        btProductSearch.setEnabled(true);
        txtCostByProduct.setEnabled(true);
        txtName.setEnabled(true);
        txtCPF.setEnabled(true);
        txtCategory.setEnabled(true);
        txtBrand.setEnabled(true);
        txtTeam.setEnabled(true);
        txtPlayer.setEnabled(true);
        txtShirtName.setEnabled(true);
        txtSleeves.setEnabled(true);
        txtNumber.setEnabled(true);
        txtColor.setEnabled(true);
        txtSize.setEnabled(true);
        txtID.setEnabled(true);
        tbClientSearch.setEnabled(true);
        tbProductSearch.setEnabled(true);
    }

    @Override
    public void setNoEnabledAll() {
        spQuantity.setEnabled(false);
        btAddClient.setEnabled(false);
        btAddProduct.setEnabled(false);
        btClientSearch.setEnabled(false);
        btRemoveClient.setEnabled(false);
        btRemoveProduct.setEnabled(false);
        btProductSearch.setEnabled(false);
        txtCostByProduct.setEnabled(false);
        txtName.setEnabled(false);
        txtCPF.setEnabled(false);
        txtCategory.setEnabled(false);
        txtBrand.setEnabled(false);
        txtTeam.setEnabled(false);
        txtPlayer.setEnabled(false);
        txtShirtName.setEnabled(false);
        txtSleeves.setEnabled(false);
        txtNumber.setEnabled(false);
        txtColor.setEnabled(false);
        txtSize.setEnabled(false);
        txtID.setEnabled(false);
        tbClientSearch.setEnabled(false);
        tbProductSearch.setEnabled(false);
    }

    @Override
    public void setEditableAll() {
        txtDate.setEditable(true);
    }

    @Override
    public void setNoEditableAll() {
        txtDate.setEditable(false);
    }

    @Override
    public void setEmptyAll() {
        tbAddedClientModel.clearList();
        tbAddedProductModel.clearList();
        txtName.setText("");
        txtCPF.setText("");
        txtDate.setText("");
        txtCategory.setText("");
        txtBrand.setText("");
        txtTeam.setText("");
        txtPlayer.setText("");
        txtShirtName.setText("");
        txtSleeves.setText("");
        txtNumber.setText("");
        txtColor.setText("");
        txtSize.setText("");
        txtID.setText("");
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
    public Sale getObjectCreated() {
        Sale newSale = new Sale();
        newSale.setClient(tbAddedClientModel.getObjectByRow(0));
        newSale.setSaleDate(txtDate.getText());
        newSale.addAllProducts(tbAddedProductModel.getList());
        newSale.setSaleCost(parseTxtCostToDouble(txtTotalCost));
        return newSale;
    }

    @Override
    public Sale create() {
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
        btCancel.setText("Close");
        tbAddedClientModel.clearList();
        tbAddedProductModel.clearList();
        setNoEditableAll();
        setNoEnabledAll();
    }

    @Override
    public void read(Sale t) {
        prepareRead();
        txtDate.setText(t.getSaleDate());
        tbAddedClientModel.addObjectRow(t.getClient());
        tbAddedProductModel.addObjectRowS(t.getProductList());
        txtTotalCost.setText(costFormatter.formatCost(t.getSaleCost()));
        showForm();
    }

    @Override
    public void prepareUpdate(Sale t) {
        setVisibleAll();
        setEnabledAll();
        setEditableAll();
        setEmptyAll();
        btOk.setText("Update");
        btCancel.setText("Cancel");
        txtDate.setText(t.getSaleDate());
        tbAddedClientModel.addObjectRow(t.getClient());
        tbAddedProductModel.addObjectRowS(t.getProductList());
        txtTotalCost.setText(costFormatter.formatCost(t.getSaleCost()));
    }

    @Override
    public Sale getObjectUpdated(Sale oldT) {
        Sale updatedSale = oldT;
        updatedSale.setClient(tbAddedClientModel.getObjectByRow(0));
        updatedSale.setSaleDate(txtDate.getText());
        updatedSale.getProductList().clear();
        updatedSale.addAllProducts(tbAddedProductModel.getList());
        updatedSale.setSaleCost(parseTxtCostToDouble(txtTotalCost));
        return updatedSale;
    }

    @Override
    public Sale update(Sale t) {
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
        txtCPF.setDocument(new TxtModelsTypes(TxtTypes.CPF));
        txtShirtName.setDocument(new TxtModelsTypes(TxtTypes.Integer));
    }

    @Override
    public boolean fieldsAreEmpty() {
        if ("  /  /    ".equals(txtDate.getText())
                || !clientIsAdded()
                || !productsAreAdded()) {
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
        setSpQuantityModel();
        setAlwaysNoEditable();
        setTbAddedClientColumnSizes();
        setTbClientSearchColumnSizes();
        setTbAddedProductsColumnSizes();
        setTbProductSearchColumnSizes();
        setListenerInTbAddedProducts();
    }

    public boolean productFiltersAreEmpty() {
        return txtCategory.getText().isEmpty() && txtBrand.getText().isEmpty()
                && txtTeam.getText().isEmpty() && txtPlayer.getText().isEmpty()
                && txtShirtName.getText().isEmpty() && txtSleeves.getText().isEmpty()
                && txtNumber.getText().isEmpty() && txtColor.getText().isEmpty()
                && txtSize.getText().isEmpty() && txtID.getText().isEmpty();
    }

    public boolean clientFiltersAreEmpty() {
        return txtName.getText().isEmpty() && txtCPF.getText().isEmpty();
    }

    public void filterTbProductSearch() {
        if (!productFiltersAreEmpty()) {
            String[] filters = {txtCategory.getText(), txtBrand.getText(),
                txtTeam.getText(), txtPlayer.getText(), txtShirtName.getText(),
                txtSleeves.getText(), txtNumber.getText(), txtColor.getText(),
                txtSize.getText(), txtID.getText()
            };
            tbProductSearchModel.filter(tbProductSearch, filters);
            resetCostAndQtdByProduct();
        } else {
            tbProductSearch.setRowSorter(null);
        }
    }

    public void resetCostAndQtdByProduct() {
        txtCostByProduct.setText("R$ 0,00");
        setSpQuantityModel();
    }

    public void filterTbClientSearch() {
        if (!clientFiltersAreEmpty()) {
            String[] filters = {txtName.getText(), txtCPF.getText()};
            tbClientSearchModel.filter(tbClientSearch, filters);
        } else {
            tbClientSearch.setRowSorter(null);
        }
    }

    public void setListenerInTbAddedProducts() {
        TableModelListener listener = (TableModelEvent event) -> {
            if (event.getType() == TableModelEvent.INSERT
                    || event.getType() == TableModelEvent.DELETE
                    || event.getType() == TableModelEvent.UPDATE) {
                updateTotalCostValue();
            }
        };
        tbAddedProductModel.addTableModelListener(listener);
    }

    public void setSpQuantityModel() {
        // Parameters (InitialValue, Minimumn, Máximumn, StepSize)
        spQuantity.setModel(new SpinnerNumberModel(1, 1, 1000000, 1));
    }

    public boolean clientIsAdded() {
        return tbAddedClient.getRowCount() != 0;
    }

    public boolean productsAreAdded() {
        return tbAddedProducts.getRowCount() != 0;
    }

    public Product getProductSelectedInTbSearchProduct() {
        int row = tbProductSearch.getSelectedRow();
        Product selectedProduct = tbProductSearchModel.getObjectByRow(row);
        return selectedProduct;
    }

    public int getSpQuantity() {
        int qtd = Integer.parseInt(spQuantity.getValue().toString());
        return qtd;
    }

    public void updateCostByProductValue() {
        if (rowIsSelected(tbProductSearch)) {
            Product selectedProduct = getProductSelectedInTbSearchProduct();
            int qtd = getSpQuantity();
            double costByProduct = qtd * selectedProduct.getCost();
            String costFormatted;
            costFormatted = costFormatter.formatCost(costByProduct);
            txtCostByProduct.setText(costFormatted);
        } else {
            resetCostAndQtdByProduct();
        }
    }

    public void updateTotalCostValue() {
        if (productsAreAdded()) {
            List<Product> addedProducts = tbAddedProductModel.getList();
            double totalCost = 0;
            for (int i = 0; i < addedProducts.size(); i++) {
                double productCost = addedProducts.get(i).getCost();
                int productQtd = addedProducts.get(i).getQuantity();
                totalCost += productCost * productQtd;
            }
            txtTotalCost.setText(costFormatter.formatCost(totalCost));
        } else {
            txtTotalCost.setText("R$ 0,00");
        }
    }

    public void clearAllSelectedRows() {
        tbClientSearch.getSelectionModel().clearSelection();
        tbProductSearch.getSelectionModel().clearSelection();
    }

    @Override
    public void showForm() {
        this.setVisible(true);
    }

    public void clearAllFilters() {
        tbClientSearch.setRowSorter(null);
        tbProductSearch.setRowSorter(null);
    }

    public void setTbClientSearchColumnSizes() {
        tbClientSearch.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        // Enable the horizontal ScrollBar
        tbClientSearch.getColumnModel().getColumn(0).setPreferredWidth(60);
        tbClientSearch.getColumnModel().getColumn(1).setPreferredWidth(200);
        tbClientSearch.getColumnModel().getColumn(2).setPreferredWidth(90);
        tbClientSearch.getColumnModel().getColumn(3).setPreferredWidth(100);
        tbClientSearch.getColumnModel().getColumn(4).setPreferredWidth(220);
        tbClientSearch.getColumnModel().getColumn(5).setPreferredWidth(75);
        tbClientSearch.getColumnModel().getColumn(6).setPreferredWidth(100);
        tbClientSearch.getColumnModel().getColumn(7).setPreferredWidth(55);
        tbClientSearch.getColumnModel().getColumn(8).setPreferredWidth(95);
        tbClientSearch.getColumnModel().getColumn(9).setPreferredWidth(80);
        tbClientSearch.getColumnModel().getColumn(10).setPreferredWidth(40);
    }

    public void setTbAddedClientColumnSizes() {
        tbAddedClient.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        // Enable the horizontal ScrollBar
        tbAddedClient.getColumnModel().getColumn(0).setPreferredWidth(60);
        tbAddedClient.getColumnModel().getColumn(1).setPreferredWidth(200);
        tbAddedClient.getColumnModel().getColumn(2).setPreferredWidth(90);
        tbAddedClient.getColumnModel().getColumn(3).setPreferredWidth(100);
        tbAddedClient.getColumnModel().getColumn(4).setPreferredWidth(220);
        tbAddedClient.getColumnModel().getColumn(5).setPreferredWidth(75);
        tbAddedClient.getColumnModel().getColumn(6).setPreferredWidth(100);
        tbAddedClient.getColumnModel().getColumn(7).setPreferredWidth(55);
        tbAddedClient.getColumnModel().getColumn(8).setPreferredWidth(95);
        tbAddedClient.getColumnModel().getColumn(9).setPreferredWidth(80);
        tbAddedClient.getColumnModel().getColumn(10).setPreferredWidth(40);
    }

    public void setTbProductSearchColumnSizes() {
        tbProductSearch.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        // Enable the horizontal ScrollBar
        tbProductSearch.getColumnModel().getColumn(0).setPreferredWidth(45);
        tbProductSearch.getColumnModel().getColumn(1).setPreferredWidth(75);
        tbProductSearch.getColumnModel().getColumn(2).setPreferredWidth(65);
        tbProductSearch.getColumnModel().getColumn(3).setPreferredWidth(70);
        tbProductSearch.getColumnModel().getColumn(4).setPreferredWidth(80);
        tbProductSearch.getColumnModel().getColumn(5).setPreferredWidth(100);
        tbProductSearch.getColumnModel().getColumn(6).setPreferredWidth(75);
        tbProductSearch.getColumnModel().getColumn(7).setPreferredWidth(70);
        tbProductSearch.getColumnModel().getColumn(8).setPreferredWidth(55);
        tbProductSearch.getColumnModel().getColumn(9).setPreferredWidth(70);
        tbProductSearch.getColumnModel().getColumn(10).setPreferredWidth(60);
        tbProductSearch.getColumnModel().getColumn(11).setPreferredWidth(60);
    }

    public void setTbAddedProductsColumnSizes() {
        tbAddedProducts.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        // Enable the horizontal ScrollBar
        tbAddedProducts.getColumnModel().getColumn(0).setPreferredWidth(45);
        tbAddedProducts.getColumnModel().getColumn(1).setPreferredWidth(45);
        tbAddedProducts.getColumnModel().getColumn(2).setPreferredWidth(75);
        tbAddedProducts.getColumnModel().getColumn(3).setPreferredWidth(65);
        tbAddedProducts.getColumnModel().getColumn(4).setPreferredWidth(70);
        tbAddedProducts.getColumnModel().getColumn(5).setPreferredWidth(80);
        tbAddedProducts.getColumnModel().getColumn(6).setPreferredWidth(100);
        tbAddedProducts.getColumnModel().getColumn(7).setPreferredWidth(75);
        tbAddedProducts.getColumnModel().getColumn(8).setPreferredWidth(70);
        tbAddedProducts.getColumnModel().getColumn(9).setPreferredWidth(55);
        tbAddedProducts.getColumnModel().getColumn(10).setPreferredWidth(70);
        tbAddedProducts.getColumnModel().getColumn(11).setPreferredWidth(60);
        tbAddedProducts.getColumnModel().getColumn(12).setPreferredWidth(60);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAddClient;
    private javax.swing.JButton btAddProduct;
    private javax.swing.JButton btCancel;
    private javax.swing.JButton btClientSearch;
    private javax.swing.JButton btOk;
    private javax.swing.JButton btProductSearch;
    private javax.swing.JButton btRemoveClient;
    private javax.swing.JButton btRemoveProduct;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel labAddedClient;
    private javax.swing.JLabel labAddedProducts;
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
    private javax.swing.JLabel labShirtName;
    private javax.swing.JLabel labSize;
    private javax.swing.JLabel labSleeves;
    private javax.swing.JLabel labTeam;
    private javax.swing.JLabel labTitle;
    private javax.swing.JLabel labTotalCost;
    private javax.swing.JSpinner spQuantity;
    private javax.swing.JTable tbAddedClient;
    private javax.swing.JTable tbAddedProducts;
    private javax.swing.JTable tbClientSearch;
    private javax.swing.JTable tbProductSearch;
    private javax.swing.JTextField txtBrand;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtCategory;
    private javax.swing.JTextField txtColor;
    private javax.swing.JFormattedTextField txtCostByProduct;
    private javax.swing.JFormattedTextField txtDate;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNumber;
    private javax.swing.JTextField txtPlayer;
    private javax.swing.JTextField txtShirtName;
    private javax.swing.JTextField txtSize;
    private javax.swing.JTextField txtSleeves;
    private javax.swing.JTextField txtTeam;
    private javax.swing.JFormattedTextField txtTotalCost;
    // End of variables declaration//GEN-END:variables
}
