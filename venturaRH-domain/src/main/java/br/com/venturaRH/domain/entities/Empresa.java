package br.com.venturaRH.domain.entities;

import br.com.venturaRH.domain.valueobject.Cnpj;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

import static javax.persistence.CascadeType.ALL;

@Getter
@Setter
public class Empresa {

    private Cnpj cnpj;
    private String razaoSocial;


    public Empresa(Cnpj cnpj, String razaoSocial) {
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }
}
