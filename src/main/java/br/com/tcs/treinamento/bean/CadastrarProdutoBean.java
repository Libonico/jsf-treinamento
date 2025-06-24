package br.com.tcs.treinamento.bean;
import javax.faces.bean.ManagedBean;
import java.util.ArrayList;
import java.util.List;

//ManagedBean (necessário para criação da Bean)
@ManagedBean(name = "cadastrarProdutoBean")
public class CadastrarProdutoBean {

    private String nomeProduto;
    private String valorProduto;
    private String tipoProduto;
    List<String> tipoProdutoOpcao;

    //Construtor sem argumentos (necessário para criação Bean)
    public CadastrarProdutoBean() {
        tipoProdutoOpcao = new ArrayList<String>();

        tipoProdutoOpcao.add("Alimentício");
        tipoProdutoOpcao.add("Vestuário");
        tipoProdutoOpcao.add("Utensílios");
        tipoProdutoOpcao.add("Eletrônico");
    }

    //Getters e Setters

    public void limpar(){
        setNomeProduto(null);
        setValorProduto(null);
        setTipoProduto(null);
    }

    public void validarInfos(){
        List<String>erros = new ArrayList<>();
        if(getNomeProduto() == null || getNomeProduto().trim().isEmpty()){
            erros.add("O nome do produto não pode ser nulo.");
        }
        if(getValorProduto() == null || getValorProduto().trim().isEmpty()){
            erros.add("O valor do protuto não pode ser nulo.");
        }
        if(getTipoProduto() == null || getValorProduto().trim().isEmpty()){
            erros.add("O tipo do produto não pode ser nulo.");
        }
    }

    public List<String> getTipoProdutoOpcao() {return tipoProdutoOpcao;}

    public String getTipoProduto() {return tipoProduto;}

    public void setTipoProduto(String tipoProduto) {this.tipoProduto = tipoProduto;}

    public String getNomeProduto() {return nomeProduto;}

    public void setNomeProduto(String produto) {this.nomeProduto = produto;}

    public String getValorProduto() {return valorProduto;}

    public void setValorProduto(String valor) {this.valorProduto = valor;}
}
