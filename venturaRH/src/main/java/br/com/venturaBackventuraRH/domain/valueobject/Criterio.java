package br.com.venturaBackventuraRH.domain.valueobject;

import java.util.ArrayList;
import java.util.List;

public class Criterio {
    private List<String> criterioVaga = new ArrayList<>();
    private int pmd;
    private int peso;

    public Criterio(List<String> criterioVaga, int pmd, int peso) {
        this.criterioVaga = criterioVaga;
        this.pmd = pmd;
        this.peso = peso;
    }
}
