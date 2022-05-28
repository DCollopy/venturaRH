package venturaRH.domain;


import br.com.venturaRH.domain.entities.Criterio;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CriterioTest {

    @Test
    void naoDeveriaCriarPmdInvalido(){
        assertThrows(IllegalArgumentException.class,
                () -> new Criterio(0,1, "xxx","xxxx"));
        assertThrows(IllegalArgumentException.class,
                () -> new Criterio(-1,1,"xxx",""));
        assertThrows(IllegalArgumentException.class,
                () -> new Criterio(6,1,"xxxx",""));
    }

    @Test
    void naoDeveriaCriarPesoInvalido(){
        assertThrows(IllegalArgumentException.class,
                () -> new Criterio(1,0, "xxx","xxxx"));
        assertThrows(IllegalArgumentException.class,
                () -> new Criterio(1,-1,"xxx",""));
        assertThrows(IllegalArgumentException.class,
                () -> new Criterio(1,10,"xxxx",""));
    }

    @Test
    void naoDeveriaCriarTituloInvalido(){
        assertThrows(IllegalArgumentException.class,
                () -> new Criterio(1,1, "","xxxx"));
    }

    @Test
    void deveriaCriarPmdTituloPesoValido(){
    String titulo = "UML";
    int pmd = 1;
    }

}