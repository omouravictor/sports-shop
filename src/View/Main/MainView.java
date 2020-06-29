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
        menuCategory2 = new javax.swing.JMenu();
        menuItemCRUDcategory2 = new javax.swing.JMenuItem();
        menuCategory3 = new javax.swing.JMenu();
        menuItemCRUDcategory3 = new javax.swing.JMenuItem();
        menuCategory4 = new javax.swing.JMenu();
        menuItemCRUDcategory4 = new javax.swing.JMenuItem();

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

        menuCategory2.setText("Category");

        menuItemCRUDcategory2.setText("CRUD");
        menuItemCRUDcategory2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCRUDcategory2ActionPerformed(evt);
            }
        });
        menuCategory2.add(menuItemCRUDcategory2);

        mainMenu.add(menuCategory2);

        menuCategory3.setText("Category");

        menuItemCRUDcategory3.setText("CRUD");
        menuItemCRUDcategory3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCRUDcategory3ActionPerformed(evt);
            }
        });
        menuCategory3.add(menuItemCRUDcategory3);

        mainMenu.add(menuCategory3);

        menuCategory4.setText("Category");

        menuItemCRUDcategory4.setText("CRUD");
        menuItemCRUDcategory4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCRUDcategory4ActionPerformed(evt);
            }
        });
        menuCategory4.add(menuItemCRUDcategory4);

        mainMenu.add(menuCategory4);

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

    private void menuItemCRUDcategory2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCRUDcategory2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItemCRUDcategory2ActionPerformed

    private void menuItemCRUDcategory3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCRUDcategory3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItemCRUDcategory3ActionPerformed

    private void menuItemCRUDcategory4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCRUDcategory4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItemCRUDcategory4ActionPerformed

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
    private javax.swing.JMenu menuCategory2;
    private javax.swing.JMenu menuCategory3;
    private javax.swing.JMenu menuCategory4;
    private javax.swing.JMenu menuClient;
    private javax.swing.JMenuItem menuItemCRUDbrand;
    private javax.swing.JMenuItem menuItemCRUDcategory;
    private javax.swing.JMenuItem menuItemCRUDcategory2;
    private javax.swing.JMenuItem menuItemCRUDcategory3;
    private javax.swing.JMenuItem menuItemCRUDcategory4;
    private javax.swing.JMenuItem menuItemCRUDclient;
    // End of variables declaration//GEN-END:variables
}
