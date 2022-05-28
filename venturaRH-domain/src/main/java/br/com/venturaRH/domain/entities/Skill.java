package br.com.venturaRH.domain.entities;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;
import static javax.persistence.CascadeType.ALL;

@Getter
@Setter
public class Skill {
    private int uuid;
    private String lingagem;

    public Skill(int uuid, String lingagem) {
        this.uuid = uuid;
        this.lingagem = lingagem;
    }

}
