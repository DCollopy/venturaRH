package br.com.venturaRH.domain.valueobject;

import lombok.Getter;


import java.io.Serializable;

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


}
