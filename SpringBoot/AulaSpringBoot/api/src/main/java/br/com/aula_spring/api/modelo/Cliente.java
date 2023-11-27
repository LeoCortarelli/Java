package br.com.aula_spring.api.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;

@Entity
@Table (name = "clientes") // Criando uma tabela no banco de dados 
public class Cliente {

    /* ANOTAÇÕES DE VALIDAÇÃO JPA */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;

    @NotEmpty(message = "Informe um nome") // Essa anotação garante que você precisa de um nome , ou pelo menos um caracter
    private String nome;

    @Email(message = "Informe um email correto") //ESSA ANOTAÇÃO VERIFICA SE O EMAIL TEM @ E . 
    private String email;

    // Get Set codigo
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    // Get Set Nome
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Get Set Email
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
}
