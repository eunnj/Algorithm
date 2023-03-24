-- 코드를 입력하세요
SELECT A.FLAVOR
FROM FIRST_HALF A, JULY B
WHERE A.FLAVOR = B.FLAVOR
GROUP BY A.SHIPMENT_ID
ORDER BY SUM(A.TOTAL_ORDER)+SUM(B.TOTAL_ORDER) DESC
LIMIT 3;