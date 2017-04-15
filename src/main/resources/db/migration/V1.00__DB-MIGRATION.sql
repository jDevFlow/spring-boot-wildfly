/*
* DB MIGRATION
* @author robsonapsilva
*/

--create sequence person
CREATE SEQUENCE public.person_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 1;

ALTER SEQUENCE public.person_seq
    OWNER TO postgres;
    
--create table person
CREATE TABLE public.person
(
    id bigint NOT NULL,
    email character varying(100) COLLATE pg_catalog."default" NOT NULL,
    full_name character varying(100) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT person_pkey PRIMARY KEY (id),
    CONSTRAINT uk_fwmwi44u55bo4rvwsv0cln012 UNIQUE (email)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.person
    OWNER to postgres;