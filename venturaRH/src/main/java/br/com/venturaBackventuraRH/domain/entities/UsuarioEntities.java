package br.com.venturaBackventuraRH.domain.entities;

import br.com.venturaBackventuraRH.domain.valueobject.Cpf;
import br.com.venturaBackventuraRH.domain.valueobject.Email;
import br.com.venturaBackventuraRH.domain.valueobject.Telefone;

import java.util.List;

public class UsuarioEntities extends PerfilEntities {
    private EscolaridadeEntities escolaridadeEntities;
    private SkillEntities skillEntities;
    private ExperienciaEntities experienciaEntities;

    public UsuarioEntities(String uuid,
                           String nome,
                           String sobrenome,
                           Cpf cpf, String cidade,
                           Email email,
                           EscolaridadeEntities escolaridadeEntities,
                           SkillEntities skillEntities, ExperienciaEntities experienciaEntities) {
        super(uuid, nome, sobrenome, cpf, cidade, email);
        this.escolaridadeEntities = escolaridadeEntities;
        this.skillEntities = skillEntities;
        this.experienciaEntities = experienciaEntities;
    }
}
