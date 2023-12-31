-- 코드를 입력하세요
WITH TBL AS(
    SELECT CAR_ID
    FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
    WHERE YEAR(START_DATE) = 2022 AND MONTH(START_DATE) BETWEEN 8 AND 10
    GROUP BY 1
    HAVING COUNT(HISTORY_ID) >= 5
)
SELECT MONTH(START_DATE) MONTH, CAR_ID, COUNT(CAR_ID) RECORDS
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
WHERE YEAR(START_DATE) = 2022 AND MONTH(START_DATE) BETWEEN 8 AND 10
AND CAR_ID IN (SELECT * FROM TBL)
GROUP BY 1, 2
ORDER BY 1, 2 DESC