-- 코드를 입력하세요
SELECT COUNT(*) USERS
FROM USER_INFO
WHERE JOINED LIKE CONCAT('2021','%')
AND AGE BETWEEN 20 AND 29