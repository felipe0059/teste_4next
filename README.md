# **Teste Java - Logus Retail**
*A proposta do desafio é a criação de uma API RESTful para gerir a agenda de um consultório médico.**


# Tecnologias

-  Maven
-   Java 11
-   Spring Boot 2.7.0
-   H2 Database (develop)
-   Swagger

Projeto em desenvolvimento, portanto até o prazo de entrega algumas tecnologias poderão ser substituídas de acordo com a fase de produção.

## URLS

-   Default port : http://localhost:8080/
-   H2 port : http://localhost:8080/h2-console
-   Swagger port :  http://localhost:8080/swagger-ui.html

## EndPoints

- POST /consultas/agendar -> Agendar uma nova consulta;
- GET /consultas -> Retorna todas as consultas;
- PUT /medicos/cadastrar -> Cadastra um novo médico no sistema;
- PUT /medicos/alterar/{nome} -> Altera apenas o crm de um médico;
- DELETE /medicos/{nome} -> Deleta um médico pelo nome;

## Models
```json
Medico {
  "id": "Long",
  "nome": "String",
  "crm": "String",
  "especialidade": "ENUM",
  "idade": "Integer";
}
```
```json
Consulta {
"id":"Long",  
"nome":"String",
"dataConsulta":"LocalDate", 
"consultorio":"ENUM",
"id_medico": "Integer" 
}
```

## Continua


