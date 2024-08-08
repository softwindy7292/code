select * from emp;

select ename, substr(hiredate, 1, 2) as "년도", substr(hiredate, 4, 2) as "달" from emp;

select ename, substr(hiredate, 1, 2) as "년도", substr(hiredate, 4, 2) as "달", substr(hiredate, 7, 2) as "날짜" from emp;

select * from emp where substr(hiredate, 4, 2) = '09';

select ltrim('            안녕하세요            ') from dual;
select rtrim('            안녕하세요            ') from dual;
select trim('            안녕하세요            ') from dual;

select sysdate from dual;
select sysdate-1 어제, sysdate 오늘, sysdate+1 내일 from dual;

select ename, hiredate, round(months_between(sysdate, hiredate)) 근무개월수 from emp;

select ename, hiredate, add_months(hiredate, 4) from emp;

select sysdate, next_day(sysdate, '금요일') from dual;

select hiredate, last_day(hiredate) from emp;
select sysdate, last_day(sysdate) from dual;
select '22/02/01', last_day('22/02/01') from dual;

select sysdate, to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS') from dual;
select hiredate, to_char(hiredate, 'YYYY/MM/DD day') from emp;

select ename, to_char(sal, 'L999,999') as salary from emp;

select ename, hiredate from emp where hiredate = to_date(19810220, 'YYYYMMDD');

select round(sysdate-to_date('2016/01/01', 'YYYY/MM/DD')) from dual;

select to_number('20,000', '99,999')-to_number('10,000', '99,999') from dual;

select ename, sal, comm, sal * 12 + comm 연봉, sal * 12 + nvl(comm, 0) 연봉2 from emp;

select * from emp where sal > 2000 and sal < 5000;
select * from emp where sal between 2000 and 5000;

select * from emp where hiredate >= '82/01/01' and hiredate <= '82/12/31';
select * from emp where hiredate between '82/01/01' and '82/12/31';

select ename, job, hiredate from emp where hiredate between '81/02/20' and '81/05/01';

select * from emp where sal in(800, 1600, 950);

select ename from emp where deptno in(10, 20, 30);

select ename, deptno from emp where deptno in(10, 30) order by ename;