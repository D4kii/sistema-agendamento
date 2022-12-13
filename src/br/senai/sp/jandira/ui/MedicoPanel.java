package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.MedicoDao;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.OperacaoEnum;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class MedicoPanel extends javax.swing.JPanel {

    private int linha;

    public MedicoPanel() {
        initComponents();
        MedicoDao.criarListaMedicos();
        preencherTabela();
    }

    public int getLinha() {
        linha = tabelaMedicosJTablel.getSelectedRow();
        return linha;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        editarMedicoButton = new javax.swing.JButton();
        jScrollPaneMedico = new javax.swing.JScrollPane();
        tabelaMedicosJTablel = new javax.swing.JTable();
        excluirMedicoButton1 = new javax.swing.JButton();
        adicionarMedicoButton = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Lista de Médicos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N
        setPreferredSize(new java.awt.Dimension(750, 380));
        setLayout(null);

        editarMedicoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/lapis (3).png"))); // NOI18N
        editarMedicoButton.setToolTipText("editar");
        editarMedicoButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        editarMedicoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarMedicoButtonActionPerformed(evt);
            }
        });
        add(editarMedicoButton);
        editarMedicoButton.setBounds(670, 280, 70, 50);

        tabelaMedicosJTablel.setAutoCreateRowSorter(true);
        tabelaMedicosJTablel.setBackground(new java.awt.Color(255, 204, 51));
        tabelaMedicosJTablel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tabelaMedicosJTablel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tabelaMedicosJTablel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelaMedicosJTablel.setSelectionBackground(new java.awt.Color(228, 53, 88));
        jScrollPaneMedico.setViewportView(tabelaMedicosJTablel);

        add(jScrollPaneMedico);
        jScrollPaneMedico.setBounds(10, 20, 730, 250);

        excluirMedicoButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/excluir (1).png"))); // NOI18N
        excluirMedicoButton1.setToolTipText("excluir");
        excluirMedicoButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        excluirMedicoButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirMedicoButton1ActionPerformed(evt);
            }
        });
        add(excluirMedicoButton1);
        excluirMedicoButton1.setBounds(10, 280, 60, 60);

        adicionarMedicoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/mais.png"))); // NOI18N
        adicionarMedicoButton.setToolTipText("adicionar");
        adicionarMedicoButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        adicionarMedicoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarMedicoButtonActionPerformed(evt);
            }
        });
        add(adicionarMedicoButton);
        adicionarMedicoButton.setBounds(590, 280, 70, 50);
    }// </editor-fold>//GEN-END:initComponents

    private void editarMedicoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarMedicoButtonActionPerformed
        if (getLinha() != -1) {
            editarMedico();
        } else {
            JOptionPane.showConfirmDialog(
                    this,
                    "Por favor, selecione o plano que deseja editar.",
                    "Médicos",
                    JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_editarMedicoButtonActionPerformed
    private void editarMedico() {
        Medico medico = MedicoDao.getMedico(getCodigo());

        MedicoDialog medicoDialog = new MedicoDialog(null,
                true,
                medico,
                OperacaoEnum.EDITAR);
        medicoDialog.setVisible(true);

        preencherTabela();
    }


    private void excluirMedicoButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirMedicoButton1ActionPerformed
        if (getLinha() != -1) {
            excluirMedico();
        } else {
            JOptionPane.showMessageDialog(
                    this,
                    "Por favor, selecione o médico que deseja excluir",
                    "Atenção",
                    JOptionPane.OK_OPTION);
        }
    }//GEN-LAST:event_excluirMedicoButton1ActionPerformed
    private void excluirMedico() {

        int resposta = JOptionPane.showConfirmDialog(
                this,
                "Confirma exclusão?",
                "Atenção",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        if (resposta == 0) {

            MedicoDao.excluir(getCodigo());

            preencherTabela();
        }
    }

    private void adicionarMedicoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarMedicoButtonActionPerformed
        MedicoDialog medicoDialog
                = new MedicoDialog(null,
                        true,
                        OperacaoEnum.ADICIONAR);
        medicoDialog.setVisible(true);

        preencherTabela();
        
    }//GEN-LAST:event_adicionarMedicoButtonActionPerformed
    private Integer getCodigo() {
        String codigoStr = tabelaMedicosJTablel.getValueAt(getLinha(),
                0).toString();
        Integer codigo = Integer.valueOf(codigoStr);
        return codigo;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicionarMedicoButton;
    private javax.swing.JButton editarMedicoButton;
    private javax.swing.JButton excluirMedicoButton1;
    private javax.swing.JScrollPane jScrollPaneMedico;
    private javax.swing.JTable tabelaMedicosJTablel;
    // End of variables declaration//GEN-END:variables
private void preencherTabela() {

        tabelaMedicosJTablel.setModel(MedicoDao.getMedicoModel()
        );

        ajustarTabela();
    }

    private void ajustarTabela() {
        tabelaMedicosJTablel.getTableHeader().setReorderingAllowed(false);

        tabelaMedicosJTablel.setDefaultEditor(Object.class, null);

        tabelaMedicosJTablel.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tabelaMedicosJTablel.getColumnModel().getColumn(0).setPreferredWidth(100);
        tabelaMedicosJTablel.getColumnModel().getColumn(1).setPreferredWidth(150);
        tabelaMedicosJTablel.getColumnModel().getColumn(2).setPreferredWidth(200);
        tabelaMedicosJTablel.getColumnModel().getColumn(3).setPreferredWidth(150);
        

    }
}
