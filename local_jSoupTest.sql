DESC DaeguOnlineSeller;

select distinct(���ǰ��) from DaeguOnlineSeller;

select ��ȣ, ���ͳݵ�����, ��ǥ�ڸ�, ���ڿ���, �Ű�����, ���θ������ from DaeguOnlineSeller where ���ǰ�� = '�Ƿ�/�м�/��ȭ/��Ƽ';

select count(*) from DaeguOnlineSeller where ���ǰ�� = '�Ƿ�/�м�/��ȭ/��Ƽ';

select * from DaeguOnlineSeller;

select 
    ��ȣ, 
    ���ͳݵ�����, 
    ��ǥ�ڸ�, 
    ���ڿ���, 
    �Ű�����, 
    ���θ������ 
from DaeguOnlineSeller 
where 
    ���ǰ�� = '�Ƿ�/�м�/��ȭ/��Ƽ' 
    and ���ͳݵ����� not like '%���¸���%'
    and ���ͳݵ����� not like '%���̹�%'
    and ���ͳݵ����� not like '%naver%';

select count(*) 
from DaeguOnlineSeller
where 
    ���ǰ�� = '�Ƿ�/�м�/��ȭ/��Ƽ' 
    and ���ͳݵ����� not like '%���¸���%'
    and ���ͳݵ����� not like '%���̹�%'
    and ���ͳݵ����� not like '%naver%';