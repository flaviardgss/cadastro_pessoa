package br.com.sistema.view;

public class BackupWindow extends javax.swing.JFrame {

    public BackupWindow() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelBackup = new javax.swing.JPanel();
        LabelBackup = new javax.swing.JLabel();
        LabelConstruction = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Backup");

        PanelBackup.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        PanelBackup.setPreferredSize(new java.awt.Dimension(400, 115));

        LabelBackup.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        LabelBackup.setText("Rotina destinada para backup dos dados de cadastro!");

        LabelConstruction.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        LabelConstruction.setText("Em construção...");

        javax.swing.GroupLayout PanelBackupLayout = new javax.swing.GroupLayout(PanelBackup);
        PanelBackup.setLayout(PanelBackupLayout);
        PanelBackupLayout.setHorizontalGroup(
            PanelBackupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBackupLayout.createSequentialGroup()
                .addGroup(PanelBackupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelBackupLayout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(LabelConstruction))
                    .addGroup(PanelBackupLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(LabelBackup)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        PanelBackupLayout.setVerticalGroup(
            PanelBackupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBackupLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(LabelBackup)
                .addGap(35, 35, 35)
                .addComponent(LabelConstruction)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelBackup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelBackup, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BackupWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BackupWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BackupWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BackupWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BackupWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelBackup;
    private javax.swing.JLabel LabelConstruction;
    private javax.swing.JPanel PanelBackup;
    // End of variables declaration//GEN-END:variables
}
