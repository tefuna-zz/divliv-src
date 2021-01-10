-- 配当
DROP TABLE if exists pfm.dividend CASCADE;

CREATE TABLE pfm.dividend (
  div_id serial NOT NULL,
  stock_id numeric(10) NOT NULL,
  div_receipt_date date NOT NULL,
  div_amount numeric(15) NOT NULL,
  div_amount_local numeric(15, 6) NOT NULL,
  currency_code character(3) NOT NULL,
  created_at timestamp NOT NULL,
  created_by character varying(20) NOT NULL,
  updated_at timestamp NOT NULL,
  updated_by character varying(20) NOT NULL,
  CONSTRAINT dividend_PKC PRIMARY KEY (div_id)
);
