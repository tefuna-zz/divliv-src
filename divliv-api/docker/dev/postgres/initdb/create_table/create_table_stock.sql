-- 銘柄
DROP TABLE if exists pfm.stock CASCADE;

CREATE TABLE pfm.stock (
  stock_id serial NOT NULL,
  ticker character varying(4) NOT NULL,
  isin_code character(12),
  country character(2) NOT NULL,
  stock_name character varying(255) NOT NULL,
  stock_formal_name character varying(255),
  sector character varying(64),
  created_at timestamp NOT NULL,
  created_by character varying(20) NOT NULL,
  updated_at timestamp NOT NULL,
  updated_by character varying(20) NOT NULL,
  CONSTRAINT stock_PKC PRIMARY KEY (stock_id)
);

CREATE UNIQUE INDEX stock_IX1 ON pfm.stock(ticker, country);