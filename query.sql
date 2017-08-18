drop table if exists city;
create table city(
		id int not null auto_increment,
		name varchar(100) not null,
		primary key(id));

insert into city(id,name) values (1,'Ahmedabad');
insert into city(id,name) values (2,'Kolkata');
insert into city(id,name) values (3,'Visakhapatnam');
insert into city(id,name) values (4,'Punjab');
insert into city(id,name) values (5,'Delhi');
insert into city(id,name) values (6,'Banglore');
insert into city(id,name) values (7,'Hyderabad');
insert into city(id,name) values (8,'Mumbai');
insert into city(id,name) values (9,'Pune');
insert into city(id,name) values (10,'Chennai');
insert into city(id,name) values (11,'Rajkot');

drop table if exists team;
create table team(
		id int not null auto_increment,
		name varchar(100) not null,
		coach varchar(100) not null,
		home_city_id int not null,
		captain int null,
		primary key(id),
		foreign key(home_city_id)
		references city(id));
	
drop table if exists player;
create table player(
		id int not null auto_increment,
		name varchar(100) not null,
		country varchar(100) not null,
		team_id int not null,
		primary key(id),
		foreign key(team_id)
		references team(id));
	
create table user(id int not null auto_increment,name varchar(30),username varchar(30),password varchar(30),primary key(id));

insert into user(name,username,password) values('admin','admin','password');


