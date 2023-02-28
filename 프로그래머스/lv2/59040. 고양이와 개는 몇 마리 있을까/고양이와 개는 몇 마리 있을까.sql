-- 코드를 입력하세요
SELECT animal_type, count(*) as "count"
from ANIMAL_INS
where ANIMAL_TYPE like 'Cat' or ANIMAL_TYPE like 'Dog'
group by animal_type
order by animal_type;