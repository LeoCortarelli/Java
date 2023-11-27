package br.com.aula_spring.api.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.aula_spring.api.modelo.Pessoa;

@Repository  //INDICA AO PROGRAMA QUE ISTO E UM REPOSITORIO
public interface Repositorio extends CrudRepository<Pessoa, Integer> { //O CrudRepository DISPOE DE VARIOS METODOS PARA FAZER CRUD
                                                    // PASSA O PARAMETRO COM A CLASSE PARA FAZER O CRUD

    /* AGORA TEMOS ACESSO A FNÇÕES SQL AQUI */

    /* LISTANDO TODAS AS PESSOAS */
    List<Pessoa> findAll(); // Quando for chamado o findAll() ira retornar uma lista de pessoas cadastradas



    /* LISTANDO UMA PESSOA EXPECIFICA POR CODIGO */
    Pessoa findByCodgo(int codgo);// findBy Retorna por alguma caracteristica do objeto no caso pelo codigo(id)
    
    

    /* ORDENAR INFORMAÇÕES DA TABELA */  // POR PADRÃO ELE SEMPRE VAI SER ORDENADO 'POR CODIGO OU ID'
    List<Pessoa> findByOrderByNome(); // feito isso sava e adciona no Controle.java o metodo
            // findByOrderByNome() ele ordena por nome mais você pode criar outras ordenações 

            /* EXISTE TAMBEM AS OPÇÕES  findByOrderByNomeAsc() que e o padrão ele ordena de A a Z ou 1 a 100
                findByOrderByNomeDesc() ordena ao contrario 100 a 1 ou de Z a A,
                Você tambem tem que alterar la no controle.java
            */

    
    /* ORDENAR AS PESSOAS COM O MESMO NOME  */
    List<Pessoa> findByNomeOrderByIdadeDesc(String nome);  //findByNomeOrderByIdade ordena por nome e depois por idade 
                                                /* O DESC ORDENA DO MAIOR PARA O MENOR */
                                                /* Você pega a variavel nome que vem por parametro */


    /* FILTRAR PESSOAS QUE CONTEM NO NOME UMA LETRA EXPECIFICA */
    List<Pessoa> findByNomeContaining(String termo); // Containing cria o termo que vai ser pesquisado no banco




    /* FUNCÕES QUE COMESSÃO E FINALIZAM (StartsWith e EndsWith)
        EXEMPLO: se digitar (A) todos os nomes que inicião com A serão trazidos */
    List<Pessoa> findByNomeStartsWith(String termo); // IRA TRAZER TODOS OS NOMES QUE COMESSÃO COM A LETRA ESCOLHIDA
    List<Pessoa> findByNomeEndingWith(String termo); // IRA TRAZER TODOS OS NOMES QUE TERMINAM COM A LETRA ESCOLHIDA



    /* Utilizando a annotation @Query (Serve para criar o comando proprio SQL) */
    @Query(value = "SELECT SUM(idade) FROM pessoas", nativeQuery = true) // nativeQuery serve para ativar a QUERY
    int somaIdades();




    /* Utilizando a annotation @Query MANIPULANDO OS PARAMETROS */

                    /* Para passar a idade do parametro abaixo idadeMaiorIgual() ultiliza o (:) ex: :idade */
    @Query(value = "SELECT * FROM pessoas WHERE idade >= :idade", nativeQuery = true)
    List<Pessoa> idadeMaiorIgual(int idade); // A IDADE VAI SER MAIOR OU IGUAL A IDADE PASSADA PELO PARAMETRO
    


    /* Solucionar o erro do buscar por codigo se colocar ex que estava dando erro
     * Se colocar um codigo em buscarPorCodigo que não existe ele não tras nada porem ele da sucesso */
    /* VAMOS SOLUCIONAR ESSE ERRO */
    int countByCodgo(int codgo);

}
