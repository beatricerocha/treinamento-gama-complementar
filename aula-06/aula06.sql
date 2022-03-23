use revisao;
-- Estrutura da tabela
desc revisao.clientes;


-- Alterando o nome de um campo na estrutura da nossa tabela
alter table clientes rename column email_clientes to email_cliente;

alter table clientes change cpf_clie cpf_cliente char(11) not null;

-- Adicionando novos campos na nossa tabela
alter table clientes add cpf_cliente char(11) not null;
select * from clientes;

-- Modificando um campo da nossa tabela
alter table clientes modify email_cliente varchar(70) not null;

-- OBS ao alterar o relacionamento entre tabelas 
-- primeiro alterar a que está apontando fk para depois pk 

-- Atualizando um campo de um registro na nossa tabela
update clientes set cpf_cliente="25500301044" where id_cliente=2;
update clientes set nome_cliente="Maria de Souza" where id_cliente=2;

-- Atualizando mais de um campo de um registro na nossa tabela
update clientes set nome_cliente="Maria de Souza Silva", cpf_cliente="82828678123" where id_cliente=2;

-- tipos de select 
select * from clientes where id_cliente=2;
select * from clientes where nome_cliente="Maria";
select * from clientes where nome_cliente like "Maria%";
-- Atualizando mais de um campo com valor especifico 

update clientes  set cpf_cliente="Atualizar" where cpf_cliente="";
update clientes set cpf_cliente="Update" where id_cliente>=3;
update clientes set email_cliente="wilson@ig.com.br" where id_cliente=2;
update clientes set email_cliente="joy@ig.com.br" where id_cliente=3;

update clientes set email_cliente=(select novo_email from emaileemail_clientes where id_cliente=1) where id_cliente=1 ;
select * from emaileemail_clientes;
select * from clientes where email_cliente like "%ig.com.br";

-- Criando um sistema de backup das tabelas
create table clientes_bck select * from clientes;
select * from clientes_bck;

delete from clientes where cpf_clie="Update";

-- Recuperando registros através de uma tabela de backup
insert into clientes
(id_cliente,nome_cliente,idade_cliente,email_cliente,cpf_clie)
select id_cliente,nome_cliente,idade_cliente,email_cliente,cpf_clie from clientes_bck where cpf_clie="Update";


create table correntistas(
Ag int not null, 
Conta int not null, 
Nome varchar(50) not null, 
Email varchar(80) not null,
Telefone varchar(20) not null,
Saldo decimal(8,2),
primary key (ag,conta));


create table fluxo_caixa(
ag int not null,
conta int not null,
fluxo int not null,
entrada decimal(8,2) not null,
saida decimal(8,2) not null,
primary key(ag,conta,fluxo));

insert into correntistas
(Ag,Conta,Nome,Email,Telefone,Saldo)
values(0191,07229,"marcos","marcos@gama.com","991499988",4000.00);


insert into fluxo_caixa
(ag,conta,fluxo,entrada,saida)
values
(0191,07228,10,1000,0),
(0191,07228,11,800,0),
(0191,07228,12,400,200);

select * from correntistas;
select * from fluxo_caixa;

-- Criando um relacionamento entre as tabelas
select c.Ag,c.Conta,c.Nome,f.entrada,f.saida 
from correntistas as c, 
fluxo_caixa as f 
where (c.Ag=f.ag) and (c.Conta=f.conta);

select c.Ag,c.Conta,c.Nome,f.entrada,f.saida
from correntistas as c
inner join fluxo_caixa as f
on(c.Ag=f.ag) and (c.Conta=f.conta);

