select * from emp;

select * from emp where sal >= (select avg(sal) from emp);
select empno, ename, sal from emp where sal >= (select avg(sal) from emp) order by sal desc;

select ename, loc from emp, dept where emp.deptno = dept.deptno and ename = 'SMITH';
select * from dept where deptno = (select deptno from emp where ename='SMITH');

select * from emp where sal >= (select sal from emp where ename='SMITH');

select deptno from emp where sal >= 3000;
select * from emp where deptno = 20 or deptno = 10;
select * from emp where deptno in(20,10);
select *from emp where deptno in (select deptno from emp where sal>=3000);

select ename,hiredate from emp where hiredate>(select hiredate from emp where ename='SMITH');

select ename,hiredate from emp where deptno=(select deptno from emp where ename='SMITH')and ename != 'SMITH';

select *from emp where ename like '%T%';
select *from emp where deptno in(20,30);
select empno, ename from emp where deptno in (select deptno from emp where ename like '%T%');


create table emp01(
    empno number(4),
    ename varchar2(20),
    sal number(7,2)
);
alter table emp01 add (job varchar2(9));
alter table emp01 modify (job varchar(30));

alter table emp01 drop column job;

desc emp01;

commit;

drop table emp01;

create table emp02 as select * from emp;
select * from emp02;
desc emp02;

create table emp03 as select empno, ename from emp;
desc emp03;