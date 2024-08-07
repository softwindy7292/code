show user;

select * from dept;
select * from emp;

select ename, job from emp;

select loc from dept;

select * from emp where sal >= 3000;

select * from emp where deptno != 20;
select * from emp where deptno <> 20;
select * from emp where deptno ^= 20;

select empno, ename, sal from emp where ename = 'KING';

desc emp;

select * from emp where hiredate >= '1982/01/01';
select * from emp where hiredate >= '1982.01.01';

select * from emp where deptno = 10 and job = 'MANAGER';

select * from emp where deptno = 10 or job = 'MANAGER';

select * from emp where deptno != 10;