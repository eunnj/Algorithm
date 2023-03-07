-- 코드를 입력하세요
SELECT a.FLAVOR
FROM FIRST_HALF a, ICECREAM_INFO b
WHERE a.FLAVOR = b.FLAVOR and b.INGREDIENT_TYPE='fruit_based' and a.TOTAL_ORDER>3000
ORDER BY TOTAL_ORDER desc;