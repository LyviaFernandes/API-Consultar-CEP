package Lyvia.consulta_cep.service;

import Lyvia.consulta_cep.model.Endereco;
import Lyvia.consulta_cep.repository.CepRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CepService {

    @Autowired
    private CepRepositoryImpl cepRepository;

    public Endereco consultarCep(String cep) {
        return cepRepository.buscarCep(cep);
    }
}
