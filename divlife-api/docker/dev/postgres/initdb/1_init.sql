-- role
DROP ROLE IF EXISTS pfm;
CREATE ROLE pfm WITH
    NOSUPERUSER NOCREATEDB NOCREATEROLE NOINHERIT LOGIN NOREPLICATION
    PASSWORD 'pfm';

-- database
DROP DATABASE IF EXISTS pfmdb;
CREATE DATABASE pfmdb WITH
    OWNER='pfm'
    ENCODING='UTF8'
    LC_COLLATE='ja_JP.utf8'
    LC_CTYPE='ja_JP.utf8';


\c pfmdb;

-- schema
DROP SCHEMA IF EXISTS pfm CASCADE;
CREATE SCHEMA pfm;
GRANT USAGE ON SCHEMA pfm TO pfm;
REVOKE ALL ON DATABASE pfmdb FROM public;
