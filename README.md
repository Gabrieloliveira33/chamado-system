# Chamado System

Sistema de Chamados (Ticketing System) desenvolvido como projeto de estudo e portfólio, com foco em boas práticas de engenharia de software, modelagem UML e arquitetura back-end.

## 📌 Objetivo do Projeto

O objetivo deste projeto é construir um sistema de gerenciamento de chamados semelhante aos utilizados em ambientes corporativos de suporte técnico, permitindo a interação entre usuários, técnicos e administradores.

Atualmente, o repositório contém a **fase de análise e design**, que antecede a implementação do sistema.

---

## 🧠 Análise e Design

Antes da implementação, foi realizada a modelagem UML para definir claramente o escopo do sistema, seus atores, responsabilidades e modelo de dados.

Todos os artefatos desta fase estão organizados na pasta:


---

### 🔹 Diagrama de Casos de Uso

O Diagrama de Casos de Uso descreve as ações disponíveis para cada ator do sistema:

- **Cliente**
  - Criar chamado
  - Consultar seus chamados
  - Fazer comentários

- **Técnico**
  - Consultar chamados atribuídos
  - Alterar status do chamado
  - Fazer comentários

- **Administrador**
  - Criar e excluir usuários
  - Atribuir técnicos aos chamados
  - Consultar todos os chamados

📄 Arquivo:  
`Analise e design/diagrama-casos-de-uso.pdf`

---

### 🔹 Diagrama de Classes

O Diagrama de Classes define as entidades do sistema, seus atributos, relacionamentos e enums utilizados no domínio da aplicação.

Principais entidades modeladas:
- **Usuário**
- **Chamado**
- **Comentário**

Enums:
- **Role**: CLIENTE, TECNICO, ADMIN
- **Status**: PENDENTE, EM_ANDAMENTO, FINALIZADO

📄 Arquivo:  
`Analise e design/diagrama-classes.pdf`

---

## 🛠️ Tecnologias Planejadas

- Java 17
- Spring Boot
- Spring Data JPA
- MySQL
- HTML, CSS e JavaScript puro
- Docker
- Git e GitHub

---

## 🚧 Status do Projeto

🔄 **Em desenvolvimento**

O projeto encontra-se atualmente na fase de **análise e design**.  
As próximas etapas incluem:

- Criação do projeto Spring Boot
- Implementação das entidades JPA
- Configuração do banco de dados MySQL
- Desenvolvimento do back-end REST
- Criação do front-end
- Containerização com Docker

---

## 📚 Observações

Este projeto está sendo desenvolvido com foco em aprendizado prático, seguindo uma abordagem incremental, documentada e alinhada às boas práticas de mercado.
