package br.com.venturaBackventuraRH.domain.entities;

import br.com.venturaBackventuraRH.domain.valueobject.Cnpj;
import jdk.jfr.Enabled;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

import static javax.persistence.CascadeType.ALL;

@Entity
@Table(name = "Empresa")
@Getter
@Setter
public class EmpresaEntities{
    @EmbeddedId
    private Cnpj cnpj;
    private String razaoSocial;

    public EmpresaEntities() {
    }

    @ManyToOne(cascade = ALL)
    ClienteEntities cliente_empresa;

    @ManyToMany(cascade = ALL)
    Set<OportunidadeEntities> oportunidade_empresa;
}
