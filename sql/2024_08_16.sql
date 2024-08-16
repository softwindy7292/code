select * from emp;

create table emp05(
    empno number(4) primary key,
    ename varchar2(10) not null,
    job varchar2(9),
    deptno number(2)
);

desc emp05;

create table emp06(
    empno number(4) constraint emp06_empno_pk primary key,
    ename varchar2(10) not null,
    job varchar2(9),
    deptno number(2)
);

desc emp06;

drop table emp07;

create table emp07(
    empno number(4) primary key,
    ename varchar2(10) not null,
    job varchar2(9),
    deptno number(2) constraint emp07_deptno_fk references dept(deptno)
);

desc emp07;

insert into emp07(empno, ename, deptno) values (8000,'홍길동',null);
insert into emp07(empno, ename, deptno) values (8001,'홍길동',40);
insert into emp07(empno, ename, deptno) values (8002,'홍길동',10);

select * from emp07;

--시스템에서만 실행 가능
create user scott2 identified by tiger;

select ename, deptno from emp where empno=7566;
select ename, sal from emp where sal not between 1500 and 2850;
select ename, job, hiredate from emp where hiredate between '81/02/20' and '81/05/01' order by hiredate;
select ename, deptno from emp where deptno in(10, 30) order by ename;
select ename, job from emp where mgr is null;
select ename from emp where ename like '%L%L%' and deptno=30;
select ename, job, sal from emp where job in('CLERK', 'ANALYST') and sal not in(1000, 3000, 5000);
select ename, nvl(to_char(comm),'no commission') from emp;