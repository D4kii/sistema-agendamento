
package br.senai.sp.jandira.ui;

//import br.senai.sp.jandira.dao.EspecialidadeDao;
import br.senai.sp.jandira.dao.PlanoDeSaudeDao;
import br.senai.sp.jandira.model.OperacaoEnum;
import br.senai.sp.jandira.model.PlanoDeSaude;
import javax.swing.JOptionPane;
import javax.swing.JTable;



public class PlanoDeSaudePanel extends javax.swing.JPanel {
    
    private int linha;

    public PlanoDeSaudePanel() {
        initComponents();
        PlanoDeSaudeDao.criarListaPlanos();
        preencherTabela();
    }

    public int getLinha() {
        linha = tabelaPlanosDeSaudeJTablel.getSelectedRow();
        return linha;
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        planoDeSaudePanel1 = new javax.swing.JPanel();
        editarplanoButton = new javax.swing.JButton();
        jScrollPanePlano = new javax.swing.JScrollPane();
        tabelaPlanosDeSaudeJTablel = new javax.swing.JTable();
        excluirPlanoButton = new javax.swing.JButton();
        adicionarplanoButton1 = new javax.swing.JButton();

        setLayout(null);

        planoDeSaudePanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Planos de Saúde", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));
        planoDeSaudePanel1.setPreferredSize(new java.awt.Dimension(750, 380));
        planoDeSaudePanel1.setLayout(null);

        editarplanoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/lapis (3).png"))); // NOI18N
        editarplanoButton.setToolTipText("editar");
        editarplanoButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        editarplanoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarplanoButtonActionPerformed(evt);
            }
        });
        planoDeSaudePanel1.add(editarplanoButton);
        editarplanoButton.setBounds(670, 280, 70, 50);

        tabelaPlanosDeSaudeJTablel.setAutoCreateRowSorter(true);
        tabelaPlanosDeSaudeJTablel.setBackground(new java.awt.Color(255, 204, 51));
        tabelaPlanosDeSaudeJTablel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tabelaPlanosDeSaudeJTablel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tabelaPlanosDeSaudeJTablel.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelaPlanosDeSaudeJTablel.setSelectionBackground(new java.awt.Color(228, 53, 88));
        jScrollPanePlano.setViewportView(tabelaPlanosDeSaudeJTablel);

        planoDeSaudePanel1.add(jScrollPanePlano);
        jScrollPanePlano.setBounds(10, 20, 730, 250);

        excluirPlanoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/excluir (1).png"))); // NOI18N
        excluirPlanoButton.setToolTipText("excluir");
        excluirPlanoButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        excluirPlanoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirPlanoButtonActionPerformed(evt);
            }
        });
        planoDeSaudePanel1.add(excluirPlanoButton);
        excluirPlanoButton.setBounds(10, 280, 60, 60);

        adicionarplanoButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/mais.png"))); // NOI18N
        adicionarplanoButton1.setToolTipText("adicionar");
        adicionarplanoButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        adicionarplanoButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarplanoButton1ActionPerformed(evt);
            }
        });
        planoDeSaudePanel1.add(adicionarplanoButton1);
        adicionarplanoButton1.setBounds(590, 280, 70, 50);

        add(planoDeSaudePanel1);
        planoDeSaudePanel1.setBounds(0, 0, 750, 409);
    }// </editor-fold>//GEN-END:initComponents

    private void editarplanoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarplanoButtonActionPerformed
        if (getLinha() != -1) {
            editarPlano();
        }else {
            JOptionPane.showConfirmDialog(
                this,
                "Por favor, selecione o Plano de Saúde que você deseja editar.",
                "Planos de Saúde",
                JOptionPane.WARNING_MESSAGE);
        }
      

    }//GEN-LAST:event_editarplanoButtonActionPerformed
    
    private void editarPlano(){
        PlanoDeSaude planoDeSaude = new PlanoDeSaudeDao().getPlanoDeSaude(getCodigo());
        
        PlanosDialog planosDialog = new PlanosDialog(null, true,planoDeSaude, OperacaoEnum.EDITAR);
        planosDialog.setVisible(true);
       
       preencherTabela();
    }
    
    private void excluirPlanoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirPlanoButtonActionPerformed
        
        
        if (getLinha() != -1) {
            excluirPlano(linha);
        } else {
        JOptionPane.showMessageDialog(
                this,
                "Por favor, selecione o Plano de Saúde que deseja excluir",
                "Atenção",
                JOptionPane.OK_OPTION);
        
        
        }
      

    }//GEN-LAST:event_excluirPlanoButtonActionPerformed
    
    private void excluirPlano(int linha) {
         
        
        int resposta = JOptionPane.showConfirmDialog(
                this,
                "Confirma exclusão",
                "Atenção", 
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        
        if(resposta == 0){
        
        PlanoDeSaudeDao.excluir(getCodigo());
        
        preencherTabela();
        }
    }
    
    private void adicionarplanoButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarplanoButton1ActionPerformed
        
        PlanosDialog planosDialog 
            = new PlanosDialog(null, true, OperacaoEnum.ADICIONAR);
    planosDialog.setVisible(true);
    
    preencherTabela();
        
    }//GEN-LAST:event_adicionarplanoButton1ActionPerformed
    
    private Integer getCodigo(){
        String codigoStr = tabelaPlanosDeSaudeJTablel.getValueAt(linha, 0).toString();
        Integer codigo = Integer.valueOf(codigoStr);
        return codigo;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicionarplanoButton1;
    private javax.swing.JButton editarplanoButton;
    private javax.swing.JButton excluirPlanoButton;
    private javax.swing.JScrollPane jScrollPanePlano;
    private javax.swing.JPanel planoDeSaudePanel1;
    private javax.swing.JTable tabelaPlanosDeSaudeJTablel;
    // End of variables declaration//GEN-END:variables

    private void preencherTabela(){
    
        tabelaPlanosDeSaudeJTablel.setModel(PlanoDeSaudeDao.getPlanoDeSaudeModel());
        
        ajustarTabela();
    }

    private void ajustarTabela() {
        tabelaPlanosDeSaudeJTablel.getTableHeader().setReorderingAllowed(false);
        
        tabelaPlanosDeSaudeJTablel.setDefaultEditor(Object.class, null);
        
        tabelaPlanosDeSaudeJTablel.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tabelaPlanosDeSaudeJTablel.getColumnModel().getColumn(0).setPreferredWidth(50);
        tabelaPlanosDeSaudeJTablel.getColumnModel().getColumn(1).setPreferredWidth(150);
        tabelaPlanosDeSaudeJTablel.getColumnModel().getColumn(2).setPreferredWidth(200);
        tabelaPlanosDeSaudeJTablel.getColumnModel().getColumn(3).setPreferredWidth(200);
        tabelaPlanosDeSaudeJTablel.getColumnModel().getColumn(4).setPreferredWidth(130);
        
    }


}
