# CRUD Java

 - Projeto feito em java para gerenciar uma agenda de compromissos.
 - Conectado com um banco de dados MySQL.

 Util Banco:
 ```
 CREATE DATABASE Agenda;
 
 CREATE TABLE agendatb(
   id int not null auto_increment,
   compromisso varchar(255),
   descricao varchar(255),
   data timestamp,
   localizacao varchar(255)

   primary key(id)
 );
 ```