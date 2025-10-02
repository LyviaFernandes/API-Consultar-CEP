package Lyvia.consulta_cep.controller;

import Lyvia.consulta_cep.model.Endereco;
import Lyvia.consulta_cep.service.CepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cep")
public class CepController {

    @Autowired
    private CepService cepService;

    @GetMapping("/{cep}")
    public Endereco getEndereco(@PathVariable String cep) {
        return cepService.consultarCep(cep);
    }
}

