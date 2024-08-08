select * from emp;

select deptno, decode(deptno, 10, 'A', 20, 'B', 'default') 부서이름 from emp;
select ename, deptno, decode(deptno, 10, 'ACCOUNTING', 20, 'RESEARCH', 30, 'SALES') DNAME from emp;

select ename, deptno, case when deptno = 10 then 'ACCOUNTING' when deptno = 20 then 'RESEARCH' when deptno = 30 then 'SALES' when deptno = 40 then 'OPERATIONS' end 부서이름 from emp;

select sum(sal) from emp;
select sum(comm) from emp;

select sum(sal), avg(sal), max(sal), min(sal) from emp;

select count(*) from emp;
select count(comm) from emp;

select count(distinct job) from emp;

select deptno, avg(sal) from emp group by deptno;

select deptno, max(sal) from emp group by deptno;

select deptno, sum(sal), round(avg(sal),2) from emp group by deptno;

select deptno, max(sal), min(sal) from emp group by deptno;

select deptno, count(*), count(comm) from emp group by deptno;

select deptno, avg(sal) from emp group by deptno having avg(sal) >= 2000;

select deptno, max(sal), min(sal) from emp group by deptno having max(sal) >= 2900;

select ename, sal, job from emp where sal > (select sal from emp where ename = 'CLARK');