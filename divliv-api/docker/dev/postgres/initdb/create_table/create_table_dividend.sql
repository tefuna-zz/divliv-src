-- 配当
DROP TABLE if exists pfm.dividend CASCADE;

CREATE TABLE pfm.dividend (
  dividend_id serial NOT NULL
  , stock_id numeric(10) NOT NULL
  , receipt_date date NOT NULL
  , amount numeric(15) NOT NULL
  , amount_local numeric(15, 6) NOT NULL
  , currency_code character(3) NOT NULL
  , created_at timestamp NOT NULL
  , created_by character varying NOT NULL
  , updated_at timestamp NOT NULL
  , updated_by character varying NOT NULL
  , CONSTRAINT dividend_PKC PRIMARY KEY (dividend_id)
) ;
