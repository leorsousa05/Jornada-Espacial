-- Active: postgres://avnadmin:AVNS_M5c0gyyQgAlMG5WniRc@jornada-espacial-banco-de-dados-jornada-espacial.f.aivencloud.com:18884/defaultdb?sslmode=require


-- Tabela de Usuário
-- Limita as opções de resposta
CREATE TYPE tipo_usuario AS ENUM ('admin', 'comum');
CREATE TYPE sexo_usuario AS ENUM ('Homem', 'Mulher', 'Nulo', 'Não binário');

-- Cria a tabela
CREATE TABLE tb_jornada_espacial_usuarios(
 -- Dados da conta
  cod_usuario SERIAL PRIMARY KEY UNIQUE,
  login VARCHAR(200) NOT NULL UNIQUE,
  senha VARCHAR(200) NOT NULL,
  tipo tipo_usuario NOT NULL,
-- Dados Pessoais
  nome_completo VARCHAR(200) NOT NULL,
  idade INTEGER CHECK (idade > 0 AND idade < 150),
  sexo sexo_usuario NOT NULL,
  email VARCHAR(200) NOT NULL UNIQUE,
  cpf VARCHAR(14) NOT NULL UNIQUE,
  telefone VARCHAR(14) UNIQUE
);

/* Mostrar a tabela */
SELECT * FROM tb_jornada_espacial_usuarios;

/* cadastrar um usuário */
INSERT INTO tb_jornada_espacial_usuarios 
(cod_usuario, login, senha, tipo, nome_completo, idade, sexo, email, cpf, telefone)
VALUES 
( 1 , -- cod_usuario
  'Victor', -- login
  'java123', -- senha
  'admin', -- tipo
  'Victor Hugo Martins Millan', -- nome_completo
    21, -- idade
  'Homem', -- sexo
  'victorhugomartinsmillan@hotmail.com', -- email
  '2486871782', -- cpf
  '1140028922' -- telefone
  ); 

/* editar dados de um usuário */
UPDATE tb_jornada_espacial_usuarios
SET 
cod_usuario=1
login= 'Victor', 
senha='java123', 
tipo='admin', 
nome_completo='Victor Hugo Martins Millan',
idade= 21,
sexo= 'Homem',
email= 'victorhugomartinsmillan@hotmail.com',
cpf= '2486871782',
telefone= '1140028922'
WHERE cod_usuario = 2;

/* apagar um usuário */
DELETE FROM tb_jornada_espacial_usuarios
WHERE cod_usuario = 2;





-- Tabela de Eventos
-- Limita as opções de resposta
CREATE TYPE categoria_evento AS ENUM ('jogos', 'geek/nerd','espaço','ciência','tecnologia' );
CREATE TYPE modalidade_evento AS ENUM ('presencial', 'distancia');

-- Cria a tabela
CREATE TABLE tb_jornada_espacial_eventos(
 -- Dados do evento
  cod_evento SERIAL PRIMARY KEY,
  nome_evento VARCHAR(200) NOT NULL,
  descrição TEXT,
  data_inscricao DATE NOT NULL,
  inicio_hora_data TIMESTAMP NOT NULL,
  fim_hora_data TIMESTAMP NOT NULL,
  modalidade modalidade_evento NOT NULL,
  categoria categoria_evento,
  autor VARCHAR(200) NOT NULL
);

/* Mostrar a tabela */
SELECT * FROM tb_jornada_espacial_eventos;

/* cadastrar um evento */
INSERT INTO tb_jornada_espacial_eventos 
(
  nome_evento, 
  descrição, 
  data_inscricao, 
  inicio_hora_data, 
  fim_hora_data,
  modalidade,
  categoria,
  autor
)
VALUES 
(
  'EXPOMAFE', -- Nome do evento
  'A EXPOMAFE É UMA PARCEIRA ESTRATÉGICA PARA O SEU NEGÓCIO E POSSUI UMA VARIEDADE DE SOLUÇÕES DIGITAIS', -- Descrição do evento
  '2024-05-20', -- Data limite para inscrição no evento
  '2024-05-21 10:00:00', -- Data e hora de início do evento
  '2024-05-21 18:00:00', -- Data e hora de término do evento
  'presencial', -- Modalidade do evento
  'tecnologia', -- Categoria do evento
  'Informa Markets.' -- Autor ou organizador do evento
);

/* editar dados de um evento */
UPDATE tb_jornada_espacial_eventos
SET nome_evento="Expomafe"
WHERE cod_evento = 1;

/* apagar um evento */
DELETE FROM tb_jornada_espacial_eventos
WHERE cod_evento = 1;

/* Apagar tabela */
DROP TABLE IF EXISTS tb_jornada_espacial_usuarios;
