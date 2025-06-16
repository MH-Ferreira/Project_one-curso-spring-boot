``` markdown
# Project One - API Rest com Spring Boot

##  Descrição
Este é um projeto de demonstração que implementa uma API REST utilizando Spring Boot. O projeto serve como exemplo de implementação de endpoints básicos com diferentes métodos HTTP.

## ️ Tecnologias Utilizadas
- Java 21
- Spring Boot
- Spring MVC
- Lombok
- Jakarta EE

##  Estrutura do Projeto
O projeto está organizado da seguinte maneira:
```
project_one/ 
<p></p>├── src/main/java/com/senai/project_one/ 
<p></p>│ ├── controller/ │ 
<p></p>│ └── HelloWorldController.java │ 
<p></p>├── service/ │ 
<p></p>│ └── HelloWorldService.java 
<p></p>│ └── domain/ 
<p></p>│ └── User.java
``` 

##  Como Executar
1. Clone o repositório:
```bash
git clone [URL_DO_SEU_REPOSITORIO]
```
```
1. Entre na pasta do projeto:
``` bash
cd project_one
```
1. Execute o projeto usando Maven:
``` bash
mvn spring-boot:run
```
O servidor iniciará na porta 8080.
## Endpoints Disponíveis
### 1. Hello World (GET)
- **Endpoint:** `/hello-world`
- **Método:** GET
- **Descrição:** Retorna uma mensagem de hello world personalizada
- **Exemplo de uso:**
``` bash
curl http://localhost:8080/hello-world
```
### 2. Hello World com Filtro (POST)
- **Endpoint:** `/hello-world/{id}`
- **Método:** POST
- **Parâmetros:**
    - `id` (path variable) - Identificador único
    - `filter` (query parameter, opcional) - Filtro para personalizar a mensagem
    - `body` (request body) - Objeto User

- **Exemplo de uso:**
``` bash
curl -X POST http://localhost:8080/hello-world/1?filter=video \
-H "Content-Type: application/json" \
-d '{"name": "Exemplo", "email": "exemplo@email.com"}'
```
## Exemplos de Requisições
### GET Request
``` bash
# Requisição básica
GET http://localhost:8080/hello-world

# Resposta esperada:
"Hello World - Matheus"
```
### POST Request
``` bash
# Requisição com ID e filtro
POST http://localhost:8080/hello-world/1?filter=video
Content-Type: application/json

{
    "name": "Exemplo",
    "email": "exemplo@email.com"
}

# Resposta esperada:
"Hello World video"
```
## ⚠️ Notas Importantes
- O servidor roda na porta 8080 por padrão
- Para requisições POST, é necessário incluir o ID na URL
- O parâmetro `filter` é opcional e tem valor padrão "nenhum"
- Todas as requisições POST requerem um corpo (body) com objeto User em formato JSON

- GitHub: [Meu git](https://github.com/MH-Ferreira)
``` 

Para usar este README, você só precisa:
1. Substituir `[URL_DO_SEU_REPOSITORIO]` pela URL real do seu repositório
2. Substituir `[SUA_LICENÇA]` pelo tipo de licença que você está usando
3. Atualizar a seção de autor com suas informações
4. Caso você tenha adicionado mais endpoints ou funcionalidades, você pode expandir a seção de endpoints

Este README fornece:
- Uma visão geral do projeto
- Instruções de instalação e execução
- Documentação detalhada dos endpoints
- Exemplos práticos de uso
- Informações sobre como contribuir

Você pode personalizá-lo ainda mais adicionando:
- Badges (shields)
- Screenshots da aplicação
- Mais exemplos de uso
- Troubleshooting comum
- Qualquer outra informação relevante para seu projeto
```
