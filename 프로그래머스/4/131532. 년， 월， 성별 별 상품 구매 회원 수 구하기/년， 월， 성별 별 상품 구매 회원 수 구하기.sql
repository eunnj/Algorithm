-- 코드를 입력하세요
SELECT EXTRACT(year from SALES_DATE) as year, EXTRACT(month from SALES_DATE) as month,gender, COUNT(DISTINCT a.USER_ID) as users
from USER_INFO a,ONLINE_SALE b
where a.user_id=b.user_id
and a.gender IS NOT NULL
group by 
    EXTRACT(YEAR FROM SALES_DATE), 
    EXTRACT(MONTH FROM SALES_DATE), 
    GENDER
order by 1,2,3;
