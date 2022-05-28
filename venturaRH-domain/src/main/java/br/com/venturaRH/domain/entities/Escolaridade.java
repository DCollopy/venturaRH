package br.com.venturaRH.domain.entities;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import static javax.persistence.CascadeType.ALL;

@Getter
@Setter
public class Escolaridade{
    private int uuid;
    private String nomeEscola;
    private Date dataInicio;
    private Date dataFim;

    public Escolaridade(int uuid, String nomeEscola, Date dataInicio, Date dataFim) {
        this.uuid = uuid;
        this.nomeEscola = nomeEscola;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

}
