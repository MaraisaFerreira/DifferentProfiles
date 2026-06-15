# Spring Boot Profiles & Flyway Simulator

Este é um projeto simples desenvolvido para simular e demonstrar o uso de Perfis (Perfis de Configuração) no Spring Boot, isolando os ambientes de Desenvolvimento (dev) e Produção (prod).

O projeto também utiliza o Flyway para versionamento de banco de dados e carrega credenciais sensíveis de um arquivo externo.

---

## Funcionalidades e Diferenças entre Perfis

O sistema se comporta de forma diferente dependendo do perfil ativo:

- Perfil: dev (Desenvolvimento)
    * Banco de Dados: db mysql de teste (recriado a cada nova reinicialização)
    * Migração (Flyway): Criação da tabela automática
    * Carga de Dados: ATIVA. Uma classe de configuração insere dados de teste automaticamente na inicialização.

- Perfil: prod (Produção)
    * Banco de Dados: db mysql de prod
    * Migração (Flyway): Criação da tabela automática
    * Carga de Dados: INATIVA. Nenhum dado de teste é inserido, apenas a tabela é criada pelo flyway.

---

## Configuração de Credenciais Externas

Para não expor dados sensíveis no repositório, as credenciais do banco de dados são lidas a partir de um arquivo externo chamado db_credentials.yaml.

Como estruturar o arquivo externo (db_credentials.yaml):

```yaml
  db-test:
    username: YOUR_USER
    password: YOUR_PASSWORD

  db:
  username: YOUR_USER
  password: YOUR_PASSWORD

```
---

## Tecnologias Utilizadas

* Java
* Spring Boot (Spring Data JPA, Spring Web)
* Flyway Migration (Gerenciamento de esquema de banco de dados)
* YAML (Para configuração externa e interna)
