# 🎬 CinemaManager - Backend API

![Spring](https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white) ![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white) ![MongoDB](https://img.shields.io/badge/MongoDB-4EA94B?style=for-the-badge&logo=mongodb&logoColor=white) ![Railway](https://img.shields.io/badge/Railway-0B0D0E?style=for-the-badge&logo=railway&logoColor=white)

API RESTful desenvolvida com Java e Spring Boot para gerenciar um catálogo de filmes. Este projeto serve como a "cozinha" da aplicação CinemaManager, responsável por toda a lógica de negócio e persistência de dados.

O desenvolvimento desta API foi um exercício prático para construir e fazer o deploy de um serviço backend na nuvem.

---

## 🚀 API no Ar

A API está hospedada na Railway e pode ser acessada pela seguinte URL base:

**[https://apifilmesback-production.up.railway.app](https://apifilmesback-production.up.railway.app)**

### Principais Endpoints

A URL base para todas as requisições é a URL acima.

* `GET /filmes/listar`
    * **Descrição:** Retorna uma lista de **todos** os filmes cadastrados.

* `GET /filmes/listar/id/{id}`
    * **Descrição:** Busca um filme específico pelo seu ID.

* `GET /filmes/listar/nome/{titulo}`
    * **Descrição:** Busca uma lista de filmes que contenham o texto fornecido no título.

* `GET /filmes/disponiveis`
    * **Descrição:** Retorna uma lista apenas dos filmes marcados como disponíveis.

* `POST /filmes`
    * **Descrição:** Adiciona um novo filme ao catálogo. Os dados do filme devem ser enviados no corpo (body) da requisição em formato JSON.

* `PUT /filmes/editar/{id}`
    * **Descrição:** Atualiza os dados de um filme existente. Os novos dados devem ser enviados no corpo da requisição.

* `DELETE /filmes/{id}`
    * **Descrição:** Deleta um filme específico do catálogo.

---

## 🛠️ Tecnologias e Arquitetura

* **Java 17:** Linguagem de programação principal.
* **Spring Boot:** Framework para a criação da aplicação e da API REST.
* **Spring Data MongoDB:** Para facilitar a integração e as operações com o banco de dados MongoDB.
* **Maven:** Gerenciador de dependências e build do projeto.
* **Arquitetura:** Serviço RESTful que se conecta a um banco de dados NoSQL.
* **Hospedagem:** Tanto a API quanto o banco de dados MongoDB estão hospedados na plataforma **Railway**.

---

## ⚙️ Como Rodar Localmente

**Pré-requisitos:**
* Java JDK 17 (ou superior)
* Maven
* Uma instância do MongoDB rodando localmente ou uma string de conexão para um banco na nuvem.

```bash
# 1. Clone o repositório
git clone [https://github.com/SEU-USUARIO/SEU-REPO-BACKEND.git](https://github.com/SEU-USUARIO/SEU-REPO-BACKEND.git)
cd SEU-REPO-BACKEND

# 2. Configure o Banco de Dados
# Abra o arquivo 'src/main/resources/application.properties'
# E configure a sua string de conexão do MongoDB:
# spring.data.mongodb.uri=SUA_STRING_DE_CONEXAO_AQUI

# 3. Rode a aplicação
mvn spring-boot:run
```
O servidor será iniciado na porta `8080`.
