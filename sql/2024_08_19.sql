select * from emp;

select ename, job, dname, sal, grade from emp, dept, salgrade where emp.deptno = dept.deptno and sal between losal and hisal;

select ename, hiredate from emp where (select hiredate from emp where ename='SMITH') < hiredate;

select job, max(sal), min(sal), sum(sal), avg(sal) from emp group by job;

select job, count(job) from emp group by job;

select max(sal)-min(sal) from emp;

select count(distinct(mgr)) as "Number of Manager" from emp;