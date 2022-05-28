package venturaRH.domain;

import br.com.venturaRH.domain.valueobject.Telefone;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelefoneTest{
    @Test
    void naoDeveriaCriarTelefoneComDDDsInvalidos() {
        assertThrows(IllegalArgumentException.class,
                () -> new Telefone(null, "123456789"));

        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("", "123456789"));

        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("1", "123456789"));
    }

    @Test
    void naoDeveriaCriarTelefoneComNumerosInvalidos() {
        assertThrows(IllegalArgumentException.class,
                () -> new Telefone(null, null));

        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("", ""));

        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("1", "1234"));
    }

    @Test
    void deveriaCriarTelefoneComDDDsNumero(){
        String ddd = "21";
        String numero = "123456789";
        Telefone telefone = new Telefone(ddd,numero);
        assertEquals(ddd,telefone.getDdd());
        assertEquals(numero,telefone.getNumero());
    }
}