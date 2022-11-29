
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
        linha = tabelaPlanosDeSaudeJTablel1.getSelectedRow();
        return linha;
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        editarplanoButton1 = new javax.swing.JButton();
        jScrollPanePlano1 = new javax.swing.JScrollPane();
        tabelaPlanosDeSaudeJTablel1 = new javax.swing.JTable();
        excluirPlanoButton1 = new javax.swing.JButton();
        adicionarplanoButton2 = new javax.swing.JButton();

        setLayout(null);

        editarplanoButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/lapis (3).png"))); // NOI18N
        editarplanoButton1.setToolTipText("editar");
        editarplanoButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        editarplanoButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarplanoButton1ActionPerformed(evt);
            }
        });
        add(editarplanoButton1);
        editarplanoButton1.setBounds(670, 280, 70, 50);

        tabelaPlanosDeSaudeJTablel1.setAutoCreateRowSorter(true);
        tabelaPlanosDeSaudeJTablel1.setBackground(new java.awt.Color(255, 204, 51));
        tabelaPlanosDeSaudeJTablel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tabelaPlanosDeSaudeJTablel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tabelaPlanosDeSaudeJTablel1.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelaPlanosDeSaudeJTablel1.setSelectionBackground(new java.awt.Color(228, 53, 88));
        jScrollPanePlano1.setViewportView(tabelaPlanosDeSaudeJTablel1);

        add(jScrollPanePlano1);
        jScrollPanePlano1.setBounds(10, 20, 730, 250);

        excluirPlanoButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/excluir (1).png"))); // NOI18N
        excluirPlanoButton1.setToolTipText("excluir");
        excluirPlanoButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        excluirPlanoButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirPlanoButton1ActionPerformed(evt);
            }
        });
        add(excluirPlanoButton1);
        excluirPlanoButton1.setBounds(10, 280, 60, 60);

        adicionarplanoButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/mais.png"))); // NOI18N
        adicionarplanoButton2.setToolTipText("adicionar");
        adicionarplanoButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        adicionarplanoButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarplanoButton2ActionPerformed(evt);
            }
        });
        add(adicionarplanoButton2);
        adicionarplanoButton2.setBounds(590, 280, 70, 50);
    }// </editor-fold>//GEN-END:initComponents
    
    private void editarPlano(){
        PlanoDeSaude planoDeSaude = PlanoDeSaudeDao.getPlanoDeSaude(getCodigo());
        
        PlanosDialog planosDialog = new PlanosDialog(null, true,planoDeSaude, OperacaoEnum.EDITAR);
        planosDialog.setVisible(true);
       
       preencherTabela();
    }
        
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
    
    private void editarplanoButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarplanoButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editarplanoButton1ActionPerformed

    private void excluirPlanoButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirPlanoButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_excluirPlanoButton1ActionPerformed

    private void adicionarplanoButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarplanoButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adicionarplanoButton2ActionPerformed
    
    private Integer getCodigo(){
        String codigoStr = tabelaPlanosDeSaudeJTablel1.getValueAt(linha, 0).toString();
        Integer codigo = Integer.valueOf(codigoStr);
        return codigo;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicionarplanoButton2;
    private javax.swing.JButton editarplanoButton1;
    private javax.swing.JButton excluirPlanoButton1;
    private javax.swing.JScrollPane jScrollPanePlano1;
    private javax.swing.JTable tabelaPlanosDeSaudeJTablel1;
    // End of variables declaration//GEN-END:variables

    private void preencherTabela(){
    
        tabelaPlanosDeSaudeJTablel1.setModel(PlanoDeSaudeDao.getPlanoDeSaudeModel());
        
        ajustarTabela();
    }

    private void ajustarTabela() {
        tabelaPlanosDeSaudeJTablel1.getTableHeader().setReorderingAllowed(false);
        
        tabelaPlanosDeSaudeJTablel1.setDefaultEditor(Object.class, null);
        
        tabelaPlanosDeSaudeJTablel1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tabelaPlanosDeSaudeJTablel1.getColumnModel().getColumn(0).setPreferredWidth(50);
        tabelaPlanosDeSaudeJTablel1.getColumnModel().getColumn(1).setPreferredWidth(150);
        tabelaPlanosDeSaudeJTablel1.getColumnModel().getColumn(2).setPreferredWidth(200);
        tabelaPlanosDeSaudeJTablel1.getColumnModel().getColumn(3).setPreferredWidth(200);
        tabelaPlanosDeSaudeJTablel1.getColumnModel().getColumn(4).setPreferredWidth(130);
        
    }


}
