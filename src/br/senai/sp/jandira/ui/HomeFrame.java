
package br.senai.sp.jandira.ui;

import java.awt.Toolkit;

public class HomeFrame extends javax.swing.JFrame {

    private EspecialidadesPanel especialidadesPanel;
    
    private final int POS_X = 30;
    private final int POS_Y = 180;
    private final int LARGURA = 750;
    private final int ALTURA = 350;
    
    public HomeFrame() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/senai/sp/jandira/imagens/relatorio.png")));
        initPanels();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jPanel1 = new javax.swing.JPanel();
        tituloLabel = new javax.swing.JLabel();
        iconLabel = new javax.swing.JLabel();
        sairButton = new javax.swing.JButton();
        agendaButton = new javax.swing.JButton();
        pacienteButton = new javax.swing.JButton();
        planosButton = new javax.swing.JButton();
        homePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        especialidadesButton = new javax.swing.JButton();
        homeButton = new javax.swing.JButton();
        medicosButton = new javax.swing.JButton();

        jScrollPane1.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Agendamento");
        setBackground(new java.awt.Color(255, 204, 102));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        tituloLabel.setFont(new java.awt.Font("Arial", 3, 33)); // NOI18N
        tituloLabel.setText("Sistema para Agendamento de Consultas");
        jPanel1.add(tituloLabel);
        tituloLabel.setBounds(80, 20, 720, 42);

        iconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/calendario.png"))); // NOI18N
        jPanel1.add(iconLabel);
        iconLabel.setBounds(0, 0, 70, 80);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 800, 80);

        sairButton.setBackground(new java.awt.Color(255, 0, 0));
        sairButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sairButton.setForeground(new java.awt.Color(255, 255, 255));
        sairButton.setText("Sair");
        sairButton.setToolTipText("sair");
        sairButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        sairButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairButtonActionPerformed(evt);
            }
        });
        getContentPane().add(sairButton);
        sairButton.setBounds(690, 100, 90, 60);

        agendaButton.setBackground(new java.awt.Color(255, 204, 51));
        agendaButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        agendaButton.setForeground(new java.awt.Color(51, 51, 51));
        agendaButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/cronograma_1.png"))); // NOI18N
        agendaButton.setToolTipText("agendamento");
        agendaButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        agendaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agendaButtonActionPerformed(evt);
            }
        });
        getContentPane().add(agendaButton);
        agendaButton.setBounds(130, 100, 70, 60);

        pacienteButton.setBackground(new java.awt.Color(255, 204, 51));
        pacienteButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        pacienteButton.setForeground(new java.awt.Color(51, 51, 51));
        pacienteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/paciente.png"))); // NOI18N
        pacienteButton.setToolTipText("pacientes");
        pacienteButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pacienteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pacienteButtonActionPerformed(evt);
            }
        });
        getContentPane().add(pacienteButton);
        pacienteButton.setBounds(220, 100, 70, 60);

        planosButton.setBackground(new java.awt.Color(255, 204, 51));
        planosButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        planosButton.setForeground(new java.awt.Color(51, 51, 51));
        planosButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/plano-de-saude.png"))); // NOI18N
        planosButton.setToolTipText("plano de saúde");
        planosButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        planosButton.setPreferredSize(new java.awt.Dimension(70, 30));
        planosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                planosButtonActionPerformed(evt);
            }
        });
        getContentPane().add(planosButton);
        planosButton.setBounds(490, 100, 70, 60);

        homePanel.setBackground(new java.awt.Color(255, 255, 255));
        homePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        homePanel.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Swis721 BlkCn BT", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 51));
        jLabel1.setText("SISACON");
        homePanel.add(jLabel1);
        jLabel1.setBounds(20, 80, 420, 59);

        jLabel2.setFont(new java.awt.Font("Sitka Banner", 1, 14)); // NOI18N
        jLabel2.setText("Sistema de Agendamento de Consultas");
        homePanel.add(jLabel2);
        jLabel2.setBounds(20, 130, 220, 18);

        jLabel3.setFont(new java.awt.Font("Swis721 Ex BT", 1, 18)); // NOI18N
        jLabel3.setText("Suporte Técnico");
        homePanel.add(jLabel3);
        jLabel3.setBounds(530, 180, 190, 25);

        jLabel4.setFont(new java.awt.Font("Swis721 Cn BT", 0, 14)); // NOI18N
        jLabel4.setText("E-mail: sisacon@gmail.com");
        homePanel.add(jLabel4);
        jLabel4.setBounds(550, 210, 160, 20);

        jLabel5.setFont(new java.awt.Font("Swis721 Cn BT", 0, 12)); // NOI18N
        jLabel5.setText("Telefone: (11)9555-5555");
        homePanel.add(jLabel5);
        jLabel5.setBounds(550, 230, 140, 15);

        getContentPane().add(homePanel);
        homePanel.setBounds(30, 180, 750, 350);

        especialidadesButton.setBackground(new java.awt.Color(255, 204, 51));
        especialidadesButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        especialidadesButton.setForeground(new java.awt.Color(51, 51, 51));
        especialidadesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/osteopatia.png"))); // NOI18N
        especialidadesButton.setToolTipText("especialidades");
        especialidadesButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        especialidadesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                especialidadesButtonActionPerformed(evt);
            }
        });
        getContentPane().add(especialidadesButton);
        especialidadesButton.setBounds(400, 100, 70, 60);

        homeButton.setBackground(new java.awt.Color(255, 204, 51));
        homeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/home-page.png"))); // NOI18N
        homeButton.setToolTipText("home page");
        homeButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(homeButton);
        homeButton.setBounds(40, 100, 70, 60);

        medicosButton.setBackground(new java.awt.Color(255, 204, 51));
        medicosButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        medicosButton.setForeground(new java.awt.Color(51, 51, 51));
        medicosButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/medical-team (2).png"))); // NOI18N
        medicosButton.setToolTipText("médicos");
        medicosButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        medicosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicosButtonActionPerformed(evt);
            }
        });
        getContentPane().add(medicosButton);
        medicosButton.setBounds(310, 100, 70, 60);

        setBounds(0, 0, 816, 592);
    }// </editor-fold>//GEN-END:initComponents

    private void medicosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicosButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medicosButtonActionPerformed

    private void pacienteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pacienteButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pacienteButtonActionPerformed

    private void especialidadesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_especialidadesButtonActionPerformed
        especialidadesButton.setBackground(new java.awt.Color(255,204,51));
        homeButton.setBackground(new java.awt.Color(255,204,51));
        homePanel.setVisible(false);
        especialidadesPanel.setVisible(true);
        
    }//GEN-LAST:event_especialidadesButtonActionPerformed

    private void planosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_planosButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_planosButtonActionPerformed

    private void agendaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agendaButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_agendaButtonActionPerformed

    private void sairButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sairButtonActionPerformed

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        especialidadesButton.setBackground(new java.awt.Color(255,204,51));
        homeButton.setBackground(new java.awt.Color(255,204,51));
        homePanel.setVisible(true);
        especialidadesPanel.setVisible(false);
        
    }//GEN-LAST:event_homeButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agendaButton;
    private javax.swing.JButton especialidadesButton;
    private javax.swing.JButton homeButton;
    private javax.swing.JPanel homePanel;
    private javax.swing.JLabel iconLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JButton medicosButton;
    private javax.swing.JButton pacienteButton;
    private javax.swing.JButton planosButton;
    private javax.swing.JButton sairButton;
    private javax.swing.JLabel tituloLabel;
    // End of variables declaration//GEN-END:variables

    private void initPanels() {
        
        especialidadesPanel = new EspecialidadesPanel();
        especialidadesPanel.setBounds(POS_X, POS_Y, LARGURA, ALTURA);
        getContentPane().add(especialidadesPanel);
        especialidadesPanel.setVisible(false);
        
    }


    

}


