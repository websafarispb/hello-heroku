DROP TABLE IF EXISTS cats CASCADE;

CREATE TABLE cats(
	id serial PRIMARY KEY,
	name varchar(15) NOT NULL
);