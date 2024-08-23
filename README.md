# Task Manager 🎯

## Descrição do Projeto

O **Task Manager** é uma aplicação de gerenciamento de tarefas desenvolvida em Java com o framework Spring. A aplicação permite que os usuários criem, editem, visualizem e excluam tarefas de forma simples e eficaz. Cada tarefa possui um título, descrição, data de criação (gerada automaticamente), data de expiração (definida pelo usuário) e um nível de dificuldade.

## Tecnologias Utilizadas 🔧

- **Java**: Linguagem de programação utilizada para o desenvolvimento do projeto.
- **Spring Boot**: Framework utilizado para criar a aplicação de forma rápida e simplificada.
- **JPA (Java Persistence API)**: Utilizado para mapeamento objeto-relacional e manipulação dos dados no banco.
- **Hibernate**: Implementação do JPA, usada para facilitar as operações de banco de dados.
- **Banco H2**: Banco de dados em memória, utilizado para testes e desenvolvimento.
- **API Rest**: Interface para comunicação entre o frontend e o backend.
- **Postman**: Ferramenta utilizada para testes das requisições HTTP.
- **Git e Github**: Ferramentas utilizadas versionamento de código.

## Funcionalidades

- **Criar Tarefa**: Adicione uma nova tarefa com título, descrição, data de criação automática, data de expiração e nível de dificuldade.
- **Visualizar Tarefas**: Veja todas as tarefas cadastradas, com todas as informações detalhadas.
- **Editar Tarefa**: Modifique os detalhes de uma tarefa existente.
- **Excluir Tarefa**: Remova uma tarefa do sistema.

## Futuras Implementações 🚀

- **Cadastro de Usuários**: Adicionar funcionalidade para cadastro de usuários, permitindo a personalização e a gestão das tarefas por usuário.
- **Autenticação**: Implementar autenticação de usuários para garantir a segurança e o acesso controlado às funcionalidades da aplicação.
- **Regras de Uso**: Definir regras específicas de uso com base no tipo de cadastro do usuário, como permissões e limitações.

## Como Executar o Projeto 🔗

1. Clone o repositório:
   ```bash
   git clone https://github.com/seuusuario/task-manager.git
   
2. Navegue até o diretório do projeto:
   ```bash
   cd task-manager

3. Execute o projeto usando sua IDE favorita ou via linha de comando:
   ```bash
   mvn spring-boot:run

4. Acesse a API através do Postman ou qualquer cliente REST:
- Endpoint para criar tarefa: POST /api/tasks
- Endpoint para visualizar todas as tarefas: GET /api/tasks
- Endpoint para editar uma tarefa: PUT /api/tasks/{id}
- Endpoint para excluir uma tarefa: DELETE /api/tasks/{id}

## Contribuição
Contribuições são bem-vindas! Se você tiver alguma ideia ou sugestão para melhorar o projeto, fique à vontade para abrir uma issue ou enviar um *pull request*.


   
