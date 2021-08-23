DROP TABLE IF EXISTS proyectos;
DROP table IF EXISTS cientificos;
DROP table IF EXISTS asignado_a;


CREATE TABLE `cientificos` (
  `DNI` long NOT NULL,
  `nomApels` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`DNI`)
);

CREATE TABLE `proyectos` (
  `id` char(4) NOT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `horas` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

insert into cientificos (DNI, nombre)values('12345678Q','Jhon');
insert into cientificos (DNI, nombre)values('23456789J','Kevin');
insert into cientificos (DNI, nombre)values('34567891U','Pedro');
insert into cientificos (DNI, nombre)values('45678912Y','Richi');
insert into cientificos (DNI, nombre)values('56789012S','Sofia');

insert into proyectos (id, nombre, horas) values ('GEOX', 'Proy1',100);
insert into proyectos (id, nombre, horas) values ('TEOX', 'Proy2',140);
insert into proyectos (id, nombre, horas) values ('NEOX', 'Proy3',130);
insert into proyectos (id, nombre, horas) values ('YEOX', 'Proy4',106);
insert into proyectos (id, nombre, horas) values ('SEOX', 'Proy5',200);

CREATE TABLE `asignado_a` (
`cien_DNI` long,
`proy_id` char(4),
PRIMARY KEY (`cien_DNI`, `proy_id`),
FOREIGN KEY (`cien_DNI`) REFERENCES cientificos(`DNI`) ON DELETE CASCADE ON UPDATE CASCADE,
FOREIGN KEY (`proy_id`) REFERENCES proyectos(`id`) ON DELETE CASCADE ON UPDATE CASCADE
);

insert into asignado_a (cien_DNI, proy_id) values ('45678912Y', 'SEOX');
insert into asignado_a (cien_DNI, proy_id) values ('56789012S', 'SEOX');
insert into asignado_a (cien_DNI, proy_id) values ('34567891U', 'YEOX');
insert into asignado_a (cien_DNI, proy_id) values ('23456789J', 'TEOX');



