package br.com.venturaBackventuraRH.domain.valueobject;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Getter
@Setter
public class Email implements Serializable {
    private String endereco;

    public Email(String endereco) {
        if (endereco == null || !endereco.matches("^[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\\\\.[a-zA-Z]{2,}$"))
        {
            throw new IllegalArgumentException("E-mail invalido");
        }
        this.endereco = endereco;
    }

    public Email() {

    }
}
