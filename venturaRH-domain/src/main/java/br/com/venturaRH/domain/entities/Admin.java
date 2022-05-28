package br.com.venturaRH.domain.entities;

import br.com.venturaRH.domain.valueobject.Cpf;
import br.com.venturaRH.domain.valueobject.Email;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Admin extends Perfil {

    private String funcional;

    public Admin(String nome, String sobrenome, Cpf cpf, String cidade, Email email, String funcional) {
        super(nome, sobrenome, cpf, cidade, email);
        this.funcional = funcional;
    }

}
