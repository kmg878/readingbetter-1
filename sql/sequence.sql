-- sequence
DROP SEQUENCE seq_attend;

CREATE SEQUENCE seq_attend
START WITH 1
INCREMENT BY 1;

DROP SEQUENCE seq_member;

CREATE SEQUENCE seq_member
START WITH 1
INCREMENT BY 1;

DROP SEQUENCE seq_tobook;

CREATE SEQUENCE seq_tobook
START WITH 1
INCREMENT BY 1;

DROP SEQUENCE seq_days;

CREATE SEQUENCE seq_days
START WITH 1
INCREMENT BY 1;

commit;

select * from member;
select * from school;
insert into school values(0, '기타');