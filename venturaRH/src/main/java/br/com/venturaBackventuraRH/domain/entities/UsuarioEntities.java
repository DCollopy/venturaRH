package br.com.venturaBackventuraRH.domain.entities;

import br.com.venturaBackventuraRH.domain.valueobject.Cpf;
import br.com.venturaBackventuraRH.domain.valueobject.Email;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import java.util.Set;

import static javax.persistence.CascadeType.ALL;

@Entity
@Table(name = "usuarios")
@Getter
@Setter
public class UsuarioEntities extends PerfilEntities {

    public UsuarioEntities(String nome,
                           String sobrenome,
                           Cpf cpf, String cidade,
                           Email email) {
        super(nome, sobrenome, cpf, cidade, email);
    }

    public UsuarioEntities() {
    }

    @ManyToMany(cascade = ALL)
    Set<EscolaridadeEntities> escolaridade_usuario;

    @ManyToMany(cascade = ALL)
    Set<SkillEntities> skill_usuario;

    @ManyToMany(cascade = ALL)
    Set<ExperienciaEntities> experiencia_usuario;

    @ManyToMany(cascade = ALL)
    Set<OportunidadeEntities> oportunidade_usuario;
}
