create table member_info(
    custno number(6) primary key,
    custname varchar2(20),
    phone varchar2(13),
    address varchar2(100),
    joindate date default sysdate,
    grade char(1),
    city char(2)
);

select * from member_info;
select to_char(joindate, 'YYYY.MM.DD') joindate from member_info;
select custno, custname, phone, address, to_char(joindate, 'YYYY.MM.DD') joindate, grade, city from member_info;
update member_info set custname = '���ູ', phone = '010-1111-2222', address = '���� ���빮�� �ְ�1��', grade = 'A', city = '01' where custno = 100001;
select m.custno, i.custname, i.grade, sum(m.price) from member_info i, member_money m where i.custno = m.custno group by m.custno;
select m.custno, custname, grade, sum(price) as price from member_info i, member_money m where i.custno = m.custno group by m.custno, custname, grade order by price desc;
--delete member_info;

--create sequence custno_seq start with 100001;
--drop sequence custno_seq;

--insert into member_info (custno, custname, phone, address, joindate, grade, city) values (1, '���찳', '000-0000-0000', '����� ���쵿 �����', '2015/12/02', 'C', '10'); --������ ������
--insert into member_info (custno, custname, phone, address, joindate, grade, city) values (custno_seq.nextval, '���ູ', '010-1111-2222', '���� ���빮�� �ְ�1��', '2015/12/02', 'A', '01');
--insert into member_info (custno, custname, phone, address, joindate, grade, city) values (custno_seq.nextval, '���ູ', '010-1111-3333', '���� ���빮�� �ְ�2��', '2015/12/06', 'B', '01');
--insert into member_info (custno, custname, phone, address, joindate, grade, city) values (custno_seq.nextval, '�����', '010-1111-4444', '��⵵ �����ֽ� �ݰ', '2015/12/02', 'B', '02');
--insert into member_info (custno, custname, phone, address, joindate, grade, city) values (custno_seq.nextval, '�ֻ��', '010-1111-5555', '��û�ϵ� ��õ�� ����', '2015/12/02', 'A', '05');
--insert into member_info (custno, custname, phone, address, joindate, grade, city) values (custno_seq.nextval, '����ȭ', '010-1111-6666', '������ ������ �����', '2015/12/02', 'B', '04');
--insert into member_info (custno, custname, phone, address, joindate, grade, city) values (custno_seq.nextval, '������', '010-1111-7777', '��󳲵� �о�� Ȱ����', '2015/12/02', 'C', '10');

create table member_money(
    saleno number(8) primary key,
    custno number(6),
    pcost number(8),
    amount number(4),
    price number(8),
    pcode varchar2(6),
    sdate date default sysdate,
    foreign key(custno) references member_info (custno)
);

select * from member_money;
--drop table member_money;

insert into member_money (saleno, custno, pcost, amount, price, pcode, sdate) values (20160001, 100001, 500, 5, 2500, 'A001', '2016/01/01');
insert into member_money (saleno, custno, pcost, amount, price, pcode, sdate) values (20160002, 100001, 1000, 4, 4000, 'A002', '2016/01/01');
insert into member_money (saleno, custno, pcost, amount, price, pcode, sdate) values (20160003, 100001, 500, 3, 1500, 'A008', '2016/01/01');
insert into member_money (saleno, custno, pcost, amount, price, pcode, sdate) values (20160004, 100002, 2000, 1, 2000, 'A004', '2016/01/02');
insert into member_money (saleno, custno, pcost, amount, price, pcode, sdate) values (20160005, 100002, 500, 1, 500, 'A001', '2016/01/03');
insert into member_money (saleno, custno, pcost, amount, price, pcode, sdate) values (20160006, 100003, 1500, 2, 3000, 'A003', '2016/01/03');
insert into member_money (saleno, custno, pcost, amount, price, pcode, sdate) values (20160007, 100004, 500, 2, 1000, 'A001', '2016/01/04');
insert into member_money (saleno, custno, pcost, amount, price, pcode, sdate) values (20160008, 100004, 300, 1, 300, 'A005', '2016/01/04');
insert into member_money (saleno, custno, pcost, amount, price, pcode, sdate) values (20160009, 100004, 600, 1, 600, 'A006', '2016/01/04');
insert into member_money (saleno, custno, pcost, amount, price, pcode, sdate) values (20160010, 100004, 3000, 1, 3000, 'A007', '2016/01/06');

commit;