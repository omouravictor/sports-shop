package View.Main;

import Control.Main.MainControl;

public class MainView extends javax.swing.JFrame {

    private static MainControl mainControl;

    public MainView(MainControl mainControl) {
        MainView.mainControl = mainControl;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainMenu = new javax.swing.JMenuBar();
        menuBrand = new javax.swing.JMenu();
        menuItemCRUDbrand = new javax.swing.JMenuItem();
        menuCategory = new javax.swing.JMenu();
        menuItemCRUDcategory = new javax.swing.JMenuItem();
        menuClient = new javax.swing.JMenu();
        menuItemCRUDclient = new javax.swing.JMenuItem();
        menuProduct = new javax.swing.JMenu();
        menuItemCRUDproduct = new javax.swing.JMenuItem();
        menuItemCRUDshirt = new javax.swing.JMenuItem();
        menuSale = new javax.swing.JMenu();
        menuItemCRUDsale = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SportsShop");
        setResizable(false);

        menuBrand.setText("Brand");

        menuItemCRUDbrand.setText("CRUD");
        menuItemCRUDbrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCRUDbrandActionPerformed(evt);
            }
        });
        menuBrand.add(menuItemCRUDbrand);

        mainMenu.add(menuBrand);

        menuCategory.setText("Category");

        menuItemCRUDcategory.setText("CRUD");
        menuItemCRUDcategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCRUDcategoryActionPerformed(evt);
            }
        });
        menuCategory.add(menuItemCRUDcategory);

        mainMenu.add(menuCategory);

        menuClient.setText("Client");

        menuItemCRUDclient.setText("CRUD");
        menuItemCRUDclient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCRUDclientActionPerformed(evt);
            }
        });
        menuClient.add(menuItemCRUDclient);

        mainMenu.add(menuClient);

        menuProduct.setText("Product");

        menuItemCRUDproduct.setText("CRUD Product");
        menuItemCRUDproduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCRUDproductActionPerformed(evt);
            }
        });
        menuProduct.add(menuItemCRUDproduct);

        menuItemCRUDshirt.setText("CRUD Shirt");
        menuItemCRUDshirt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCRUDshirtActionPerformed(evt);
            }
        });
        menuProduct.add(menuItemCRUDshirt);

        mainMenu.add(menuProduct);

        menuSale.setText("Sale");

        menuItemCRUDsale.setText("CRUD");
        menuSale.add(menuItemCRUDsale);

        mainMenu.add(menuSale);

        setJMenuBar(mainMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemCRUDbrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCRUDbrandActionPerformed
        mainControl.showBrandCRUD();
    }//GEN-LAST:event_menuItemCRUDbrandActionPerformed

    private void menuItemCRUDcategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCRUDcategoryActionPerformed
        mainControl.showCategoryCRUD();
    }//GEN-LAST:event_menuItemCRUDcategoryActionPerformed

    private void menuItemCRUDclientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCRUDclientActionPerformed
        mainControl.showClientCRUD();
    }//GEN-LAST:event_menuItemCRUDclientActionPerformed

    private void menuItemCRUDproductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCRUDproductActionPerformed
        mainControl.showProductCRUD();
    }//GEN-LAST:event_menuItemCRUDproductActionPerformed

    private void menuItemCRUDshirtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCRUDshirtActionPerformed
        mainControl.showShirtCRUD();
    }//GEN-LAST:event_menuItemCRUDshirtActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView(mainControl).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar mainMenu;
    private javax.swing.JMenu menuBrand;
    private javax.swing.JMenu menuCategory;
    private javax.swing.JMenu menuClient;
    private javax.swing.JMenuItem menuItemCRUDbrand;
    private javax.swing.JMenuItem menuItemCRUDcategory;
    private javax.swing.JMenuItem menuItemCRUDclient;
    private javax.swing.JMenuItem menuItemCRUDproduct;
    private javax.swing.JMenuItem menuItemCRUDsale;
    private javax.swing.JMenuItem menuItemCRUDshirt;
    private javax.swing.JMenu menuProduct;
    private javax.swing.JMenu menuSale;
    // End of variables declaration//GEN-END:variables
}
