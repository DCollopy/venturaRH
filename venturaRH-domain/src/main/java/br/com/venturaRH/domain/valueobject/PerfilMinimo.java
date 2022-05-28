package br.com.venturaRH.domain.valueobject;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;


@Getter
@Setter

public class PerfilMinimo {

    private double resultado;

    public PerfilMinimo(double resultado) {
        if(resultado <= 0){
            throw new IllegalArgumentException("Numero invalido");
        }

        this.resultado = resultado;
    }

}
