package br.com.venturaRH.domain.entities;


import br.com.venturaRH.domain.valueobject.PerfilMinimo;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Oportunidade {

    private int uuid;
    private String titulo;
    private String descricaoTecnica;
    private String idioma;
    private PerfilMinimo perfilMinimo;
    private LocalDate dataFinal;

    public Oportunidade(int uuid,
                        String titulo,
                        String descricaoTecnica,
                        String idioma,
                        PerfilMinimo perfilMinimo, LocalDate dataFinal) {
        this.uuid = uuid;
        this.titulo = titulo;
        this.descricaoTecnica = descricaoTecnica;
        this.idioma = idioma;
        this.perfilMinimo = perfilMinimo;
        this.dataFinal = LocalDate.now();
    }

}
