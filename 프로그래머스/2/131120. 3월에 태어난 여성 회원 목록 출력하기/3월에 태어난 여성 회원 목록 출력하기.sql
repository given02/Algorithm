-- 코드를 입력하세요
SELECT MEMBER_ID, MEMBER_NAME, GENDER, DATE_FORMAT(DATE_OF_BIRTH,'%Y-%m-%d') DATE_OF_BIRTH
FROM MEMBER_PROFILE
WHERE SUBSTR(DATE_OF_BIRTH,6,2) LIKE '03'
AND GENDER LIKE 'W'
AND TLNO NOT LIKE 'NULL'
ORDER BY MEMBER_ID