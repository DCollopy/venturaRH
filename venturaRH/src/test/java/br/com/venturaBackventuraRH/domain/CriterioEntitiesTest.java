package br.com.venturaBackventuraRH.domain;

import br.com.venturaBackventuraRH.domain.entities.CriterioEntities;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CriterioEntitiesTest {

    @Test
    void naoDeveriaCriarPmdInvalido(){
        assertThrows(IllegalArgumentException.class,
                () -> new CriterioEntities(0,1, "xxx","xxxx"));
        assertThrows(IllegalArgumentException.class,
                () -> new CriterioEntities(-1,1,"xxx",""));
        assertThrows(IllegalArgumentException.class,
                () -> new CriterioEntities(6,1,"xxxx",""));
    }

    @Test
    void naoDeveriaCriarPesoInvalido(){
        assertThrows(IllegalArgumentException.class,
                () -> new CriterioEntities(1,0, "xxx","xxxx"));
        assertThrows(IllegalArgumentException.class,
                () -> new CriterioEntities(1,-1,"xxx",""));
        assertThrows(IllegalArgumentException.class,
                () -> new CriterioEntities(1,10,"xxxx",""));
    }

    @Test
    void naoDeveriaCriarTituloInvalido(){
        assertThrows(IllegalArgumentException.class,
                () -> new CriterioEntities(1,1, "","xxxx"));
    }

    @Test
    void deveriaCriarPmdTituloPesoValido(){
    String titulo = "UML";
    int pmd = 1;
    }

}