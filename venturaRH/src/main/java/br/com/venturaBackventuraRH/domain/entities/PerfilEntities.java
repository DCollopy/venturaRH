package br.com.venturaBackventuraRH.domain.entities;

import br.com.venturaBackventuraRH.domain.valueobject.Telefone;
import br.com.venturaBackventuraRH.domain.valueobject.Cpf;
import br.com.venturaBackventuraRH.domain.valueobject.Email;

import java.util.ArrayList;
import java.util.List;

public class PerfilEntities {
    private String uuid;
    private String nome;
    private String sobrenome;
    private Cpf cpf;
    private String cidade;
    private Email email;
    private Telefone telefone;


    public PerfilEntities(String uuid, String nome, String sobrenome, Cpf cpf, String cidade, Email email) {
        this.uuid = uuid;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.cidade = cidade;
        this.email = email;
    }


}
