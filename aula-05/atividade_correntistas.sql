create table correntista(
	id_correntista int not null auto_increment primary key,
    agencia_correntista int not null,
    conta_correntista varchar(8)  not null,
    nome_correntista varchar(50) not null,
    email_correntista varchar(80) not null,
    telefone_correntista varchar(10)  not null,
    saldo_correntista float);
  
insert into correntista (agencia_correntista, conta_correntista, nome_correntista, email_correntista, telefone_correntista, saldo_correntista) values 
(1234, "000000-1", "José Silva", "jose@email.com", "1100000001", 100.00),
(1235, "000000-2", "Maria Silva", "maria@email.com", "1100000002", 200.00),
(1236, "000000-3", "Ana Silva", "ana@email.com", "1100000003", 300.00),
(1237, "000000-4", "Julia Silva", "julia@email.com", "1100000004", 400.00);

select agencia_correntista, conta_correntista, nome_correntista from correntista; 


select sum(saldo_correntista) as total_geral_saldo from correntista;

