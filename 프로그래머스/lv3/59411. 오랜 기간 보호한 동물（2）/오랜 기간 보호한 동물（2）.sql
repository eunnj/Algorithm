-- 코드를 입력하세요
SELECT *
    FROM (
        SELECT a.animal_id, a.name
        FROM animal_ins a, animal_outs b
        WHERE a.animal_id = b.animal_id
        ORDER BY b.datetime - a.datetime DESC
    ) 
    WHERE ROWNUM < 3
