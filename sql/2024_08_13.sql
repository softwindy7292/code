create table emp02 as select * from emp;
drop table emp02;
select * from emp02;

truncate table emp02;

rename emp02 to test;

select * from test;

desc user_tables;

select * from user_tables;

select table_name from user_tables;

create table dept02 as select * from dept;
select * from dept02;

truncate table dept02;

insert into dept02(deptno, dname, loc) values(10,'ACCOUNTING','NEW YORK');
insert into dept02(deptno, dname, loc) values(20,'RESEARCH','DALLAS');
insert into dept02 values(30,'SALES','ACAVA');

desc dept02;

create table emp01 as select * from emp;
select * from emp01;
drop table emp01;

update emp01 set deptno = 30;
update emp01 set sal = sal*1.5;
update emp01 set hiredate = sysdate;
update emp01 set deptno = 40 where deptno = 10;
update emp01 set sal = sal*1.1 where job = 'MANAGER';
update emp01 set hiredate = sysdate where substr(hiredate,1,2) = 82;
update emp01 set hiredate = sysdate, sal = 50, comm = 4000 where ename='SMITH';

drop table dept01;
create table dept01 as select * from dept;
select * from dept01;

delete from dept01;
rollback;

delete from dept01 where deptno = 10;
delete from emp01 where deptno = (select deptno from dept where dname = 'SALES');

select distinct job from emp;