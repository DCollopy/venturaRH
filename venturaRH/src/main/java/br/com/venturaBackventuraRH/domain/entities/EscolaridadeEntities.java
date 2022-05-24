package br.com.venturaBackventuraRH.domain.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import static javax.persistence.CascadeType.ALL;
@Entity
@Table(name = "escolaridade")
@Getter
@Setter
public class EscolaridadeEntities implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int uuid;
    private String nomeEscola;
    private Date dataInicio;
    private Date dataFim;

    public EscolaridadeEntities(int uuid, String nomeEscola, Date dataInicio, Date dataFim) {
        this.uuid = uuid;
        this.nomeEscola = nomeEscola;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    public EscolaridadeEntities() {

    }

    @ManyToMany(cascade = ALL)
    Set<UsuarioEntities> usuario_escolaridade;

    @OneToMany(cascade = ALL)
    Set<EscolaridadeNivelEntities> usuario_escolaridade_nivel;


}
