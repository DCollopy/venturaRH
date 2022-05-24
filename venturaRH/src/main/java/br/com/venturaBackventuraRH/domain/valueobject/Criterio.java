package br.com.venturaBackventuraRH.domain.valueobject;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Getter
@Setter
public class Criterio implements Serializable {
    private int pmd;
    private int peso;

    public Criterio( int pmd, int peso) {
        this.pmd = pmd;
        this.peso = peso;
    }

    public Criterio() {

    }
}
