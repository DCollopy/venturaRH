package br.com.venturaBackventuraRH.domain.entities;

import br.com.venturaBackventuraRH.domain.valueobject.Cpf;
import br.com.venturaBackventuraRH.domain.valueobject.Email;
import br.com.venturaBackventuraRH.domain.valueobject.Telefone;

import java.util.List;

public class AdminEntities extends PerfilEntities {

    public AdminEntities(String uuid, String nome, String sobrenome, Cpf cpf, String cidade, Email email) {
        super(uuid, nome, sobrenome, cpf, cidade, email);
    }
}
