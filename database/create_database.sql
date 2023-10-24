-- removing current database
drop database if exists finance;

-- creating database and schemas
create database finance;

-- creating users
create user finance with password 'obiwan';

-- grant access
grant all privileges on database finance to finance;
