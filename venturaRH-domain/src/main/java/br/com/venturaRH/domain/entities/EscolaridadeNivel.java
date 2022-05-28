package br.com.venturaRH.domain.entities;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EscolaridadeNivel {
    private int uuid;
    private String nivel;

    public EscolaridadeNivel(int uuid, String nivel) {
        this.uuid = uuid;
        this.nivel = nivel;
    }

}
