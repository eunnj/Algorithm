-- 코드를 입력하세요
SELECT a.animal_id,a.animal_type,a.name
from animal_ins a, animal_outs b
where 1=1
    and a.animal_id = b.animal_id
    and a.SEX_UPON_INTAKE like '%Intact%'
    and (b.SEX_UPON_OUTCOME like '%Spayed%' or b.SEX_UPON_OUTCOME like '%Neutered%')
order by 1
;