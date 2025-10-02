package Lyvia.consulta_cep.repository;

import Lyvia.consulta_cep.model.Endereco;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository
public class CepRepositoryImpl implements CepRepository {

    private static final String VIA_CEP_URL = "https://viacep.com.br/ws/{cep}/json/";

    @Override
    public Endereco buscarCep(String cep) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(VIA_CEP_URL, Endereco.class, cep);
    }
}
