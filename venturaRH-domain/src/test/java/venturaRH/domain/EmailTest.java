package venturaRH.domain;

import br.com.venturaRH.domain.valueobject.Email;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailTest {

    @Test
    void naoDeveriaCriarEmailInvalido(){
        assertThrows(IllegalArgumentException.class,
                () -> new Email(null));

        assertThrows(IllegalArgumentException.class,
                () -> new Email(""));

        assertThrows(IllegalArgumentException.class,
                () -> new Email("emailinvalido"));

    }

    @Test
    void deveriaCriarEmail(){
        String endereco = "teste@email.com.br";
        Email email = new Email(endereco);
        assertEquals(endereco,email.getEndereco());
    }
}