alter table OMIKUJI add constraint OMIKUJI_FK1 foreign key (unsei_code) references MST_UNSEI (unsei_code);
