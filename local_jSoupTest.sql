DESC DaeguOnlineSeller;

select distinct(취급품목) from DaeguOnlineSeller;

select 상호, 인터넷도메인, 대표자명, 전자우편, 신고일자, 도로명소재지 from DaeguOnlineSeller where 취급품목 = '의류/패션/잡화/뷰티';

select count(*) from DaeguOnlineSeller where 취급품목 = '의류/패션/잡화/뷰티';

select * from DaeguOnlineSeller;

select 
    상호, 
    인터넷도메인, 
    대표자명, 
    전자우편, 
    신고일자, 
    도로명소재지 
from DaeguOnlineSeller 
where 
    취급품목 = '의류/패션/잡화/뷰티' 
    and 인터넷도메인 not like '%오픈마켓%'
    and 인터넷도메인 not like '%네이버%'
    and 인터넷도메인 not like '%naver%';

select count(*) 
from DaeguOnlineSeller
where 
    취급품목 = '의류/패션/잡화/뷰티' 
    and 인터넷도메인 not like '%오픈마켓%'
    and 인터넷도메인 not like '%네이버%'
    and 인터넷도메인 not like '%naver%';