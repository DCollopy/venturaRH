package br.com.venturaBackventuraRH.domain.entities;

import br.com.venturaBackventuraRH.domain.valueobject.Criterio;
import lombok.Getter;

import java.time.LocalDate;
import java.util.Date;

@Getter
public class OportunidadeEntities {
    private String uuid;
    private String titulo;
    private String descricaoTecnica;
    private String idioma;
    private EscolaridadeEntities escolaridadeEntities;
    private double perfilMinimo;
    private LocalDate dataFinal;
    private Criterio criterio;
    private EmpresaEntities empresaEntities;

    public OportunidadeEntities(String uuid,
                                String titulo,
                                String descricaoTecnica,
                                String idioma,
                                EscolaridadeEntities escolaridadeEntities,
                                double perfilMinimo, Date dataFinal, Criterio criterio, EmpresaEntities empresaEntities) {
        this.uuid = uuid;
        this.titulo = titulo;
        this.descricaoTecnica = descricaoTecnica;
        this.idioma = idioma;
        this.escolaridadeEntities = escolaridadeEntities;
        this.perfilMinimo = perfilMinimo;
        this.dataFinal = LocalDate.now();
        this.criterio = criterio;
        this.empresaEntities = empresaEntities;
    }
}
