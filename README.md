# E-Commerce

Uma aplicação backend de e-commerce desenvolvida com Spring Boot 4.1.0 e Java 21.

## 📋 Sobre o Projeto

Este é um projeto de uma plataforma de e-commerce com API REST para gerenciar produtos, pedidos e transações. A aplicação utiliza as melhores práticas de desenvolvimento com Spring Boot e fornece endpoints robustos e escaláveis.

## 🛠️ Stack Tecnológico

- **Java**: 21
- **Framework**: Spring Boot 4.1.0
- **Build Tool**: Maven
- **Database**: PostgreSQL
- **Bibliotecas**:
  - Spring Boot Starter Web (spring-boot-starter-webmvc)
  - Spring Boot Starter Validation (spring-boot-starter-validation)
  - Spring Boot Starter Actuator (spring-boot-starter-actuator)
  - Spring Boot Starter Data JPA (spring-boot-starter-data-jpa)
  - MapStruct (org.mapstruct:mapstruct) — versão 1.6.3
  - SpringDoc OpenAPI (org.springdoc:springdoc-openapi-starter-webmvc-ui) — versão 2.6.0
  - PostgreSQL JDBC Driver (org.postgresql:postgresql)
  - Lombok (org.projectlombok:lombok) — optional
  - Spring Boot DevTools (spring-boot-devtools) — runtime, optional
  - Dependências de teste: spring-boot-starter-actuator-test, spring-boot-starter-data-jpa-test, spring-boot-starter-validation-test, spring-boot-starter-webmvc-test

## 📦 Pré-requisitos

Antes de iniciar, certifique-se de ter instalado:

- **Java 21** ou superior
- **Maven 3.6+** ou use o Maven Wrapper incluído (`mvnw`)
- **PostgreSQL 12+** (ou superior)
- **Git** (opcional)

## 🚀 Getting Started

### 1. Clonar o Repositório

```bash
git clone https://github.com/dr3x-code/e-commerce.git
cd e-commerce
```

### 2. Configurar o Banco de Dados

Crie um banco de dados PostgreSQL para a aplicação:

```sql
CREATE DATABASE ecommerce;
```

### 3. Configurar Variáveis de Ambiente

Crie ou edite o arquivo `application.properties` em `src/main/resources/`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/ecommerce
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=false
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
```

### 4. Instalar Dependências e Compilar

```bash
# Usando Maven Wrapper (recomendado)
./mvnw clean install

# Ou com Maven instalado globalmente
mvn clean install
```

### 5. Executar a Aplicação

```bash
# Usando Maven Wrapper
./mvnw spring-boot:run

# Ou com Maven instalado globalmente
mvn spring-boot:run
```

A aplicação estará disponível em `http://localhost:8080`

## 📚 Estrutura do Projeto

```
e-commerce/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/github/dr3x_code/e_commerce/
│   │   │       ├── ECommerceApplication.java    # Classe principal
│   │   │       ├── controller/                   # Controladores REST
│   │   │       ├── service/                      # Lógica de negócio
│   │   │       ├── repository/                   # Acesso a dados
│   │   │       ├── model/                        # Entidades
│   │   │       └── exception/                    # Tratamento de exceções
│   │   └── resources/
│   │       └── application.properties            # Configurações
│   └── test/
│       └── java/                                 # Testes unitários
├── pom.xml                                       # Configuração Maven
├── mvnw / mvnw.cmd                               # Maven Wrapper
└── README.md                                     # Este arquivo
```

## 🔌 Endpoints Principais

A API REST oferece os seguintes endpoints (a serem implementados/documentados):

- `GET /api/products` - Listar produtos
- `GET /api/products/{id}` - Obter produto específico
- `POST /api/orders` - Criar novo pedido
- `GET /api/orders/{id}` - Obter detalhes do pedido

*Documentação completa dos endpoints disponível em `http://localhost:8080/swagger-ui.html` (se Springdoc for adicionado)*

## 🧪 Executar Testes

```bash
# Executar todos os testes
./mvnw test

# Executar testes de um pacote específico
./mvnw test -Dtest=com.github.dr3x_code.e_commerce.controller.*Test
```

## 📊 Monitoramento com Actuator

A aplicação inclui Spring Boot Actuator. Endpoints de monitoramento disponíveis em:

- `http://localhost:8080/actuator/health` - Status da aplicação
- `http://localhost:8080/actuator/metrics` - Métricas

## 🔧 Configuração do IDE

### IntelliJ IDEA

1. Abra o projeto
2. A estrutura Maven será reconhecida automaticamente
3. Para usar Lombok:
   - Vá em `Settings > Plugins` e instale "Lombok"
   - Habilite annotation processing em `Settings > Build, Execution, Deployment > Compiler > Annotation Processors`


## 🤝 Contribuindo

1. Faça um fork do projeto
2. Crie uma branch para sua feature (`git checkout -b feature/MinhaFeature`)
3. Commit suas mudanças (`git commit -m 'Adiciona MinhaFeature'`)
4. Push para a branch (`git push origin feature/MinhaFeature`)
5. Abra um Pull Request


## 👨‍💻 Autor

- **GitHub**: [@dr3x-code](https://github.com/dr3x-code)


**Última atualização**: Julho de 2026
