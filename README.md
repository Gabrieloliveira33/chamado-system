# Chamado System

Sistema de Chamados (Ticketing System) desenvolvido como projeto de portfólio,
com foco em boas práticas de arquitetura, modelagem e uso do ecossistema Spring.

## 🎯 Objetivo do Projeto
Permitir que usuários abram chamados, técnicos façam o atendimento
e administradores gerenciem usuários e chamados.

O projeto será desenvolvido **por etapas**, iniciando pela análise e design,
seguindo para implementação back-end, front-end e deploy com Docker.

---

## 👥 Atores do Sistema
- **Cliente**: abre chamados, acompanha status e adiciona comentários
- **Técnico**: atende chamados atribuídos e altera status
- **Admin**: gerencia usuários, técnicos e chamados

---

## 🧩 Funcionalidades Planejadas
- Abertura de chamados
- Alteração de status (PENDENTE → EM_ANDAMENTO → FINALIZADO)
- Comentários internos por chamado
- Gerenciamento de usuários (Admin)
- Atribuição de técnico a chamado
- Autenticação e autorização por perfil

---

## 🏗️ Arquitetura
- Back-end: **Java + Spring Boot (API REST)**
- Front-end: **HTML, CSS e JavaScript puro**
- Banco de Dados: **MySQL**
- Containerização: **Docker**
- Padrão arquitetural: **MVC + Camadas (Controller, Service, Repository)**

---

## 📐 Análise e Design
Os diagramas UML foram criados antes da implementação, seguindo boas práticas
de engenharia de software.

📁 **Pasta:** `Analise e design/`

- Diagrama de Casos de Uso
- Diagrama de Classes
- Arquivo do Astah (.asta)

---

## 📂 Estrutura do Projeto

```text
chamado-system/
│
├── Analise e design/
│   ├── diagrama-casos-de-uso.pdf
│   ├── diagrama-classes.pdf
│   └── chamado-system - Analise e Design.asta
│
└── backend/
    └── chamado-system/
        ├── src/main/java/com/chamadosystem/
        │   ├── controller
        │   ├── entity
        │   ├── enums
        │   ├── repository
        │   └── service
        └── pom.xml
