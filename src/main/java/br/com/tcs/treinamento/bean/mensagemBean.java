package br.com.tcs.treinamento.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import java.io.Serializable;

@ManagedBean
@RequestScoped
public class mensagemBean implements Serializable {
    private String mensagemDigitada;

    public String salvarMensagem() {
        // 1. Coloque a mensagem no Flash Scope
        FacesContext.getCurrentInstance().getExternalContext()
                .getFlash().put("mensagem", mensagemDigitada);

        // 2. Redirecione normalmente
        return "exibirMensagem.xhtml?faces-redirect=true";
    }

    public String getMensagemDigitada() {return mensagemDigitada;}

    public void setMensagemDigitada(String mensagemDigitada) {this.mensagemDigitada = mensagemDigitada;}
}