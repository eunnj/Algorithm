-- 코드를 입력하세요
SELECT hour(datetime) as hour, count(*) as count
from ANIMAL_OUTS
group by hour
having hour > 8 and hour < 20
order by hour;