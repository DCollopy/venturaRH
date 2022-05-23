package br.com.venturaBackventuraRH.domain.entities;

import br.com.venturaBackventuraRH.domain.valueobject.Cpf;
import br.com.venturaBackventuraRH.domain.valueobject.Email;
import br.com.venturaBackventuraRH.domain.valueobject.Telefone;

import java.util.List;

public class ClienteEntities extends PerfilEntities {
    private String funcional;
    private EmpresaEntities empresa;

    public ClienteEntities(String uuid, String nome, String sobrenome, Cpf cpf, String cidade, Email email, String funcional, EmpresaEntities empresa) {
        super(uuid, nome, sobrenome, cpf, cidade, email);
        this.funcional = funcional;
        this.empresa = empresa;
    }
}
