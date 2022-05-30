
# **Teste Java - Logus Retail**

*A proposta do desafio é a criação de uma API RESTful para gerir a agenda de um consultório médico.**

# Tecnologias

-  Maven
-   Java 11
-   Spring Boot 2.7.0
-   H2 Database/PostGreSQL (develop/deploy)
-   Swagger
-   Lombok

Projeto em desenvolvimento, portanto até o prazo de entrega algumas tecnologias e estratégias poderão ser substituídas de acordo com a fase de produção.

# Kanbans
Foi utilizado a metodologia do próprio github para organização e monitoramento de atividades  
Acesso [aqui](https://github.com/felipe0059/teste_4next/projects/1).

## URLS

-   Default port : http://localhost:8080/
-   H2 port : http://localhost:8080/h2-console
-   Swagger port :  http://localhost:8080/swagger-ui.html
-  Deploy url : https://backendconsultoriofgh.herokuapp.com/swagger-ui/index.html

## Constraints
- O CRM do médico é único;
- Um paciente pode agendar apenas uma consulta por dia;
- Apenas uma consulta por hora no mesmo consultório;
- Não é possível agendar a consulta se o médico não estiver cadastrado;
- Os atributos não podem ser em branco; O tratamento de exceptions retornará um 404 com o campo do erro.
- 

## EndPoints

 **Consulta**
- **POST** /consultas/agendar -> Agendar uma nova consulta;
- **GET**/consultas -> Retorna todas as consultas ordenadas por data e hora;
- **DELETE** /consultas/{id} -> Deleta uma consulta por pelo Id;
 
 **Médico**
- **POST** /medicos/cadastrar -> Cadastra um novo médico no sistema;
- **GET** /medicos/{nome} -> Retorna um médico pelo nome e todas as consultas referentes a ele;
- **DELETE** /medicos/{nome} -> Deleta um médico pelo nome;

## Models
```json
Medico {
  "nome": "String",
  "crm": "String",
  "idade": "Integer"
  "especialidade": "ENUM"; 
}
```
```json
Consulta {
"id":"Long",  
"nomeMedico":"String",
"dataConsulta":"LocalDate",
"horaConsulta":"LocalTime";
"numeroConsultorio": "Integer" 
}
```
```json
Consultório {
"id":"Long",  
"numero":"Integer"
}
```

## Segurança

Segurança Basic implementada

- **Endpoints públicos :**  
--**GET** /consultas -> Retorna todas as consultas ordenadas por data e hora;  
--**GET** /medicos/{nome} -> Retorna um médico pelo nome e todas as consultas referentes a ele;    

- **Endpoints com necessidade de autenticação:** 
(Usuario: user  /  senha: 123)

-- **POST** /consultas/agendar -> Agendar uma nova consulta;  
-- **POST** /medicos/cadastrar -> Cadastra um novo médico no sistema;  
-- **DELETE** /consultas/{id} -> Deleta uma consulta por pelo Id;  
-- **DELETE** /medicos/{nome} -> Deleta um médico pelo nome;  

## Documentação

Documentação do swagger [aqui](https://drive.google.com/file/d/1yBQ4NtO1r4_tuRhkj6vgBU3FctBc0mD0/view?usp=sharing).

## Deploy

Feito deploy da aplicação na plataforma [Heroku](https://backendconsultoriofgh.herokuapp.com/swagger-ui/index.html).

## Front-End

Repositório do front end [aqui](https://github.com/felipe0059/front_4next).




