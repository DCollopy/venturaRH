package br.com.venturaBackventuraRH.domain.entities;

import br.com.venturaBackventuraRH.domain.valueobject.Criterio;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.Set;

import static javax.persistence.CascadeType.ALL;
@Entity
@Table(name="oportunidade")
@Getter
@Setter
@AllArgsConstructor
public class OportunidadeEntities implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int uuid;
    private String titulo;
    private String descricaoTecnica;
    private String idioma;
    private double perfilMinimo;
    private LocalDate dataFinal;
    private Criterio criterio;

    public OportunidadeEntities(int uuid,
                                String titulo,
                                String descricaoTecnica,
                                String idioma,
                                double perfilMinimo, Date dataFinal, Criterio criterio) {
        this.uuid = uuid;
        this.titulo = titulo;
        this.descricaoTecnica = descricaoTecnica;
        this.idioma = idioma;
        this.perfilMinimo = perfilMinimo;
        this.dataFinal = LocalDate.now();
        this.criterio = criterio;
    }
    public OportunidadeEntities() {

    }

    @ManyToMany(cascade = ALL)
    Set<EmpresaEntities> empresa_oportunidade;

    @ManyToMany(cascade = ALL)
    Set<ClienteEntities> cliente_oportunidade;

    @ManyToMany(cascade = ALL)
    Set<UsuarioEntities> usuario_oportunidade;

    @OneToMany(cascade = ALL)
    Set<EscolaridadeNivelEntities> escolaridade_nivel_oportunidade;


}
