-- Criamos uma área de locação para o cliente, desenvolver as suas tabelas e gravar os dados
-- create database revisao;

-- Após a criação do database, iniciamos o serviço para este espaço alocado
-- use revisao;

-- Criando a nossa primeira tabela de registros no database
create table clientes(
id_cliente int not null auto_increment primary key,
nome_cliente varchar(50) not null,
idade_cliente int not null,
email_cliente varchar(80) not null);

-- Sintaxe utilizada para ver a estrutura da tabela
describe clientes;

-- Inserindo registros na estrutura da nossa tabela
insert into clientes
(nome_cliente,idade_cliente,email_cliente)
values
("Igor",30,"igor@terra.com.br"),
("Paula",26,"paula@ig.com.br");

-- Fazendo a leitura dos registros na nossa tabela
select * from clientes;
select nome_cliente,email_cliente from clientes;

-- Ordenando os registros da tabela
select * from clientes order by nome_cliente asc; -- ordena de forma ascendente
select * from clientes order by nome_cliente desc; -- ordena de forma descendente

select * from clientes where idade_cliente=20; -- busca simples de registros
select * from clientes where idade_cliente>=20 and idade_cliente<=30 order by idade_cliente; -- busca da faixa de registros
select * from clientes where idade_cliente between 20 and 30 order by idade_cliente; -- busca registros dentro de uma faixa com uma função do próprio banco de dados

select count(*) from clientes where idade_cliente between 20 and 30; -- o count premite retornar a quantidade de registros encontrados no range
select * from clientes where nome_cliente="igor";
-- Utilização do Like mais o %, permite fazer buscas dentro de campos do tipo string, (varchar, char, text)
select * from clientes where nome_cliente like "Veda%";
select * from clientes where nome_cliente like "%Williams";
select * from clientes where nome_cliente like "%V.%";
select * from clientes where nome_cliente like "B%";

-- Agrupamento de registros desejados no banco de dados junto a contagem de registros
select count(*) as total_registros, idade_cliente from clientes where idade_cliente between 20 and 30 group by idade_cliente order by idade_cliente;

-- Utilizando a função max
select max(idade_cliente) from clientes;
select * from clientes where idade_cliente=100;

-- Utilizando a função min
select min(idade_cliente) from clientes;
select * from clientes where idade_cliente=18;

-- Criando sub-selects
select * from clientes where idade_cliente =(select max(idade_cliente) from clientes) order by nome_cliente;

-- Criar uma tabela de produtos
create table produtos(
id_produto int not null auto_increment primary key,
nome_produto varchar(40) not null,
quantidade_produto int not null,
valor_unid_produto double(8,2) not null);

insert into produtos
(nome_produto,quantidade_produto,valor_unid_produto)
values
("Mouse",20,35.99),
("Teclado",15,50.75),
("Monitor",5,450.00);

select * from produtos;
-- Calculando campos no banco de dados 
select nome_produto, quantidade_produto,valor_unid_produto, (quantidade_produto*valor_unid_produto) as total  from produtos;
-- Função sum, permite somar os valores atribuídos, campos  a função.
select sum(quantidade_produto*valor_unid_produto) as total_geral from produtos;