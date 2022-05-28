package venturaRH.domain;


import br.com.venturaRH.domain.valueobject.PerfilMinimo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PerfilMinimoTest {

    @Test
    void naoDeveriaVoltarResultadoNegativoZero() {
        assertThrows(IllegalArgumentException.class,
                () -> new PerfilMinimo(0));
        assertThrows(IllegalArgumentException.class,
                () -> new PerfilMinimo(-1));
    }

    @Test
    void deveriaRetornarNumeroPositivo() {
        double resultado = 20.0;
        PerfilMinimo perfilMinimo = new PerfilMinimo(resultado);

        assertEquals(resultado,perfilMinimo.getResultado());
    }
}