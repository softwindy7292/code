select * from emp;
select * from dept;
select * from salgrade;

select * from emp, dept;

select * from emp, dept where emp.deptno = dept.deptno;

select ename, dname from emp,dept where emp.deptno = dept.deptno and emp.ename = 'CLARK';
select ename, dname, loc from emp,dept where emp.deptno = dept.deptno and emp.ename = 'CLARK';
select ename, loc, sal from emp,dept where emp.deptno = dept.deptno and emp.deptno = 10;

select ename, sal, grade from emp, salgrade where emp.sal >salgrade.losal and emp.sal < salgrade.hisal;
select ename, sal, grade from emp, salgrade where emp.sal between salgrade.losal and salgrade.hisal;

select e.ename, e.mgr, m.empno, m.ename from emp e, emp m where e.mgr = m.empno;
select e.ename||'의 매니저는 '||m.ename||'입니다' from emp e, emp m where e.mgr=m.empno;

select ename, dname, loc from emp,dept where emp.deptno = dept.deptno and emp.comm is not null;

select ename, job, emp.deptno, dname from emp,dept where emp.deptno = dept.deptno and loc = 'DALLAS';

select ename, job, dname, sal, grade from emp, dept, salgrade where emp.deptno = dept.deptno and emp.sal between salgrade.losal and salgrade.hisal;