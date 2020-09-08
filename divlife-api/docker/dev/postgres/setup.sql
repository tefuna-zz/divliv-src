-- create user
create role pfm with login password 'pfm';

-- 

-- create database
create database pfmdb
    owner='pfm'
    encoding='UTF8'
    lc_collate='Japanese_Japan.932'
    Lc_ctype='Japanese_Japan.932'
;

-- create schema by role: pfm
create schema pfm;
