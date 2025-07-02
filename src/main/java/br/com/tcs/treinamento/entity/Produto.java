package br.com.tcs.treinamento.entity;

import java.util.Date;

public class Produto {
    private int id;
    private String nomeProduto;
    private Date dataCadastro;

    public Produto(int id, String nomeProduto, Date dataCadastro){
        this.id = id;
        this.nomeProduto = nomeProduto;
        this.dataCadastro = dataCadastro;
    }

    public Produto() {}

    public int getId() {return id;}

    public void setId(int id) {this.id = id;}

    public String getNomeProduto() {return nomeProduto;}

    public void setNomeProduto(String nomeProduto) {this.nomeProduto = nomeProduto;}

    public Date getDataCadastro() {return dataCadastro;}

    public void setDataCadastro(Date dataCadastro) {this.dataCadastro = dataCadastro;}
}

