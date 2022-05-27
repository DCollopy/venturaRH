package br.com.venturaBackventuraRH.domain.entities;

import br.com.venturaBackventuraRH.domain.valueobject.PerfilMinimo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
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
    private PerfilMinimo perfilMinimo;
    private LocalDate dataFinal;

    public OportunidadeEntities(int uuid,
                                String titulo,
                                String descricaoTecnica,
                                String idioma,
                                PerfilMinimo perfilMinimo,LocalDate dataFinal) {
        this.uuid = uuid;
        this.titulo = titulo;
        this.descricaoTecnica = descricaoTecnica;
        this.idioma = idioma;
        this.perfilMinimo = perfilMinimo;
        this.dataFinal = LocalDate.now();
    }
    public OportunidadeEntities() {

    }

    @ManyToMany(cascade = ALL)
    Set<EmpresaEntities> empresa_oportunidade;

    @ManyToMany(cascade = ALL)
    Set<ClienteEntities> cliente_oportunidade;

    @ManyToMany(cascade = ALL)
    Set<UsuarioEntities> usuario_oportunidade;

    @ManyToMany(cascade = ALL)
    Set<CriterioEntities> criterio_oportunidade;

    @OneToMany(cascade = ALL)
    Set<EscolaridadeNivelEntities> escolaridade_nivel_oportunidade;


}
