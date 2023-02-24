-- 코드를 입력하세요
SELECT a.product_code, sum(a.price*b.sales_amount) as SALES
from product a
join offline_sale b on a.product_id = b.product_id
group by a.product_id
order by SALES desc, a.product_code;