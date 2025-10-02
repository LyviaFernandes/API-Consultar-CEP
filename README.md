Show! Aqui vai um **README.md** pronto e organizado para o seu projeto de consulta de CEP com Spring Boot 🚀.

---

# 📦 Projeto: API de Consulta de CEP

Este projeto é uma **API RESTful** desenvolvida com **Spring Boot**, que consulta informações de endereço a partir de um **CEP** (Código de Endereçamento Postal).
A API funciona como uma **ponte** entre o cliente e o serviço público do **ViaCEP**, retornando informações como rua, bairro, cidade e estado.

---

## 📚 Tecnologias Utilizadas

* **Java 17+**
* **Spring Boot**
* **Spring Web**
* **Lombok**
* **Spring Boot DevTools**
* **RestTemplate**
* **Maven**

---

## ⚙️ Estrutura do Projeto

```
src/main/java/com/lyvia/consultacep
    ├── ConsultacepApplication.java   # Classe principal
    ├── model
    │     └── Endereco.java           # Representa os dados de endereço
    ├── repository
    │     ├── CepRepository.java      # Interface de repositório
    │     └── CepRepositoryImpl.java  # Implementação que consulta o ViaCEP
    ├── service
    │     └── CepService.java         # Camada de regras de negócio
    └── controller
          └── CepController.java      # Controlador REST da API
```

---

## 🔑 Fluxo da Aplicação

1. O cliente faz uma requisição **GET** para `/api/cep/{cep}`.
2. O **Controller** recebe a requisição e chama o **Service**.
3. O **Service** delega ao **Repository**, que consulta a API pública do **ViaCEP**.
4. Os dados retornam como um objeto **Endereco** em formato **JSON**.

---

## ⚙️ Configuração do Projeto

No arquivo `src/main/resources/application.properties`:

```properties
spring.application.name=consulta-cep
server.port=8080
```

---

## ▶️ Como Executar

1. Clone o repositório:

   ```bash
   git clone https://github.com/LyviaFernandes/API-Consultar-CEP.git
   ```
2. Entre na pasta do projeto:

   ```bash
   cd consulta-cep
   ```
3. Compile e rode a aplicação:

   ```bash
   mvn spring-boot:run
   ```
4. A aplicação estará disponível em:

   ```
   http://localhost:8080
   ```

---

## 📮 Testando a API

No **Postman** ou navegador, faça uma requisição GET:

**Exemplo:**

```
GET http://localhost:8080/api/cep/01001000
```

**Resposta (JSON):**

```json
{
  "cep": "01001-000",
  "logradouro": "Praça da Sé",
  "complemento": "lado ímpar",
  "bairro": "Sé",
  "localidade": "São Paulo",
  "uf": "SP"
}
```

---

## 🛠️ Possíveis Melhorias Futuras

* Tratamento de exceções para CEP inválido.
* Cache de respostas para melhorar desempenho.
* Persistência em banco de dados para histórico de consultas.
* Documentação automática com Swagger.

---

✍️ Desenvolvido por **Lyvia**

---
