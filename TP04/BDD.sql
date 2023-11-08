create database aulajava;

use aulajava;

create table tbcargos(
  cd_cargo smallint primary key auto_increment,
  ds_cargo varchar(20)
);

create table tbfuncs(
  cod_func smallint primary key auto_increment,
  nome_func varchar(30),
  sal_func decimal(8,2),
  cod_cargo smallint not null,
  foreign key(cod_cargo) references tbcargos(cd_cargo)
);

insert into tbcargos (ds_cargo) values
  ('Analista'),
  ('Programador'),
  ('DBA'),
  ('Gerente'),
  ('Ag. Administrativo');
  
select * from tbcargos;
  
insert into tbfuncs (nome_func, sal_func, cod_cargo) values
  ('Aline Martins', 5656.01, 1),
  ('Tomás Lima', 5656.01, 1),
  ('Vitor Oliveira', 4170.99, 2),
  ('Breno Cunha', 4170.99, 2),
  ('Larissa Almeida', 6695.43, 3),
  ('Matheus Barbosa', 6695.43, 3),
  ('Livia Cardoso', 11200.79, 4),
  ('Luana Goncalves', 11200.79, 4),
  ('Tânia Araujo', 1601.00, 5),
  ('Felipe Sousa', 1601.00, 5);
  
select * from tbfuncs;