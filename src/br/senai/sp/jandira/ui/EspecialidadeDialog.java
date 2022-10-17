/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDao;
import br.senai.sp.jandira.model.Especialidade;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class EspecialidadeDialog extends javax.swing.JDialog {
        Especialidade especialidade;
    
    public EspecialidadeDialog(
            java.awt.Frame parent,
            boolean modal,
            Especialidade e) {
        
        super(parent, modal);
        initComponents();
        
        especialidade = e;
        preencherFormulario();
    }
    
    public EspecialidadeDialog(
            java.awt.Frame parent,
            boolean modal) {
        super(parent, modal);
        initComponents();
        
      
    }
    
    private void preencherFormulario(){
        tituloLabel.setText("Especialidades - EDITAR");
        tituloLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/lapis (3).png")));
        codigoEspecialidadeField.setText(especialidade.getCodigo().toString());
        nomeEspecialidadeField.setText(especialidade.getNome());
        descricaoEspecialidadeField.setText(especialidade.getDescricao());
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tituloLabel = new javax.swing.JLabel();
        atualizarEspecialidadesPanel = new javax.swing.JPanel();
        codigoEspecialidadeField = new javax.swing.JTextField();
        nomeEspecialidadeField = new javax.swing.JTextField();
        descricaoEspecialidadeField = new javax.swing.JTextField();
        codifoLabel = new javax.swing.JLabel();
        especialidadeLabel = new javax.swing.JLabel();
        descricaoLabel = new javax.swing.JLabel();
        lixoButton = new javax.swing.JButton();
        salvarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        tituloLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        tituloLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/mais.png"))); // NOI18N
        tituloLabel.setText(" Especialidades - Adicionar ");
        jPanel1.add(tituloLabel);
        tituloLabel.setBounds(10, 0, 420, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 610, 50);

        atualizarEspecialidadesPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Detalhes da Especialidade", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(255, 153, 51))); // NOI18N
        atualizarEspecialidadesPanel.setLayout(null);

        codigoEspecialidadeField.setEditable(false);
        codigoEspecialidadeField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        codigoEspecialidadeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoEspecialidadeFieldActionPerformed(evt);
            }
        });
        atualizarEspecialidadesPanel.add(codigoEspecialidadeField);
        codigoEspecialidadeField.setBounds(20, 60, 120, 30);

        nomeEspecialidadeField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        nomeEspecialidadeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeEspecialidadeFieldActionPerformed(evt);
            }
        });
        atualizarEspecialidadesPanel.add(nomeEspecialidadeField);
        nomeEspecialidadeField.setBounds(20, 120, 380, 30);

        descricaoEspecialidadeField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        atualizarEspecialidadesPanel.add(descricaoEspecialidadeField);
        descricaoEspecialidadeField.setBounds(20, 180, 490, 30);

        codifoLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        codifoLabel.setText("Código:");
        atualizarEspecialidadesPanel.add(codifoLabel);
        codifoLabel.setBounds(20, 40, 50, 14);

        especialidadeLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        especialidadeLabel.setText("Nome da Especialidade:");
        atualizarEspecialidadesPanel.add(especialidadeLabel);
        especialidadeLabel.setBounds(20, 100, 150, 14);

        descricaoLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        descricaoLabel.setText("Descrição da especialidade:");
        atualizarEspecialidadesPanel.add(descricaoLabel);
        descricaoLabel.setBounds(20, 160, 180, 16);

        lixoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/cruz.png"))); // NOI18N
        lixoButton.setToolTipText("cancelar");
        lixoButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lixoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lixoButtonActionPerformed(evt);
            }
        });
        atualizarEspecialidadesPanel.add(lixoButton);
        lixoButton.setBounds(420, 230, 60, 50);

        salvarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/salvar.png"))); // NOI18N
        salvarButton.setToolTipText("salvar");
        salvarButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        salvarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarButtonActionPerformed(evt);
            }
        });
        atualizarEspecialidadesPanel.add(salvarButton);
        salvarButton.setBounds(490, 230, 60, 50);

        getContentPane().add(atualizarEspecialidadesPanel);
        atualizarEspecialidadesPanel.setBounds(10, 80, 580, 300);

        setBounds(0, 0, 625, 455);
    }// </editor-fold>//GEN-END:initComponents

    private void codigoEspecialidadeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoEspecialidadeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoEspecialidadeFieldActionPerformed

    private void nomeEspecialidadeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeEspecialidadeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeEspecialidadeFieldActionPerformed

    private void salvarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarButtonActionPerformed
    
        // Criar um objeto especialidade
        Especialidade novaEspecialidade = new Especialidade();
        novaEspecialidade.setNome(nomeEspecialidadeField.getText());
        novaEspecialidade.setDescricao(descricaoEspecialidadeField.getText());
        
        // Gravar o objeto, através do dao, e avisar o usuário que foi gravado
        EspecialidadeDao.gravar(novaEspecialidade);
        
        JOptionPane.showMessageDialog(this,
                "Salvo com sucesso!",
                "Adiciionar especialidade",
                JOptionPane.INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_salvarButtonActionPerformed

    private void lixoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lixoButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lixoButtonActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(EspecialidadeDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EspecialidadeDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EspecialidadeDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EspecialidadeDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EspecialidadeDialog dialog = new EspecialidadeDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JPanel atualizarEspecialidadesPanel;
    private javax.swing.JLabel codifoLabel;
    private javax.swing.JTextField codigoEspecialidadeField;
    private javax.swing.JTextField descricaoEspecialidadeField;
    private javax.swing.JLabel descricaoLabel;
    private javax.swing.JLabel especialidadeLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton lixoButton;
    private javax.swing.JTextField nomeEspecialidadeField;
    private javax.swing.JButton salvarButton;
    private javax.swing.JLabel tituloLabel;
    // End of variables declaration//GEN-END:variables
}