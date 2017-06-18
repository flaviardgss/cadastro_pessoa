package br.com.sistema.view;

public class AboutWindow extends javax.swing.JFrame {

    public AboutWindow() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelAbout = new javax.swing.JPanel();
        College = new javax.swing.JLabel();
        Student = new javax.swing.JLabel();
        Register = new javax.swing.JLabel();
        Teacher = new javax.swing.JLabel();
        Discipline = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sobre");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        PanelAbout.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        PanelAbout.setPreferredSize(new java.awt.Dimension(310, 210));

        College.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        College.setText("UNIFACS - Universidade Salvador");

        Student.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        Student.setText("Aluna: Flávia Rodrigues dos Santos");

        Register.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        Register.setText("Matrícula: 312161030");

        Teacher.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        Teacher.setText("Professor: Jairo Luciano Rêgo");

        Discipline.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        Discipline.setText("Disciplina: Linguagens e Técnicas de Programação I");

        javax.swing.GroupLayout PanelAboutLayout = new javax.swing.GroupLayout(PanelAbout);
        PanelAbout.setLayout(PanelAboutLayout);
        PanelAboutLayout.setHorizontalGroup(
            PanelAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAboutLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(PanelAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Discipline)
                    .addComponent(Teacher)
                    .addComponent(Student)
                    .addComponent(College)
                    .addComponent(Register, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        PanelAboutLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {College, Discipline, Register, Student, Teacher});

        PanelAboutLayout.setVerticalGroup(
            PanelAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAboutLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(College)
                .addGap(18, 18, 18)
                .addComponent(Teacher)
                .addGap(18, 18, 18)
                .addComponent(Discipline)
                .addGap(18, 18, 18)
                .addComponent(Student)
                .addGap(18, 18, 18)
                .addComponent(Register)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        PanelAboutLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {College, Discipline, Register, Student, Teacher});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelAbout, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelAbout, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(AboutWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AboutWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AboutWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AboutWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AboutWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel College;
    private javax.swing.JLabel Discipline;
    private javax.swing.JPanel PanelAbout;
    private javax.swing.JLabel Register;
    private javax.swing.JLabel Student;
    private javax.swing.JLabel Teacher;
    // End of variables declaration//GEN-END:variables
}
