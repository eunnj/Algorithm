-- 코드를 입력하세요
SELECT i.rest_id, i.rest_name,i.food_type,i.favorites,i.address,r.score
from REST_INFO i 
join (select rest_id,round(avg(REVIEW_SCORE),2) as score from REST_REVIEW 
group by rest_id) r
on i.rest_id = r.rest_id 
where i.address like '서울%'
order by r.score desc, i.favorites desc;