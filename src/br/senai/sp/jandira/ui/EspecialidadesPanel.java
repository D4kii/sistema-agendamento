
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDao;
import br.senai.sp.jandira.model.Especialidade;
import javax.swing.JOptionPane;
import javax.swing.JTable;


public class EspecialidadesPanel extends javax.swing.JPanel {
    
    private int linha;
    
    public EspecialidadesPanel() {
        initComponents();
        EspecialidadeDao.criarListaEspecialidades();
        preencherTabela();
    }
    
    private int getLinha(){
        linha = tabelaEspecialidadesJTablel.getSelectedRow();
        return linha;
    }
    
    private void setLinha(){
        linha = tabelaEspecialidadesJTablel.getSelectedRow();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        editarButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaEspecialidadesJTablel = new javax.swing.JTable();
        excluirEspecialidadeButton = new javax.swing.JButton();
        adicionarEspecialidadeJButton1 = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Lista de Especialidades", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));
        setPreferredSize(new java.awt.Dimension(750, 380));
        setLayout(null);

        editarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/lapis (3).png"))); // NOI18N
        editarButton.setToolTipText("editar");
        editarButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        editarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarButtonActionPerformed(evt);
            }
        });
        add(editarButton);
        editarButton.setBounds(670, 280, 70, 50);

        tabelaEspecialidadesJTablel.setAutoCreateRowSorter(true);
        tabelaEspecialidadesJTablel.setBackground(new java.awt.Color(255, 204, 51));
        tabelaEspecialidadesJTablel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tabelaEspecialidadesJTablel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tabelaEspecialidadesJTablel.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelaEspecialidadesJTablel.setSelectionBackground(new java.awt.Color(228, 53, 88));
        jScrollPane2.setViewportView(tabelaEspecialidadesJTablel);

        add(jScrollPane2);
        jScrollPane2.setBounds(10, 20, 730, 250);

        excluirEspecialidadeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/excluir (1).png"))); // NOI18N
        excluirEspecialidadeButton.setToolTipText("excluir");
        excluirEspecialidadeButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        excluirEspecialidadeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirEspecialidadeButtonActionPerformed(evt);
            }
        });
        add(excluirEspecialidadeButton);
        excluirEspecialidadeButton.setBounds(10, 280, 60, 60);

        adicionarEspecialidadeJButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/mais.png"))); // NOI18N
        adicionarEspecialidadeJButton1.setToolTipText("adicionar");
        adicionarEspecialidadeJButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        adicionarEspecialidadeJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarEspecialidadeJButton1ActionPerformed(evt);
            }
        });
        add(adicionarEspecialidadeJButton1);
        adicionarEspecialidadeJButton1.setBounds(590, 280, 70, 50);
    }// </editor-fold>//GEN-END:initComponents

    private void editarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarButtonActionPerformed
    
        if (getLinha() != -1) {
            editarEspecialidade();
        } else {
        JOptionPane.showConfirmDialog(
                this,
                "Por favor, selecione a especialidade que você deseja editar.",
                "Especialidades",
                JOptionPane.WARNING_MESSAGE);
        }
     
    
    
    }//GEN-LAST:event_editarButtonActionPerformed
    
     private void editarEspecialidade() {
       Especialidade especialidade = new EspecialidadeDao().getEspecialidade(getCodigo());
       
       EspecialidadeDialog especialidadeDialog = new EspecialidadeDialog(null, true, especialidade);
       especialidadeDialog.setVisible(true);
       
       preencherTabela();
    }
    
    
    
    
    private void excluirEspecialidadeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirEspecialidadeButtonActionPerformed
       
  
        if (getLinha() != -1) {
        excluirEspecialidade(linha);
        } else {
        JOptionPane.showMessageDialog(
                this,
                "Por favor, selecione a especialidade que deseja excluir",
                "Atenção",
                JOptionPane.OK_OPTION);
        }
        
        
       
    }//GEN-LAST:event_excluirEspecialidadeButtonActionPerformed
    
   private void excluirEspecialidade(int linha) {
         
        
        int resposta = JOptionPane.showConfirmDialog(
                this,
                "Confirma exclusão",
                "Atenção", 
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        
        if(resposta == 0){
        
        EspecialidadeDao.excluir(getCodigo());
        
        preencherTabela();
        }
    }
    
    
    private void adicionarEspecialidadeJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarEspecialidadeJButton1ActionPerformed
   
    
    EspecialidadeDialog especialidadeDialog 
            = new EspecialidadeDialog(null, true);
    especialidadeDialog.setVisible(true);
    
    preencherTabela();
    }//GEN-LAST:event_adicionarEspecialidadeJButton1ActionPerformed

    private Integer getCodigo(){
        String codigoStr = tabelaEspecialidadesJTablel.getValueAt(linha, 0).toString();
        Integer codigo = Integer.valueOf(codigoStr);
        return codigo;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicionarEspecialidadeJButton1;
    private javax.swing.JButton editarButton;
    private javax.swing.JButton excluirEspecialidadeButton;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabelaEspecialidadesJTablel;
    // End of variables declaration//GEN-END:variables
    
    private void preencherTabela (){
        
        tabelaEspecialidadesJTablel.setModel(EspecialidadeDao.getEspecialidadesModel());
        
        
        ajustarTabela();
    }
    
    private void ajustarTabela(){
        //impedir que o usuário movimente as colunas
        tabelaEspecialidadesJTablel.getTableHeader().setReorderingAllowed(true);
        
        //Bloquear a edição das células da tabela
        tabelaEspecialidadesJTablel.setDefaultEditor(Object.class, null);
        
        //
        tabelaEspecialidadesJTablel.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tabelaEspecialidadesJTablel.getColumnModel().getColumn(0).setPreferredWidth(100);
        tabelaEspecialidadesJTablel.getColumnModel().getColumn(1).setPreferredWidth(200);
        tabelaEspecialidadesJTablel.getColumnModel().getColumn(2).setPreferredWidth(400);
        
    }

   
}
