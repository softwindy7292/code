create table mvc_board(
    bid number(4) primary key,
    bname varchar2(100),
    btitle varchar2(300),
    bcontent varchar2(1200),
    bdate date default sysdate,
    bhit number(4),
    bgroup number(4),
    bstep number(4),
    bindent number(4)
);

desc mvc_board;
create sequence mvc_board_seq;

select mvc_board_seq.currval from dual;

commit;

insert into mvc_board (bId, bName, bTitle, bContent, bHit, bGroup, bStep, bIndent) 
values (mvc_board_seq.nextval, 'test' , '테스트', '테스트', 0, mvc_board_seq.currval, 0, 0);

select * from mvc_board;

commit;

update mvc_board  set bname = '김선우', btitle = '에헤이', bcontent = '성공' where bid = 22;