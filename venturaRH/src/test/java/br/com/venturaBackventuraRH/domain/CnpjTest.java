package br.com.venturaBackventuraRH.domain;

import br.com.venturaBackventuraRH.domain.valueobject.Cnpj;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CnpjTest {
    @Test
    void naoDeveriaCriarCnpjInvalido(){
        assertThrows(IllegalArgumentException.class,
                () -> new Cnpj(null));

        assertThrows(IllegalArgumentException.class,
                () -> new Cnpj(""));

        assertThrows(IllegalArgumentException.class,
                () -> new Cnpj("123456"));

    }

    @Test
    void deveriaCriarCnpj(){
        String numero = "11.111.111/0001-11";
        Cnpj cnpj = new Cnpj(numero);

        assertEquals(numero,cnpj.getCnpj());

    }

}