package br.com.aula_spring.api.controle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.aula_spring.api.modelo.Cliente;
import br.com.aula_spring.api.modelo.Pessoa;
import br.com.aula_spring.api.repositorio.Repositorio;
import br.com.aula_spring.api.servico.Servico;
import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class Controle {  // ESSA CLASSE VAI SER RESPONSAVEL PELO CONTROLE DE ROTAS

    @Autowired  // Não precisa instanciar mais um objeto
    private Repositorio acao;  // ELE VAI CONTER AS ACÕES DO BANCO DE DADOS ex: (cadastrar,selecionar,alterar,excluir)


    // cadastra alguem no banco

    // POST (CADASTRAR)
    //@PostMapping("/api") // ACESSO AO RequestBody (por enquanto via Thunder client)
    //public Pessoa cadastrar(@RequestBody Pessoa objPessoa){ // @RequestBody esperando um objeto do BODY
    //    return acao.save(objPessoa);
    //}   

    /* CODIGO A CIMA COMENTADO POR CONTA DE QUE ELE ESTA ATUALIZADO NA LINHA 146 */


    // GET (PEGAR)
    //@GetMapping("/api") // TODA VEZ QUE FOR FAZER UM REQUISIÇÃO GET ELE LISTA TODOS OS NOMES DA LISTA
    //public List<Pessoa> selecionar(){
    //    return acao.findAll(); // Retorna o a lista de pessoas findAll() que esta no Repositorio.java
    //}
    /* CODIGO A CIMA COMENTADO POR CONTA DE QUE ELE ESTA ATUALIZADO NA LINHA 156 */

    // GET (PEGAR POR CODIGO)
    //@GetMapping("/api/{codigo}") // Pega pelo codigo e coloca em uma variavel codigo
    //public Pessoa selecionarPorCodigo(@PathVariable int codigo){ // @PathVariable TRANFORMA EM UMA VARIAVEL
    //    return acao.findByCodgo(codigo); //CHAMA O findBy que está no Repositorio.java
    //} /* CODIGO A CIMA COMENTADO POR CONTA DE QUE ELE ESTA ATUALIZADO NA LINHA 163 */

    /* ALTERANDO OS REGISTROS (update) */
    //@PutMapping("/api") // NO PUT VOCÊ E OBRIGADO A PASSAR UM OBJETO COMPLETO
    //public Pessoa editar(@RequestBody Pessoa objPessoa){ // @RequestBody esperando um objeto do BODY
    //    return acao.save(objPessoa); //SAVE TEM DUAS OPÇÕES CADASTRAR E ATUALIZAR
    //}  // CODIGO ACIMA MODIFICADO NA LINHA 170


    /* DELETANDO OS REGISTROS (delete) */
    //@DeleteMapping("/api/{codgo}")
    //public void deletar(@PathVariable int codgo){
    //    Pessoa obj = selecionarPorCodigo(codgo); // Chama o metodo criado a cima de selecionar por codigo e depois deleta ele
    //    acao.delete(obj); // DELETA O OBJETO SELECIONADO
    //} CODIGO ACIMA MODIFICADO NA LINHA 178
 

    /* CONTAR QUANTOS REGISTROS */
    @GetMapping("/api/contador") // VOCÊ COLOCA NO localhost:8080/api/contador
    public Long contador(){ // VOCÊ ULTILIZA O LONG POR CONTA DE REGISTROS MUITO GRANDES NA SUA DATABASE
        return acao.count(); // count() Serve para contar quandos registros ha na tabela ou database
    }


    /* ORDENAR INFORMAÇÕES DA TABELA */  // POR PADRÃO ELE SEMPRE VAI SER ORDENADO 'POR CODIGO OU ID'
    /* PRIMEIRO CRIAR O METODO NA CLASSE Repositorio.java */
    @GetMapping("/api/ordenarNomes")
    public List<Pessoa> ordenarNomes(){
        return acao.findByOrderByNome(); // findByOrderByNome() ele pega esse metodo da classe que está no Repositorio.java
    }


    /* ORDENAR AS PESSOAS COM O MESMO NOME  */
    /* PRIMEIRO CRIAR O METODO NA CLASSE Repositorio.java */
    @GetMapping("/api/ordenarNomes2")
    public List<Pessoa> ordenarNomes2(){
        return acao.findByNomeOrderByIdadeDesc("Julia");
    }


    /* FILTRAR PESSOAS QUE CONTEM NO NOME UMA LETRA EXPECIFICA */
    /* PRIMEIRO CRIAR O METODO findByNomeContaining() NA CLASSE Repositorio.java */
    @GetMapping("/api/nomeContem")
    public List<Pessoa> nomeContem(){
        return acao.findByNomeContaining("L"); // letras maiusculas e minusculas não interferem no banco
    }


    /* FUNCÕES QUE COMESSÃO E FINALIZAM (StartsWith e EndsWith)
        EXEMPLO: se digitar (A) todos os nomes que inicião com A serão trazidos */
    @GetMapping("/api/iniciaCom")
    public List<Pessoa> iniciaCom(){
        return acao.findByNomeStartsWith("L");
    }

    @GetMapping("/api/finalCom")
    public List<Pessoa> finalCom(){
        return acao.findByNomeEndingWith("a");
    }


    /* Utilizando a annotation @Query (Serve para criar o comando proprio SQL) 
        ANTES criar o metodo somaIdades() no Repositorio.java */
    @GetMapping("/api/somaIdade")
    public int somaIdades(){
        return acao.somaIdades();
    }


        /* Utilizando a annotation @Query MANIPULANDO OS PARAMETROS 
           ANTES criar o metodo somaIdades() no Repositorio.java */
    @GetMapping("/api/idadeMaiorIgual")
    public List<Pessoa> idadeMaiorIgual(){
        return acao.idadeMaiorIgual(18);
    }


        /* ResponseEntity  SERVE PARA TER UM FEADBACK DO PROJETO SE CONSEGUIU CONEXAO SE CONSEGUIU
            CADASTRAR, INCLUIR, ALTERAR ETC...*/
    @GetMapping("/status")
    public ResponseEntity<?> status(){
        return new ResponseEntity<>(HttpStatus.CREATED); // ESSE STATUS E EXIBIDO QUANDO NÓS EFETUAMOS
                                                        // O CADASTRO DE ALGO NO BANCO 
    }


    //@GetMapping("/api") // TODA VEZ QUE FOR FAZER UM REQUISIÇÃO GET ELE LISTA TODOS OS NOMES DA LISTA
    //public List<Pessoa> selecionar(){
    //    return acao.findAll(); // Retorna o a lista de pessoas findAll() que esta no Repositorio.java
    //} /* CODIGO A CIMA COMENTADO POR CONTA DE QUE ELE ESTA ATUALIZADO NA LINHA 156 */


    /* Implementando servicos */

    /* MODIFICANDO O POST LA DO COMEÇO DO CODIGO */
    @Autowired
    private Servico servico;

    @PostMapping("/api") // ACESSO AO RequestBody (por enquanto via Thunder client)
    public ResponseEntity<?> cadastrar(@RequestBody Pessoa objPessoa){ // @RequestBody esperando um objeto do BODY
        return servico.cadastrar(objPessoa);
    }


    /* MODIFICANDO O BUSCAR TODOS OS REGISTROS */
    @GetMapping("/api") // TODA VEZ QUE FOR FAZER UM REQUISIÇÃO GET ELE LISTA TODOS OS NOMES DA LISTA
    public ResponseEntity<?> selecionarResponseEntity(){
        return servico.selecionarResponseEntity(); 
    }


    /* MODIFICANDO O BUSCAR POR CODIGO */
    @GetMapping("/api/{codigo}") // Pega pelo codigo e coloca em uma variavel codigo
    public ResponseEntity<?> selecionarpeloCodgo(@PathVariable int codigo){ // @PathVariable TRANFORMA EM UMA VARIAVEL
        return servico.selecionarpeloCodgo(codigo);
    }


    /* MODIFICANDO O ALTERANDO OS REGISTROS (update) */
    @PutMapping("/api") // NO PUT VOCÊ E OBRIGADO A PASSAR UM OBJETO COMPLETO
    public ResponseEntity<?> editar(@RequestBody Pessoa objPessoa){ // @RequestBody esperando um objeto do BODY
        return servico.editarRegistros(objPessoa); //(SAVE) TEM DUAS OPÇÕES CADASTRAR E ATUALIZAR
        /* ATUALIZAR NO servico.java linha 70 */
    }


    /* DELENTANDO OS REGISTROS (delete) */
    @DeleteMapping("/api/{codgo}")
    public ResponseEntity<?> deletar(@PathVariable int codgo){
        return servico.deletar(codgo); // Chama o metodo criado a cima de selecionar por codigo e depois deleta ele
        /* REMOVER REGISTROS ATUALIZADO NA CLASSE servico.java NA LINHA 87 */
    }


    /* ANOTAÇÕES COM DO JPA COM A CLASSE cliente.java */
    @PostMapping("/cliente")
    public void cliente(@Valid @RequestBody Cliente objCliente){ // chamando um objeto da classe cliente do body
                    /* @Valid ele chama as anotetion que está na clsse cliente como @NotEmpty e @Email para
                        para validar as informações */
    }








/*----------------------------------------------------------------------------------------------------------- */

    /* APRENDENDO ROTAS WEB */
    @GetMapping("")
    public String mensagem(){ 
        return "Hello Word";
    }
    
    @GetMapping("/boasvindas") // NÃO PODE TER METODOS COM ROTAS IGUAIS 
    public String bemvindo(){
        return "bem vindo";
    }

    @GetMapping("/bemvindo/{nome}") // ELE PEGA OQUE ESTÁ COLOCADO EM {} E TRANSFORMA EM UMA VARIAVEL
    public String bemvindoVariaveis(@PathVariable String nome){
        return "bem vindo " + nome;
    }

    @PostMapping("/pessoa") // que vai ser responsavel por receber um nome e exibir em seguida
    public Pessoa pessoa(@RequestBody Pessoa p){
        return p;
    }
}
