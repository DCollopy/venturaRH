package br.com.venturaBackventuraRH.domain.entities;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EscolaridadeEntities {
    private int uuid;
    private String escolaridadeNivel;
    private String nomeEscola;
    private Date dataInicio;
    private Date dataFim;

    public EscolaridadeEntities(int uuid, String escolaridadeNivel, String nomeEscola, Date dataInicio, Date dataFim) {
        this.uuid = uuid;
        this.escolaridadeNivel = escolaridadeNivel;
        this.nomeEscola = nomeEscola;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }
}
