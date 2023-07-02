-- 코드를 입력하세요
SELECT i.animal_id, i.animal_type, o.name
from animal_ins i , animal_outs o
where 1=1
    and i.animal_id = o.animal_id
    and i.SEX_UPON_INTAKE != o.SEX_UPON_OUTCOME
;