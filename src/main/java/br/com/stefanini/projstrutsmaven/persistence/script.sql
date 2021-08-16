create database bancoprova;

use bancoprova;

create table usuario(
	idUsuario int primary key auto_increment, 
	nome varchar(50),
	email varchar(100) unique,
	senha varchar(150),
	perfil varchar (10)
);

create table prova(
	idProva int primary key auto_increment,
	materia varchar(50)
);

create table questao(
	idQuestao int primary key auto_increment,
	pergunta varchar(255),
	alternativaA varchar(255),
	alternativaB varchar(255),
	alternativaC varchar(255),
	alternativaD varchar(255),
	resposta varchar(255),
	id_prova int,
	foreign key  (Id_prova) references prova(idProva)
);
