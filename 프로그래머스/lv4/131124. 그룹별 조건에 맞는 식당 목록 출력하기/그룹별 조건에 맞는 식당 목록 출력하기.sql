-- 코드를 입력하세요

select a.MEMBER_NAME,b.REVIEW_TEXT, DATE_FORMAT(b.REVIEW_DATE, '%Y-%m-%d') AS REVIEW_DATE
from MEMBER_PROFILE a,REST_REVIEW b
where 1=1
    and a.MEMBER_ID=b.MEMBER_ID
    and a.member_id in (
        SELECT member_id
        FROM (
            SELECT member_id, COUNT(member_id) as count_member_id
            FROM REST_REVIEW
            GROUP BY member_id
            order by count_member_id desc
            limit 1
        ) AS subquery
    )
order by 3,2
;