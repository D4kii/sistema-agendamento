
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDao;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.OperacaoEnum;
import java.awt.TextField;
import javax.swing.JOptionPane;
//import javax.swing.JTextField;


public class EspecialidadeDialog extends javax.swing.JDialog {
    
    private Especialidade especialidade;
    private OperacaoEnum operacao;
    
    public EspecialidadeDialog(
            java.awt.Frame parent,
            boolean modal,
            Especialidade e,
            OperacaoEnum operacao) {
        
        super(parent, modal);
        initComponents();
        
        especialidade = e;
        this.operacao = operacao;
        
        preencherFormulario();
        
        preencherTitulo();
    }
    
    public EspecialidadeDialog(
            java.awt.Frame parent,
            boolean modal,
            OperacaoEnum operacao) {
        
        super(parent, modal);
        initComponents();
        this.operacao = operacao;
        
        preencherTitulo();
        
    }
    
    
    private void preencherFormulario(){
        
        codigoEspecialidadeField.setText(especialidade.getCodigo().toString());
        nomeEspecialidadeField.setText(especialidade.getNome());
        descricaoEspecialidadeField.setText(especialidade.getDescricao());
        
    }
    
    private void preencherTitulo() {
        tituloLabel.setText("Especialidades - " + operacao);
        
        if(operacao == OperacaoEnum.EDITAR) {
            tituloLabel.setIcon(new javax.swing.ImageIcon(
                    getClass().getResource("/br/senai/sp/jandira/imagens/lapis (3).png")));
        } else { tituloLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/mais.png")));
            
        }
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
    
        if (operacao == OperacaoEnum.ADICIONAR) {
            adicionar();
        } else {
            editar();
        }
      
       
        
    }//GEN-LAST:event_salvarButtonActionPerformed
    private void editar() {
        especialidade.setNome(nomeEspecialidadeField.getText());
        especialidade.setDescricao(descricaoEspecialidadeField.getText());
        
        EspecialidadeDao.atualizar(especialidade);
        
        JOptionPane.showMessageDialog(null,
                "Especialidade atualizada com sucesso!",
                "Especialidades",
                JOptionPane.INFORMATION_MESSAGE);
        
        dispose();
    }
    
    
    private void adicionar() {
        if (nomeEspecialidadeField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null,
                    "O nome é obrigatório!",
                    "Especialidade",
                    JOptionPane.WARNING_MESSAGE);  
        }
        else if (descricaoEspecialidadeField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null,
                    "Descrição é obrigatória!",
                    "Descrição de especialidade",
                    JOptionPane.WARNING_MESSAGE);  
        } else {
        
        Especialidade novaEspecialidade = new Especialidade();
        novaEspecialidade.setNome(nomeEspecialidadeField.getText());
        novaEspecialidade.setDescricao(descricaoEspecialidadeField.getText());
        
        // Gravar o objeto, através do dao, e avisar o usuário que foi gravado
        EspecialidadeDao.gravar(novaEspecialidade);
        
        JOptionPane.showMessageDialog(this,
                "Salvo com sucesso!",
                "Adiciionar especialidade",
                JOptionPane.INFORMATION_MESSAGE);
        
        dispose();
    }
    }
    
    
    private void lixoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lixoButtonActionPerformed
        dispose();
    }//GEN-LAST:event_lixoButtonActionPerformed

    
    

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
