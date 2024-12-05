SELECT * FROM endereco;
SELECT * FROM dadospessoais;

CREATE TABLE medicos(
	cod_MED VARCHAR(50) primary key NOT NULL,
	cpf VARCHAR(50) NOT NULL
);
CREATE TABLE pacientes(
	cod_PAC VARCHAR(50) primary key not null,
	cpf VARCHAR(50) NOT NULL
)
CREATE TABLE consultas(
	codigo VARCHAR(50),
	cpf_med VARCHAR(50),
	cpf_pac VARCHAR(50),
	situação VARCHAR(50),
	OBS VARCHAR(200)		
)
CREATE TABLE auditoria(
	auditoria_id SERIAL PRIMARY KEY,
    codigo VARCHAR(50),
    nome_medico varchar(50),
    cpf_medico varchar(50),
	numero_medico varchar(50),
    nome_paciente VARCHAR(50),
    cpf_paciente VARCHAR(50),
	telefone_paciente VARCHAR(50),
	OBS VARCHAR (200),
    data_operacao TIMESTAMP,	
    usuario VARCHAR(50),
    data_auditoria TIMESTAMP DEFAULT CURRENT_TIMESTAMP
)
SELECT * FROM consultas;
SELECT * FROM medicos;
SELECT * FROM pacientes;
INSERT INTO pacientes values ('55','711.005.621-09');
alter table dadospessoais add COLUMN codigo VARCHAR(20);
SELECT dadospessoais.*, pacientes.*
FROM dadospessoais
JOIN pacientes ON dadospessoais.cpf = pacientes.cpf
WHERE pacientes.cpf = '444.444.444-44'
ORDER BY dadospessoais.cpf DESC, pacientes.cpf DESC;
Select * from dadospessoais, medicos WHERE medicos.cpf = dadospessoais.cpf

Select dadospessoais.*, medicos.* FROM dadospessoais JOIN medicos ON dadospessoais.cpf = medicos.cpf
WHERE medicos.cpf = '123.456.789-01' ORDER BY dadospessoais.cpf DESC, medicos.cpf DESC

usando essa tabela "CREATE TABLE consultas( codigo VARCHAR(50), cpf_med VARCHAR(50), cpf_pac VARCHAR(50), situação VARCHAR(50), OBS VARCHAR(200) )" quero puxar dos dadospessoais o nome e o cpf do medico e do paciente e o fone
Para consultar o nome, CPF e telefone tanto do médico quanto do paciente a partir da tabela dadospessoais usando a tabela consultas, você pode fazer uma JOIN com a tabela dadospessoais duas vezes, uma para o médico e outra para o paciente. Aqui está um exemplo de como fazer isso:

SELECT 
    consultas.codigo,
    medicos.nome AS nome_medico,
    medicos.cpf AS cpf_medico,
    medicos.fone AS fone_medico,
    pacientes.nome AS nome_paciente,
    pacientes.cpf AS cpf_paciente,
    pacientes.fone AS fone_paciente,
    consultas.situação,
    consultas.OBS
FROM 
    consultas
JOIN 
    dadospessoais AS medicos ON consultas.cpf_med = medicos.cpf
JOIN 
    dadospessoais AS pacientes ON consultas.cpf_pac = pacientes.cpf
ORDER BY 
    consultas.codigo;
-- Verifique se os dados estão nas tabelas
SELECT * FROM dadospessoais;
SELECT * FROM consultas;
update consultas set cpf_pac'444.444.444-44' where cpf
SELECT 
    consultas.codigo,
    medicos.nome AS nome_medico,
    medicos.cpf AS cpf_medico,
    medicos.fone AS fone_medico,
    pacientes.nome AS nome_paciente,
    pacientes.cpf AS cpf_paciente,
    pacientes.fone AS fone_paciente,
    consultas.situação,
    consultas.OBS
FROM 
    consultas
JOIN 
    dadospessoais AS medicos ON consultas.cpf_med = medicos.cpf
JOIN 
    dadospessoais AS pacientes ON consultas.cpf_pac = pacientes.cpf
WHERE 
    consultas.cpf_pac = '444.444.444-44' -- Substitua pelo CPF do médico
ORDER BY 
    consultas.codigo;

SELECT 
    consultas.codigo,
    medicos.cpf AS cpf_medico,
    medicos_dados.nome AS nome_medico,
    medicos_dados.fone AS fone_medico,
    pacientes.cpf AS cpf_paciente,
    pacientes_dados.nome AS nome_paciente,
    pacientes_dados.fone AS fone_paciente,
    consultas.situação,
    consultas.OBS
FROM 
    consultas
JOIN 
    medicos ON consultas.cpf_med = medicos.cpf
JOIN 
    dadospessoais AS medicos_dados ON medicos.cpf = medicos_dados.cpf
JOIN 
    pacientes ON consultas.cpf_pac = pacientes.cpf
JOIN 
    dadospessoais AS pacientes_dados ON pacientes.cpf = pacientes_dados.cpf
ORDER BY 
    consultas.codigo;

	
SELECT 
    consultas.codigo,
    medicos.cpf AS cpf_medico,
    medicos_dados.nome AS nome_medico,
    medicos_dados.fone AS fone_medico,
    pacientes.cpf AS cpf_paciente,
    pacientes_dados.nome AS nome_paciente,
    pacientes_dados.fone AS fone_paciente,
    consultas.situação,
    consultas.OBS
FROM 
    consultas
LEFT JOIN 
    medicos ON consultas.cpf_med = medicos.cpf
LEFT JOIN 
    dadospessoais AS medicos_dados ON medicos.cpf = medicos_dados.cpf
LEFT JOIN 
    pacientes ON consultas.cpf_pac = pacientes.cpf
LEFT JOIN 
    dadospessoais AS pacientes_dados ON pacientes.cpf = pacientes_dados.cpf
ORDER BY 
    consultas.codigo;

UPDATE consultas 
SET OBS = CONCAT(OBS, '\n', 'novoComentario') 
WHERE codigo = 'codigoConsulta';

SELECT 
    consultas.codigo, 
    medicos.cpf AS cpf_medico,
    medicos_dados.nome AS nome_medico,
    medicos_dados.fone AS fone_medico,
    pacientes.cpf AS cpf_paciente,
    pacientes_dados.nome AS nome_paciente,
    pacientes_dados.fone AS fone_paciente,
    consultas.situação,
    consultas.OBS 
FROM 
    consultas 
JOIN 
    medicos ON consultas.cpf_med = medicos.cpf 
JOIN 
    dadospessoais AS medicos_dados ON medicos.cpf = medicos_dados.cpf 
JOIN 
    pacientes ON consultas.cpf_pac = pacientes.cpf 
JOIN 
    dadospessoais AS pacientes_dados ON pacientes.cpf = pacientes_dados.cpf 
WHERE 
    consultas.cpf_med = '123.456.789-01' 
ORDER BY 
    consultas.codigo;
UPDATE consultas 
SET OBS = CONCAT(OBS, '\n', 'aaaaaaaa') 
WHERE codigo = 'Insira o codigo';
SELECT * FROM consultas;
CREATE OR REPLACE FUNCTION auditoria_consultas() 
RETURNS TRIGGER AS $$
BEGIN
    INSERT INTO auditoria (codigo, nome_medico, cpf_medico, numero_medico, nome_paciente, cpf_paciente, telefone_paciente, OBS, data_operacao, usuario)
    SELECT 
        NEW.codigo, 
        medicos_dados.nome AS nome_medico, 
        NEW.cpf_med AS cpf_medico, 
        medicos_dados.fone AS numero_medico, 
        pacientes_dados.nome AS nome_paciente, 
        NEW.cpf_pac AS cpf_paciente, 
        pacientes_dados.fone AS telefone_paciente, 
        NEW.OBS, 
        CURRENT_TIMESTAMP AS data_operacao, 
        current_user AS usuario
    FROM 
        dadospessoais AS medicos_dados,
        dadospessoais AS pacientes_dados
    WHERE 
        medicos_dados.cpf = NEW.cpf_med 
        AND pacientes_dados.cpf = NEW.cpf_pac;

    RETURN NEW;
END;
$$ LANGUAGE plpgsql;
CREATE TRIGGER trigger_auditoria_consultas
AFTER UPDATE OF situação ON consultas
FOR EACH ROW
WHEN (OLD.situação IS DISTINCT FROM NEW.situação)
EXECUTE FUNCTION auditoria_consultas();
