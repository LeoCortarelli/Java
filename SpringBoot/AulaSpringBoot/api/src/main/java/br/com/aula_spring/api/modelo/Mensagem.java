package br.com.aula_spring.api.modelo;

import org.springframework.stereotype.Component;

/* QUANDO A SUA APLICAÇÃO SPRING ESTIVER SENDO ESECUTADA ELE VAI VARRER , PESQUISAR TODOS OS ELEMENTOS
 * NA CLSSE MENSAGEM */

 /* DEPOIS QUE ELE FIZER ISSO EU POSSO ULTILIZAR O @Autowired QUE E A INJEÇÃO DE DEPENDENCIAS 
  * PARA PODER INSTANCIAR UM OBJETO DESSA CLASSE , QUANDO ULTILIZA O @Autowired O DESENVOLVEDOR NÃO FICA
  * MAIS ENCARREGADO DA INSTANCIA DO OBJETO , ISSO FICA AUTOMATICAMENTE POR CONTA DO SPRING */
@Component 
public class Mensagem {
    private String mensagem;

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    /* DEPOIS CRIADO IR NA CLASSE DE servico.java */
}
