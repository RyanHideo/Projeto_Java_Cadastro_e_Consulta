create table DadosPessoais(
	nome varchar(50),
	cpf varchar(20),
	rg Varchar(30),
	sexo Varchar(20),
	data_nascimento varchar(50),
	email varchar(50),
	fone varchar(50),
	fone2 varchar(50),
	primary key(cpf)
) 
create table endereco(
	rua varchar(50),
	numero integer,
	bairro Varchar(50),
	cidade Varchar(50),
	estado varchar(50),
	cep varchar(50),
	obs varchar(50),
	primary key(cep)
) 
SELECT * FROM endereco;
select * from DadosPessoais;
INSERT INTO DadosPessoais values ('Ryan','711.005.621-09','9989898','Masculnio','10/01/2002',
'RyanHideoOugaske@gmail.com', '(67)9999-9999', '(67)9999-8888')
Select * from DadosPessoais WHERE cpf = '711.005.621-09';
