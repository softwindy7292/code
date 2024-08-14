DROP TABLE DEPT01;
CREATE TABLE DEPT01 AS SELECT * FROM DEPT;

select * from dept01;

delete from dept01;
rollback;

commit;

create table students(
    id number(3) primary key,
    num varchar2(20),
    score number(3) not null,
    gender varchar2(10),
    constraint gender_check check (gender in('남','여')),
    constraint score_check check (score >= 70)
);
drop table students;

desc students;

insert into students values(100,'101',70,'남');
insert into students values(101,'520',100,'여');

commit;
select * from students;