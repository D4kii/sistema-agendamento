package br.senai.sp.jandira.model;

import java.time.LocalDate;
import javax.swing.JList;

public class Medico {
    
    private JList especialidadesList;
    private Integer codigo;
    private String nome;
    private LocalDate nascimentoMedico;
    private Especialidade[] especialidades;
    private String telefone;
    private String email;
    private String crm;
    private static int contador = 199;

    public Medico(String nome) {
        this.nome = nome;
        this.codigo++;
        gerarCodigo();
    }

    public Medico(String nome, String telefone, String email, Especialidade[] especialidades, String crm, LocalDate validadedataNascimento) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.especialidades = especialidades;
        this.crm = crm;
        nascimentoMedico = validadedataNascimento;
        gerarCodigo();
    }

    public Medico(String nome, String telefone, String email, Especialidade[] especialidades, String crm, LocalDate validadedataNascimento, Integer codigo) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.especialidades = especialidades;
        this.crm = crm;
        nascimentoMedico = validadedataNascimento;
        this.codigo = codigo;
    }

    public Medico() {
        this.contador++;
        this.codigo = codigo;
    }

    public static int getContador() {
        return contador;
    }

    public String getNome() {
        return nome;

    }

    public void setNome(String nome) {
        this.nome = nome;
        gerarCodigo();
    }

    private void gerarCodigo() {
        contador++;
        this.codigo = contador;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setNascimentoMedico(LocalDate nascimentoMedico) {
        this.nascimentoMedico = nascimentoMedico;
    }

    public LocalDate getNascimentoMedico() {
        return nascimentoMedico;
    }

    public Especialidade[] getEspecialidades() {
        return especialidades;

    }

    public void setEspecialidades(Especialidade[] especialidades) {
        this.especialidades = especialidades;

    }

    public String getTelefone() {
        return telefone;

    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;

    }

    public String getEmail() {
        return email;

    }

    public void setEmail(String email) {
        this.email = email;

    }

    public String getCrm() {
        return crm;

    }

    public void setCrm(String crm) {
        this.crm = crm;

    }

    public JList getEspecialidadesList() {
        return especialidadesList;
    }

    public void setEspecialidadesList(JList especialidadesList) {
        this.especialidadesList = especialidadesList;
    }
    
    
     public String getMedicoSeparadoPorPontoEVirgula() {
        return this.codigo + ";" + this.crm + ";" + this.nome + ";" + this.telefone + ";" + this.email + ";" + this.nascimentoMedico + ";" + this.especialidades;
    }
    
}
