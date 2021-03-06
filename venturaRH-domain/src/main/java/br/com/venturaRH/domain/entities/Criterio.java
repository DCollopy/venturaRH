package br.com.venturaRH.domain.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

import static javax.persistence.CascadeType.ALL;

@Getter
@Setter
public class Criterio {

    private int uuid;
    private int pmd;
    private int peso;
    private  String titulo;
    private String descricao;


    public Criterio(int pmd, int peso, String titulo, String descricao) {
        if(pmd <=0 || pmd >= 6){
            throw new IllegalArgumentException("Valor Incorreto, entre com um valor de 1 a 5 ");
        }
        if(peso <=0 || peso >= 5){
            throw new IllegalArgumentException("Valor Incorreto, entre com um valor de 1 a 5 ");
        }
        if(titulo.isEmpty()) {
            throw new IllegalArgumentException("Entre com o titulo!");
        }

        this.pmd = pmd;
        this.peso = peso;
        this.titulo = titulo;
        this.descricao = descricao;
    }

}
