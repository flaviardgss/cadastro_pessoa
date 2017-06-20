package br.com.sistema.view;

public class MainWindow extends javax.swing.JFrame {

    PersonWindow jc;

    public MainWindow() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelColor = new javax.swing.JPanel();
        MainMenu = new javax.swing.JMenuBar();
        MenuRegister = new javax.swing.JMenu();
        MenuItemClient = new javax.swing.JMenuItem();
        MenuUtilities = new javax.swing.JMenu();
        MenuItemBackup = new javax.swing.JMenuItem();
        MenuItemRestore = new javax.swing.JMenuItem();
        MenuAbout = new javax.swing.JMenu();
        MenuItemAbout = new javax.swing.JMenuItem();
        MenuExit = new javax.swing.JMenu();
        MenuItemExit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Meu Sistema");
        setBackground(new java.awt.Color(255, 102, 255));
        setPreferredSize(new java.awt.Dimension(620, 380));

        PanelColor.setBackground(new java.awt.Color(204, 204, 255));
        PanelColor.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        javax.swing.GroupLayout PanelColorLayout = new javax.swing.GroupLayout(PanelColor);
        PanelColor.setLayout(PanelColorLayout);
        PanelColorLayout.setHorizontalGroup(
            PanelColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
        );
        PanelColorLayout.setVerticalGroup(
            PanelColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 359, Short.MAX_VALUE)
        );

        MainMenu.setBackground(new java.awt.Color(204, 204, 255));
        MainMenu.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        MenuRegister.setText("Cadastro");
        MenuRegister.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        MenuItemClient.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        MenuItemClient.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        MenuItemClient.setText("Cliente");
        MenuItemClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemClientActionPerformed(evt);
            }
        });
        MenuRegister.add(MenuItemClient);

        MainMenu.add(MenuRegister);

        MenuUtilities.setText("Utilitário");
        MenuUtilities.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        MenuItemBackup.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.ALT_MASK));
        MenuItemBackup.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        MenuItemBackup.setText("Backup");
        MenuItemBackup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemBackupActionPerformed(evt);
            }
        });
        MenuUtilities.add(MenuItemBackup);

        MenuItemRestore.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK));
        MenuItemRestore.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        MenuItemRestore.setText("Restore");
        MenuItemRestore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemRestoreActionPerformed(evt);
            }
        });
        MenuUtilities.add(MenuItemRestore);

        MainMenu.add(MenuUtilities);

        MenuAbout.setText("Sobre");
        MenuAbout.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        MenuItemAbout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.ALT_MASK));
        MenuItemAbout.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        MenuItemAbout.setText("Sobre");
        MenuItemAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemAboutActionPerformed(evt);
            }
        });
        MenuAbout.add(MenuItemAbout);

        MainMenu.add(MenuAbout);

        MenuExit.setText("Sair");
        MenuExit.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        MenuItemExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        MenuItemExit.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        MenuItemExit.setText("Sair");
        MenuItemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemExitActionPerformed(evt);
            }
        });
        MenuExit.add(MenuItemExit);

        MainMenu.add(MenuExit);

        setJMenuBar(MainMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MenuItemClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemClientActionPerformed
        jc = new PersonWindow(this, true);
        jc.setVisible(true);
    }//GEN-LAST:event_MenuItemClientActionPerformed

    private void MenuItemExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_MenuItemExitActionPerformed

    private void MenuItemAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemAboutActionPerformed
        AboutWindow sobre = new AboutWindow();
        sobre.setLocationRelativeTo(null);
        sobre.setVisible(true);
    }//GEN-LAST:event_MenuItemAboutActionPerformed

    private void MenuItemBackupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemBackupActionPerformed
        BackupWindow backup = new BackupWindow();
        backup.setLocationRelativeTo(null);
        backup.setVisible(true);
    }//GEN-LAST:event_MenuItemBackupActionPerformed

    private void MenuItemRestoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemRestoreActionPerformed
        RestoreWindow restore = new RestoreWindow();
        restore.setLocationRelativeTo(null);
        restore.setVisible(true);
    }//GEN-LAST:event_MenuItemRestoreActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                LoginWindow login = new LoginWindow();
                login.setLocationRelativeTo(null);
                login.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar MainMenu;
    private javax.swing.JMenu MenuAbout;
    private javax.swing.JMenu MenuExit;
    private javax.swing.JMenuItem MenuItemAbout;
    private javax.swing.JMenuItem MenuItemBackup;
    private javax.swing.JMenuItem MenuItemClient;
    private javax.swing.JMenuItem MenuItemExit;
    private javax.swing.JMenuItem MenuItemRestore;
    private javax.swing.JMenu MenuRegister;
    private javax.swing.JMenu MenuUtilities;
    private javax.swing.JPanel PanelColor;
    // End of variables declaration//GEN-END:variables
}
