package Lyvia.consulta_cep.repository;

import Lyvia.consulta_cep.model.Endereco;

public interface CepRepository {
    Endereco buscarCep(String cep);
}
