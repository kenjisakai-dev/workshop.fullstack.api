# API de Produtos

API REST simples desenvolvida em **Spring Boot** para cadastro e listagem de produtos, usando banco de dados em memória **H2**.

## Tecnologias

- Java + Spring Boot
- Spring Data JPA
- H2 Database (em memória)
- Lombok
- Maven

## Como executar

Na raiz do projeto, execute:

```bash
./mvnw spring-boot:run
```

No Windows:

```bash
mvnw.cmd spring-boot:run
```

A aplicação sobe na porta **3000**: `http://localhost:3000`

O console do H2 fica disponível em: `http://localhost:3000/h2-console`
(JDBC URL: `jdbc:h2:mem:workshopdb`, usuário: `sa`, senha: vazia)

## Modelo `Produto`

```json
{
	"id": 1,
	"nome": "Notebook",
	"quantidade": 10,
	"categoria": "Eletrônicos"
}
```

## Rotas da API

Base URL: `http://localhost:3000/api/produtos`

### 1. Listar todos os produtos

- **Método:** `GET`
- **URL:** `/api/produtos`
- **Descrição:** Retorna a lista de todos os produtos cadastrados.

Exemplo com `curl`:

```bash
curl http://localhost:3000/api/produtos
```

Resposta (exemplo):

```json
[
	{
		"id": 1,
		"nome": "Notebook",
		"quantidade": 10,
		"categoria": "Eletrônicos"
	}
]
```

### 2. Cadastrar um novo produto

- **Método:** `POST`
- **URL:** `/api/produtos`
- **Body (JSON):** objeto `Produto` (sem o campo `id`, que é gerado automaticamente)

Exemplo com `curl`:

```bash
curl -X POST http://localhost:3000/api/produtos ^
  -H "Content-Type: application/json" ^
  -d "{\"nome\":\"Notebook\",\"quantidade\":10,\"categoria\":\"Eletrônicos\"}"
```

Resposta (exemplo):

```json
{
	"id": 1,
	"nome": "Notebook",
	"quantidade": 10,
	"categoria": "Eletrônicos"
}
```

## Estrutura do projeto

```
src/main/java/com/workshop/fullstack/api/
├── ApiApplication.java        # Classe principal
├── controllers/               # Endpoints REST
├── models/                    # Entidades JPA
├── repositories/              # Interfaces JPA
└── services/                  # Regras de negócio
```
