
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.PlanoDeSaudeDao;
import br.senai.sp.jandira.model.OperacaoEnum;
import br.senai.sp.jandira.model.PlanoDeSaude;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class PlanosDialog extends javax.swing.JDialog {

    
  private PlanoDeSaude planoDeSaude;
    private OperacaoEnum operacao;
    
    public PlanosDialog(
            java.awt.Frame parent,
            boolean modal,
            PlanoDeSaude plano,
            OperacaoEnum operacao) {
        
        super(parent, modal);
        initComponents();
        
        planoDeSaude = plano;
        this.operacao = operacao;
        
        preencherFormulario();
        
        preencherTitulo();
    }
    
    public PlanosDialog(
            java.awt.Frame parent,
            boolean modal,
            OperacaoEnum operacao) {
        
        super(parent, modal);
        initComponents();
        this.operacao = operacao;
        
        preencherTitulo();
        
    }
    private void preencherFormulario(){
        
        codigoPlanosField.setText(planoDeSaude.getCodigo().toString());
        operadoraField.setText(planoDeSaude.getOperadora());
        numeroCarteirinhaField.setText(planoDeSaude.getNumero());
        categoriaField.setText(planoDeSaude.getCategoria());
        validadeField.setText(planoDeSaude.getValidade().toString());
        
    }
    
    private void preencherTitulo() {
        planoTituloLabel.setText("Planos de Saúde - " + operacao);
        
        if(operacao == OperacaoEnum.EDITAR) {
            planoTituloLabel.setIcon(new javax.swing.ImageIcon(
                    getClass().getResource("/br/senai/sp/jandira/imagens/lapis (3).png")));
        } else { planoTituloLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/mais.png")));
            
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        planoTituloLabel = new javax.swing.JLabel();
        atualizarPlanosPanel = new javax.swing.JPanel();
        codigoPlanosField = new javax.swing.JTextField();
        operadoraField = new javax.swing.JTextField();
        numeroCarteirinhaField = new javax.swing.JTextField();
        codigoPlanoLabel = new javax.swing.JLabel();
        operadoraLabel = new javax.swing.JLabel();
        numerocarteiraLabel = new javax.swing.JLabel();
        lixoplanoButton = new javax.swing.JButton();
        salvarplanoButton = new javax.swing.JButton();
        categoriaLabel = new javax.swing.JLabel();
        categoriaField = new javax.swing.JTextField();
        validadeLabel = new javax.swing.JLabel();
        validadeField = new javax.swing.JTextField();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        planoTituloLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        planoTituloLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/mais.png"))); // NOI18N
        planoTituloLabel.setText(" Planos de Saúde - Adicionar ");
        jPanel1.add(planoTituloLabel);
        planoTituloLabel.setBounds(10, 0, 420, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 570, 50);

        atualizarPlanosPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Detalhes do Plano de Saúde", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(255, 153, 51))); // NOI18N
        atualizarPlanosPanel.setLayout(null);

        codigoPlanosField.setEditable(false);
        codigoPlanosField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        codigoPlanosField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoPlanosFieldActionPerformed(evt);
            }
        });
        atualizarPlanosPanel.add(codigoPlanosField);
        codigoPlanosField.setBounds(40, 60, 120, 30);

        operadoraField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        operadoraField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                operadoraFieldActionPerformed(evt);
            }
        });
        atualizarPlanosPanel.add(operadoraField);
        operadoraField.setBounds(190, 60, 310, 30);

        numeroCarteirinhaField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        atualizarPlanosPanel.add(numeroCarteirinhaField);
        numeroCarteirinhaField.setBounds(40, 130, 230, 30);

        codigoPlanoLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        codigoPlanoLabel.setText("Código:");
        atualizarPlanosPanel.add(codigoPlanoLabel);
        codigoPlanoLabel.setBounds(40, 40, 50, 14);

        operadoraLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        operadoraLabel.setText("Nome da Operadora:");
        atualizarPlanosPanel.add(operadoraLabel);
        operadoraLabel.setBounds(190, 40, 150, 14);

        numerocarteiraLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        numerocarteiraLabel.setText("Numero da carteirinha:");
        atualizarPlanosPanel.add(numerocarteiraLabel);
        numerocarteiraLabel.setBounds(40, 110, 180, 16);

        lixoplanoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/cruz.png"))); // NOI18N
        lixoplanoButton.setToolTipText("cancelar");
        lixoplanoButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lixoplanoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lixoplanoButtonActionPerformed(evt);
            }
        });
        atualizarPlanosPanel.add(lixoplanoButton);
        lixoplanoButton.setBounds(360, 220, 60, 50);

        salvarplanoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/salvar.png"))); // NOI18N
        salvarplanoButton.setToolTipText("salvar");
        salvarplanoButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        salvarplanoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarplanoButtonActionPerformed(evt);
            }
        });
        atualizarPlanosPanel.add(salvarplanoButton);
        salvarplanoButton.setBounds(440, 220, 60, 50);

        categoriaLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        categoriaLabel.setText("Categoria do Plano:");
        atualizarPlanosPanel.add(categoriaLabel);
        categoriaLabel.setBounds(300, 110, 120, 16);

        categoriaField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        categoriaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoriaFieldActionPerformed(evt);
            }
        });
        atualizarPlanosPanel.add(categoriaField);
        categoriaField.setBounds(300, 130, 200, 30);

        validadeLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        validadeLabel.setText("Validade:");
        atualizarPlanosPanel.add(validadeLabel);
        validadeLabel.setBounds(40, 180, 120, 20);

        validadeField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        validadeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validadeFieldActionPerformed(evt);
            }
        });
        atualizarPlanosPanel.add(validadeField);
        validadeField.setBounds(280, 250, 110, 30);

        jFormattedTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField1ActionPerformed(evt);
            }
        });
        atualizarPlanosPanel.add(jFormattedTextField1);
        jFormattedTextField1.setBounds(30, 200, 64, 30);

        getContentPane().add(atualizarPlanosPanel);
        atualizarPlanosPanel.setBounds(10, 80, 540, 300);

        setBounds(0, 0, 625, 455);
    }// </editor-fold>//GEN-END:initComponents

    private void codigoPlanosFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoPlanosFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoPlanosFieldActionPerformed

    private void operadoraFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_operadoraFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_operadoraFieldActionPerformed

    private void lixoplanoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lixoplanoButtonActionPerformed
        dispose();
    }//GEN-LAST:event_lixoplanoButtonActionPerformed

    private void salvarplanoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarplanoButtonActionPerformed

         if (operacao == OperacaoEnum.ADICIONAR) {
            adicionar();
        } else {
            editar();
        }
    }//GEN-LAST:event_salvarplanoButtonActionPerformed

    private void categoriaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoriaFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoriaFieldActionPerformed

    private void validadeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validadeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_validadeFieldActionPerformed

    private void jFormattedTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField1ActionPerformed
     private void editar() {
        planoDeSaude.setOperadora(operadoraField.getText());
        planoDeSaude.setCategoria(categoriaField.getText());
        planoDeSaude.setNumero(numeroCarteirinhaField.getText());
        planoDeSaude.setValidade(LocalDate.MIN);
        
        
         PlanoDeSaudeDao.atualizar(planoDeSaude);
        
         JOptionPane.showMessageDialog(null,
                "Plano de Saúde atualizado com sucesso!",
                "Plano de Saúde",
                JOptionPane.INFORMATION_MESSAGE);
        
        dispose();
    }
    
    
    private void adicionar() {
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("DD/MM/YYYY");
        
        PlanoDeSaude novoPlano = new PlanoDeSaude();
        novoPlano.setOperadora(operadoraField.getText());
        novoPlano.setCategoria(categoriaField.getText());
        novoPlano.setNumero(numeroCarteirinhaField.getText());
        novoPlano.setValidade(LocalDate.parse(
                                validadeField.getText(),
                                    formatter1));
        
        // Gravar o objeto, através do dao, e avisar o usuário que foi gravado
        PlanoDeSaudeDao.gravar(novoPlano);
        
        JOptionPane.showMessageDialog(this,
                "Salvo com sucesso!",
                "Adiciionar especialidade",
                JOptionPane.INFORMATION_MESSAGE);
        
        dispose();
    }
   
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel atualizarPlanosPanel;
    private javax.swing.JTextField categoriaField;
    private javax.swing.JLabel categoriaLabel;
    private javax.swing.JLabel codigoPlanoLabel;
    private javax.swing.JTextField codigoPlanosField;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton lixoplanoButton;
    private javax.swing.JTextField numeroCarteirinhaField;
    private javax.swing.JLabel numerocarteiraLabel;
    private javax.swing.JTextField operadoraField;
    private javax.swing.JLabel operadoraLabel;
    private javax.swing.JLabel planoTituloLabel;
    private javax.swing.JButton salvarplanoButton;
    private javax.swing.JTextField validadeField;
    private javax.swing.JLabel validadeLabel;
    // End of variables declaration//GEN-END:variables
}
