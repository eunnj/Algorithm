-- 코드를 입력하세요
SELECT MCDP_CD as "진료과코드", count(*) as "5월예약건수"
from APPOINTMENT
where year(APNT_YMD)='2022' and Month(APNT_YMD) = '05'
group by MCDP_CD
order by 2 asc, 1 asc;