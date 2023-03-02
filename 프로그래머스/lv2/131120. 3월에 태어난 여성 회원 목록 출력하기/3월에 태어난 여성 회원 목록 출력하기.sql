-- 코드를 입력하세요
SELECT member_id, member_name, gender,DATE_FORMAT(DATE_OF_BIRTH,'%Y-%m-%d') as DATE_OF_BIRTH
from MEMBER_PROFILE
where TLNO is not null and month(DATE_OF_BIRTH)=3 and gender="W"
order by member_id;