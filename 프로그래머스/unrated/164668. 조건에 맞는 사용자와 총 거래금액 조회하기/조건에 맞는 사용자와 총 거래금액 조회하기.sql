-- 코드를 입력하세요
SELECT b.user_id, b.nickname,sum(a.price) as total_sales
from  USED_GOODS_BOARD a, USED_GOODS_USER b
where 1=1 
    and a.STATUS = 'DONE'
    and a.WRITER_ID = b.user_id
group by b.user_id,b.nickname
having sum(a.price) >=700000
order by 3;