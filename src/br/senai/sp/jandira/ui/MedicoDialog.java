package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.dao.EspecialidadeDao;
import static br.senai.sp.jandira.dao.EspecialidadeDao.getEspecialidades;
import br.senai.sp.jandira.dao.MedicoDao;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.OperacaoEnum;
import com.sun.source.tree.BreakTree;
import java.awt.List;
import java.io.BufferedReader;
import java.nio.file.Files;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.text.html.HTMLDocument;

public class MedicoDialog extends javax.swing.JDialog {

    private Medico medico;
    private OperacaoEnum operacao;

    public MedicoDialog(
            java.awt.Frame parent,
            boolean modal,
            OperacaoEnum operacao) {

        super(parent, modal);
        initComponents();
        this.operacao = operacao;
        preencherTitulo();
        preencherEspecialidades();
    }

    public MedicoDialog(
            java.awt.Frame parent,
            boolean modal,
            Medico e,
            OperacaoEnum operacao) {

        super(parent, modal);
        initComponents();

        medico = e;
        this.operacao = operacao;

        preencherFormulario();
        preencherTitulo();
        preencherEspecialidades();
        preencherEspecialidadeMed();
    }

    private void preencherEspecialidades() {
        jListEspecialidade.setModel(EspecialidadeDao.preencherEspecialidade());
    }

    private void preencherFormulario() {

        codigoMedicoField.setText(medico.getCodigo().toString());
        crmField.setText(medico.getCrm());
        nomeMedicoField.setText(medico.getNome());
        telefoneField.setText(medico.getTelefone());
        emailField.setText(medico.getEmail());
        nascimentoFormattedTextField.setText(medico.getNascimentoMedico().format(
                DateTimeFormatter.BASIC_ISO_DATE.ofPattern(
                        "dd/MM/yyyy")));

    }

    private void preencherTitulo() {
        medicoTituloLabel.setText("Médicos - " + operacao);

        if (operacao == OperacaoEnum.EDITAR) {
            medicoTituloLabel.setIcon(
                    new javax.swing.ImageIcon(
                            getClass().getResource(
                                    "/br/senai/sp/jandira/imagens/lapis (3).png")));
        } else {
            medicoTituloLabel.setIcon(
                    new javax.swing.ImageIcon(
                            getClass().getResource(
                                    "/br/senai/sp/jandira/imagens/mais.png")));

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        operadoraLabel1 = new javax.swing.JLabel();
        operadoraField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        medicoTituloLabel = new javax.swing.JLabel();
        atualizarMedicosPanel = new javax.swing.JPanel();
        codigoMedicoField = new javax.swing.JTextField();
        crmField = new javax.swing.JTextField();
        telefoneField = new javax.swing.JTextField();
        codigoMedicoLabel = new javax.swing.JLabel();
        crmLabel = new javax.swing.JLabel();
        telefoneLabel = new javax.swing.JLabel();
        lixoMedicoButton = new javax.swing.JButton();
        salvarMedicoButton = new javax.swing.JButton();
        emailLabel = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        especialidadesMedicoLabel = new javax.swing.JLabel();
        nascimentoFormattedTextField = new javax.swing.JFormattedTextField();
        nomeMedicoLabel = new javax.swing.JLabel();
        nomeMedicoField = new javax.swing.JTextField();
        jScrollPaneEspecialidadesLista = new javax.swing.JScrollPane();
        jListEspecialidade = new javax.swing.JList<>();
        jScrollPaneMedicoEspecialidade = new javax.swing.JScrollPane();
        jListEspecialidadeMed = new javax.swing.JList<>();
        dataNascimentoLabel = new javax.swing.JLabel();
        ListaEspecialidades = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        operadoraLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        operadoraLabel1.setText("CRM:");

        operadoraField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        operadoraField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                operadoraField1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        medicoTituloLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        medicoTituloLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/mais.png"))); // NOI18N
        medicoTituloLabel.setText(" Médicos - Adicionar ");
        jPanel1.add(medicoTituloLabel);
        medicoTituloLabel.setBounds(10, 0, 420, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 570, 50);

        atualizarMedicosPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Detalhes do Plano de Saúde", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(255, 153, 51))); // NOI18N
        atualizarMedicosPanel.setLayout(null);

        codigoMedicoField.setEditable(false);
        codigoMedicoField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        codigoMedicoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoMedicoFieldActionPerformed(evt);
            }
        });
        atualizarMedicosPanel.add(codigoMedicoField);
        codigoMedicoField.setBounds(20, 40, 90, 30);

        crmField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        crmField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crmFieldActionPerformed(evt);
            }
        });
        atualizarMedicosPanel.add(crmField);
        crmField.setBounds(120, 40, 120, 30);

        telefoneField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        atualizarMedicosPanel.add(telefoneField);
        telefoneField.setBounds(20, 100, 120, 30);

        codigoMedicoLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        codigoMedicoLabel.setText("Código:");
        atualizarMedicosPanel.add(codigoMedicoLabel);
        codigoMedicoLabel.setBounds(20, 20, 50, 14);

        crmLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        crmLabel.setText("CRM:");
        atualizarMedicosPanel.add(crmLabel);
        crmLabel.setBounds(120, 20, 40, 14);

        telefoneLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        telefoneLabel.setText("Telefone:");
        atualizarMedicosPanel.add(telefoneLabel);
        telefoneLabel.setBounds(20, 80, 70, 16);

        lixoMedicoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/cruz.png"))); // NOI18N
        lixoMedicoButton.setToolTipText("cancelar");
        lixoMedicoButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lixoMedicoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lixoMedicoButtonActionPerformed(evt);
            }
        });
        atualizarMedicosPanel.add(lixoMedicoButton);
        lixoMedicoButton.setBounds(380, 250, 60, 50);

        salvarMedicoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/salvar.png"))); // NOI18N
        salvarMedicoButton.setToolTipText("salvar");
        salvarMedicoButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        salvarMedicoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarMedicoButtonActionPerformed(evt);
            }
        });
        atualizarMedicosPanel.add(salvarMedicoButton);
        salvarMedicoButton.setBounds(450, 250, 60, 50);

        emailLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        emailLabel.setText("E-mail:");
        atualizarMedicosPanel.add(emailLabel);
        emailLabel.setBounds(150, 80, 130, 16);

        emailField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        emailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailFieldActionPerformed(evt);
            }
        });
        atualizarMedicosPanel.add(emailField);
        emailField.setBounds(150, 100, 360, 30);

        especialidadesMedicoLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        especialidadesMedicoLabel.setText("Especialidades do Médico:");
        atualizarMedicosPanel.add(especialidadesMedicoLabel);
        especialidadesMedicoLabel.setBounds(220, 140, 160, 20);

        nascimentoFormattedTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        nascimentoFormattedTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nascimentoFormattedTextFieldActionPerformed(evt);
            }
        });
        atualizarMedicosPanel.add(nascimentoFormattedTextField);
        nascimentoFormattedTextField.setBounds(390, 160, 120, 30);
        try {
            nascimentoFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        }catch(java.text.ParseException ex) {
            ex.printStackTrace();
        }

        nomeMedicoLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        nomeMedicoLabel.setText("Nome do Médico:");
        atualizarMedicosPanel.add(nomeMedicoLabel);
        nomeMedicoLabel.setBounds(250, 20, 110, 14);

        nomeMedicoField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        nomeMedicoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeMedicoFieldActionPerformed(evt);
            }
        });
        atualizarMedicosPanel.add(nomeMedicoField);
        nomeMedicoField.setBounds(250, 40, 260, 30);

        jListEspecialidade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPaneEspecialidadesLista.setViewportView(jListEspecialidade);

        atualizarMedicosPanel.add(jScrollPaneEspecialidadesLista);
        jScrollPaneEspecialidadesLista.setBounds(20, 160, 140, 140);

        jScrollPaneMedicoEspecialidade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jScrollPaneMedicoEspecialidade.setViewportView(jListEspecialidadeMed);

        atualizarMedicosPanel.add(jScrollPaneMedicoEspecialidade);
        jScrollPaneMedicoEspecialidade.setBounds(220, 160, 150, 140);

        dataNascimentoLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        dataNascimentoLabel.setText("Data de Nascimento:");
        atualizarMedicosPanel.add(dataNascimentoLabel);
        dataNascimentoLabel.setBounds(390, 140, 120, 20);

        ListaEspecialidades.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        ListaEspecialidades.setText("Lista de Especialidades:");
        atualizarMedicosPanel.add(ListaEspecialidades);
        ListaEspecialidades.setBounds(20, 140, 137, 20);

        jButton1.setText(">");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        atualizarMedicosPanel.add(jButton1);
        jButton1.setBounds(170, 190, 40, 30);

        jButton2.setText("<");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        atualizarMedicosPanel.add(jButton2);
        jButton2.setBounds(170, 230, 40, 30);

        getContentPane().add(atualizarMedicosPanel);
        atualizarMedicosPanel.setBounds(10, 60, 540, 320);

        setBounds(0, 0, 641, 463);
    }// </editor-fold>//GEN-END:initComponents

    private void codigoMedicoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoMedicoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoMedicoFieldActionPerformed

    private void crmFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crmFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_crmFieldActionPerformed

    private void lixoMedicoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lixoMedicoButtonActionPerformed
        dispose();
    }//GEN-LAST:event_lixoMedicoButtonActionPerformed

    private void salvarMedicoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarMedicoButtonActionPerformed

        if (operacao == OperacaoEnum.ADICIONAR) {
            adicionar();
        } else {
            editar();
        }
    }//GEN-LAST:event_salvarMedicoButtonActionPerformed
    private void editar() {
        DateTimeFormatter formatacao = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        medico.setCrm(crmField.getText());
        medico.setNome(nomeMedicoField.getText());
        medico.setTelefone(telefoneField.getText());
        medico.setNascimentoMedico(LocalDate.parse(
                nascimentoFormattedTextField.getText(),
                formatacao));

        MedicoDao.atualizar(medico);

        JOptionPane.showMessageDialog(null,
                "Médico atualizado com sucesso!",
                "Médico",
                JOptionPane.INFORMATION_MESSAGE);

        dispose();
    }

    private void adicionar() {
        if (nomeMedicoField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null,
                    "O nome do médico é obrigatório!",
                    "Médico",
                    JOptionPane.WARNING_MESSAGE);
        } else if (crmField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null,
                    "O número da CRM é obrigatório!",
                    "Médico",
                    JOptionPane.WARNING_MESSAGE);
        } else if (telefoneField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null,
                    "O telefone do médico é obrigatório!",
                    "Médico",
                    JOptionPane.WARNING_MESSAGE);
        } else if (nascimentoFormattedTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null,
                    "A data de nascimento é obrigatória!",
                    "Médico",
                    JOptionPane.WARNING_MESSAGE);
        } else if (emailField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null,
                    "O e-mail é obrigatório!",
                    "Médico",
                    JOptionPane.WARNING_MESSAGE);

        } else if (jListEspecialidade.isSelectionEmpty()== true) {
            JOptionPane.showMessageDialog(null,
                    "A Especialidade do Médico é obrigatória!",
                    "Médico",
                    JOptionPane.WARNING_MESSAGE);
        } else {

            DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            Medico novoMedico = new Medico();
            novoMedico.setCrm(crmField.getText());
            novoMedico.setNome(nomeMedicoField.getText());
            novoMedico.setTelefone(telefoneField.getText());
            novoMedico.setEmail(emailField.getText());
            novoMedico.setNascimentoMedico(LocalDate.parse(
                    nascimentoFormattedTextField.getText(),
                    formatter1));

            // Gravar o objeto, através do dao, e avisar o usuário que foi gravado
            MedicoDao.gravar(novoMedico);

            JOptionPane.showMessageDialog(this,
                    "Salvo com sucesso!",
                    "Adicionar Médico",
                    JOptionPane.INFORMATION_MESSAGE);

            dispose();
        }

    }

    private void preencherEspecialidadeMed() {

        DefaultListModel<Especialidade> medEsp = new DefaultListModel<>();

        for (Especialidade esp : medico.getEspecialidades()) {
            medEsp.addElement(esp);
        }
        jListEspecialidadeMed.setModel(medEsp);
    }


    private void emailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailFieldActionPerformed

    private void nascimentoFormattedTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nascimentoFormattedTextFieldActionPerformed

    }//GEN-LAST:event_nascimentoFormattedTextFieldActionPerformed

    private void operadoraField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_operadoraField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_operadoraField1ActionPerformed

    private void nomeMedicoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeMedicoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeMedicoFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (jListEspecialidade.isSelectionEmpty() == false) {

            ArrayList<Especialidade> newList = new ArrayList<>();
            int vetor = jListEspecialidadeMed.getModel().getSize();
            for (int i = 0; i < vetor; i++) {
                newList.add(jListEspecialidadeMed.getModel().getElementAt(i));
            }
            

            if (newList.contains(jListEspecialidade.getSelectedValue()) == false) {
                newList.add(jListEspecialidade.getSelectedValue());

                DefaultListModel<Especialidade> listaEsp = new DefaultListModel<>();
                for (Especialidade esp : newList) {
                    listaEsp.addElement(esp);
                }
                jListEspecialidadeMed.setModel(listaEsp);
            } else {
                JOptionPane.showMessageDialog(null,
                        "Item já selecionado!",
                        "Médico",
                        JOptionPane.WARNING_MESSAGE, null);
            }

        } else {
            JOptionPane.showMessageDialog(this,
                    "Nenhum item foi selecionado!",
                    "Médico",
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ListaEspecialidades;
    private javax.swing.JPanel atualizarMedicosPanel;
    private javax.swing.JTextField codigoMedicoField;
    private javax.swing.JLabel codigoMedicoLabel;
    private javax.swing.JTextField crmField;
    private javax.swing.JLabel crmLabel;
    private javax.swing.JLabel dataNascimentoLabel;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel especialidadesMedicoLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JList<Especialidade> jListEspecialidade;
    private javax.swing.JList<Especialidade> jListEspecialidadeMed;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPaneEspecialidadesLista;
    private javax.swing.JScrollPane jScrollPaneMedicoEspecialidade;
    private javax.swing.JButton lixoMedicoButton;
    private javax.swing.JLabel medicoTituloLabel;
    private javax.swing.JFormattedTextField nascimentoFormattedTextField;
    private javax.swing.JTextField nomeMedicoField;
    private javax.swing.JLabel nomeMedicoLabel;
    private javax.swing.JTextField operadoraField1;
    private javax.swing.JLabel operadoraLabel1;
    private javax.swing.JButton salvarMedicoButton;
    private javax.swing.JTextField telefoneField;
    private javax.swing.JLabel telefoneLabel;
    // End of variables declaration//GEN-END:variables
}
