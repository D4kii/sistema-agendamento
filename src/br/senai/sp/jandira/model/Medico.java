package br.senai.sp.jandira.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Medico {

    private Integer codigo;
    private String nome;
    private LocalDate nascimentoMedico;
    private ArrayList<Especialidade> especialidades;
    private String telefone;
    private String email;
    private String crm;
    private static int contador = 199;

    public Medico(String nome) {
        this.nome = nome;
        this.codigo++;
        gerarCodigo();
    }

    public Medico(String nome,
            String telefone,
            String email,
            ArrayList especialidades,
            String crm,
            LocalDate validadedataNascimento) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.especialidades = especialidades;
        this.crm = crm;
        nascimentoMedico = validadedataNascimento;
        gerarCodigo();
    }

    public Medico(
            String nome,
            String telefone,
            String email,
            String crm,
            LocalDate validadedataNascimento,
            Integer codigo,
            ArrayList<Especialidade> especialidades) {
        
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.especialidades = especialidades;
        this.crm = crm;
        nascimentoMedico = validadedataNascimento;
        this.codigo = codigo;
        
    }

    public Medico() {
        gerarCodigo();
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

    public ArrayList<Especialidade> getEspecialidades() {
        return especialidades;

    }

    public void setEspecialidades(ArrayList<Especialidade> especialidades) {
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

    public String arrayparaString(ArrayList<Especialidade> array) {
        ArrayList<String> codigos = new ArrayList<>();
        for (Especialidade e : array) {
            codigos.add(e.getCodigo().toString());
        }
        return String.join(";", codigos);
    }

    public String getMedicoSeparadoPorPontoEVirgula() {
        return this.codigo + ";"
                + this.crm + ";"
                + this.nome + ";"
                + this.telefone + ";"
                + this.email + ";"
                + this.nascimentoMedico + ";"
                + arrayparaString(this.especialidades) + ".";
    }

}
