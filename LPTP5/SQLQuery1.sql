create database Cadastro
go
USE Cadastro

create table Cliente(
     nome varchar(20) not null,
	 peso decimal(3,2) not null,
	 idade int(3) not null,
	 altura decimal (2,2) not null,
	 objetivo varchar(50) not null,