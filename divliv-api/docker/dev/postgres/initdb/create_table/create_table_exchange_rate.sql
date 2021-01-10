-- 為替レート
DROP TABLE if exists pfm.exchange_rate CASCADE;

CREATE TABLE pfm.exchange_rate (
    rate_id serial NOT NULL,
    base_date date NOT NULL,
    currency_code character(3) NOT NULL,
    rate numeric(15, 6) NOT NULL,
    created_at timestamp NOT NULL,
    created_by character varying(20) NOT NULL,
    updated_at timestamp NOT NULL,
    updated_by character varying(20) NOT NULL,
    CONSTRAINT exchange_rate_PKC PRIMARY KEY (rate_id)
);

CREATE UNIQUE INDEX exchange_rate_IX1 ON pfm.exchange_rate(base_date, currency_code);
