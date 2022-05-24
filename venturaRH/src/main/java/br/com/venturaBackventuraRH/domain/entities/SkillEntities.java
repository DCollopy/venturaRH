package br.com.venturaBackventuraRH.domain.entities;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

import static javax.persistence.CascadeType.ALL;

@Entity
@Table(name="skills")
@Getter
@Setter
public class SkillEntities implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int uuid;
    private String lingagem;

    public SkillEntities(int uuid,String lingagem) {
        this.uuid = uuid;
        this.lingagem = lingagem;
    }

    public SkillEntities() {

    }

    @ManyToMany(cascade = ALL)
    Set<UsuarioEntities> usuario_skill;
}
