create table OMIKUJI (
    omikuji_code varchar(255) not null,
    created_date date,
    AUTHOR varchar(255),
    update_date date,
    CHANGER varchar(255),
    GAKUMON varchar(255),
    AKINAI varchar(255),
    NEGAIGOTO varchar(255),
    unsei_code varchar(255),
    constraint OMIKUJI_PK primary key(omikuji_code)
);
