DROP TABLE if exists pfm.stock CASCADE;

CREATE TABLE pfm.stock (
  stock_id serial NOT NULL
  , ticker character varying(4) NOT NULL
  , country character(2) NOT NULL
  , name character varying(255) NOT NULL
  , formal_name character varying(255)
  , sector character varying(64)
  , created_at timestamp NOT NULL
  , created_by character varying NOT NULL
  , updated_at timestamp NOT NULL
  , updated_by character varying NOT NULL
  , CONSTRAINT stock_PKC PRIMARY KEY (stock_id)
) ;