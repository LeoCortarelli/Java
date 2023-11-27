package br.com.aula_spring.api.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.aula_spring.api.modelo.Mensagem;
import br.com.aula_spring.api.modelo.Pessoa;
import br.com.aula_spring.api.repositorio.Repositorio;

@Service  //@Service indica ao programa que essa classe e um servico
public class Servico {
    
    @Autowired
    private Mensagem mensagem;
    /* TODA VEZ QUE PRECISARMOS PASSAR UMA MENSAGEM BASTA CHAMAR ESSE OBJETO (mensagem)
     * NOS NÃO PRECISAMOS INSTANCIAR UM OBJETO mensagem NA CLASSE SERVICO */


     /* Importando o Repositorio.java que tem as acoes de SQL como cadastrar,atualizar,deletar vamos remover
      * do controle e deixar no servico essa e a melhor pratica para arquitetar o servico */
    @Autowired
    private Repositorio acao; 

    
     /* CADASTRO E VALIDAÇÃO DO CADASTRO
      * caso tenha algo de errado na incerção de dados do usuario podemos ultilizar o 
      * metodo (@Autowired-mensagem) gerado a cima. 
      * SE ESTIVER TUDO OK RETORNAMOS O OBJ COMPLETO */
    public ResponseEntity<?> cadastrar(Pessoa obj){

        /* FAZENDO SIMPLES VC PODE IMPLEMENTAR MAIS DA SUA ESCOLHA*/

        if (obj.getNome().equals("")) { // SE O NOME INFORMADO FOR VAZIO
            mensagem.setMensagem("O nome está vazio");
            return new ResponseEntity<>(mensagem, HttpStatus.BAD_REQUEST); // BAD_REQUEST(QUER DIZER QUE OUVE UMA FALHA)
        }else if(obj.getIdade() <= 0){
            mensagem.setMensagem("A idade não pode ser menor ou igual a zero");
            return new ResponseEntity<>(mensagem, HttpStatus.BAD_REQUEST);
        }else{
            return new ResponseEntity<>(acao.save(obj), HttpStatus.CREATED); // CREATED (MANDA UMA MENSAGEM DE CRIACAO)
                                    // acao.save(obj) CRIA O OBJETO E JOGA ELE NO BANCO
        }

    }

    
    /* METODO PARA SELECIONAR PESSOAS */
    public ResponseEntity<?> selecionarResponseEntity(){
        return new ResponseEntity<>(acao.findAll(),HttpStatus.OK); //STATUS.OK quer dizer que ele retornou certo
    }



    /* METODO PARA SELECIONAR ATRAVEZ DO CODIGO */
    /* Primeiro criar o coucountByCodgo() no Repositorio.java */
    public ResponseEntity<?> selecionarpeloCodgo(int codgo){

        if(acao.countByCodgo(codgo) == 0){
            mensagem.setMensagem("Não foi encontrado nenhuma pessoa");
            return new ResponseEntity<>(mensagem, HttpStatus.BAD_REQUEST);
        }else{
            return new ResponseEntity<>(acao.findByCodgo(codgo), HttpStatus.OK);
        }

    }


    /* MÉTODO PARA EDITAR DADOS E REGISTROS */
    public ResponseEntity<?> editarRegistros(Pessoa objPessoa){ // objeto da classe pessoa
        if (acao.countByCodgo(objPessoa.getCodgo()) == 0) { // ELE VAI PROCURAR ALGUEM COM O CODIGO SE NÃO TIVER NINGUEM ELE RETORNA 0
            mensagem.setMensagem("Essa pessoa não existe");
            return new ResponseEntity<>(mensagem, HttpStatus.NOT_FOUND); // NOT_FOUND não foi encontrado nenhum registro
        }else if (objPessoa.getNome().equals("")) {
            mensagem.setMensagem("E necessario informar o nome");
            return new ResponseEntity<>(mensagem, HttpStatus.BAD_REQUEST);
        }else if(objPessoa.getIdade() <= 0){
            mensagem.setMensagem("Informe uma idade valida");
            return new ResponseEntity<>(mensagem, HttpStatus.BAD_REQUEST);
        }else{
            return new ResponseEntity<>(acao.save(objPessoa), HttpStatus.OK);
        }
    }


    /* METODO REMOVER DADOS REGISTROS */
    public ResponseEntity<?> deletar(int codigo){
        if (acao.countByCodgo(codigo) == 0) {
            mensagem.setMensagem("O codigo informado não existe");
            return new ResponseEntity<>(mensagem, HttpStatus.NOT_FOUND);
        }else{
            Pessoa objPessoa = acao.findByCodgo(codigo); // PEGANDO O OBJ PESSOA COM NOME, IDADE E CODIGO
            acao.delete(objPessoa); // deletando essa pessoa 

            /* O DELETE NÃO TEM RETORNO ENTÃO USE A MENSAGEM PARA DAR UM RETORNO E CORRIGIR O ERRO */
            mensagem.setMensagem("Pessoa removida com sucesso");
            return new ResponseEntity<>(mensagem, HttpStatus.OK);
         }
    }


}
