<h2>Projeto virtualizado com Docker.</h2>

Este projeto é uma API REST de gerenciamento de mensagens que foi virtualizada com Docker. O objetivo é praticar os principais conceitos e vantagens de utilizar o sistema de virtualização com Docker e o orquestrador de containers da Docker. Foi criado dois containers: um para virtualizar o banco de dados MongoDB e outro para virtualizar a API REST que foi desenvolvida com o framework SpringBoot . Depois, foi configurado o gerenciamento da comunicação de dados entre containers, a fim de permitir a API se comunicar com o banco de dados.



**As tecnologias utilizadas foram:**

- Docker

- Orquetrador Docker Compose

- Linguagem Java

- Spring Boot

- JPA(Hibernate)

- Gerenciador de Repositórios Maven

- IDE Intellij

- Postman

  

Para executar o projeto no terminal, digite o seguinte comando dentro da pasta raíz do projeto:

```shell script
sudo docker-compose up --build
```

Após executar o comando acima, basta abrir o seguinte endereço e visualizar a execução do projeto:

```
http://localhost:8081
```

Para adicionar os dados é necessário utilizar o método POST com o corpo da mensagem no formato JSON:

```
{
    "message":"Minha primeira mensagem"
}
```



# Autor

[![Linkedin Badge](https://img.shields.io/static/v1?label=IN&message=Fl%C3%A1vio%20Potugal&color=blue)](https://www.linkedin.com/in/flavio-portugal/)
