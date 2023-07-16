# Sistema de Gerenciamento de Biblioteca

O Sistema de Gerenciamento de Biblioteca é uma aplicação desenvolvida para o controle de usuários, clientes, livros e reservas em uma biblioteca. O sistema possui as seguintes funcionalidades:

## Funcionalidades
Usuário
Cadastro: Permite o registro de novos usuários no sistema.\
Login: Permite que os usuários façam login na aplicação para acessar as funcionalidades.

## Cliente
Cadastro: Permite o cadastro de novos clientes na biblioteca.\
Edição: Permite a atualização das informações dos clientes cadastrados.\
Exclusão: Permite a exclusão de clientes do sistema.\
Visualização: Permite visualizar os detalhes dos clientes cadastrados.

## Livro
Cadastro: Permite o cadastro de novos livros no acervo da biblioteca.\
Edição: Permite a atualização das informações dos livros cadastrados.\
Exclusão: Permite a exclusão de livros do acervo.\
Visualização: Permite visualizar os livros cadastrados.

## Reserva
Cadastro: Permite que os clientes realizem reservas de livros disponíveis.\
Edição: Permite a atualização das informações das reservas realizadas.\
Exclusão: Permite o cancelamento de reservas.\
Visualização: Permite visualizar as reservas realizadas pelos clientes.

## Recursos
Validação de registros duplicados: O sistema realiza verificações para evitar a inserção de usuários com o mesmo login e clientes com o mesmo CPF.\
Máscara de CPF: Foi utilizado mascaramento para facilitar a inserção correta do CPF dos clientes.\
Estilização com Bootstrap e CSS: A interface do sistema foi estilizada utilizando Bootstrap e CSS para uma melhor experiência de usuário.\
Banco de Dados
O sistema utiliza um banco de dados relacional de nome "poo" composto por quatro tabelas:

Tabela livro: Armazena as informações dos livros cadastrados.\
Tabela cliente: Armazena as informações dos clientes cadastrados.\
Tabela reserva_livro: Estabelece a relação entre os livros e os clientes, permitindo o registro das reservas realizadas.\
Tabela usuario: Armazena as informações dos usuários cadastrados no sistema.

## Instruções de Uso
Faça o download ou clone este repositório.\
Crie o banco de dados de nome poo com suas tabelas.(bd_biblioteca)\
Abra o projeto em sua IDE.\
Compile e execute o projeto.\
Acesse a aplicação através do seguinte caminho: http://localhost:8080/bib/usuario/logarusuario.

