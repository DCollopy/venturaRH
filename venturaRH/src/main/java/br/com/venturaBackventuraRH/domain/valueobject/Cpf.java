package br.com.venturaBackventuraRH.domain.valueobject;

import lombok.Getter;

import javax.persistence.Embeddable;
import java.io.Serializable;
@Embeddable
@Getter
public class Cpf implements Serializable {
    private String cpf;

    public Cpf(String cpf) {
        if (cpf == null || !cpf.matches("^(\\d{3}\\.?\\d{3}\\.?\\d{3}-?\\d{2})$"))
        {
            throw new IllegalArgumentException("CPF invalido");
        }
        this.cpf = cpf;
    }

    public Cpf() {

    }
}
