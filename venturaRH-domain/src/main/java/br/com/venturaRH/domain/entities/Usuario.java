package br.com.venturaRH.domain.entities;

import br.com.venturaRH.domain.valueobject.Cpf;
import br.com.venturaRH.domain.valueobject.Email;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.Set;

import static javax.persistence.CascadeType.ALL;


@Getter
@Setter
public class Usuario extends Perfil {

    public Usuario(String nome,
                   String sobrenome,
                   Cpf cpf, String cidade,
                   Email email) {
        super(nome, sobrenome, cpf, cidade, email);
    }

}
