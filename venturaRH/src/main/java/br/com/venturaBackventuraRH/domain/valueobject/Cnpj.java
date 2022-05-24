package br.com.venturaBackventuraRH.domain.valueobject;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
@Getter
@Setter
public class Cnpj implements Serializable {
    private String cnpj;

    public Cnpj(String cnpj) {
        if (cnpj == null || !cnpj.matches("^(\\d{2}\\.?\\d{3}\\.?\\d{3}\\/?\\d{4}-?\\d{2})$"))
        {
            throw new IllegalArgumentException("CNPJ invalido");
        }
        this.cnpj = cnpj;
    }

    public Cnpj() {

    }
}
