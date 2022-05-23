package br.com.venturaBackventuraRH.domain.valueobject;

import lombok.Getter;

@Getter
public class Cnpj {
    private String numero;

    public Cnpj(String numero) {
        if (numero == null || !numero.matches("^(\\d{2}\\.?\\d{3}\\.?\\d{3}\\/?\\d{4}-?\\d{2})$"))
        {
            throw new IllegalArgumentException("CNPJ invalido");
        }
        this.numero = numero;
    }
}
