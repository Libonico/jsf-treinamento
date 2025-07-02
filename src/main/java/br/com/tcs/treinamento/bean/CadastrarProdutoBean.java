package br.com.tcs.treinamento.bean;

import br.com.tcs.treinamento.entity.Produto;
import javax.annotation.PostConstruct;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ManagedBean;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@ManagedBean(name = "CadastrarProdutoBean")
@SessionScoped
public class CadastrarProdutoBean implements Serializable {
    private Produto produto = new Produto();
    private List<Produto> produtos = new ArrayList<>();
    private int idContador = 1;

    @PostConstruct
    public void init() {
        produto = new Produto();
        produtos = new ArrayList<>();
        idContador = 1;
    }

    public void adicionarProduto(){
        System.out.println("Adicionando: " + produto.getNomeProduto());
        produto.setId(idContador++);
        produtos.add(produto);
        produto = new Produto();
    }

    public void removerProduto(Produto produto){
        produtos.remove(produto);
    }

    public Produto getProduto() {return produto;}

    public void setProduto(Produto produto) {this.produto = produto;}

    public List<Produto> getProdutos() {return produtos;}

    public void setProdutos(List<Produto> produtos) {this.produtos = produtos;}

    public int getIdContador() {return idContador;}

    public void setIdContador(int idContador) {this.idContador = idContador;}
}
