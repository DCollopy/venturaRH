package br.com.venturaBackventuraRH.domain.entities;

import br.com.venturaBackventuraRH.domain.valueobject.Telefone;
import br.com.venturaBackventuraRH.domain.valueobject.Cpf;
import br.com.venturaBackventuraRH.domain.valueobject.Email;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.EmbeddedId;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@MappedSuperclass
@Getter
@Setter
public class PerfilEntities implements Serializable {
    private String nome;
    private String sobrenome;
    @EmbeddedId
    private Cpf cpf;
    private String cidade;
    private Email email;
    private Telefone telefone;


    public PerfilEntities(String nome, String sobrenome, Cpf cpf, String cidade, Email email) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.cidade = cidade;
        this.email = email;
    }

    public PerfilEntities() {
    }
}
