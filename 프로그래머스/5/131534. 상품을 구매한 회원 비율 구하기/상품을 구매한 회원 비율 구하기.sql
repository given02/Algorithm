-- 코드를 입력하세요
-- 1. 2021년 가입한 회원들 중 상품을 구매한 회원수와 상품을 구매한 회원의 비율을 년, 월 별로 출력
-- 2. 비율 = 2021년에 가입한 회원 중 상품을 구매한 회원수 / 2021년에 가입한 전체 회원 수
-- 3. 비율 = 소수점 두번째자리에서 반올림
-- 4. 결과 = 년 오름차순, 월 오름차순 정렬


-- 년, 월 별 21년에 가입한 회원 중 구매한 회원 수
WITH TBL AS(
    SELECT 
        OS.USER_ID
        ,YEAR(SALES_DATE) YEAR
        ,MONTH(SALES_DATE) MONTH
        ,COUNT(1)
    FROM ONLINE_SALE OS
    LEFT JOIN USER_INFO UI
    ON OS.USER_ID = UI.USER_ID
    WHERE YEAR(JOINED) = 2021
    GROUP BY YEAR, MONTH, OS.USER_ID
)

SELECT YEAR, MONTH, COUNT(1) PUCHASED_USERS, 
    ROUND(COUNT(1)/(SELECT COUNT(*) FROM USER_INFO WHERE YEAR(JOINED) = 2021),1) PUCHASED_RATIO
FROM TBL
GROUP BY 1,2
ORDER BY 1,2;