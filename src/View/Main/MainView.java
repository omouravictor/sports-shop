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
    private javax.swing.JMenuItem menuItemCRUDbrand;
    private javax.swing.JMenuItem menuItemCRUDcategory;
    // End of variables declaration//GEN-END:variables
}
