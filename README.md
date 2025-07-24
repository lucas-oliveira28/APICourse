
# ⚙️ API Course

Um repositório com os commits de uma API REST base para estudos de criação de API, utilizando o H2 como banco de dados relacional.


## 💡 Funcionalidades

- CRUD para cadastro de usuários (User)
- Integração com banco de dados H2
- Organização em sistema de camadas
- Serviço de busca de todos usuários ou por ID


## 📃 Documentação da API

### Retornar todos os usuários

```http
  GET /users
```

### Retornar um usuário (Filtro por ID)

```http
  GET /users/{id}
```

#### Parâmetros da URL
| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `string` | **Obrigatório**. O ID do usuário que deseja buscar |



### Criar um novo usuário

```http
  POST /users
```

#### JSON Body
| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `name`      | `String` | **Obrigatório**. Nome do usuário  |
| `email`      | `String` | **Obrigatório**. Email do usuário |
| `phone`      | `String` | **Obrigatório**. Número de telefone do usuário |
| `password`      | `String` | **Obrigatório**. Senha do usuário|

#### Exemplo

```json 
Content-Type: application/json

{ 
    "name": "Lucas Monteiro", 
    "email": "lucas.monteiro@example.com", 
    "phone": "123456789",
    "password": "minhaSenha123"
}
```

### Atualiza os dados de um usuário existente

```http
  PUT /users/{id}
```

#### Parâmetros da URL
| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `string` | **Obrigatório**. O ID do usuário que será atualizado |


#### JSON Body
| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `name`      | `String` | **Opcional**. Nome do usuário  |
| `email`      | `String` | **Opcional**. Email do usuário |
| `phone`      | `String` | **Opcional**. Número de telefone do usuário |
| `password`      | `String` | **Opcional**. Senha do usuário|

#### Exemplo

```json 
Content-Type: application/json

{ 
    "email": "lucas.oliveira@example.com", 
    "phone": "987654321"
}
```

### Remover um usuário (Filtro por ID)

```http
  DELETE /users/{id}
```

#### Parâmetros da URL
| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `string` | **Obrigatório**. O ID do usuário que será removido |








#
# 💻 Olá, me chamo Lucas!

Estou migrando de carreira para trabalhar com o que sempre gostei.  
Estou focando meus estudos em **Java** para me tornar um futuro **Dev Backend com foco em Java**.

---

## ❔ Sobre mim

- 🖥️ Técnico em Rede de Computadores pela ETE Epitácio Pessoa  
- ⚗️ Técnico em Química pelo IFPE  
- ⌛ Estudando **ADS** pela UNINTER  
- 📚 Estudando **Java, Spring Boot, CRUD e APIs**  
- 🎯 Objetivo: Se tornar um **Desenvolvedor Java Backend**  
- 🎲 Fato Curioso: Sempre fui apaixonado por games, então tenho alguns projetos básicos de jogos em **Python** e **Godot**

---

## 📝 Eu programo em

