package medi.voli.api.medico;

import medi.voli.api.endereco.DadosEndereco;

public record DadosCadastroMedico(
    String nome, String email, String crm, EspecialidadeEnum espec, DadosEndereco endereco
    ){}
