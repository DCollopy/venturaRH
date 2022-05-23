package br.com.venturaBackventuraRH.domain.entities;

public class ExperienciaEntities {
    private int uuid;
    private String nomeEmpresa;
    private String funcao;
    private String descricao;

    public ExperienciaEntities(int uuid, String nomeEmpresa, String funcao, String descricao) {
        this.uuid = uuid;
        this.nomeEmpresa = nomeEmpresa;
        this.funcao = funcao;
        this.descricao = descricao;
    }
}
