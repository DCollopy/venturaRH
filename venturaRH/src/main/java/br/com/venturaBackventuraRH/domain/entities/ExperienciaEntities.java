package br.com.venturaBackventuraRH.domain.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

import static javax.persistence.CascadeType.ALL;

@Entity
@Table(name = "experiencias")
@Getter
@Setter
public class ExperienciaEntities implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    public ExperienciaEntities() {

    }

    @ManyToMany(cascade = ALL)
    Set<UsuarioEntities> usuario_experiencia;
}
