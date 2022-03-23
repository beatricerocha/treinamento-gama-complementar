-- criando as tabelas
create table correntistas (
ag int not null, 
conta  int not null, 
nome varchar(50) not null,  
 email varchar(50) not null, 
telefone varchar(80) not null, 
saldo decimal(8,2),
primary key (ag,conta));

create table fluxo_caixa(
ag int not null, 
conta  int not null, 
fluxo  int not null, 
entrada decimal(8,2),
saida decimal(8,2),
primary key (ag,conta, fluxo));

-- inserindo dados nas tabelas
insert into correntistas (
ag, conta, nome,  email, telefone, saldo) values(226,20156, "Fernanda Silva ", "fs@email.com", "11922614000", 2256),
(221,20201, "José Silva ", "js@email.com", "11922614001", 2000);

insert into correntistas (
ag, conta, nome,  email, telefone, saldo) values
(221,20203, "Fatima Oliveira ", "fatima@email.com", "11984614001", 1000),
(225, 40015, "Guilherme Fernandes", "guilherme@email.com","11987175463", 2546),
(227,20157, "Bruno Oliveira ", "boliv@email.com", "11325648974", 2356),
(225,20285, "Ana Oliveira ", "ana@email.com", "11965478213", 3500),
(226, 40011, "Maria Fernandes", "mari@email.com","11900405603", 1025),
(227,20123, "Giovana Souza ", "gis@email.com", "11999655891", 1204),
(228,20456, "Nathalia Oliveira ", "nati@email.com", "1198145678", 7415),
(229, 45685, "Renan Fernandes", "renan@email.com","11987220175", 1000),
(220,80100, "Lucas Ferreira ", "lucf@email.com", "1195750002", 20000),
(221,60080, "Pedro Oliveira ", "pedro@email.com", "1195750222", 1000),
(222, 80064, "Rafael Fernandes", "rafaf@email.com","11987175022", 2500);



insert into fluxo_caixa (
ag, conta, fluxo, entrada, saida) values(
221,20201, 10, 1000.00, 10.00);

insert into fluxo_caixa (
ag, conta, fluxo, entrada, saida) values
(220, 80100, 01, 400.00, 40.00),
(221, 20203,09, 100.00, 10.00),
(221, 60080, 08, 300.00, 30.00),
(222, 80064, 07, 400.00, 40.00),
(225, 20285, 06, 200.00, 20.00),
(225, 40015, 05, 100.00, 10.00),
(226, 20156, 04, 200.00, 20.00),
(226, 40011, 03, 330.00, 33.00),
(227, 20123, 02, 150.00, 15.00),
(227, 20157, 11, 250.00, 25.00),
(228, 20456,12, 350.00, 35.00),
(229, 45685, 13, 213.00, 21.00);

-- selecinando dados desejados de ambas as tabelas
select c.ag, c.conta, c.nome, f.entrada, f.saida
from correntistas as c, 
fluxo_caixa as f 
where (c.ag=f.ag) and (c.conta=f.conta);

select c.ag, c.conta, c.nome, f.entrada, f.saida
from correntistas as c
inner join fluxo_caixa as f 
on (c.ag=f.ag) and (c.conta=f.conta);