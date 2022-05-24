package br.com.venturaBackventuraRH.domain.entities;

import br.com.venturaBackventuraRH.domain.valueobject.Cpf;
import br.com.venturaBackventuraRH.domain.valueobject.Email;
import br.com.venturaBackventuraRH.domain.valueobject.Telefone;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="admins")
@Getter
@Setter
public class AdminEntities extends PerfilEntities {

    private String funcional;

    public AdminEntities(String nome, String sobrenome, Cpf cpf, String cidade, Email email, String funcional) {
        super(nome, sobrenome, cpf, cidade, email);
        this.funcional = funcional;
    }

    public AdminEntities() {

    }
}
