-- FINANCE SERVICE 
-- xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx

-- dropping schema
drop schema if exists finance cascade;

-- creating schema and tables
create schema finance;

create table if not exists finance.expense (
	id serial primary key,
	title varchar(100) not null,
	value numeric(9,2) not null default 0.0,
	due_date date not null,
	paid boolean not null default false
);

-- security tables
create table if not exists finance.cms_user (
	id serial primary key,
	role varchar(100) not null,
	username varchar(100) not null unique,
	password varchar(100) not null,
	locked boolean not null default false
);

-- granting permissions
grant all privileges on schema finance to finance;

grant all privileges on all tables in schema finance to finance;

grant usage, select on all sequences in schema finance to finance;