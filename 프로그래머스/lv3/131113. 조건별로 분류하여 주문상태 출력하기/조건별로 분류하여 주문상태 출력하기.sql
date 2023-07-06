SELECT order_id, product_id, to_char(out_date,'YYYY-MM-DD') as out_date, 
        CASE WHEN TO_CHAR(OUT_DATE,'YYYYMMDD') <=20220501 THEN '출고완료'
             WHEN TO_CHAR(OUT_DATE,'YYYYMMDD') >20220501 THEN '출고대기'
             ELSE '출고미정' END AS "출고여부"
FROM food_order
order by order_id;