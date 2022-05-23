package br.com.venturaBackventuraRH.domain;

import br.com.venturaBackventuraRH.domain.valueobject.Cpf;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CpfTest {

    @Test
    void naoDeveriaCriarCpfInvalido(){
        assertThrows(IllegalArgumentException.class,
                () -> new Cpf(null));

        assertThrows(IllegalArgumentException.class,
                () -> new Cpf(""));

        assertThrows(IllegalArgumentException.class,
                () -> new Cpf("123456"));

    }

    @Test
    void deveriaCriarCpf(){
        String numero = "368.592.968-28";
        Cpf cpf = new Cpf(numero);

        assertEquals(numero,cpf.getNumero());

    }
}