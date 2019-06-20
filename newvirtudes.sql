create database virtudes;

CREATE TABLE `aluno` (
  `id_aluno` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) NOT NULL,
  `RG` varchar(15) NOT NULL,
  `telefone` varchar(15) DEFAULT NULL,
  `endereco` varchar(80) DEFAULT NULL,
  `dt_nascimento` varchar(16) DEFAULT NULL,
  PRIMARY KEY (`id_aluno`)
); 

CREATE TABLE `mensalidade` (
  `id_mensalidade` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `id_aluno` int(10) unsigned DEFAULT NULL,
  `mes` varchar(14) NOT NULL,
  `pendente` tinyint(1) DEFAULT NULL,
  `nome_aluno` varchar(45) NOT NULL,
  PRIMARY KEY (`id_mensalidade`)
); 

CREATE TABLE `presenca` (
  `id_registro` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `id_turma` int(10) unsigned NOT NULL,
  `nome_aluno` varchar(45) DEFAULT NULL,
  `dia` varchar (10) not null,
  `presenca` tinyint(1) unsigned DEFAULT NULL,
  PRIMARY KEY (`id_registro`)
);

CREATE TABLE TIPO_PRODUTO(
	ID SMALLINT UNSIGNED AUTO_INCREMENT PRIMARY KEY NOT NULL,
    NOME VARCHAR(27) UNIQUE NOT NULL
);

CREATE TABLE PRODUTO(
	ID INT UNSIGNED AUTO_INCREMENT PRIMARY KEY NOT NULL,
	NOME VARCHAR (24) UNIQUE NOT NULL,
    TIPO SMALLINT NOT NULL,
    QUANTIDADE INT UNSIGNED NOT NULL,
    COR VARCHAR (15),
    CONSTRAINT fk_tipoproduto
		FOREIGN KEY (TIPO) 
			REFERENCES TIPO_PRODUTO (ID)
);

CREATE TABLE `responsavel` (
  `id_responsavel` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) NOT NULL,
  `rg` varchar(15) DEFAULT NULL,
  `cpf` varchar(15) DEFAULT NULL,
  `telefone` varchar(15) DEFAULT NULL,
  `nome_aluno` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_responsavel`)
); 

CREATE TABLE `turma` (
  `id_turma` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `id_aluno` int(10) unsigned DEFAULT NULL,
  `id_produto` int(10) unsigned DEFAULT NULL,
  `nome_turma` varchar(20) NOT NULL,
  PRIMARY KEY (`id_turma`)
); 

CREATE TABLE `usuario` (
  `usuario` varchar(30) NOT NULL,
  `cpf` varchar(15) NOT NULL,
  `telefone` varchar(15) NOT NULL,
  `endereco` varchar(80) NOT NULL,
  `senha` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`cpf`)
); 
INSERT INTO `usuario` VALUES ('Douglas','11133377735','11992608080','estr','admin');