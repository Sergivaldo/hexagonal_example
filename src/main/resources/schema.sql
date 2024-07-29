create table tb_user (
    id serial primary key,
    name varchar(30) not null,
    email varchar(100) not null unique
);