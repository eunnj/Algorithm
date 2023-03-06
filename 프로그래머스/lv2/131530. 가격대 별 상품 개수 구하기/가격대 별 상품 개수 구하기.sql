-- 코드를 입력하세요
SELECT truncate(price,-4) as PRICE_GROUP, count(*) as products 
from PRODUCT
group by PRICE_GROUP
order by PRICE_GROUP;