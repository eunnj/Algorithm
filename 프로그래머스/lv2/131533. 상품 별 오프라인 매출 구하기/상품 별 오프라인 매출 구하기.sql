-- 코드를 입력하세요
SELECT a.PRODUCT_CODE,sum(b.SALES_AMOUNT)*a.price as sales
from PRODUCT a, OFFLINE_SALE b
where a.product_id = b.PRODUCT_ID
group by a.product_id
order by 2 desc,1 asc;