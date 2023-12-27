create table MST_UNSEI (
    unsei_code varchar(255) not null,
    created_date date,
    AUTHOR varchar(255),
    update_date date,
    CHANGER varchar(255),
    unsei_name varchar(255),
    constraint MST_UNSEI_PK primary key(unsei_code)
);
