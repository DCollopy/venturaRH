package br.com.venturaRH.domain.entities;

import br.com.venturaRH.domain.valueobject.Cpf;
import br.com.venturaRH.domain.valueobject.Email;
import br.com.venturaRH.domain.valueobject.Telefone;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Perfil{
    private String nome;
    private String sobrenome;
    private Cpf cpf;
    private String cidade;
    private Email email;
    private Telefone telefone;


    public Perfil(String nome, String sobrenome, Cpf cpf, String cidade, Email email) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.cidade = cidade;
        this.email = email;
    }

}
