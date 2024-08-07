select * from emp;

select * from emp where ename like 'F%';
select * from emp where ename like '%A%';
select * from emp where ename like '%N';

select * from emp where ename like '_A%';

select * from emp where ename not like '%A%';

select * from emp where comm is null;
select * from emp where comm is not null;

select * from emp order by sal asc;
select * from emp order by sal desc;

select * from emp order by hiredate desc;

select * from emp where deptno=20 order by sal;
select * from emp order by ename;

select * from emp where comm is not null order by comm;

select distinct deptno from emp;
select distinct job from emp;

select ename 사원이름 from emp;
select ename "employee name" from emp;

select ename, sal, (sal + (sal * 0.1)) 보너스 from emp;

select 25 * 32 from dual;
select sysdate from dual;

select -10, abs(-10) from dual;

select 34.9872, round(34.9872) from dual;
select round(34.2872), round(34.2872,1), round(34.2872,2), round(34.2872,3) from dual;

select 34.9872, floor(34.9872) from dual;

select mod(27,2), mod(124,9) from dual;

select upper('abcd') from dual;
select lower('ABCD') from dual;

select initcap('abcd') from dual;
select initcap('ABCD') from dual;

select length('oracle'), length('오라클') from dual;

select substr('안녕하세요', 1, 2) from dual;

select ename, substr(hiredate, 1, 2) as "년도", substr(hiredate, 4, 2) as "달" from emp;