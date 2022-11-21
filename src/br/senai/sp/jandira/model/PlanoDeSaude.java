package br.senai.sp.jandira.model;

import java.time.LocalDate;
import javax.swing.JOptionPane;

public class PlanoDeSaude {

    private static int contador;
    private String operadora;
    private String categoria;
    private String numero;
    private LocalDate validade;
    private Integer codigo;

    public PlanoDeSaude(String operadora) {
        this.operadora = operadora;
        this.codigo++;
        gerarCodigo();
    }

    public PlanoDeSaude(String operadora, String categoria, String numero, LocalDate validade) {
        this.operadora = operadora;
        this.categoria = categoria;
        this.numero = numero;
        this.validade = validade;
        gerarCodigo();
    }

    public PlanoDeSaude(String operadora, String categoria, String numero, LocalDate validade, Integer codigo) {
        this.operadora = operadora;
        this.categoria = categoria;
        this.numero = numero;
        this.validade = validade;
        this.contador = codigo;
        this.codigo = codigo;
    }

    public PlanoDeSaude() { // Construtor Default / Padrão
        this.contador++;
        this.codigo = contador;
    }

    public static int getContador() {
        return contador;
    }

    public void setOperadora(String operadora) {
        this.operadora = operadora;
        gerarCodigo();
    }

    public String getOperadora() {
        return operadora;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setValidade(LocalDate validade) {
        this.validade = validade;
    }

    public LocalDate getValidade() {
        return validade;

    }

    private void gerarCodigo() {
        this.contador++;
        this.codigo = contador;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setNomeOperadora(String operadora) {

        if (operadora.length() >= 3) {
            this.operadora = operadora;
        } else {
            JOptionPane.showMessageDialog(null, operadora + "Não é um nome válido!");
        }

    }

    public String getPlanoDeSaudeSeparadaPorPontoEVirgula() {
        return this.codigo + ";" + this.operadora + ";" + this.categoria + ";" + this.numero + ";" + this.validade;
    }

}
