package br.com.sistema.view;

import br.com.sistema.controll.PersonDao;
import br.com.sistema.model.Person;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PersonWindow extends javax.swing.JDialog {

    PersonDao base = new PersonDao();

    public PersonWindow(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupRadio = new javax.swing.ButtonGroup();
        jRadioButton1 = new javax.swing.JRadioButton();
        PanelRegister = new javax.swing.JPanel();
        LabelRecord = new javax.swing.JLabel();
        LabelName = new javax.swing.JLabel();
        LabelSex = new javax.swing.JLabel();
        LabeLevel = new javax.swing.JLabel();
        ScrollPaneArea = new javax.swing.JScrollPane();
        areaLista = new javax.swing.JTextArea();
        txtRecord = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        rdSexM = new javax.swing.JRadioButton();
        rdSexF = new javax.swing.JRadioButton();
        cbLevel = new javax.swing.JComboBox();
        ButtonSearch = new javax.swing.JButton();
        ButtonSave = new javax.swing.JButton();
        ButtonChange = new javax.swing.JButton();
        ButtonDelete = new javax.swing.JButton();
        ButtonList = new javax.swing.JButton();
        ButtonClose = new javax.swing.JButton();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Cadastro de Pessoa");

        PanelRegister.setFocusable(false);
        PanelRegister.setPreferredSize(new java.awt.Dimension(620, 380));

        LabelRecord.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        LabelRecord.setText("Registro");

        LabelName.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        LabelName.setText("Nome");

        LabelSex.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        LabelSex.setText("Sexo");

        LabeLevel.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        LabeLevel.setText("Escolaridade");

        areaLista.setEditable(false);
        areaLista.setColumns(20);
        areaLista.setRows(5);
        ScrollPaneArea.setViewportView(areaLista);

        txtRecord.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        txtName.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        buttonGroupRadio.add(rdSexM);
        rdSexM.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        rdSexM.setText("Masculino");

        buttonGroupRadio.add(rdSexF);
        rdSexF.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        rdSexF.setText("Feminino");

        cbLevel.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        cbLevel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Fundamental", "Médio", "Superior", "Pós-Graduação" }));

        ButtonSearch.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        ButtonSearch.setText("Buscar");
        ButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSearchActionPerformed(evt);
            }
        });

        ButtonSave.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        ButtonSave.setText("Gravar");
        ButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSaveActionPerformed(evt);
            }
        });

        ButtonChange.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        ButtonChange.setText("Alterar");
        ButtonChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonChangeActionPerformed(evt);
            }
        });

        ButtonDelete.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        ButtonDelete.setText("Excluir");
        ButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDeleteActionPerformed(evt);
            }
        });

        ButtonList.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        ButtonList.setText("Listar");
        ButtonList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonListActionPerformed(evt);
            }
        });

        ButtonClose.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        ButtonClose.setText("Fechar");
        ButtonClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelRegisterLayout = new javax.swing.GroupLayout(PanelRegister);
        PanelRegister.setLayout(PanelRegisterLayout);
        PanelRegisterLayout.setHorizontalGroup(
            PanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRegisterLayout.createSequentialGroup()
                .addGroup(PanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelRegisterLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(ButtonSave, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonChange, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ButtonDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonList, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ButtonClose, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                        .addGap(30, 30, 30))
                    .addGroup(PanelRegisterLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ScrollPaneArea, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelRegisterLayout.createSequentialGroup()
                                .addGroup(PanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(LabeLevel, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                    .addComponent(LabelSex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(LabelName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(LabelRecord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(PanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelRegisterLayout.createSequentialGroup()
                                        .addComponent(txtRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ButtonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(cbLevel, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(PanelRegisterLayout.createSequentialGroup()
                                            .addComponent(rdSexM)
                                            .addGap(18, 18, 18)
                                            .addComponent(rdSexF)))
                                    .addComponent(txtName))))))
                .addContainerGap())
        );
        PanelRegisterLayout.setVerticalGroup(
            PanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRegisterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelRecord)
                    .addComponent(txtRecord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelSex)
                    .addGroup(PanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rdSexM)
                        .addComponent(rdSexF)))
                .addGap(18, 18, 18)
                .addGroup(PanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabeLevel)
                    .addComponent(cbLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ScrollPaneArea, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(PanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(ButtonSave)
                    .addComponent(ButtonChange)
                    .addComponent(ButtonDelete)
                    .addComponent(ButtonList)
                    .addComponent(ButtonClose))
                .addContainerGap())
        );

        PanelRegisterLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {ButtonChange, ButtonClose, ButtonDelete, ButtonList, ButtonSave});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelRegister, javax.swing.GroupLayout.DEFAULT_SIZE, 627, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCloseActionPerformed
        dispose();
    }//GEN-LAST:event_ButtonCloseActionPerformed

    private void ButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSaveActionPerformed
        cadastrar();
    }//GEN-LAST:event_ButtonSaveActionPerformed

    private void ButtonListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonListActionPerformed
        listar();
        limpaTela();
    }//GEN-LAST:event_ButtonListActionPerformed

    private void ButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSearchActionPerformed
        buscar();
    }//GEN-LAST:event_ButtonSearchActionPerformed

    private void ButtonChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonChangeActionPerformed
        alterar();
    }//GEN-LAST:event_ButtonChangeActionPerformed

    private void ButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDeleteActionPerformed
        excluir();
    }//GEN-LAST:event_ButtonDeleteActionPerformed

    private void buscar() {
        try {
            Person px = base.buscar(Integer.parseInt(txtRecord.getText()));
            if (px.getRegistro() != 0) {
                txtRecord.setText("" + px.getRegistro());
                txtName.setText(px.getNome());
                if (px.getSexo() == 'M' || px.getSexo() == 'm') {
                    rdSexM.setSelected(true);
                } else {
                    rdSexF.setSelected(true);
                }
                cbLevel.setSelectedItem(px.getEscolaridade());
            } else {
                JOptionPane.showMessageDialog(null, "Pessoa não encontrada!");
            }
        } catch (NumberFormatException ex) {
            limpaTela();
        }
    }

    private void listar() {
        ArrayList<Person> l = base.listagem();
        String dados = "";
        for (int x = 0; x < l.size(); x++) {
            dados += l.get(x).toString() + "\n";
        }
        areaLista.setText(dados);
    }

    private void cadastrar() {
        try {
            Person p = new Person();
            p.setRegistro(Integer.parseInt(txtRecord.getText()));
            p.setNome(txtName.getText());
            char s = (rdSexM.isSelected() ? 'M' : 'F');
            p.setSexo(s);
            String escola = (String) cbLevel.getSelectedItem();
            p.setEscolaridade(escola);
            if (base.gravar(p)) {
                JOptionPane.showMessageDialog(null, "Dados gravados com sucesso!");
                limpaTela();
                listar();
            } else {
                JOptionPane.showMessageDialog(null, "Registro já gravado anteriormente!");
                listar();
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Registro inválido!");
        }
    }

    private void alterar() {
        try {
            Person p = new Person();
            p.setRegistro(Integer.parseInt(txtRecord.getText()));
            p.setNome(txtName.getText());
            char s = (rdSexM.isSelected() ? 'M' : 'F');
            p.setSexo(s);
            String escola = (String) cbLevel.getSelectedItem();
            p.setEscolaridade(escola);
            base.alterar(p);
            JOptionPane.showMessageDialog(null, "Registro alterado com sucesso!");
            limpaTela();
            listar();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Registro inválido!");
        }
    }

    private void excluir() {
        try {
            if (base.excluir(Integer.parseInt(txtRecord.getText()))) {
                JOptionPane.showMessageDialog(null, "Registro excluído!");
                limpaTela();
                listar();
            } else {
                JOptionPane.showMessageDialog(null, "Registro não foi excluído!");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Registro inválido!");
            limpaTela();
        }
    }

    private void limpaTela() {
        txtRecord.setText("");
        txtName.setText("");
        buttonGroupRadio.clearSelection();
        cbLevel.setSelectedIndex(0);

    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PersonWindow dialog = new PersonWindow(new javax.swing.JFrame(), true);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonChange;
    private javax.swing.JButton ButtonClose;
    private javax.swing.JButton ButtonDelete;
    private javax.swing.JButton ButtonList;
    private javax.swing.JButton ButtonSave;
    private javax.swing.JButton ButtonSearch;
    private javax.swing.JLabel LabeLevel;
    private javax.swing.JLabel LabelName;
    private javax.swing.JLabel LabelRecord;
    private javax.swing.JLabel LabelSex;
    private javax.swing.JPanel PanelRegister;
    private javax.swing.JScrollPane ScrollPaneArea;
    private javax.swing.JTextArea areaLista;
    private javax.swing.ButtonGroup buttonGroupRadio;
    private javax.swing.JComboBox cbLevel;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton rdSexF;
    private javax.swing.JRadioButton rdSexM;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtRecord;
    // End of variables declaration//GEN-END:variables
}
