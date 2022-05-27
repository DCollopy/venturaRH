package br.com.venturaBackventuraRH.domain.entities;

import javax.persistence.*;

import static javax.persistence.CascadeType.ALL;

@Entity
@Table(name="escolaridadeNivel")
public class EscolaridadeNivelEntities {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int uuid;
    private String nivel;

    public EscolaridadeNivelEntities(int uuid, String nivel) {
        this.uuid = uuid;
        this.nivel = nivel;
    }

    public EscolaridadeNivelEntities() {

    }

    @ManyToOne(cascade = ALL)
    EscolaridadeEntities escolaridadenivel_escolaridade;

    @ManyToOne(cascade = ALL)
    OportunidadeEntities oportunidade_escolaridade_nivel;



}
