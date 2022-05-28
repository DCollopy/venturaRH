package br.com.venturaRH.domain.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Experiencia {

    private int uuid;
    private String nomeEmpresa;
    private String funcao;
    private String descricao;

    public Experiencia(int uuid, String nomeEmpresa, String funcao, String descricao) {
        this.uuid = uuid;
        this.nomeEmpresa = nomeEmpresa;
        this.funcao = funcao;
        this.descricao = descricao;
    }
}
