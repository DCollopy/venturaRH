package br.com.venturaBackventuraRH.domain.entities;

import br.com.venturaBackventuraRH.domain.valueobject.Cpf;
import br.com.venturaBackventuraRH.domain.valueobject.Email;

import lombok.Getter;
import lombok.Setter;


import javax.persistence.*;

import java.util.Set;

import static javax.persistence.CascadeType.ALL;


@Entity
@Table(name = "clientes")
@Getter
@Setter
public class ClienteEntities extends PerfilEntities {

    private String funcional;

    public ClienteEntities(String nome, String sobrenome,
                           Cpf cpf, String cidade, Email email, String funcional) {
        super(nome, sobrenome, cpf, cidade, email);
        this.funcional = funcional;
    }

    public ClienteEntities() {

    }

    @OneToMany(cascade = ALL)
    Set<EmpresaEntities> empresa_cliente;

    @ManyToMany(cascade = ALL)
    Set<OportunidadeEntities> oportunidade_cliente;

}
