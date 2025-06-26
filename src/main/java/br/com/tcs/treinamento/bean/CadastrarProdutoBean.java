package br.com.tcs.treinamento.bean;

import jakarta.faces.view.ViewScoped;
import javax.annotation.ManagedBean;
import java.io.Serializable;
import java.util.Date;

@ManagedBean
@ViewScoped
public class CadastrarProdutoBean implements Serializable {

    private String nomeProduto;
    private String valorProduto;
    private String tipoProduto;
    private Date dataCadastroProduto;

    public CadastrarProdutoBean() {}

    public void limpar(){
        this.nomeProduto = null;
        this.valorProduto = null;
        this.dataCadastroProduto = null;
        this.tipoProduto = null;
    }

    public String getNomeProduto() {return nomeProduto;}

    public void setNomeProduto(String nomeProduto) {this.nomeProduto = nomeProduto;}

    public String getValorProduto() {return valorProduto;}

    public void setValorProduto(String valorProduto) {this.valorProduto = valorProduto;}

    public String getTipoProduto() {return tipoProduto;}

    public void setTipoProduto(String tipoProduto) {this.tipoProduto = tipoProduto;}

    public Date getDataCadastroProduto() {return dataCadastroProduto;}

    public void setDataCadastroProduto(Date dataCadastroProduto) {this.dataCadastroProduto = dataCadastroProduto;}


}
