package br.senai.sp.jandira.model;

import javax.swing.JOptionPane;

public class Especialidade {

    private static int contador = 99;
    private Integer codigo;
    private String nome;
    private String descricao;

    // Construtores da classe
    public Especialidade(String nome) {
        this.nome = nome;
        gerarCodigo();
    }

    public Especialidade(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        gerarCodigo();
    }

    public Especialidade() { // Construtor Default / Padrão
        this.contador++;
        this.codigo = contador;
    }

    // Métodos de acesso aos atributos
    public int getContador() {
        return contador;
    }

    private void gerarCodigo(){
        this.contador++;
        this.codigo = contador;
    }
    
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome= nome;
    }

    public String getNome() {
        return nome;
    }

    public void setDescricao(String descricao) {
        this.descricao= descricao;
    }

    public String getDescricao() {
        return descricao;
    }

}
