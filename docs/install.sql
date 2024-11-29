
create table ruolo (
id int(11) not null  primary key 
, ruolo varchar(20) not null 
)engine=innodb;

insert into ruolo(id,ruolo) values (1,'Cliente');
insert into ruolo(id,ruolo) values (2,'Staff');


create table utente (
id int(11) not null auto_increment primary key 
, ruolo_id int(11) not null 
, nome varchar(20) not null 
, cognome varchar(30) not null 
, email varchar(70) not null 
, password varchar(70) not null 
, indirizzo_spedizione varchar(255)
, foreign key (ruolo_id) references ruolo(id)
)engine=innodb;


create table prodotto (
id int(11) not null auto_increment primary key
,nome varchar(20) not null 
,prezzo decimal(11,2) not null 
)engine=innodb;

create table stato_ordine (
id int(11) not null  primary key
,stato varchar(20) not null 
)engine=innodb;

insert into stato_ordine(id,stato) values (1,'Inviato');
insert into stato_ordine(id,stato) values (2,'In lavorazione');
insert into stato_ordine(id,stato) values (3,'Spedito');
insert into stato_ordine(id,stato) values (4,'Archiviato');



create table ordine (
id int(11) not null auto_increment primary key
,data_creazione timestamp not null
,data_ultima_modifica timestamp not null
,stato_ordine_id  int(11) not null 
,utente_id  int(11) not null 
,totale_da_pagare decimal(11,2) not null 
, foreign key (stato_ordine_id) references stato_ordine(id)
, foreign key (utente_id) references utente(id)
)engine=innodb;

create table riga_ordine (
id int(11) not null auto_increment primary key
,prodotto_id  int(11) not null 
,quantita  int(5) not null 
,prezzo decimal(11,2) not null 
,foreign key (prodotto_id) references prodotto(id)
)engine=innodb;

