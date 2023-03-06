-- 코드를 입력하세요
SELECT b.INGREDIENT_TYPE, sum(a.TOTAL_ORDER)
from FIRST_HALF a, ICECREAM_INFO b
where a.flavor = b.flavor
group by INGREDIENT_TYPE
order by TOTAL_ORDER;

