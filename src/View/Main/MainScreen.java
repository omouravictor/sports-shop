package View.Main;

import Control.Main.SportsShop;

public class MainScreen extends javax.swing.JFrame {

    private static SportsShop mainControl;

    public MainScreen(SportsShop mainControl) {
        MainScreen.mainControl = mainControl;
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

        mainMenu.add(menuProduct);

        menuSale.setText("Sale");

        menuItemCRUDsale.setText("CRUD");
        menuItemCRUDsale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCRUDsaleActionPerformed(evt);
            }
        });
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

    private void menuItemCRUDsaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCRUDsaleActionPerformed
        mainControl.showSaleCRUD();
    }//GEN-LAST:event_menuItemCRUDsaleActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen(mainControl).setVisible(true);
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
    private javax.swing.JMenu menuProduct;
    private javax.swing.JMenu menuSale;
    // End of variables declaration//GEN-END:variables
}
