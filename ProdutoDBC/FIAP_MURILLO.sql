-- Locadora

-- 1 Marca pode ter n modelos 

-- Sequence (ou sequencia)
--Contadores automatico
Create sequence seq_marca;
create sequence seq_modelo;

create table marca (
    id_marca int primary key,
    ds_marca varchar(100) not null
    
);